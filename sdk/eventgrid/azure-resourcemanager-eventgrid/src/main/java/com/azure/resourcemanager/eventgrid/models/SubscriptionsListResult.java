// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.fluent.models.SubscriptionInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of the List event subscriptions operation.
 */
@Fluent
public final class SubscriptionsListResult implements JsonSerializable<SubscriptionsListResult> {
    /*
     * A collection of Subscriptions.
     */
    private List<SubscriptionInner> value;

    /*
     * A link for the next page of event subscriptions
     */
    private String nextLink;

    /**
     * Creates an instance of SubscriptionsListResult class.
     */
    public SubscriptionsListResult() {
    }

    /**
     * Get the value property: A collection of Subscriptions.
     * 
     * @return the value value.
     */
    public List<SubscriptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of Subscriptions.
     * 
     * @param value the value value to set.
     * @return the SubscriptionsListResult object itself.
     */
    public SubscriptionsListResult withValue(List<SubscriptionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of event subscriptions.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of event subscriptions.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SubscriptionsListResult object itself.
     */
    public SubscriptionsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubscriptionsListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubscriptionsListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SubscriptionsListResult.
     */
    public static SubscriptionsListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SubscriptionsListResult deserializedSubscriptionsListResult = new SubscriptionsListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SubscriptionInner> value = reader.readArray(reader1 -> SubscriptionInner.fromJson(reader1));
                    deserializedSubscriptionsListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSubscriptionsListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubscriptionsListResult;
        });
    }
}
