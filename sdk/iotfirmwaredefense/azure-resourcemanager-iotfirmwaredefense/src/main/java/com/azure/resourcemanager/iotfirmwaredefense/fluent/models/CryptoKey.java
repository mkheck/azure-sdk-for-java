// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.iotfirmwaredefense.models.CryptoKeyType;
import com.azure.resourcemanager.iotfirmwaredefense.models.PairedKey;
import com.azure.resourcemanager.iotfirmwaredefense.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Crypto key properties.
 */
@Immutable
public final class CryptoKey implements JsonSerializable<CryptoKey> {
    /*
     * ID for the key result.
     */
    private String cryptoKeyId;

    /*
     * Type of the key (public or private).
     */
    private CryptoKeyType keyType;

    /*
     * Size of the key in bits.
     */
    private Long cryptoKeySize;

    /*
     * Key algorithm name.
     */
    private String keyAlgorithm;

    /*
     * Functions the key can fulfill.
     */
    private List<String> usage;

    /*
     * List of files where this key was found.
     */
    private List<String> filePaths;

    /*
     * A matching paired key or certificate.
     */
    private PairedKey pairedKey;

    /*
     * Indicates the key size is considered too small to be secure for the algorithm according to NIST guidance.
     */
    private Boolean isShortKeySize;

    /*
     * The status of the last operation.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of CryptoKey class.
     */
    private CryptoKey() {
    }

    /**
     * Get the cryptoKeyId property: ID for the key result.
     * 
     * @return the cryptoKeyId value.
     */
    public String cryptoKeyId() {
        return this.cryptoKeyId;
    }

    /**
     * Get the keyType property: Type of the key (public or private).
     * 
     * @return the keyType value.
     */
    public CryptoKeyType keyType() {
        return this.keyType;
    }

    /**
     * Get the cryptoKeySize property: Size of the key in bits.
     * 
     * @return the cryptoKeySize value.
     */
    public Long cryptoKeySize() {
        return this.cryptoKeySize;
    }

    /**
     * Get the keyAlgorithm property: Key algorithm name.
     * 
     * @return the keyAlgorithm value.
     */
    public String keyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * Get the usage property: Functions the key can fulfill.
     * 
     * @return the usage value.
     */
    public List<String> usage() {
        return this.usage;
    }

    /**
     * Get the filePaths property: List of files where this key was found.
     * 
     * @return the filePaths value.
     */
    public List<String> filePaths() {
        return this.filePaths;
    }

    /**
     * Get the pairedKey property: A matching paired key or certificate.
     * 
     * @return the pairedKey value.
     */
    public PairedKey pairedKey() {
        return this.pairedKey;
    }

    /**
     * Get the isShortKeySize property: Indicates the key size is considered too small to be secure for the algorithm
     * according to NIST guidance.
     * 
     * @return the isShortKeySize value.
     */
    public Boolean isShortKeySize() {
        return this.isShortKeySize;
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pairedKey() != null) {
            pairedKey().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("cryptoKeyId", this.cryptoKeyId);
        jsonWriter.writeStringField("keyType", this.keyType == null ? null : this.keyType.toString());
        jsonWriter.writeNumberField("cryptoKeySize", this.cryptoKeySize);
        jsonWriter.writeStringField("keyAlgorithm", this.keyAlgorithm);
        jsonWriter.writeArrayField("usage", this.usage, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("pairedKey", this.pairedKey);
        jsonWriter.writeBooleanField("isShortKeySize", this.isShortKeySize);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CryptoKey from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CryptoKey if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the CryptoKey.
     */
    public static CryptoKey fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CryptoKey deserializedCryptoKey = new CryptoKey();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("cryptoKeyId".equals(fieldName)) {
                    deserializedCryptoKey.cryptoKeyId = reader.getString();
                } else if ("keyType".equals(fieldName)) {
                    deserializedCryptoKey.keyType = CryptoKeyType.fromString(reader.getString());
                } else if ("cryptoKeySize".equals(fieldName)) {
                    deserializedCryptoKey.cryptoKeySize = reader.getNullable(JsonReader::getLong);
                } else if ("keyAlgorithm".equals(fieldName)) {
                    deserializedCryptoKey.keyAlgorithm = reader.getString();
                } else if ("usage".equals(fieldName)) {
                    List<String> usage = reader.readArray(reader1 -> reader1.getString());
                    deserializedCryptoKey.usage = usage;
                } else if ("filePaths".equals(fieldName)) {
                    List<String> filePaths = reader.readArray(reader1 -> reader1.getString());
                    deserializedCryptoKey.filePaths = filePaths;
                } else if ("pairedKey".equals(fieldName)) {
                    deserializedCryptoKey.pairedKey = PairedKey.fromJson(reader);
                } else if ("isShortKeySize".equals(fieldName)) {
                    deserializedCryptoKey.isShortKeySize = reader.getNullable(JsonReader::getBoolean);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedCryptoKey.provisioningState = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCryptoKey;
        });
    }
}
