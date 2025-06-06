// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageAgentDetails;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class InMageAgentDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageAgentDetails model = BinaryData.fromString(
            "{\"agentVersion\":\"pcjycb\",\"agentUpdateStatus\":\"lrgttwfldsiuor\",\"postUpdateRebootStatus\":\"ikcedpk\",\"agentExpiryDate\":\"2021-02-08T07:42:37Z\"}")
            .toObject(InMageAgentDetails.class);
        Assertions.assertEquals("pcjycb", model.agentVersion());
        Assertions.assertEquals("lrgttwfldsiuor", model.agentUpdateStatus());
        Assertions.assertEquals("ikcedpk", model.postUpdateRebootStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-08T07:42:37Z"), model.agentExpiryDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageAgentDetails model = new InMageAgentDetails().withAgentVersion("pcjycb")
            .withAgentUpdateStatus("lrgttwfldsiuor")
            .withPostUpdateRebootStatus("ikcedpk")
            .withAgentExpiryDate(OffsetDateTime.parse("2021-02-08T07:42:37Z"));
        model = BinaryData.fromObject(model).toObject(InMageAgentDetails.class);
        Assertions.assertEquals("pcjycb", model.agentVersion());
        Assertions.assertEquals("lrgttwfldsiuor", model.agentUpdateStatus());
        Assertions.assertEquals("ikcedpk", model.postUpdateRebootStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-08T07:42:37Z"), model.agentExpiryDate());
    }
}
