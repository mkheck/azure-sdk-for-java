// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.generated;

/**
 * Samples for SqlManagedInstances GetByResourceGroup.
 */
public final class SqlManagedInstancesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/azurearcdata/resource-manager/Microsoft.AzureArcData/stable/2021-08-01/examples/
     * GetSqlManagedInstance.json
     */
    /**
     * Sample code: Updates a SQL Instance tags.
     * 
     * @param manager Entry point to AzureArcDataManager.
     */
    public static void updatesASQLInstanceTags(com.azure.resourcemanager.azurearcdata.AzureArcDataManager manager) {
        manager.sqlManagedInstances()
            .getByResourceGroupWithResponse("testrg", "testsqlManagedInstance", com.azure.core.util.Context.NONE);
    }
}
