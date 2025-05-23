// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Dimension properties.
 */
@Fluent
public final class DimensionProperties implements JsonSerializable<DimensionProperties> {
    /*
     * Dimension description.
     */
    private String description;

    /*
     * Filter enabled.
     */
    private Boolean filterEnabled;

    /*
     * Grouping enabled.
     */
    private Boolean groupingEnabled;

    /*
     * Dimension data.
     */
    private List<String> data;

    /*
     * Total number of data for the dimension.
     */
    private Integer total;

    /*
     * Dimension category.
     */
    private String category;

    /*
     * Usage start.
     */
    private OffsetDateTime usageStart;

    /*
     * Usage end.
     */
    private OffsetDateTime usageEnd;

    /*
     * The link (url) to the next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of DimensionProperties class.
     */
    public DimensionProperties() {
    }

    /**
     * Get the description property: Dimension description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the filterEnabled property: Filter enabled.
     * 
     * @return the filterEnabled value.
     */
    public Boolean filterEnabled() {
        return this.filterEnabled;
    }

    /**
     * Get the groupingEnabled property: Grouping enabled.
     * 
     * @return the groupingEnabled value.
     */
    public Boolean groupingEnabled() {
        return this.groupingEnabled;
    }

    /**
     * Get the data property: Dimension data.
     * 
     * @return the data value.
     */
    public List<String> data() {
        return this.data;
    }

    /**
     * Set the data property: Dimension data.
     * 
     * @param data the data value to set.
     * @return the DimensionProperties object itself.
     */
    public DimensionProperties withData(List<String> data) {
        this.data = data;
        return this;
    }

    /**
     * Get the total property: Total number of data for the dimension.
     * 
     * @return the total value.
     */
    public Integer total() {
        return this.total;
    }

    /**
     * Get the category property: Dimension category.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Get the usageStart property: Usage start.
     * 
     * @return the usageStart value.
     */
    public OffsetDateTime usageStart() {
        return this.usageStart;
    }

    /**
     * Get the usageEnd property: Usage end.
     * 
     * @return the usageEnd value.
     */
    public OffsetDateTime usageEnd() {
        return this.usageEnd;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("data", this.data, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DimensionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DimensionProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DimensionProperties.
     */
    public static DimensionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DimensionProperties deserializedDimensionProperties = new DimensionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedDimensionProperties.description = reader.getString();
                } else if ("filterEnabled".equals(fieldName)) {
                    deserializedDimensionProperties.filterEnabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("groupingEnabled".equals(fieldName)) {
                    deserializedDimensionProperties.groupingEnabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("data".equals(fieldName)) {
                    List<String> data = reader.readArray(reader1 -> reader1.getString());
                    deserializedDimensionProperties.data = data;
                } else if ("total".equals(fieldName)) {
                    deserializedDimensionProperties.total = reader.getNullable(JsonReader::getInt);
                } else if ("category".equals(fieldName)) {
                    deserializedDimensionProperties.category = reader.getString();
                } else if ("usageStart".equals(fieldName)) {
                    deserializedDimensionProperties.usageStart = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("usageEnd".equals(fieldName)) {
                    deserializedDimensionProperties.usageEnd = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("nextLink".equals(fieldName)) {
                    deserializedDimensionProperties.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDimensionProperties;
        });
    }
}
