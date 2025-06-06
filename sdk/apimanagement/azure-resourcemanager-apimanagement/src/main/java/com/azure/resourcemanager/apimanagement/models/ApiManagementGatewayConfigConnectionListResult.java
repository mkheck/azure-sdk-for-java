// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementGatewayConfigConnectionResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of the List API Management gateway operation.
 */
@Fluent
public final class ApiManagementGatewayConfigConnectionListResult
    implements JsonSerializable<ApiManagementGatewayConfigConnectionListResult> {
    /*
     * Result of the List API Management gateway config connection operation.
     */
    private List<ApiManagementGatewayConfigConnectionResourceInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete list of API Management services.
     */
    private String nextLink;

    /**
     * Creates an instance of ApiManagementGatewayConfigConnectionListResult class.
     */
    public ApiManagementGatewayConfigConnectionListResult() {
    }

    /**
     * Get the value property: Result of the List API Management gateway config connection operation.
     * 
     * @return the value value.
     */
    public List<ApiManagementGatewayConfigConnectionResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List API Management gateway config connection operation.
     * 
     * @param value the value value to set.
     * @return the ApiManagementGatewayConfigConnectionListResult object itself.
     */
    public ApiManagementGatewayConfigConnectionListResult
        withValue(List<ApiManagementGatewayConfigConnectionResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of API
     * Management services.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of API
     * Management services.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ApiManagementGatewayConfigConnectionListResult object itself.
     */
    public ApiManagementGatewayConfigConnectionListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model ApiManagementGatewayConfigConnectionListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApiManagementGatewayConfigConnectionListResult.class);

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
     * Reads an instance of ApiManagementGatewayConfigConnectionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiManagementGatewayConfigConnectionListResult if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApiManagementGatewayConfigConnectionListResult.
     */
    public static ApiManagementGatewayConfigConnectionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApiManagementGatewayConfigConnectionListResult deserializedApiManagementGatewayConfigConnectionListResult
                = new ApiManagementGatewayConfigConnectionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ApiManagementGatewayConfigConnectionResourceInner> value = reader
                        .readArray(reader1 -> ApiManagementGatewayConfigConnectionResourceInner.fromJson(reader1));
                    deserializedApiManagementGatewayConfigConnectionListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedApiManagementGatewayConfigConnectionListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApiManagementGatewayConfigConnectionListResult;
        });
    }
}
