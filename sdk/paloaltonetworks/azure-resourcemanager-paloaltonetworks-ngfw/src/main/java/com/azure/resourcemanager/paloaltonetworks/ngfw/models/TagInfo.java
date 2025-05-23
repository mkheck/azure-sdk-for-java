// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Tag.
 */
@Fluent
public final class TagInfo implements JsonSerializable<TagInfo> {
    /*
     * tag name
     */
    private String key;

    /*
     * tag value
     */
    private String value;

    /**
     * Creates an instance of TagInfo class.
     */
    public TagInfo() {
    }

    /**
     * Get the key property: tag name.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: tag name.
     * 
     * @param key the key value to set.
     * @return the TagInfo object itself.
     */
    public TagInfo withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: tag value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: tag value.
     * 
     * @param value the value value to set.
     * @return the TagInfo object itself.
     */
    public TagInfo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (key() == null) {
            throw LOGGER.atError().log(new IllegalArgumentException("Missing required property key in model TagInfo"));
        }
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model TagInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TagInfo.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("key", this.key);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TagInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TagInfo if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TagInfo.
     */
    public static TagInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TagInfo deserializedTagInfo = new TagInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedTagInfo.key = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedTagInfo.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTagInfo;
        });
    }
}
