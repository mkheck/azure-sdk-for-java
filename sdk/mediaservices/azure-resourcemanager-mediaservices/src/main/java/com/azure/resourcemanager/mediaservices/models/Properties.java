// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The service specification property.
 */
@Immutable
public final class Properties implements JsonSerializable<Properties> {
    /*
     * The service specifications.
     */
    private ServiceSpecification serviceSpecification;

    /**
     * Creates an instance of Properties class.
     */
    public Properties() {
    }

    /**
     * Get the serviceSpecification property: The service specifications.
     * 
     * @return the serviceSpecification value.
     */
    public ServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceSpecification() != null) {
            serviceSpecification().validate();
        }
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
     * Reads an instance of Properties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Properties if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Properties.
     */
    public static Properties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Properties deserializedProperties = new Properties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceSpecification".equals(fieldName)) {
                    deserializedProperties.serviceSpecification = ServiceSpecification.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProperties;
        });
    }
}
