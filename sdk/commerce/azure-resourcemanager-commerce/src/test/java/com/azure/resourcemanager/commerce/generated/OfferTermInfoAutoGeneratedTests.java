// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.commerce.models.OfferTermInfoAutoGenerated;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class OfferTermInfoAutoGeneratedTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OfferTermInfoAutoGenerated model = BinaryData
            .fromString("{\"Name\":\"OfferTermInfoAutoGenerated\",\"EffectiveDate\":\"2021-04-23T06:59:32Z\"}")
            .toObject(OfferTermInfoAutoGenerated.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-23T06:59:32Z"), model.effectiveDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OfferTermInfoAutoGenerated model
            = new OfferTermInfoAutoGenerated().withEffectiveDate(OffsetDateTime.parse("2021-04-23T06:59:32Z"));
        model = BinaryData.fromObject(model).toObject(OfferTermInfoAutoGenerated.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-23T06:59:32Z"), model.effectiveDate());
    }
}
