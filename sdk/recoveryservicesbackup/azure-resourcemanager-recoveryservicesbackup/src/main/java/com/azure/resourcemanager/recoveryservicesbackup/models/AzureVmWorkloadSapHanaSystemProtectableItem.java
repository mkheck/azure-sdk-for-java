// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Azure VM workload-specific protectable item representing SAP HANA System.
 */
@Fluent
public final class AzureVmWorkloadSapHanaSystemProtectableItem extends AzureVmWorkloadProtectableItem {
    /*
     * Type of the backup item.
     */
    private String protectableItemType = "SAPHanaSystem";

    /**
     * Creates an instance of AzureVmWorkloadSapHanaSystemProtectableItem class.
     */
    public AzureVmWorkloadSapHanaSystemProtectableItem() {
    }

    /**
     * Get the protectableItemType property: Type of the backup item.
     * 
     * @return the protectableItemType value.
     */
    @Override
    public String protectableItemType() {
        return this.protectableItemType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem withParentUniqueName(String parentUniqueName) {
        super.withParentUniqueName(parentUniqueName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem withIsAutoProtectable(Boolean isAutoProtectable) {
        super.withIsAutoProtectable(isAutoProtectable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem withIsAutoProtected(Boolean isAutoProtected) {
        super.withIsAutoProtected(isAutoProtected);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem withSubinquireditemcount(Integer subinquireditemcount) {
        super.withSubinquireditemcount(subinquireditemcount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem withSubprotectableitemcount(Integer subprotectableitemcount) {
        super.withSubprotectableitemcount(subprotectableitemcount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem
        withPrebackupvalidation(PreBackupValidation prebackupvalidation) {
        super.withPrebackupvalidation(prebackupvalidation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem withIsProtectable(Boolean isProtectable) {
        super.withIsProtectable(isProtectable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemProtectableItem withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (prebackupvalidation() != null) {
            prebackupvalidation().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("backupManagementType", backupManagementType());
        jsonWriter.writeStringField("workloadType", workloadType());
        jsonWriter.writeStringField("friendlyName", friendlyName());
        jsonWriter.writeStringField("protectionState", protectionState() == null ? null : protectionState().toString());
        jsonWriter.writeStringField("parentName", parentName());
        jsonWriter.writeStringField("parentUniqueName", parentUniqueName());
        jsonWriter.writeStringField("serverName", serverName());
        jsonWriter.writeBooleanField("isAutoProtectable", isAutoProtectable());
        jsonWriter.writeBooleanField("isAutoProtected", isAutoProtected());
        jsonWriter.writeNumberField("subinquireditemcount", subinquireditemcount());
        jsonWriter.writeNumberField("subprotectableitemcount", subprotectableitemcount());
        jsonWriter.writeJsonField("prebackupvalidation", prebackupvalidation());
        jsonWriter.writeBooleanField("isProtectable", isProtectable());
        jsonWriter.writeStringField("protectableItemType", this.protectableItemType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureVmWorkloadSapHanaSystemProtectableItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureVmWorkloadSapHanaSystemProtectableItem if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureVmWorkloadSapHanaSystemProtectableItem.
     */
    public static AzureVmWorkloadSapHanaSystemProtectableItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureVmWorkloadSapHanaSystemProtectableItem deserializedAzureVmWorkloadSapHanaSystemProtectableItem
                = new AzureVmWorkloadSapHanaSystemProtectableItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("backupManagementType".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem
                        .withBackupManagementType(reader.getString());
                } else if ("workloadType".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem.withWorkloadType(reader.getString());
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem.withFriendlyName(reader.getString());
                } else if ("protectionState".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem
                        .withProtectionState(ProtectionStatus.fromString(reader.getString()));
                } else if ("parentName".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem.withParentName(reader.getString());
                } else if ("parentUniqueName".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem.withParentUniqueName(reader.getString());
                } else if ("serverName".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem.withServerName(reader.getString());
                } else if ("isAutoProtectable".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem
                        .withIsAutoProtectable(reader.getNullable(JsonReader::getBoolean));
                } else if ("isAutoProtected".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem
                        .withIsAutoProtected(reader.getNullable(JsonReader::getBoolean));
                } else if ("subinquireditemcount".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem
                        .withSubinquireditemcount(reader.getNullable(JsonReader::getInt));
                } else if ("subprotectableitemcount".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem
                        .withSubprotectableitemcount(reader.getNullable(JsonReader::getInt));
                } else if ("prebackupvalidation".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem
                        .withPrebackupvalidation(PreBackupValidation.fromJson(reader));
                } else if ("isProtectable".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem
                        .withIsProtectable(reader.getNullable(JsonReader::getBoolean));
                } else if ("protectableItemType".equals(fieldName)) {
                    deserializedAzureVmWorkloadSapHanaSystemProtectableItem.protectableItemType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureVmWorkloadSapHanaSystemProtectableItem;
        });
    }
}
