// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveOutputInner;
import java.io.IOException;
import java.util.List;

/**
 * LiveOutputListResult
 * 
 * The LiveOutput list result.
 */
@Fluent
public final class LiveOutputListResult implements JsonSerializable<LiveOutputListResult> {
    /*
     * The result of the List LiveOutput operation.
     */
    private List<LiveOutputInner> value;

    /*
     * The number of result.
     */
    private Integer odataCount;

    /*
     * The link to the next set of results. Not empty if value contains incomplete list of live outputs.
     */
    private String odataNextLink;

    /**
     * Creates an instance of LiveOutputListResult class.
     */
    public LiveOutputListResult() {
    }

    /**
     * Get the value property: The result of the List LiveOutput operation.
     * 
     * @return the value value.
     */
    public List<LiveOutputInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The result of the List LiveOutput operation.
     * 
     * @param value the value value to set.
     * @return the LiveOutputListResult object itself.
     */
    public LiveOutputListResult withValue(List<LiveOutputInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataCount property: The number of result.
     * 
     * @return the odataCount value.
     */
    public Integer odataCount() {
        return this.odataCount;
    }

    /**
     * Set the odataCount property: The number of result.
     * 
     * @param odataCount the odataCount value to set.
     * @return the LiveOutputListResult object itself.
     */
    public LiveOutputListResult withOdataCount(Integer odataCount) {
        this.odataCount = odataCount;
        return this;
    }

    /**
     * Get the odataNextLink property: The link to the next set of results. Not empty if value contains incomplete list
     * of live outputs.
     * 
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: The link to the next set of results. Not empty if value contains incomplete list
     * of live outputs.
     * 
     * @param odataNextLink the odataNextLink value to set.
     * @return the LiveOutputListResult object itself.
     */
    public LiveOutputListResult withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("@odata.count", this.odataCount);
        jsonWriter.writeStringField("@odata.nextLink", this.odataNextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LiveOutputListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LiveOutputListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LiveOutputListResult.
     */
    public static LiveOutputListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LiveOutputListResult deserializedLiveOutputListResult = new LiveOutputListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<LiveOutputInner> value = reader.readArray(reader1 -> LiveOutputInner.fromJson(reader1));
                    deserializedLiveOutputListResult.value = value;
                } else if ("@odata.count".equals(fieldName)) {
                    deserializedLiveOutputListResult.odataCount = reader.getNullable(JsonReader::getInt);
                } else if ("@odata.nextLink".equals(fieldName)) {
                    deserializedLiveOutputListResult.odataNextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLiveOutputListResult;
        });
    }
}
