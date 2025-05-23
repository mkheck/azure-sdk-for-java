// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AzureVmDiskDetails;
import org.junit.jupiter.api.Assertions;

public final class AzureVmDiskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureVmDiskDetails model = BinaryData.fromString(
            "{\"vhdType\":\"ixiezeag\",\"vhdId\":\"eituugedhfpjs\",\"diskId\":\"zmblsyjdeol\",\"vhdName\":\"aebfsyrled\",\"maxSizeMB\":\"ustbvtqigdx\",\"targetDiskLocation\":\"sgeafgfosehx\",\"targetDiskName\":\"sxezppkkwaa\",\"lunId\":\"k\",\"diskEncryptionSetId\":\"jlpzeqtoyrp\",\"customTargetDiskName\":\"xlaj\"}")
            .toObject(AzureVmDiskDetails.class);
        Assertions.assertEquals("ixiezeag", model.vhdType());
        Assertions.assertEquals("eituugedhfpjs", model.vhdId());
        Assertions.assertEquals("zmblsyjdeol", model.diskId());
        Assertions.assertEquals("aebfsyrled", model.vhdName());
        Assertions.assertEquals("ustbvtqigdx", model.maxSizeMB());
        Assertions.assertEquals("sgeafgfosehx", model.targetDiskLocation());
        Assertions.assertEquals("sxezppkkwaa", model.targetDiskName());
        Assertions.assertEquals("k", model.lunId());
        Assertions.assertEquals("jlpzeqtoyrp", model.diskEncryptionSetId());
        Assertions.assertEquals("xlaj", model.customTargetDiskName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureVmDiskDetails model = new AzureVmDiskDetails().withVhdType("ixiezeag")
            .withVhdId("eituugedhfpjs")
            .withDiskId("zmblsyjdeol")
            .withVhdName("aebfsyrled")
            .withMaxSizeMB("ustbvtqigdx")
            .withTargetDiskLocation("sgeafgfosehx")
            .withTargetDiskName("sxezppkkwaa")
            .withLunId("k")
            .withDiskEncryptionSetId("jlpzeqtoyrp")
            .withCustomTargetDiskName("xlaj");
        model = BinaryData.fromObject(model).toObject(AzureVmDiskDetails.class);
        Assertions.assertEquals("ixiezeag", model.vhdType());
        Assertions.assertEquals("eituugedhfpjs", model.vhdId());
        Assertions.assertEquals("zmblsyjdeol", model.diskId());
        Assertions.assertEquals("aebfsyrled", model.vhdName());
        Assertions.assertEquals("ustbvtqigdx", model.maxSizeMB());
        Assertions.assertEquals("sgeafgfosehx", model.targetDiskLocation());
        Assertions.assertEquals("sxezppkkwaa", model.targetDiskName());
        Assertions.assertEquals("k", model.lunId());
        Assertions.assertEquals("jlpzeqtoyrp", model.diskEncryptionSetId());
        Assertions.assertEquals("xlaj", model.customTargetDiskName());
    }
}
