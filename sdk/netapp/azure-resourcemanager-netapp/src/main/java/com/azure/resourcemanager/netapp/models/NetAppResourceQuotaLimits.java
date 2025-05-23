// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of NetAppResourceQuotaLimits.
 */
public interface NetAppResourceQuotaLimits {
    /**
     * Get quota limits
     * 
     * Get the default and current limits for quotas.
     * 
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current limits for quotas as paginated response with {@link PagedIterable}.
     */
    PagedIterable<QuotaItem> list(String location);

    /**
     * Get quota limits
     * 
     * Get the default and current limits for quotas.
     * 
     * @param location The name of the Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current limits for quotas as paginated response with {@link PagedIterable}.
     */
    PagedIterable<QuotaItem> list(String location, Context context);

    /**
     * Get quota limits
     * 
     * Get the default and current subscription quota limit.
     * 
     * @param location The name of the Azure region.
     * @param quotaLimitName The name of the Quota Limit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current subscription quota limit along with {@link Response}.
     */
    Response<QuotaItem> getWithResponse(String location, String quotaLimitName, Context context);

    /**
     * Get quota limits
     * 
     * Get the default and current subscription quota limit.
     * 
     * @param location The name of the Azure region.
     * @param quotaLimitName The name of the Quota Limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current subscription quota limit.
     */
    QuotaItem get(String location, String quotaLimitName);
}
