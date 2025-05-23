// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.AccessIdName;

/**
 * Samples for TenantAccess GetEntityTag.
 */
public final class TenantAccessGetEntityTagSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementHeadTenantAccess.json
     */
    /**
     * Sample code: ApiManagementHeadTenantAccess.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementHeadTenantAccess(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.tenantAccess()
            .getEntityTagWithResponse("rg1", "apimService1", AccessIdName.ACCESS, com.azure.core.util.Context.NONE);
    }
}
