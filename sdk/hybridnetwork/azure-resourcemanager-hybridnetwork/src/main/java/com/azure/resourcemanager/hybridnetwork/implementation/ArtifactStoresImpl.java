// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.fluent.ArtifactStoresClient;
import com.azure.resourcemanager.hybridnetwork.fluent.models.ArtifactStoreInner;
import com.azure.resourcemanager.hybridnetwork.models.ArtifactStore;
import com.azure.resourcemanager.hybridnetwork.models.ArtifactStores;

public final class ArtifactStoresImpl implements ArtifactStores {
    private static final ClientLogger LOGGER = new ClientLogger(ArtifactStoresImpl.class);

    private final ArtifactStoresClient innerClient;

    private final com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager;

    public ArtifactStoresImpl(ArtifactStoresClient innerClient,
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ArtifactStore> listByPublisher(String resourceGroupName, String publisherName) {
        PagedIterable<ArtifactStoreInner> inner
            = this.serviceClient().listByPublisher(resourceGroupName, publisherName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ArtifactStoreImpl(inner1, this.manager()));
    }

    public PagedIterable<ArtifactStore> listByPublisher(String resourceGroupName, String publisherName,
        Context context) {
        PagedIterable<ArtifactStoreInner> inner
            = this.serviceClient().listByPublisher(resourceGroupName, publisherName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ArtifactStoreImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String publisherName, String artifactStoreName) {
        this.serviceClient().delete(resourceGroupName, publisherName, artifactStoreName);
    }

    public void delete(String resourceGroupName, String publisherName, String artifactStoreName, Context context) {
        this.serviceClient().delete(resourceGroupName, publisherName, artifactStoreName, context);
    }

    public Response<ArtifactStore> getWithResponse(String resourceGroupName, String publisherName,
        String artifactStoreName, Context context) {
        Response<ArtifactStoreInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, publisherName, artifactStoreName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ArtifactStoreImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ArtifactStore get(String resourceGroupName, String publisherName, String artifactStoreName) {
        ArtifactStoreInner inner = this.serviceClient().get(resourceGroupName, publisherName, artifactStoreName);
        if (inner != null) {
            return new ArtifactStoreImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ArtifactStore getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publisherName = ResourceManagerUtils.getValueFromIdByName(id, "publishers");
        if (publisherName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'publishers'.", id)));
        }
        String artifactStoreName = ResourceManagerUtils.getValueFromIdByName(id, "artifactStores");
        if (artifactStoreName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'artifactStores'.", id)));
        }
        return this.getWithResponse(resourceGroupName, publisherName, artifactStoreName, Context.NONE).getValue();
    }

    public Response<ArtifactStore> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publisherName = ResourceManagerUtils.getValueFromIdByName(id, "publishers");
        if (publisherName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'publishers'.", id)));
        }
        String artifactStoreName = ResourceManagerUtils.getValueFromIdByName(id, "artifactStores");
        if (artifactStoreName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'artifactStores'.", id)));
        }
        return this.getWithResponse(resourceGroupName, publisherName, artifactStoreName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publisherName = ResourceManagerUtils.getValueFromIdByName(id, "publishers");
        if (publisherName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'publishers'.", id)));
        }
        String artifactStoreName = ResourceManagerUtils.getValueFromIdByName(id, "artifactStores");
        if (artifactStoreName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'artifactStores'.", id)));
        }
        this.delete(resourceGroupName, publisherName, artifactStoreName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publisherName = ResourceManagerUtils.getValueFromIdByName(id, "publishers");
        if (publisherName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'publishers'.", id)));
        }
        String artifactStoreName = ResourceManagerUtils.getValueFromIdByName(id, "artifactStores");
        if (artifactStoreName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'artifactStores'.", id)));
        }
        this.delete(resourceGroupName, publisherName, artifactStoreName, context);
    }

    private ArtifactStoresClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager() {
        return this.serviceManager;
    }

    public ArtifactStoreImpl define(String name) {
        return new ArtifactStoreImpl(name, this.manager());
    }
}
