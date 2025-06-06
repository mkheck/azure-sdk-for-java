// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.SkuDescription;
import org.junit.jupiter.api.Assertions;

public final class SkuDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuDescription model
            = BinaryData.fromString("{\"id\":\"enjbdlwtgrhp\",\"name\":\"jp\"}").toObject(SkuDescription.class);
        Assertions.assertEquals("enjbdlwtgrhp", model.id());
        Assertions.assertEquals("jp", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuDescription model = new SkuDescription().withId("enjbdlwtgrhp").withName("jp");
        model = BinaryData.fromObject(model).toObject(SkuDescription.class);
        Assertions.assertEquals("enjbdlwtgrhp", model.id());
        Assertions.assertEquals("jp", model.name());
    }
}
