// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

/**
 * Samples for StreamingJobs ListByResourceGroup.
 */
public final class StreamingJobsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/streamanalytics/resource-manager/Microsoft.StreamAnalytics/stable/2020-03-01/examples/
     * StreamingJob_List_ByResourceGroup_Expand.json
     */
    /**
     * Sample code: List all streaming jobs in a resource group and use the $expand OData query parameter to expand
     * inputs, outputs, transformation, and functions.
     * 
     * @param manager Entry point to StreamAnalyticsManager.
     */
    public static void
        listAllStreamingJobsInAResourceGroupAndUseTheExpandODataQueryParameterToExpandInputsOutputsTransformationAndFunctions(
            com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager) {
        manager.streamingJobs()
            .listByResourceGroup("sjrg3276", "inputs,outputs,transformation,functions",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/streamanalytics/resource-manager/Microsoft.StreamAnalytics/stable/2020-03-01/examples/
     * StreamingJob_List_ByResourceGroup_NoExpand.json
     */
    /**
     * Sample code: List all streaming jobs in a resource group and do not use the $expand OData query parameter.
     * 
     * @param manager Entry point to StreamAnalyticsManager.
     */
    public static void listAllStreamingJobsInAResourceGroupAndDoNotUseTheExpandODataQueryParameter(
        com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager) {
        manager.streamingJobs().listByResourceGroup("sjrg6936", null, com.azure.core.util.Context.NONE);
    }
}
