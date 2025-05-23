// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the topics configuration info of a namespace.
 */
@Fluent
public final class UpdateTopicsConfigurationInfo implements JsonSerializable<UpdateTopicsConfigurationInfo> {
    /*
     * Custom domain info for topics configuration.
     */
    private List<CustomDomainConfiguration> customDomains;

    /**
     * Creates an instance of UpdateTopicsConfigurationInfo class.
     */
    public UpdateTopicsConfigurationInfo() {
    }

    /**
     * Get the customDomains property: Custom domain info for topics configuration.
     * 
     * @return the customDomains value.
     */
    public List<CustomDomainConfiguration> customDomains() {
        return this.customDomains;
    }

    /**
     * Set the customDomains property: Custom domain info for topics configuration.
     * 
     * @param customDomains the customDomains value to set.
     * @return the UpdateTopicsConfigurationInfo object itself.
     */
    public UpdateTopicsConfigurationInfo withCustomDomains(List<CustomDomainConfiguration> customDomains) {
        this.customDomains = customDomains;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customDomains() != null) {
            customDomains().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("customDomains", this.customDomains, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdateTopicsConfigurationInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateTopicsConfigurationInfo if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UpdateTopicsConfigurationInfo.
     */
    public static UpdateTopicsConfigurationInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateTopicsConfigurationInfo deserializedUpdateTopicsConfigurationInfo
                = new UpdateTopicsConfigurationInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("customDomains".equals(fieldName)) {
                    List<CustomDomainConfiguration> customDomains
                        = reader.readArray(reader1 -> CustomDomainConfiguration.fromJson(reader1));
                    deserializedUpdateTopicsConfigurationInfo.customDomains = customDomains;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdateTopicsConfigurationInfo;
        });
    }
}
