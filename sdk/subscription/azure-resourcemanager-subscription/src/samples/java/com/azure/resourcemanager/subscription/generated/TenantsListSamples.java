// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.generated;

/**
 * Samples for Tenants List.
 */
public final class TenantsListSamples {
    /*
     * x-ms-original-file:
     * specification/subscription/resource-manager/Microsoft.Subscription/stable/2016-06-01/examples/listTenants.json
     */
    /**
     * Sample code: listTenants.
     * 
     * @param manager Entry point to SubscriptionManager.
     */
    public static void listTenants(com.azure.resourcemanager.subscription.SubscriptionManager manager) {
        manager.tenants().list(com.azure.core.util.Context.NONE);
    }
}
