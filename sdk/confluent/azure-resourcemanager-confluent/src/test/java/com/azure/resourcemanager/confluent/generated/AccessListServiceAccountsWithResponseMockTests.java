// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.confluent.ConfluentManager;
import com.azure.resourcemanager.confluent.models.AccessListServiceAccountsSuccessResponse;
import com.azure.resourcemanager.confluent.models.ListAccessRequestModel;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AccessListServiceAccountsWithResponseMockTests {
    @Test
    public void testListServiceAccountsWithResponse() throws Exception {
        String responseStr
            = "{\"kind\":\"rlpyznuciqdsmexi\",\"metadata\":{\"first\":\"fuxtyasiibmiybnn\",\"last\":\"tgnljhnmgixhcmav\",\"prev\":\"foudor\",\"next\":\"gyyprotwy\",\"total_size\":677853893},\"data\":[{\"kind\":\"xhugcm\",\"id\":\"avlg\",\"metadata\":{\"self\":\"mftpmdtz\",\"resource_name\":\"ltfvnz\",\"created_at\":\"jtotpvopvpbd\",\"updated_at\":\"qgqqihedsvqwthmk\",\"deleted_at\":\"bcysih\"},\"display_name\":\"qcwdhoh\",\"description\":\"tmcdzsufcohd\"},{\"kind\":\"zlmcmuapcvhdb\",\"id\":\"wqqxeysko\",\"metadata\":{\"self\":\"inkfkbgbz\",\"resource_name\":\"wxeqocljmygvkzqk\",\"created_at\":\"eokbze\",\"updated_at\":\"zrxcczurt\",\"deleted_at\":\"ipqxbkwvzgnzv\"},\"display_name\":\"bzdixzmq\",\"description\":\"odawopqhewjptmcg\"},{\"kind\":\"ostzelndlatu\",\"id\":\"zlbiojlvfhrbbpn\",\"metadata\":{\"self\":\"cwwyyur\",\"resource_name\":\"chpp\",\"created_at\":\"rsnm\",\"updated_at\":\"ayzejnhlbkpbz\",\"deleted_at\":\"piljhahzvech\"},\"display_name\":\"bnwieholew\",\"description\":\"iuubwefqsf\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ConfluentManager manager = ConfluentManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AccessListServiceAccountsSuccessResponse response
            = manager.access()
                .listServiceAccountsWithResponse("nw", "acevehjkuyx",
                    new ListAccessRequestModel().withSearchFilters(
                        mapOf("faey", "gaoql", "hriypoqeyhlqhy", "inmfgvxirp")),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("rlpyznuciqdsmexi", response.kind());
        Assertions.assertEquals("fuxtyasiibmiybnn", response.metadata().first());
        Assertions.assertEquals("tgnljhnmgixhcmav", response.metadata().last());
        Assertions.assertEquals("foudor", response.metadata().prev());
        Assertions.assertEquals("gyyprotwy", response.metadata().next());
        Assertions.assertEquals(677853893, response.metadata().totalSize());
        Assertions.assertEquals("xhugcm", response.data().get(0).kind());
        Assertions.assertEquals("avlg", response.data().get(0).id());
        Assertions.assertEquals("mftpmdtz", response.data().get(0).metadata().self());
        Assertions.assertEquals("ltfvnz", response.data().get(0).metadata().resourceName());
        Assertions.assertEquals("jtotpvopvpbd", response.data().get(0).metadata().createdAt());
        Assertions.assertEquals("qgqqihedsvqwthmk", response.data().get(0).metadata().updatedAt());
        Assertions.assertEquals("bcysih", response.data().get(0).metadata().deletedAt());
        Assertions.assertEquals("qcwdhoh", response.data().get(0).displayName());
        Assertions.assertEquals("tmcdzsufcohd", response.data().get(0).description());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
