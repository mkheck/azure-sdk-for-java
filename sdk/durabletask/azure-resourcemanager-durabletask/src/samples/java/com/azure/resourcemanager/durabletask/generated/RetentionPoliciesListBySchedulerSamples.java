// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.durabletask.generated;

/**
 * Samples for RetentionPolicies ListByScheduler.
 */
public final class RetentionPoliciesListBySchedulerSamples {
    /*
     * x-ms-original-file: 2025-04-01-preview/RetentionPolicies_ListByScheduler_MaximumSet_Gen.json
     */
    /**
     * Sample code: RetentionPolicies_ListByScheduler_MaximumSet.
     * 
     * @param manager Entry point to DurableTaskManager.
     */
    public static void
        retentionPoliciesListBySchedulerMaximumSet(com.azure.resourcemanager.durabletask.DurableTaskManager manager) {
        manager.retentionPolicies().listByScheduler("rgdurabletask", "myscheduler", com.azure.core.util.Context.NONE);
    }
}
