// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.TagProductLinkContractInner;

/**
 * An immutable client-side representation of TagProductLinkContract.
 */
public interface TagProductLinkContract {
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
     * Gets the productId property: Full resource Id of a product.
     * 
     * @return the productId value.
     */
    String productId();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.TagProductLinkContractInner object.
     * 
     * @return the inner object.
     */
    TagProductLinkContractInner innerModel();

    /**
     * The entirety of the TagProductLinkContract definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The TagProductLinkContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the TagProductLinkContract definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the TagProductLinkContract definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName, tagId.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serviceName The name of the API Management service.
             * @param tagId Tag identifier. Must be unique in the current API Management service instance.
             * @return the next definition stage.
             */
            WithCreate withExistingTag(String resourceGroupName, String serviceName, String tagId);
        }

        /**
         * The stage of the TagProductLinkContract definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProductId {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            TagProductLinkContract create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            TagProductLinkContract create(Context context);
        }

        /**
         * The stage of the TagProductLinkContract definition allowing to specify productId.
         */
        interface WithProductId {
            /**
             * Specifies the productId property: Full resource Id of a product..
             * 
             * @param productId Full resource Id of a product.
             * @return the next definition stage.
             */
            WithCreate withProductId(String productId);
        }
    }

    /**
     * Begins update for the TagProductLinkContract resource.
     * 
     * @return the stage of resource update.
     */
    TagProductLinkContract.Update update();

    /**
     * The template for TagProductLinkContract update.
     */
    interface Update extends UpdateStages.WithProductId {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        TagProductLinkContract apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        TagProductLinkContract apply(Context context);
    }

    /**
     * The TagProductLinkContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the TagProductLinkContract update allowing to specify productId.
         */
        interface WithProductId {
            /**
             * Specifies the productId property: Full resource Id of a product..
             * 
             * @param productId Full resource Id of a product.
             * @return the next definition stage.
             */
            Update withProductId(String productId);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    TagProductLinkContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    TagProductLinkContract refresh(Context context);
}
