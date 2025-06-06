// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.fluent.models.DiagnosticContractInner;
import com.azure.resourcemanager.apimanagement.models.AlwaysLog;
import com.azure.resourcemanager.apimanagement.models.BodyDiagnosticSettings;
import com.azure.resourcemanager.apimanagement.models.HttpMessageDiagnostic;
import com.azure.resourcemanager.apimanagement.models.PipelineDiagnosticSettings;
import com.azure.resourcemanager.apimanagement.models.SamplingSettings;
import com.azure.resourcemanager.apimanagement.models.SamplingType;
import java.util.Arrays;

/**
 * Samples for WorkspaceApiDiagnostic CreateOrUpdate.
 */
public final class WorkspaceApiDiagnosticCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementCreateWorkspaceApiDiagnostic.json
     */
    /**
     * Sample code: ApiManagementCreateWorkspaceApiDiagnostic.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateWorkspaceApiDiagnostic(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.workspaceApiDiagnostics()
            .createOrUpdateWithResponse("rg1", "apimService1", "wks1", "57d1f7558aa04f15146d9d8a",
                "applicationinsights",
                new DiagnosticContractInner().withAlwaysLog(AlwaysLog.ALL_ERRORS)
                    .withLoggerId("/workspaces/wks1/loggers/applicationinsights")
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
                            .withBody(new BodyDiagnosticSettings().withBytes(512)))),
                null, com.azure.core.util.Context.NONE);
    }
}
