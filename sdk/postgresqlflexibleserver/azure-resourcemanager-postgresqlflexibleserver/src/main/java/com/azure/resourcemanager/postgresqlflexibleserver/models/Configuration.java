// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ConfigurationInner;

/**
 * An immutable client-side representation of Configuration.
 */
public interface Configuration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the value property: Value of the configuration. Required to update the configuration.
     * 
     * @return the value value.
     */
    String value();

    /**
     * Gets the description property: Description of the configuration.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the defaultValue property: Default value of the configuration.
     * 
     * @return the defaultValue value.
     */
    String defaultValue();

    /**
     * Gets the dataType property: Data type of the configuration.
     * 
     * @return the dataType value.
     */
    ConfigurationDataType dataType();

    /**
     * Gets the allowedValues property: Allowed values of the configuration.
     * 
     * @return the allowedValues value.
     */
    String allowedValues();

    /**
     * Gets the source property: Source of the configuration. Required to update the configuration.
     * 
     * @return the source value.
     */
    String source();

    /**
     * Gets the isDynamicConfig property: Configuration dynamic or static.
     * 
     * @return the isDynamicConfig value.
     */
    Boolean isDynamicConfig();

    /**
     * Gets the isReadOnly property: Configuration read-only or not.
     * 
     * @return the isReadOnly value.
     */
    Boolean isReadOnly();

    /**
     * Gets the isConfigPendingRestart property: Configuration is pending restart or not.
     * 
     * @return the isConfigPendingRestart value.
     */
    Boolean isConfigPendingRestart();

    /**
     * Gets the unit property: Configuration unit.
     * 
     * @return the unit value.
     */
    String unit();

    /**
     * Gets the documentationLink property: Configuration documentation link.
     * 
     * @return the documentationLink value.
     */
    String documentationLink();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ConfigurationInner object.
     * 
     * @return the inner object.
     */
    ConfigurationInner innerModel();

    /**
     * The entirety of the Configuration definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The Configuration definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Configuration definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Configuration definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serverName The name of the server.
             * @return the next definition stage.
             */
            WithCreate withExistingFlexibleServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the Configuration definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithValue, DefinitionStages.WithSource {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Configuration create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Configuration create(Context context);
        }

        /**
         * The stage of the Configuration definition allowing to specify value.
         */
        interface WithValue {
            /**
             * Specifies the value property: Value of the configuration. Required to update the configuration..
             * 
             * @param value Value of the configuration. Required to update the configuration.
             * @return the next definition stage.
             */
            WithCreate withValue(String value);
        }

        /**
         * The stage of the Configuration definition allowing to specify source.
         */
        interface WithSource {
            /**
             * Specifies the source property: Source of the configuration. Required to update the configuration..
             * 
             * @param source Source of the configuration. Required to update the configuration.
             * @return the next definition stage.
             */
            WithCreate withSource(String source);
        }
    }

    /**
     * Begins update for the Configuration resource.
     * 
     * @return the stage of resource update.
     */
    Configuration.Update update();

    /**
     * The template for Configuration update.
     */
    interface Update extends UpdateStages.WithValue, UpdateStages.WithSource {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Configuration apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Configuration apply(Context context);
    }

    /**
     * The Configuration update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Configuration update allowing to specify value.
         */
        interface WithValue {
            /**
             * Specifies the value property: Value of the configuration. Required to update the configuration..
             * 
             * @param value Value of the configuration. Required to update the configuration.
             * @return the next definition stage.
             */
            Update withValue(String value);
        }

        /**
         * The stage of the Configuration update allowing to specify source.
         */
        interface WithSource {
            /**
             * Specifies the source property: Source of the configuration. Required to update the configuration..
             * 
             * @param source Source of the configuration. Required to update the configuration.
             * @return the next definition stage.
             */
            Update withSource(String source);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Configuration refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Configuration refresh(Context context);
}
