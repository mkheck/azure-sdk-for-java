// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.DestinationType;
import com.azure.resourcemanager.managednetworkfabric.models.Encapsulation;
import com.azure.resourcemanager.managednetworkfabric.models.IsolationDomainProperties;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapPatchableParametersDestinationsItem;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkTapPatchableParametersDestinationsItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkTapPatchableParametersDestinationsItem model = BinaryData.fromString(
            "{\"name\":\"agwiijc\",\"destinationType\":\"IsolationDomain\",\"destinationId\":\"whxpsbapial\",\"isolationDomainProperties\":{\"encapsulation\":\"None\",\"neighborGroupIds\":[\"uzudegefxl\"]},\"destinationTapRuleId\":\"ggo\"}")
            .toObject(NetworkTapPatchableParametersDestinationsItem.class);
        Assertions.assertEquals("agwiijc", model.name());
        Assertions.assertEquals(DestinationType.ISOLATION_DOMAIN, model.destinationType());
        Assertions.assertEquals("whxpsbapial", model.destinationId());
        Assertions.assertEquals(Encapsulation.NONE, model.isolationDomainProperties().encapsulation());
        Assertions.assertEquals("uzudegefxl", model.isolationDomainProperties().neighborGroupIds().get(0));
        Assertions.assertEquals("ggo", model.destinationTapRuleId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkTapPatchableParametersDestinationsItem model
            = new NetworkTapPatchableParametersDestinationsItem().withName("agwiijc")
                .withDestinationType(DestinationType.ISOLATION_DOMAIN)
                .withDestinationId("whxpsbapial")
                .withIsolationDomainProperties(new IsolationDomainProperties().withEncapsulation(Encapsulation.NONE)
                    .withNeighborGroupIds(Arrays.asList("uzudegefxl")))
                .withDestinationTapRuleId("ggo");
        model = BinaryData.fromObject(model).toObject(NetworkTapPatchableParametersDestinationsItem.class);
        Assertions.assertEquals("agwiijc", model.name());
        Assertions.assertEquals(DestinationType.ISOLATION_DOMAIN, model.destinationType());
        Assertions.assertEquals("whxpsbapial", model.destinationId());
        Assertions.assertEquals(Encapsulation.NONE, model.isolationDomainProperties().encapsulation());
        Assertions.assertEquals("uzudegefxl", model.isolationDomainProperties().neighborGroupIds().get(0));
        Assertions.assertEquals("ggo", model.destinationTapRuleId());
    }
}
