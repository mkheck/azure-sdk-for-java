// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.secretsstoreextension.generated;

import com.azure.resourcemanager.secretsstoreextension.models.AzureKeyVaultSecretProviderClass;
import com.azure.resourcemanager.secretsstoreextension.models.AzureKeyVaultSecretProviderClassUpdateProperties;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AzureKeyVaultSecretProviderClasses Update.
 */
public final class AzureKeyVaultSecretProviderClassesUpdateSamples {
    /*
     * x-ms-original-file: 2024-08-21-preview/AzureKeyVaultSecretProviderClasses_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: AzureKeyVaultSecretProviderClasses_Update.
     * 
     * @param manager Entry point to SecretsStoreExtensionManager.
     */
    public static void azureKeyVaultSecretProviderClassesUpdate(
        com.azure.resourcemanager.secretsstoreextension.SecretsStoreExtensionManager manager) {
        AzureKeyVaultSecretProviderClass resource = manager.azureKeyVaultSecretProviderClasses()
            .getByResourceGroupWithResponse("rg-ssc-example", "akvspc-ssc-example", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("example-tag", "example-tag-value"))
            .withProperties(new AzureKeyVaultSecretProviderClassUpdateProperties()
                .withKeyvaultName("fakeTokenPlaceholder")
                .withClientId("00000000-0000-0000-0000-000000000000")
                .withTenantId("00000000-0000-0000-0000-000000000000")
                .withObjects(
                    "array: |\n  - |\n    objectName: my-secret-object\n    objectType: secret\n    objectVersionHistory: 1"))
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
