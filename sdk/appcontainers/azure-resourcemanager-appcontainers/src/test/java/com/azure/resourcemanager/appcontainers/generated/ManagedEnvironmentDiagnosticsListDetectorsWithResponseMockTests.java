// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsCollection;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ManagedEnvironmentDiagnosticsListDetectorsWithResponseMockTests {
    @Test
    public void testListDetectorsWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"metadata\":{\"id\":\"zcmjhngxnoqrxt\",\"name\":\"sn\",\"description\":\"vhdl\",\"author\":\"did\",\"category\":\"epfwwt\",\"supportTopicList\":[{},{},{}],\"analysisTypes\":[\"sxxh\",\"wcdbckyoik\",\"kxhnegknj\",\"rbhtmeplvukaobr\"],\"type\":\"pgsn\",\"score\":16.630627},\"dataset\":[{},{},{}],\"status\":{\"message\":\"hg\",\"statusId\":1680532748},\"dataProviderMetadata\":{\"providerName\":\"akywalhjymxcgqta\",\"propertyBag\":[{},{}]}},\"id\":\"lss\",\"name\":\"ljomevt\",\"type\":\"ycnlbvgjcodk\"},{\"properties\":{\"metadata\":{\"id\":\"iytssikizbc\",\"name\":\"q\",\"description\":\"ntnrgmqsorh\",\"author\":\"kxgnlykmxcpwzvmd\",\"category\":\"sqdtiwlwxlbon\",\"supportTopicList\":[{},{},{},{}],\"analysisTypes\":[\"qicqchygt\",\"xbyja\",\"epubdp\",\"xyqvg\"],\"type\":\"aodetv\",\"score\":82.464134},\"dataset\":[{},{},{}],\"status\":{\"message\":\"wsaifmcwno\",\"statusId\":2130400407},\"dataProviderMetadata\":{\"providerName\":\"hg\",\"propertyBag\":[{}]}},\"id\":\"cknjolgj\",\"name\":\"yxpvelszerqze\",\"type\":\"xoqeintxwalj\"}],\"nextLink\":\"zoblq\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerAppsApiManager manager = ContainerAppsApiManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        DiagnosticsCollection response = manager.managedEnvironmentDiagnostics()
            .listDetectorsWithResponse("w", "pcpahprzrvxhmtf", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("sxxh", response.value().get(0).properties().metadata().analysisTypes().get(0));
        Assertions.assertEquals("hg", response.value().get(0).properties().status().message());
        Assertions.assertEquals(1680532748, response.value().get(0).properties().status().statusId());
        Assertions.assertEquals("akywalhjymxcgqta",
            response.value().get(0).properties().dataProviderMetadata().providerName());
    }
}
