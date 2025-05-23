// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Information about a specific quota dimension.
 */
@Fluent
public final class QuotaDimension implements JsonSerializable<QuotaDimension> {
    /*
     * Unique id of this dimension.
     */
    private String id;

    /*
     * The scope of this quota dimension.
     */
    private String scope;

    /*
     * The reset period of this quota dimension.
     */
    private String period;

    /*
     * The max limit of this dimension.
     */
    private Float quota;

    /*
     * The display name of this quota dimension.
     */
    private String name;

    /*
     * A description about this quota dimension.
     */
    private String description;

    /*
     * The standard unit of measurement used for this quota dimension.
     */
    private String unit;

    /*
     * The standard unit of measurement used for this quota dimension in plural form.
     */
    private String unitPlural;

    /**
     * Creates an instance of QuotaDimension class.
     */
    public QuotaDimension() {
    }

    /**
     * Get the id property: Unique id of this dimension.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Unique id of this dimension.
     * 
     * @param id the id value to set.
     * @return the QuotaDimension object itself.
     */
    public QuotaDimension withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the scope property: The scope of this quota dimension.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of this quota dimension.
     * 
     * @param scope the scope value to set.
     * @return the QuotaDimension object itself.
     */
    public QuotaDimension withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the period property: The reset period of this quota dimension.
     * 
     * @return the period value.
     */
    public String period() {
        return this.period;
    }

    /**
     * Set the period property: The reset period of this quota dimension.
     * 
     * @param period the period value to set.
     * @return the QuotaDimension object itself.
     */
    public QuotaDimension withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Get the quota property: The max limit of this dimension.
     * 
     * @return the quota value.
     */
    public Float quota() {
        return this.quota;
    }

    /**
     * Set the quota property: The max limit of this dimension.
     * 
     * @param quota the quota value to set.
     * @return the QuotaDimension object itself.
     */
    public QuotaDimension withQuota(Float quota) {
        this.quota = quota;
        return this;
    }

    /**
     * Get the name property: The display name of this quota dimension.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The display name of this quota dimension.
     * 
     * @param name the name value to set.
     * @return the QuotaDimension object itself.
     */
    public QuotaDimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: A description about this quota dimension.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description about this quota dimension.
     * 
     * @param description the description value to set.
     * @return the QuotaDimension object itself.
     */
    public QuotaDimension withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the unit property: The standard unit of measurement used for this quota dimension.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The standard unit of measurement used for this quota dimension.
     * 
     * @param unit the unit value to set.
     * @return the QuotaDimension object itself.
     */
    public QuotaDimension withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the unitPlural property: The standard unit of measurement used for this quota dimension in plural form.
     * 
     * @return the unitPlural value.
     */
    public String unitPlural() {
        return this.unitPlural;
    }

    /**
     * Set the unitPlural property: The standard unit of measurement used for this quota dimension in plural form.
     * 
     * @param unitPlural the unitPlural value to set.
     * @return the QuotaDimension object itself.
     */
    public QuotaDimension withUnitPlural(String unitPlural) {
        this.unitPlural = unitPlural;
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
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("scope", this.scope);
        jsonWriter.writeStringField("period", this.period);
        jsonWriter.writeNumberField("quota", this.quota);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("unit", this.unit);
        jsonWriter.writeStringField("unitPlural", this.unitPlural);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QuotaDimension from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QuotaDimension if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the QuotaDimension.
     */
    public static QuotaDimension fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QuotaDimension deserializedQuotaDimension = new QuotaDimension();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedQuotaDimension.id = reader.getString();
                } else if ("scope".equals(fieldName)) {
                    deserializedQuotaDimension.scope = reader.getString();
                } else if ("period".equals(fieldName)) {
                    deserializedQuotaDimension.period = reader.getString();
                } else if ("quota".equals(fieldName)) {
                    deserializedQuotaDimension.quota = reader.getNullable(JsonReader::getFloat);
                } else if ("name".equals(fieldName)) {
                    deserializedQuotaDimension.name = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedQuotaDimension.description = reader.getString();
                } else if ("unit".equals(fieldName)) {
                    deserializedQuotaDimension.unit = reader.getString();
                } else if ("unitPlural".equals(fieldName)) {
                    deserializedQuotaDimension.unitPlural = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQuotaDimension;
        });
    }
}
