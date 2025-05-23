// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerorchestratorruntime.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerorchestratorruntime.implementation.models.BgpPeerListResult;
import org.junit.jupiter.api.Assertions;

public final class BgpPeerListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BgpPeerListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"myAsn\":1240813814,\"peerAsn\":681879854,\"peerAddress\":\"ocjjxhvpmouexh\",\"provisioningState\":\"Deleting\"},\"id\":\"bqe\",\"name\":\"jnxqbzvddntwn\",\"type\":\"eic\"},{\"properties\":{\"myAsn\":206399167,\"peerAsn\":1604770276,\"peerAddress\":\"pzaoqvuhr\",\"provisioningState\":\"Deleting\"},\"id\":\"cyddglmjthjqk\",\"name\":\"pyeicxm\",\"type\":\"ciwqvhk\"}],\"nextLink\":\"xuigdtopbobj\"}")
            .toObject(BgpPeerListResult.class);
        Assertions.assertEquals(1240813814, model.value().get(0).properties().myAsn());
        Assertions.assertEquals(681879854, model.value().get(0).properties().peerAsn());
        Assertions.assertEquals("ocjjxhvpmouexh", model.value().get(0).properties().peerAddress());
        Assertions.assertEquals("xuigdtopbobj", model.nextLink());
    }
}
