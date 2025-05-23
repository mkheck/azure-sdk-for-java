// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.WorkflowModelSystemData;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class WorkflowModelSystemDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkflowModelSystemData model = BinaryData.fromString(
            "{\"createdBy\":\"zrfze\",\"createdByType\":\"ebizikayuh\",\"createdAt\":\"2021-08-17T20:49:33Z\",\"lastModifiedBy\":\"bs\",\"lastModifiedByType\":\"bqwrvtldgm\",\"lastModifiedAt\":\"2021-08-05T07:24:51Z\"}")
            .toObject(WorkflowModelSystemData.class);
        Assertions.assertEquals("zrfze", model.createdBy());
        Assertions.assertEquals("ebizikayuh", model.createdByType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-17T20:49:33Z"), model.createdAt());
        Assertions.assertEquals("bs", model.lastModifiedBy());
        Assertions.assertEquals("bqwrvtldgm", model.lastModifiedByType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-05T07:24:51Z"), model.lastModifiedAt());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkflowModelSystemData model = new WorkflowModelSystemData().withCreatedBy("zrfze")
            .withCreatedByType("ebizikayuh")
            .withCreatedAt(OffsetDateTime.parse("2021-08-17T20:49:33Z"))
            .withLastModifiedBy("bs")
            .withLastModifiedByType("bqwrvtldgm")
            .withLastModifiedAt(OffsetDateTime.parse("2021-08-05T07:24:51Z"));
        model = BinaryData.fromObject(model).toObject(WorkflowModelSystemData.class);
        Assertions.assertEquals("zrfze", model.createdBy());
        Assertions.assertEquals("ebizikayuh", model.createdByType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-17T20:49:33Z"), model.createdAt());
        Assertions.assertEquals("bs", model.lastModifiedBy());
        Assertions.assertEquals("bqwrvtldgm", model.lastModifiedByType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-05T07:24:51Z"), model.lastModifiedAt());
    }
}
