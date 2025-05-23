// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The aggregate values of savings plan utilization.
 */
@Immutable
public final class UtilizationAggregates implements JsonSerializable<UtilizationAggregates> {
    /*
     * The grain of the aggregate
     */
    private Float grain;

    /*
     * The grain unit of the aggregate
     */
    private String grainUnit;

    /*
     * The aggregate value
     */
    private Float value;

    /*
     * The aggregate value unit
     */
    private String valueUnit;

    /**
     * Creates an instance of UtilizationAggregates class.
     */
    public UtilizationAggregates() {
    }

    /**
     * Get the grain property: The grain of the aggregate.
     * 
     * @return the grain value.
     */
    public Float grain() {
        return this.grain;
    }

    /**
     * Get the grainUnit property: The grain unit of the aggregate.
     * 
     * @return the grainUnit value.
     */
    public String grainUnit() {
        return this.grainUnit;
    }

    /**
     * Get the value property: The aggregate value.
     * 
     * @return the value value.
     */
    public Float value() {
        return this.value;
    }

    /**
     * Get the valueUnit property: The aggregate value unit.
     * 
     * @return the valueUnit value.
     */
    public String valueUnit() {
        return this.valueUnit;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UtilizationAggregates from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UtilizationAggregates if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UtilizationAggregates.
     */
    public static UtilizationAggregates fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UtilizationAggregates deserializedUtilizationAggregates = new UtilizationAggregates();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("grain".equals(fieldName)) {
                    deserializedUtilizationAggregates.grain = reader.getNullable(JsonReader::getFloat);
                } else if ("grainUnit".equals(fieldName)) {
                    deserializedUtilizationAggregates.grainUnit = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedUtilizationAggregates.value = reader.getNullable(JsonReader::getFloat);
                } else if ("valueUnit".equals(fieldName)) {
                    deserializedUtilizationAggregates.valueUnit = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUtilizationAggregates;
        });
    }
}
