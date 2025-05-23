// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceCheckNameAvailabilityParameters;

/**
 * Samples for ApiManagementService CheckNameAvailability.
 */
public final class ApiManagementServiceCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementServiceCheckNameAvailability.json
     */
    /**
     * Sample code: ApiManagementServiceCheckNameAvailability.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementServiceCheckNameAvailability(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apiManagementServices()
            .checkNameAvailabilityWithResponse(
                new ApiManagementServiceCheckNameAvailabilityParameters().withName("apimService1"),
                com.azure.core.util.Context.NONE);
    }
}
