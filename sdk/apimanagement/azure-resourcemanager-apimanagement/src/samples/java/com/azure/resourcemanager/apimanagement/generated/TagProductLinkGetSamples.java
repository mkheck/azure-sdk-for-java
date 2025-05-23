// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for TagProductLink Get.
 */
public final class TagProductLinkGetSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementGetTagProductLink.json
     */
    /**
     * Sample code: ApiManagementGetTagProductLink.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementGetTagProductLink(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.tagProductLinks()
            .getWithResponse("rg1", "apimService1", "tag1", "link1", com.azure.core.util.Context.NONE);
    }
}
