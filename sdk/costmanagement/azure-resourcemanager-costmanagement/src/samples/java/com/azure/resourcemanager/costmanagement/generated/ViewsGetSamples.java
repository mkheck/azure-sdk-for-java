// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

/**
 * Samples for Views Get.
 */
public final class ViewsGetSamples {
    /*
     * x-ms-original-file:
     * specification/cost-management/resource-manager/Microsoft.CostManagement/stable/2022-10-01/examples/PrivateView.
     * json
     */
    /**
     * Sample code: PrivateView.
     * 
     * @param manager Entry point to CostManagementManager.
     */
    public static void privateView(com.azure.resourcemanager.costmanagement.CostManagementManager manager) {
        manager.views().getWithResponse("swaggerExample", com.azure.core.util.Context.NONE);
    }
}
