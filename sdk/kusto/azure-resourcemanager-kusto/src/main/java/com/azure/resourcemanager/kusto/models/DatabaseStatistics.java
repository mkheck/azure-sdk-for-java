// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A class that contains database statistics information.
 */
@Fluent
public final class DatabaseStatistics implements JsonSerializable<DatabaseStatistics> {
    /*
     * The database size - the total size of compressed data and index in bytes.
     */
    private Float size;

    /**
     * Creates an instance of DatabaseStatistics class.
     */
    public DatabaseStatistics() {
    }

    /**
     * Get the size property: The database size - the total size of compressed data and index in bytes.
     * 
     * @return the size value.
     */
    public Float size() {
        return this.size;
    }

    /**
     * Set the size property: The database size - the total size of compressed data and index in bytes.
     * 
     * @param size the size value to set.
     * @return the DatabaseStatistics object itself.
     */
    public DatabaseStatistics withSize(Float size) {
        this.size = size;
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
        jsonWriter.writeNumberField("size", this.size);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DatabaseStatistics from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DatabaseStatistics if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DatabaseStatistics.
     */
    public static DatabaseStatistics fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DatabaseStatistics deserializedDatabaseStatistics = new DatabaseStatistics();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("size".equals(fieldName)) {
                    deserializedDatabaseStatistics.size = reader.getNullable(JsonReader::getFloat);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDatabaseStatistics;
        });
    }
}
