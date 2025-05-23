// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for ApiOperation Get.
 */
public final class ApiOperationGetSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementGetApiOperation.json
     */
    /**
     * Sample code: ApiManagementGetApiOperation.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementGetApiOperation(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apiOperations()
            .getWithResponse("rg1", "apimService1", "57d2ef278aa04f0888cba3f3", "57d2ef278aa04f0ad01d6cdc",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementGetApiOperationPetStore.json
     */
    /**
     * Sample code: ApiManagementGetApiOperationPetStore.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementGetApiOperationPetStore(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apiOperations()
            .getWithResponse("rg1", "apimService1", "swagger-petstore", "loginUser", com.azure.core.util.Context.NONE);
    }
}
