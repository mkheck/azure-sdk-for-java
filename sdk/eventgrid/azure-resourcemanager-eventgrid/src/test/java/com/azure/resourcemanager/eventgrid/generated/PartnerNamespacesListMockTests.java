// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespace;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicRoutingMode;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PartnerNamespacesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"privateEndpointConnections\":[{\"properties\":{\"privateEndpoint\":{},\"groupIds\":[\"fsq\",\"hyqmrejparnpv\",\"rsz\",\"bwtdr\"],\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Creating\"},\"id\":\"w\",\"name\":\"l\",\"type\":\"zlhhfix\"}],\"provisioningState\":\"Deleting\",\"partnerRegistrationFullyQualifiedId\":\"ulz\",\"minimumTlsVersionAllowed\":\"1.1\",\"endpoint\":\"pfywv\",\"publicNetworkAccess\":\"Enabled\",\"inboundIpRules\":[{\"ipMask\":\"fzxsoxinunjlzkd\",\"action\":\"Allow\"},{\"ipMask\":\"sxyt\",\"action\":\"Allow\"},{\"ipMask\":\"miwdwisvnme\",\"action\":\"Allow\"},{\"ipMask\":\"amcajyhftpzcrryk\",\"action\":\"Allow\"}],\"disableLocalAuth\":true,\"partnerTopicRoutingMode\":\"ChannelNameHeader\"},\"location\":\"hkigglclwalhvub\",\"tags\":{\"yctajqz\":\"phetxdqc\",\"xb\":\"vale\",\"yxsbfpz\":\"biwksde\"},\"id\":\"oikvntwcz\",\"name\":\"zwushlcxpblal\",\"type\":\"hezpfkissaidqzs\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<PartnerNamespace> response
            = manager.partnerNamespaces().list("wqhdgsjsa", 1711960730, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hkigglclwalhvub", response.iterator().next().location());
        Assertions.assertEquals("phetxdqc", response.iterator().next().tags().get("yctajqz"));
        Assertions.assertEquals("ulz", response.iterator().next().partnerRegistrationFullyQualifiedId());
        Assertions.assertEquals(TlsVersion.ONE_ONE, response.iterator().next().minimumTlsVersionAllowed());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, response.iterator().next().publicNetworkAccess());
        Assertions.assertEquals("fzxsoxinunjlzkd", response.iterator().next().inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, response.iterator().next().inboundIpRules().get(0).action());
        Assertions.assertEquals(true, response.iterator().next().disableLocalAuth());
        Assertions.assertEquals(PartnerTopicRoutingMode.CHANNEL_NAME_HEADER,
            response.iterator().next().partnerTopicRoutingMode());
    }
}
