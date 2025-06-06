// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.AlwaysLog;
import com.azure.resourcemanager.apimanagement.models.BodyDiagnosticSettings;
import com.azure.resourcemanager.apimanagement.models.HttpMessageDiagnostic;
import com.azure.resourcemanager.apimanagement.models.PipelineDiagnosticSettings;
import com.azure.resourcemanager.apimanagement.models.SamplingSettings;
import com.azure.resourcemanager.apimanagement.models.SamplingType;
import java.util.Arrays;

/**
 * Samples for ApiDiagnostic CreateOrUpdate.
 */
public final class ApiDiagnosticCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementCreateApiDiagnostic.json
     */
    /**
     * Sample code: ApiManagementCreateApiDiagnostic.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementCreateApiDiagnostic(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apiDiagnostics()
            .define("applicationinsights")
            .withExistingApi("rg1", "apimService1", "57d1f7558aa04f15146d9d8a")
            .withAlwaysLog(AlwaysLog.ALL_ERRORS)
            .withLoggerId("/loggers/applicationinsights")
            .withSampling(new SamplingSettings().withSamplingType(SamplingType.FIXED).withPercentage(50.0D))
            .withFrontend(new PipelineDiagnosticSettings()
                .withRequest(new HttpMessageDiagnostic().withHeaders(Arrays.asList("Content-type"))
                    .withBody(new BodyDiagnosticSettings().withBytes(512)))
                .withResponse(new HttpMessageDiagnostic().withHeaders(Arrays.asList("Content-type"))
                    .withBody(new BodyDiagnosticSettings().withBytes(512))))
            .withBackend(new PipelineDiagnosticSettings()
                .withRequest(new HttpMessageDiagnostic().withHeaders(Arrays.asList("Content-type"))
                    .withBody(new BodyDiagnosticSettings().withBytes(512)))
                .withResponse(new HttpMessageDiagnostic().withHeaders(Arrays.asList("Content-type"))
                    .withBody(new BodyDiagnosticSettings().withBytes(512))))
            .create();
    }
}
