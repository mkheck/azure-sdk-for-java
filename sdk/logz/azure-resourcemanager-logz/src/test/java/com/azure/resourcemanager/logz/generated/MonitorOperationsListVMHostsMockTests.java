// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.logz.LogzManager;
import com.azure.resourcemanager.logz.models.VMResources;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class MonitorOperationsListVMHostsMockTests {
    @Test
    public void testListVMHosts() throws Exception {
        String responseStr = "{\"value\":[{\"id\":\"iyylhalnswhccsp\",\"agentVersion\":\"aivwitqscywu\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LogzManager manager = LogzManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<VMResources> response
            = manager.monitorOperations().listVMHosts("qhoftrmaequiah", "icslfaoq", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("iyylhalnswhccsp", response.iterator().next().id());
        Assertions.assertEquals("aivwitqscywu", response.iterator().next().agentVersion());
    }
}
