// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/**
 * Samples for ReplicationRecoveryServicesProviders Get.
 */
public final class ReplicationRecoveryServicesProvidersGetSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2025-01-01/examples
     * /ReplicationRecoveryServicesProviders_Get.json
     */
    /**
     * Sample code: Gets the details of a recovery services provider.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheDetailsOfARecoveryServicesProvider(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationRecoveryServicesProviders()
            .getWithResponse("resourceGroupPS1", "vault1", "cloud1", "241641e6-ee7b-4ee4-8141-821fadda43fa",
                com.azure.core.util.Context.NONE);
    }
}
