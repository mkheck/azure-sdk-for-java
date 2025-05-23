// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes an Azure resource with kind.
 */
@Fluent
public class AadConnectivityStateAutoGenerated implements JsonSerializable<AadConnectivityStateAutoGenerated> {
    /*
     * The connectivity state of the external AAD solution
     */
    private AadConnectivityState connectivityState;

    /**
     * Creates an instance of AadConnectivityStateAutoGenerated class.
     */
    public AadConnectivityStateAutoGenerated() {
    }

    /**
     * Get the connectivityState property: The connectivity state of the external AAD solution.
     * 
     * @return the connectivityState value.
     */
    public AadConnectivityState connectivityState() {
        return this.connectivityState;
    }

    /**
     * Set the connectivityState property: The connectivity state of the external AAD solution.
     * 
     * @param connectivityState the connectivityState value to set.
     * @return the AadConnectivityStateAutoGenerated object itself.
     */
    public AadConnectivityStateAutoGenerated withConnectivityState(AadConnectivityState connectivityState) {
        this.connectivityState = connectivityState;
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
        jsonWriter.writeStringField("connectivityState",
            this.connectivityState == null ? null : this.connectivityState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AadConnectivityStateAutoGenerated from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AadConnectivityStateAutoGenerated if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AadConnectivityStateAutoGenerated.
     */
    public static AadConnectivityStateAutoGenerated fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AadConnectivityStateAutoGenerated deserializedAadConnectivityStateAutoGenerated
                = new AadConnectivityStateAutoGenerated();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectivityState".equals(fieldName)) {
                    deserializedAadConnectivityStateAutoGenerated.connectivityState
                        = AadConnectivityState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAadConnectivityStateAutoGenerated;
        });
    }
}
