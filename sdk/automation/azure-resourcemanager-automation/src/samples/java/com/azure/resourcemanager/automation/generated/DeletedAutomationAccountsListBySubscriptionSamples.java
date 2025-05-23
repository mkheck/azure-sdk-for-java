// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

/**
 * Samples for DeletedAutomationAccounts ListBySubscription.
 */
public final class DeletedAutomationAccountsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/stable/2022-01-31/examples/
     * getDeletedAutomationAccount.json
     */
    /**
     * Sample code: Get deleted automation account.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void getDeletedAutomationAccount(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.deletedAutomationAccounts().listBySubscriptionWithResponse(com.azure.core.util.Context.NONE);
    }
}
