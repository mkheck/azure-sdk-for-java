// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVMResourceFeatureSupportRequest;
import org.junit.jupiter.api.Assertions;

public final class AzureVMResourceFeatureSupportRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureVMResourceFeatureSupportRequest model = BinaryData
            .fromString(
                "{\"featureType\":\"AzureVMResourceBackup\",\"vmSize\":\"ygaolnjpnnb\",\"vmSku\":\"ksibjgsjjxx\"}")
            .toObject(AzureVMResourceFeatureSupportRequest.class);
        Assertions.assertEquals("ygaolnjpnnb", model.vmSize());
        Assertions.assertEquals("ksibjgsjjxx", model.vmSku());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureVMResourceFeatureSupportRequest model
            = new AzureVMResourceFeatureSupportRequest().withVmSize("ygaolnjpnnb").withVmSku("ksibjgsjjxx");
        model = BinaryData.fromObject(model).toObject(AzureVMResourceFeatureSupportRequest.class);
        Assertions.assertEquals("ygaolnjpnnb", model.vmSize());
        Assertions.assertEquals("ksibjgsjjxx", model.vmSku());
    }
}
