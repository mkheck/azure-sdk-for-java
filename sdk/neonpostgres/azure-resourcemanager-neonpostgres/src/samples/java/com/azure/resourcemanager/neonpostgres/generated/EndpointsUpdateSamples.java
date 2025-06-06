// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.generated;

import com.azure.resourcemanager.neonpostgres.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.Endpoint;
import com.azure.resourcemanager.neonpostgres.models.EndpointProperties;
import com.azure.resourcemanager.neonpostgres.models.EndpointType;
import java.util.Arrays;

/**
 * Samples for Endpoints Update.
 */
public final class EndpointsUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01/Endpoints_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Endpoints_Update_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void endpointsUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        Endpoint resource = manager.endpoints()
            .getWithResponse("rgneon", "test-org", "entity-name", "entity-name", "entity-name",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new EndpointProperties().withEntityName("entity-name")
                .withAttributes(Arrays.asList(new Attributes().withName("trhvzyvaqy").withValue("evpkgsskyavybxwwssm")))
                .withProjectId("rtvdeeflqzlrpfzhjqhcsfbldw")
                .withBranchId("rzsyrhpfbydxtfkpaa")
                .withEndpointType(EndpointType.READ_ONLY))
            .apply();
    }
}
