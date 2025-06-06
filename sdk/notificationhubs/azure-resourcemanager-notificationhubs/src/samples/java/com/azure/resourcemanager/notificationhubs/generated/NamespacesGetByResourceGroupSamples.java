// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

/**
 * Samples for Namespaces GetByResourceGroup.
 */
public final class NamespacesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/notificationhubs/resource-manager/Microsoft.NotificationHubs/stable/2017-04-01/examples/Namespaces/
     * NHNameSpaceGet.json
     */
    /**
     * Sample code: NameSpaceGet.
     * 
     * @param manager Entry point to NotificationHubsManager.
     */
    public static void nameSpaceGet(com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager) {
        manager.namespaces().getByResourceGroupWithResponse("5ktrial", "nh-sdk-ns", com.azure.core.util.Context.NONE);
    }
}
