// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMapping;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReplicationNetworkMappingsListByReplicatMockTests {
    @Test
    public void testListByReplicationNetworks() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"state\":\"lcyeqdobobaqcabe\",\"primaryNetworkFriendlyName\":\"kcesrsi\",\"primaryNetworkId\":\"nl\",\"primaryFabricFriendlyName\":\"cxbjgfmyqyyfrri\",\"recoveryNetworkFriendlyName\":\"fpsfyakidfhmlxr\",\"recoveryNetworkId\":\"ekn\",\"recoveryFabricArmId\":\"kqafzvptriysjrgt\",\"recoveryFabricFriendlyName\":\"wpuqpsrc\",\"fabricSpecificSettings\":{\"instanceType\":\"NetworkMappingFabricSpecificSettings\"}},\"location\":\"vvoydwedggwg\",\"id\":\"lvbwatzadrjbjn\",\"name\":\"oarsrdr\",\"type\":\"i\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SiteRecoveryManager manager = SiteRecoveryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<NetworkMapping> response = manager.replicationNetworkMappings()
            .listByReplicationNetworks("xjouwfzcfd", "stiaxtyrnuhc", "hepisq", "cmlroiommemso",
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("lcyeqdobobaqcabe", response.iterator().next().properties().state());
        Assertions.assertEquals("kcesrsi", response.iterator().next().properties().primaryNetworkFriendlyName());
        Assertions.assertEquals("nl", response.iterator().next().properties().primaryNetworkId());
        Assertions.assertEquals("cxbjgfmyqyyfrri", response.iterator().next().properties().primaryFabricFriendlyName());
        Assertions.assertEquals("fpsfyakidfhmlxr",
            response.iterator().next().properties().recoveryNetworkFriendlyName());
        Assertions.assertEquals("ekn", response.iterator().next().properties().recoveryNetworkId());
        Assertions.assertEquals("kqafzvptriysjrgt", response.iterator().next().properties().recoveryFabricArmId());
        Assertions.assertEquals("wpuqpsrc", response.iterator().next().properties().recoveryFabricFriendlyName());
        Assertions.assertEquals("vvoydwedggwg", response.iterator().next().location());
    }
}
