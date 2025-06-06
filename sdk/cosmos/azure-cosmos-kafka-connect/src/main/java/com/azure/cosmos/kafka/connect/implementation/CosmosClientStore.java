// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.kafka.connect.implementation;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.GatewayConnectionConfig;
import com.azure.cosmos.ThrottlingRetryOptions;
import com.azure.cosmos.implementation.CosmosClientMetadataCachesSnapshot;
import com.azure.cosmos.implementation.ImplementationBridgeHelpers;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.azure.identity.ClientSecretCredential;
import com.azure.identity.ClientSecretCredentialBuilder;

import java.time.Duration;

public class CosmosClientStore {
    public static CosmosAsyncClient getCosmosClient(
        CosmosAccountConfig accountConfig,
        String sourceName) {

        return getCosmosClient(accountConfig, sourceName, null);
    }

    public static CosmosAsyncClient getCosmosClient(
        CosmosAccountConfig accountConfig,
        String sourceName,
        CosmosClientMetadataCachesSnapshot snapshot) {
        if (accountConfig == null) {
            return null;
        }

        CosmosClientBuilder cosmosClientBuilder = new CosmosClientBuilder()
            .endpoint(accountConfig.getEndpoint())
            .preferredRegions(accountConfig.getPreferredRegionsList())
            .throttlingRetryOptions(
                new ThrottlingRetryOptions()
                    .setMaxRetryAttemptsOnThrottledRequests(Integer.MAX_VALUE)
                    .setMaxRetryWaitTime(Duration.ofSeconds((Integer.MAX_VALUE / 1000) - 1)))
            .userAgentSuffix(getUserAgentSuffix(accountConfig, sourceName));

        if (accountConfig.isUseGatewayMode()) {
            cosmosClientBuilder.gatewayMode(new GatewayConnectionConfig().setMaxConnectionPoolSize(10000));
        }

        if (accountConfig.getCosmosAuthConfig() instanceof CosmosMasterKeyAuthConfig) {
            cosmosClientBuilder.key(((CosmosMasterKeyAuthConfig) accountConfig.getCosmosAuthConfig()).getMasterKey());
        } else if (accountConfig.getCosmosAuthConfig() instanceof CosmosAadAuthConfig) {
            CosmosAadAuthConfig aadAuthConfig = (CosmosAadAuthConfig) accountConfig.getCosmosAuthConfig();
            ClientSecretCredential tokenCredential = new ClientSecretCredentialBuilder()
                .authorityHost(aadAuthConfig.getAuthEndpoint())
                .tenantId(aadAuthConfig.getTenantId())
                .clientId(aadAuthConfig.getClientId())
                .clientSecret(aadAuthConfig.getClientSecret())
                .build();
            cosmosClientBuilder.credential(tokenCredential);
        } else {
            throw new IllegalArgumentException("Authorization type " + accountConfig.getCosmosAuthConfig().getClass() + "is not supported");
        }

        if (snapshot != null) {
            ImplementationBridgeHelpers.CosmosClientBuilderHelper
                .getCosmosClientBuilderAccessor()
                .setCosmosClientMetadataCachesSnapshot(cosmosClientBuilder, snapshot);
        }

        return cosmosClientBuilder.buildAsyncClient();
    }

    private static String getUserAgentSuffix(CosmosAccountConfig accountConfig, String sourceName) {
        String userAgentSuffix = KafkaCosmosConstants.USER_AGENT_SUFFIX;
        if (StringUtils.isNotEmpty(sourceName)) {
            userAgentSuffix += "|" + sourceName;
        }

        if (StringUtils.isNotEmpty(accountConfig.getApplicationName())) {
            userAgentSuffix += "|" + accountConfig.getApplicationName();
        }

        return userAgentSuffix;
    }
}
