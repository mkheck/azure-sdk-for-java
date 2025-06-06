// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.playwrighttesting.generated;

import com.azure.resourcemanager.playwrighttesting.models.Account;
import com.azure.resourcemanager.playwrighttesting.models.AccountUpdateProperties;
import com.azure.resourcemanager.playwrighttesting.models.EnablementStatus;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Accounts Update.
 */
public final class AccountsUpdateSamples {
    /*
     * x-ms-original-file: 2024-12-01/Accounts_Update.json
     */
    /**
     * Sample code: Accounts_Update.
     * 
     * @param manager Entry point to PlaywrightTestingManager.
     */
    public static void accountsUpdate(com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager manager) {
        Account resource = manager.accounts()
            .getByResourceGroupWithResponse("dummyrg", "myPlaywrightAccount", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("Team", "Dev Exp", "Division", "LT"))
            .withProperties(new AccountUpdateProperties().withRegionalAffinity(EnablementStatus.ENABLED))
            .apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
