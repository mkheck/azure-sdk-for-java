// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.CreateMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectedItemResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProtectedItemsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"protectedItemType\":\"ProtectedItem\",\"backupManagementType\":\"Invalid\",\"workloadType\":\"SAPHanaDatabase\",\"containerName\":\"fyihduyeuyldp\",\"sourceResourceId\":\"tybkcgs\",\"policyId\":\"h\",\"lastRecoveryPoint\":\"2021-05-03T17:57:59Z\",\"backupSetName\":\"mwynefxexlfciatx\",\"createMode\":\"Default\",\"deferredDeleteTimeInUTC\":\"2021-03-04T21:02:41Z\",\"isScheduledForDeferredDelete\":true,\"deferredDeleteTimeRemaining\":\"skjh\",\"isDeferredDeleteScheduleUpcoming\":false,\"isRehydrate\":false,\"resourceGuardOperationRequests\":[\"oxcxscvslx\",\"hu\"],\"isArchiveEnabled\":true,\"policyName\":\"muk\",\"softDeleteRetentionPeriodInDays\":1314222544,\"vaultId\":\"kxettcslojfkq\"},\"eTag\":\"nqtoqx\",\"location\":\"hqxc\",\"tags\":{\"mbiipsnawwlqk\":\"tkbtnqlrngl\",\"xricctkwmuqq\":\"nxhhl\"},\"id\":\"ajxeiygle\",\"name\":\"rwvaexhdc\",\"type\":\"rceqnkbrupob\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        ProtectedItemResource response = manager.protectedItems()
            .getWithResponse("ngatwmy", "yutrymd", "mfjhpycvjqdvdwkq", "ldrlefgnaavua", "n", "etaoutnpdc",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("hqxc", response.location());
        Assertions.assertEquals("tkbtnqlrngl", response.tags().get("mbiipsnawwlqk"));
        Assertions.assertEquals("fyihduyeuyldp", response.properties().containerName());
        Assertions.assertEquals("tybkcgs", response.properties().sourceResourceId());
        Assertions.assertEquals("h", response.properties().policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-03T17:57:59Z"),
            response.properties().lastRecoveryPoint());
        Assertions.assertEquals("mwynefxexlfciatx", response.properties().backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, response.properties().createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-04T21:02:41Z"),
            response.properties().deferredDeleteTimeInUtc());
        Assertions.assertEquals(true, response.properties().isScheduledForDeferredDelete());
        Assertions.assertEquals("skjh", response.properties().deferredDeleteTimeRemaining());
        Assertions.assertEquals(false, response.properties().isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, response.properties().isRehydrate());
        Assertions.assertEquals("oxcxscvslx", response.properties().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(true, response.properties().isArchiveEnabled());
        Assertions.assertEquals("muk", response.properties().policyName());
        Assertions.assertEquals(1314222544, response.properties().softDeleteRetentionPeriod());
        Assertions.assertEquals("nqtoqx", response.etag());
    }
}
