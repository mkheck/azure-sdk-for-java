// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.onlineexperimentation.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.onlineexperimentation.fluent.models.OnlineExperimentWorkspaceInner;
import java.util.Map;

/**
 * An immutable client-side representation of OnlineExperimentWorkspace.
 */
public interface OnlineExperimentWorkspace {
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
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    OnlineExperimentWorkspaceProperties properties();

    /**
     * Gets the identity property: The managed service identities assigned to this resource.
     * 
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the sku property: The SKU (Stock Keeping Unit) assigned to this resource.
     * 
     * @return the sku value.
     */
    OnlineExperimentationWorkspaceSku sku();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.onlineexperimentation.fluent.models.OnlineExperimentWorkspaceInner
     * object.
     * 
     * @return the inner object.
     */
    OnlineExperimentWorkspaceInner innerModel();

    /**
     * The entirety of the OnlineExperimentWorkspace definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The OnlineExperimentWorkspace definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the OnlineExperimentWorkspace definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the OnlineExperimentWorkspace definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the OnlineExperimentWorkspace definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the OnlineExperimentWorkspace definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProperties,
            DefinitionStages.WithIdentity, DefinitionStages.WithSku {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            OnlineExperimentWorkspace create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            OnlineExperimentWorkspace create(Context context);
        }

        /**
         * The stage of the OnlineExperimentWorkspace definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the OnlineExperimentWorkspace definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The resource-specific properties for this resource..
             * 
             * @param properties The resource-specific properties for this resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(OnlineExperimentWorkspaceProperties properties);
        }

        /**
         * The stage of the OnlineExperimentWorkspace definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed service identities assigned to this resource..
             * 
             * @param identity The managed service identities assigned to this resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the OnlineExperimentWorkspace definition allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU (Stock Keeping Unit) assigned to this resource..
             * 
             * @param sku The SKU (Stock Keeping Unit) assigned to this resource.
             * @return the next definition stage.
             */
            WithCreate withSku(OnlineExperimentationWorkspaceSku sku);
        }
    }

    /**
     * Begins update for the OnlineExperimentWorkspace resource.
     * 
     * @return the stage of resource update.
     */
    OnlineExperimentWorkspace.Update update();

    /**
     * The template for OnlineExperimentWorkspace update.
     */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithIdentity, UpdateStages.WithSku, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        OnlineExperimentWorkspace apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        OnlineExperimentWorkspace apply(Context context);
    }

    /**
     * The OnlineExperimentWorkspace update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the OnlineExperimentWorkspace update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the OnlineExperimentWorkspace update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed service identities assigned to this resource..
             * 
             * @param identity The managed service identities assigned to this resource.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the OnlineExperimentWorkspace update allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU (Stock Keeping Unit) assigned to this resource..
             * 
             * @param sku The SKU (Stock Keeping Unit) assigned to this resource.
             * @return the next definition stage.
             */
            Update withSku(OnlineExperimentationWorkspaceSku sku);
        }

        /**
         * The stage of the OnlineExperimentWorkspace update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Updatable properties of the online experiment workspace resource..
             * 
             * @param properties Updatable properties of the online experiment workspace resource.
             * @return the next definition stage.
             */
            Update withProperties(OnlineExperimentWorkspacePatchProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    OnlineExperimentWorkspace refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    OnlineExperimentWorkspace refresh(Context context);
}
