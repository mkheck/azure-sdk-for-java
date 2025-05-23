// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackNicDetails;

public final class InMageRcmFailbackNicDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmFailbackNicDetails model = BinaryData.fromString(
            "{\"macAddress\":\"slvivqsu\",\"networkName\":\"ten\",\"adapterType\":\"pijpkhc\",\"sourceIpAddress\":\"aqxukuicjufte\"}")
            .toObject(InMageRcmFailbackNicDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmFailbackNicDetails model = new InMageRcmFailbackNicDetails();
        model = BinaryData.fromObject(model).toObject(InMageRcmFailbackNicDetails.class);
    }
}
