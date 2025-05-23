// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The resource representation of a service topology. */
@Fluent
public final class ServiceTopologyResourceInner extends Resource {
    /*
     * The properties that define the service topology.
     */
    @JsonProperty(value = "properties", required = true)
    private ServiceTopologyResourceProperties innerProperties = new ServiceTopologyResourceProperties();

    /** Creates an instance of ServiceTopologyResourceInner class. */
    public ServiceTopologyResourceInner() {
    }

    /**
     * Get the innerProperties property: The properties that define the service topology.
     *
     * @return the innerProperties value.
     */
    private ServiceTopologyResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceTopologyResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceTopologyResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the artifactSourceId property: The resource Id of the artifact source that contains the artifacts that can be
     * referenced in the service units.
     *
     * @return the artifactSourceId value.
     */
    public String artifactSourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().artifactSourceId();
    }

    /**
     * Set the artifactSourceId property: The resource Id of the artifact source that contains the artifacts that can be
     * referenced in the service units.
     *
     * @param artifactSourceId the artifactSourceId value to set.
     * @return the ServiceTopologyResourceInner object itself.
     */
    public ServiceTopologyResourceInner withArtifactSourceId(String artifactSourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceTopologyResourceProperties();
        }
        this.innerProperties().withArtifactSourceId(artifactSourceId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model ServiceTopologyResourceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServiceTopologyResourceInner.class);
}
