// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.resourcemanager.quota.fluent.models.GroupQuotasEntityInner;
import com.azure.resourcemanager.quota.models.GroupQuotasEntityProperties;

/**
 * Samples for GroupQuotas CreateOrUpdate.
 */
public final class GroupQuotasCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/quota/resource-manager/Microsoft.Quota/stable/2025-03-01/examples/GroupQuotas/PutGroupQuotas.json
     */
    /**
     * Sample code: GroupQuotas_Put_Request_ForCompute.
     * 
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotasPutRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager.groupQuotas()
            .createOrUpdate("E7EC67B3-7657-4966-BFFC-41EFD36BAA09", "groupquota1",
                new GroupQuotasEntityInner()
                    .withProperties(new GroupQuotasEntityProperties().withDisplayName("GroupQuota1")),
                com.azure.core.util.Context.NONE);
    }
}
