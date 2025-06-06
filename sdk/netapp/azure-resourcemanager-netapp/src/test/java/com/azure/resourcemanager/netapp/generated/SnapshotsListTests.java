// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotInner;
import com.azure.resourcemanager.netapp.models.SnapshotsList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SnapshotsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotsList model = BinaryData.fromString(
            "{\"value\":[{\"location\":\"ysuiizynkedya\",\"properties\":{\"snapshotId\":\"yhqmibzyhwi\",\"created\":\"2021-05-22T03:58:36Z\",\"provisioningState\":\"pyy\"},\"id\":\"cdpu\",\"name\":\"nzgmwznmabik\",\"type\":\"sorgj\"},{\"location\":\"xbldtlwwrlkdmtn\",\"properties\":{\"snapshotId\":\"kotl\",\"created\":\"2021-09-05T12:27:29Z\",\"provisioningState\":\"h\"},\"id\":\"y\",\"name\":\"cogjltdtbn\",\"type\":\"hadoocrk\"}]}")
            .toObject(SnapshotsList.class);
        Assertions.assertEquals("ysuiizynkedya", model.value().get(0).location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotsList model
            = new SnapshotsList().withValue(Arrays.asList(new SnapshotInner().withLocation("ysuiizynkedya"),
                new SnapshotInner().withLocation("xbldtlwwrlkdmtn")));
        model = BinaryData.fromObject(model).toObject(SnapshotsList.class);
        Assertions.assertEquals("ysuiizynkedya", model.value().get(0).location());
    }
}
