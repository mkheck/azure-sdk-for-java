// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.rx;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.implementation.FeedResponseListValidator;
import com.azure.cosmos.implementation.InternalObjectNode;
import com.azure.cosmos.models.CompositePath;
import com.azure.cosmos.models.CompositePathSortOrder;
import com.azure.cosmos.models.CosmosContainerProperties;
import com.azure.cosmos.models.CosmosItemRequestOptions;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.util.CosmosPagedFlux;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections4.ComparatorUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class MultiOrderByQueryTests extends TestSuiteBase {

    private static final int TIMEOUT = 35000;
    private static final String NUMBER_FIELD = "numberField";
    private static final String STRING_FIELD = "stringField";
    private static final String NUMBER_FIELD_2 = "numberField2";
    private static final String STRING_FIELD_2 = "stringField2";
    private static final String BOOL_FIELD = "boolField";
    private static final String NULL_FIELD = "nullField";
    private static final String OBJECT_FIELD = "objectField";
    private static final String ARRAY_FIELD = "arrayField";
    private static final String SHORT_STRING_FIELD = "shortStringField";
    private static final String MEDIUM_STRING_FIELD = "mediumStringField";
    private static final String LONG_STRING_FIELD = "longStringField";
    private static final String PARTITION_KEY = "pk";
    private List<InternalObjectNode> documents = new ArrayList<InternalObjectNode>();
    private CosmosAsyncContainer documentCollection;
    private CosmosAsyncClient client;

    class CustomComparator implements Comparator<InternalObjectNode> {
        String path;
        CompositePathSortOrder order;
        boolean isNumericPath = false;
        boolean isStringPath = false;
        boolean isBooleanPath = false;
        boolean isNullPath = false;

        public CustomComparator(String path, CompositePathSortOrder order) {
            this.path = path;
            this.order = order;
            if (this.path.contains("number")) {
                isNumericPath = true;
            } else if (this.path.toLowerCase().contains("string")) {
                isStringPath = true;
            } else if (this.path.contains("bool")) {
                isBooleanPath = true;
            } else if (this.path.contains("null")) {
                isNullPath = true;
            }
        }

        @Override
        public int compare(InternalObjectNode doc1, InternalObjectNode doc2) {
            boolean isAsc = order == CompositePathSortOrder.ASCENDING;
            if (isNumericPath) {
                if (doc1.getInt(path) < doc2.getInt(path))
                    return isAsc ? -1 : 1;
                else if (doc1.getInt(path) > doc2.getInt(path))
                    return isAsc ? 1 : -1;
                else
                    return 0;
            } else if (isStringPath) {
                if (!isAsc) {
                    InternalObjectNode temp = doc1;
                    doc1 = doc2;
                    doc2 = temp;
                }
                return doc1.getString(path)
                                          .compareTo(doc2.getString(path));
            } else if (isBooleanPath) {
                if (!doc1.getBoolean(path) && doc2.getBoolean(path))
                    return isAsc ? -1 : 1;
                else if (doc1.getBoolean(path) && !doc2.getBoolean(path))
                    return isAsc ? 1 : -1;
                else
                    return 0;
            } else if (isNullPath) {
                // all nulls are equal
                return 0;
            } else {
                throw new IllegalStateException("data type not handled by comparator!");
            }
        }
    }

    @Factory(dataProvider = "clientBuildersWithDirectSession")
    public MultiOrderByQueryTests(CosmosClientBuilder clientBuilder) {
        super(clientBuilder);
    }

    @AfterClass(groups = { "query" }, timeOut = SHUTDOWN_TIMEOUT, alwaysRun = true)
    public void afterClass() {
        safeClose(client);
    }

    @BeforeClass(groups = { "query" }, timeOut = SETUP_TIMEOUT)
    public void before_MultiOrderByQueryTests() throws Exception {
        client = getClientBuilder().buildAsyncClient();
        documentCollection = getSharedMultiPartitionCosmosContainerWithCompositeAndSpatialIndexes(client);
        truncateCollection(documentCollection);

        int numberOfDocuments = 4;

        Random random = new Random();
        for (int i = 0; i < numberOfDocuments; ++i) {
            InternalObjectNode multiOrderByDocument = generateMultiOrderByDocument();
            String multiOrderByDocumentString = multiOrderByDocument.toJson();
            int numberOfDuplicates = 5;

            for (int j = 0; j < numberOfDuplicates; j++) {
                // Add the document itself for exact duplicates
                InternalObjectNode initialDocument = new InternalObjectNode(multiOrderByDocumentString);
                initialDocument.setId(UUID.randomUUID().toString());
                this.documents.add(initialDocument);

                // Permute all the fields so that there are duplicates with tie breaks
                InternalObjectNode numberClone = new InternalObjectNode(multiOrderByDocumentString);
                numberClone.set(NUMBER_FIELD, random.nextInt(5));
                numberClone.setId(UUID.randomUUID().toString());
                this.documents.add(numberClone);

                InternalObjectNode stringClone = new InternalObjectNode(multiOrderByDocumentString);
                stringClone.set(STRING_FIELD, Integer.toString(random.nextInt(5)));
                stringClone.setId(UUID.randomUUID().toString());
                this.documents.add(stringClone);

                InternalObjectNode boolClone = new InternalObjectNode(multiOrderByDocumentString);
                boolClone.set(BOOL_FIELD, random.nextInt(2) % 2 == 0);
                boolClone.setId(UUID.randomUUID().toString());
                this.documents.add(boolClone);

                // Also fuzz what partition it goes to
                InternalObjectNode partitionClone = new InternalObjectNode(multiOrderByDocumentString);
                partitionClone.set(PARTITION_KEY, random.nextInt(5));
                partitionClone.setId(UUID.randomUUID().toString());
                this.documents.add(partitionClone);
            }
        }

        voidBulkInsertBlocking(documentCollection, documents);

        waitIfNeededForReplicasToCatchUp(getClientBuilder());
    }

    private InternalObjectNode generateMultiOrderByDocument() {
        Random random = new Random();
        InternalObjectNode document = new InternalObjectNode();
        document.setId(UUID.randomUUID().toString());
        document.set(NUMBER_FIELD, random.nextInt(5));
        document.set(NUMBER_FIELD_2, random.nextInt(5));
        document.set(BOOL_FIELD, (random.nextInt() % 2) == 0);
        document.set(STRING_FIELD, Integer.toString(random.nextInt(5)));
        document.set(STRING_FIELD_2, Integer.toString(random.nextInt(5)));
        document.set(NULL_FIELD, null);
        document.set(OBJECT_FIELD, "");
        document.set(ARRAY_FIELD, (new ObjectMapper()).createArrayNode());
        document.set(SHORT_STRING_FIELD, "a" + random.nextInt(100));
        document.set(MEDIUM_STRING_FIELD, "a" + random.nextInt(128) + 100);
        document.set(LONG_STRING_FIELD, "a" + random.nextInt(255) + 128);
        document.set(PARTITION_KEY, random.nextInt(5));
        return document;
    }

    @Test(groups = { "query" }, timeOut = TIMEOUT * 10)
    public void queryDocumentsWithMultiOrder() throws InterruptedException {
        CosmosQueryRequestOptions cosmosQueryRequestOptions = new CosmosQueryRequestOptions();


        boolean[] booleanValues = new boolean[] {true, false};
        CosmosContainerProperties containerSettings = documentCollection.read().block().getProperties();
        Iterator<List<CompositePath>> compositeIndexesIterator = containerSettings.getIndexingPolicy().getCompositeIndexes().iterator();
        while (compositeIndexesIterator.hasNext()) {
        List<CompositePath> compositeIndex = compositeIndexesIterator.next();
            // for every order
            for (boolean invert : booleanValues) {
                // for normal and inverted order
                for (boolean hasTop : booleanValues) {
                    // with and without top
                    for (boolean hasFilter : booleanValues) {
                        // with and without filter
                        // Generate a multi order by from that index
                        List<String> orderByItems = new ArrayList<String>();
                        List<String> selectItems = new ArrayList<String>();
                        boolean isDesc;
                        Iterator<CompositePath> compositeIndexiterator = compositeIndex.iterator();
                        while (compositeIndexiterator.hasNext()) {
                            CompositePath compositePath = compositeIndexiterator.next();
                            isDesc = compositePath.getOrder() == CompositePathSortOrder.DESCENDING ? true : false;
                            if (invert) {
                                isDesc = !isDesc;
                            }

                            String isDescString = isDesc ? "DESC" : "ASC";
                            String compositePathName = compositePath.getPath().replaceAll("/", "");
                            String orderByItemsString = "root." + compositePathName + " " + isDescString;
                            String selectItemsString = "root." + compositePathName;
                            orderByItems.add(orderByItemsString);
                            selectItems.add(selectItemsString);
                        }

                        int topCount = 10;
                        StringBuilder selectItemStringBuilder = new StringBuilder();
                        for (String selectItem: selectItems) {
                            selectItemStringBuilder.append(selectItem);
                            selectItemStringBuilder.append(",");
                        }
                        selectItemStringBuilder.deleteCharAt(selectItemStringBuilder.length() - 1);
                        StringBuilder orderByItemStringBuilder = new StringBuilder();
                        for (String orderByItem : orderByItems) {
                            orderByItemStringBuilder.append(orderByItem);
                            orderByItemStringBuilder.append(",");
                        }
                        orderByItemStringBuilder.deleteCharAt(orderByItemStringBuilder.length() - 1);

                        String topString = hasTop ? "TOP " + topCount : "";
                        String whereString = hasFilter ? "WHERE root." + NUMBER_FIELD  + " % 2 = 0" : "";
                        String query = "SELECT " + topString + " [" + selectItemStringBuilder.toString() + "] " +
                                "FROM root " + whereString + " " +
                                "ORDER BY " + orderByItemStringBuilder.toString();

                        List<InternalObjectNode> expectedOrderedList = top(sort(filter(this.documents, hasFilter), compositeIndex, invert), hasTop, topCount) ;

                        CosmosPagedFlux<InternalObjectNode> queryObservable = documentCollection.queryItems(query, cosmosQueryRequestOptions, InternalObjectNode.class);

                        FeedResponseListValidator<InternalObjectNode> validator = new FeedResponseListValidator
                                .Builder<InternalObjectNode>()
                                .withOrderedResults(expectedOrderedList, compositeIndex)
                                .build();

                        validateQuerySuccess(queryObservable.byPage(), validator);
                        validateQuerySuccessWithContinuationTokenAndSizes(query, documentCollection, new int[] { 5, 20, 100}, validator, InternalObjectNode.class);
                    }
                }
            }
        }
    }

    @Test(groups = { "query" }, timeOut = TIMEOUT * 10)
    public void queryDocumentsWithUndefinedValueAndMultiOrderby() {
        // CREATE document with numberField not set.
        // This query should be valid too as we now support mixed null values

        // created 6 documents so that when we test query with page size 5, we also test the scenario where continuation continued on undefined value.
        int documentWithUndefinedFiledSize = 6;
        List<String> documentWithEmptyFieldIds = new ArrayList<>();
        for (int i = 0; i < documentWithUndefinedFiledSize; i++) {
            InternalObjectNode documentWithEmptyField = generateMultiOrderByDocument();
            documentWithEmptyField.remove(NUMBER_FIELD);
            documentCollection.createItem(documentWithEmptyField, new CosmosItemRequestOptions()).block();
            documentWithEmptyFieldIds.add(documentWithEmptyField.getId());
        }

        String query = "SELECT * FROM root ORDER BY root." + NUMBER_FIELD + " ASC ,root." + STRING_FIELD + " DESC";
        CosmosPagedFlux<InternalObjectNode> queryObservable = documentCollection.queryItems(query, new CosmosQueryRequestOptions(), InternalObjectNode.class);

        FeedResponseListValidator<InternalObjectNode> feedResponseValidator =
            new FeedResponseListValidator.Builder<InternalObjectNode>()
                .totalSize(this.documents.size() + documentWithUndefinedFiledSize)
                .exactlyTopIdsInAnyOrder(documentWithEmptyFieldIds)
                .build();

        validateQuerySuccess(queryObservable.byPage(), feedResponseValidator);
        validateQuerySuccessWithContinuationTokenAndSizes(query, documentCollection, new int[] { 5, 20, 100 }, feedResponseValidator, InternalObjectNode.class);
    }

    private List<InternalObjectNode> top(List<InternalObjectNode> arrayList, boolean hasTop, int topCount) {
        List<InternalObjectNode> result = new ArrayList<InternalObjectNode>();
        int counter = 0;
        if (hasTop) {
            while (counter < topCount && counter < arrayList.size()) {
                result.add(arrayList.get(counter));
                counter++;
            }
        } else {
            result.addAll(arrayList);
        }
        return result;
    }

    private List<InternalObjectNode> sort(List<InternalObjectNode> arrayList, List<CompositePath> compositeIndex,
                                          boolean invert) {
        Collection<Comparator<InternalObjectNode>> comparators = new ArrayList<Comparator<InternalObjectNode>>();
        Iterator<CompositePath> compositeIndexIterator = compositeIndex.iterator();
        while (compositeIndexIterator.hasNext()) {
            CompositePath compositePath = compositeIndexIterator.next();
            CompositePathSortOrder order = compositePath.getOrder();
            if (invert) {
                if (order == CompositePathSortOrder.DESCENDING) {
                    order = CompositePathSortOrder.ASCENDING;
                } else {
                    order = CompositePathSortOrder.DESCENDING;
                }
            }
            String path = compositePath.getPath().replace("/", "");
            comparators.add(new CustomComparator(path, order));
        }
        Collections.sort(arrayList, ComparatorUtils.chainedComparator(comparators));
        return arrayList;
    }

    private List<InternalObjectNode> filter(List<InternalObjectNode> cosmosItemSettings, boolean hasFilter) {
        List<InternalObjectNode> result = new ArrayList<InternalObjectNode>();
        if (hasFilter) {
            for (InternalObjectNode document : cosmosItemSettings) {
                if (document.getInt(NUMBER_FIELD) % 2 == 0) {
                    result.add(document);
                }
            }
        } else {
            result.addAll(cosmosItemSettings);
        }
        return result;
    }
}
