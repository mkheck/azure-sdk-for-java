// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * ListRecoveryPointsRecommendedForMoveRequest Request.
 */
@Fluent
public final class ListRecoveryPointsRecommendedForMoveRequest
    implements JsonSerializable<ListRecoveryPointsRecommendedForMoveRequest> {
    /*
     * Gets the class type.
     */
    private String objectType;

    /*
     * List of Recovery Points excluded from Move
     */
    private List<String> excludedRPList;

    /**
     * Creates an instance of ListRecoveryPointsRecommendedForMoveRequest class.
     */
    public ListRecoveryPointsRecommendedForMoveRequest() {
    }

    /**
     * Get the objectType property: Gets the class type.
     * 
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: Gets the class type.
     * 
     * @param objectType the objectType value to set.
     * @return the ListRecoveryPointsRecommendedForMoveRequest object itself.
     */
    public ListRecoveryPointsRecommendedForMoveRequest withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the excludedRPList property: List of Recovery Points excluded from Move.
     * 
     * @return the excludedRPList value.
     */
    public List<String> excludedRPList() {
        return this.excludedRPList;
    }

    /**
     * Set the excludedRPList property: List of Recovery Points excluded from Move.
     * 
     * @param excludedRPList the excludedRPList value to set.
     * @return the ListRecoveryPointsRecommendedForMoveRequest object itself.
     */
    public ListRecoveryPointsRecommendedForMoveRequest withExcludedRPList(List<String> excludedRPList) {
        this.excludedRPList = excludedRPList;
        return this;
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
        jsonWriter.writeStringField("objectType", this.objectType);
        jsonWriter.writeArrayField("excludedRPList", this.excludedRPList,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ListRecoveryPointsRecommendedForMoveRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListRecoveryPointsRecommendedForMoveRequest if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ListRecoveryPointsRecommendedForMoveRequest.
     */
    public static ListRecoveryPointsRecommendedForMoveRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ListRecoveryPointsRecommendedForMoveRequest deserializedListRecoveryPointsRecommendedForMoveRequest
                = new ListRecoveryPointsRecommendedForMoveRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectType".equals(fieldName)) {
                    deserializedListRecoveryPointsRecommendedForMoveRequest.objectType = reader.getString();
                } else if ("excludedRPList".equals(fieldName)) {
                    List<String> excludedRPList = reader.readArray(reader1 -> reader1.getString());
                    deserializedListRecoveryPointsRecommendedForMoveRequest.excludedRPList = excludedRPList;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedListRecoveryPointsRecommendedForMoveRequest;
        });
    }
}
