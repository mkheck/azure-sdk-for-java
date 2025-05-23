// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.neonpostgres.fluent.models.ComputeInner;

/**
 * An instance of this class provides access to all the operations defined in ComputesClient.
 */
public interface ComputesClient {
    /**
     * Get a Compute.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param computeName The name of the Compute.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Compute along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ComputeInner> getWithResponse(String resourceGroupName, String organizationName, String projectName,
        String branchName, String computeName, Context context);

    /**
     * Get a Compute.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param computeName The name of the Compute.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Compute.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ComputeInner get(String resourceGroupName, String organizationName, String projectName, String branchName,
        String computeName);

    /**
     * Create a Compute.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param computeName The name of the Compute.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Compute resource type.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ComputeInner>, ComputeInner> beginCreateOrUpdate(String resourceGroupName,
        String organizationName, String projectName, String branchName, String computeName, ComputeInner resource);

    /**
     * Create a Compute.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param computeName The name of the Compute.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Compute resource type.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ComputeInner>, ComputeInner> beginCreateOrUpdate(String resourceGroupName,
        String organizationName, String projectName, String branchName, String computeName, ComputeInner resource,
        Context context);

    /**
     * Create a Compute.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param computeName The name of the Compute.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Compute resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ComputeInner createOrUpdate(String resourceGroupName, String organizationName, String projectName,
        String branchName, String computeName, ComputeInner resource);

    /**
     * Create a Compute.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param computeName The name of the Compute.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Compute resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ComputeInner createOrUpdate(String resourceGroupName, String organizationName, String projectName,
        String branchName, String computeName, ComputeInner resource, Context context);

    /**
     * Update a Compute.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param computeName The name of the Compute.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Compute resource type.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ComputeInner>, ComputeInner> beginUpdate(String resourceGroupName, String organizationName,
        String projectName, String branchName, String computeName, ComputeInner properties);

    /**
     * Update a Compute.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param computeName The name of the Compute.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Compute resource type.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ComputeInner>, ComputeInner> beginUpdate(String resourceGroupName, String organizationName,
        String projectName, String branchName, String computeName, ComputeInner properties, Context context);

    /**
     * Update a Compute.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param computeName The name of the Compute.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Compute resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ComputeInner update(String resourceGroupName, String organizationName, String projectName, String branchName,
        String computeName, ComputeInner properties);

    /**
     * Update a Compute.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param computeName The name of the Compute.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Compute resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ComputeInner update(String resourceGroupName, String organizationName, String projectName, String branchName,
        String computeName, ComputeInner properties, Context context);

    /**
     * Delete a Compute.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param computeName The name of the Compute.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String organizationName, String projectName,
        String branchName, String computeName, Context context);

    /**
     * Delete a Compute.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param computeName The name of the Compute.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String organizationName, String projectName, String branchName,
        String computeName);

    /**
     * List Compute resources by Branch.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Compute list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ComputeInner> list(String resourceGroupName, String organizationName, String projectName,
        String branchName);

    /**
     * List Compute resources by Branch.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param organizationName Name of the Neon Organizations resource.
     * @param projectName The name of the Project.
     * @param branchName The name of the Branch.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Compute list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ComputeInner> list(String resourceGroupName, String organizationName, String projectName,
        String branchName, Context context);
}
