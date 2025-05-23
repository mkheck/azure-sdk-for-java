// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.UpdateComputePolicyProperties;
import com.azure.resourcemanager.datalakeanalytics.models.AadObjectType;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class UpdateComputePolicyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateComputePolicyProperties model = BinaryData.fromString(
            "{\"objectId\":\"d161c37d-3409-4e04-871f-49c51e46ee9a\",\"objectType\":\"Group\",\"maxDegreeOfParallelismPerJob\":445329815,\"minPriorityPerJob\":668778225}")
            .toObject(UpdateComputePolicyProperties.class);
        Assertions.assertEquals(UUID.fromString("d161c37d-3409-4e04-871f-49c51e46ee9a"), model.objectId());
        Assertions.assertEquals(AadObjectType.GROUP, model.objectType());
        Assertions.assertEquals(445329815, model.maxDegreeOfParallelismPerJob());
        Assertions.assertEquals(668778225, model.minPriorityPerJob());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateComputePolicyProperties model
            = new UpdateComputePolicyProperties().withObjectId(UUID.fromString("d161c37d-3409-4e04-871f-49c51e46ee9a"))
                .withObjectType(AadObjectType.GROUP)
                .withMaxDegreeOfParallelismPerJob(445329815)
                .withMinPriorityPerJob(668778225);
        model = BinaryData.fromObject(model).toObject(UpdateComputePolicyProperties.class);
        Assertions.assertEquals(UUID.fromString("d161c37d-3409-4e04-871f-49c51e46ee9a"), model.objectId());
        Assertions.assertEquals(AadObjectType.GROUP, model.objectType());
        Assertions.assertEquals(445329815, model.maxDegreeOfParallelismPerJob());
        Assertions.assertEquals(668778225, model.minPriorityPerJob());
    }
}
