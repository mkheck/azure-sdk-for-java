// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.ReferenceDataSetResourceInner;
import com.azure.resourcemanager.timeseriesinsights.models.DataStringComparisonBehavior;
import com.azure.resourcemanager.timeseriesinsights.models.ProvisioningState;
import com.azure.resourcemanager.timeseriesinsights.models.ReferenceDataSetCreateOrUpdateParameters;
import com.azure.resourcemanager.timeseriesinsights.models.ReferenceDataSetKeyProperty;
import com.azure.resourcemanager.timeseriesinsights.models.ReferenceDataSetResource;
import com.azure.resourcemanager.timeseriesinsights.models.ReferenceDataSetUpdateParameters;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ReferenceDataSetResourceImpl
    implements ReferenceDataSetResource, ReferenceDataSetResource.Definition, ReferenceDataSetResource.Update {
    private ReferenceDataSetResourceInner innerObject;

    private final com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public List<ReferenceDataSetKeyProperty> keyProperties() {
        List<ReferenceDataSetKeyProperty> inner = this.innerModel().keyProperties();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DataStringComparisonBehavior dataStringComparisonBehavior() {
        return this.innerModel().dataStringComparisonBehavior();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ReferenceDataSetResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String environmentName;

    private String referenceDataSetName;

    private ReferenceDataSetCreateOrUpdateParameters createParameters;

    private ReferenceDataSetUpdateParameters updateReferenceDataSetUpdateParameters;

    public ReferenceDataSetResourceImpl withExistingEnvironment(String resourceGroupName, String environmentName) {
        this.resourceGroupName = resourceGroupName;
        this.environmentName = environmentName;
        return this;
    }

    public ReferenceDataSetResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getReferenceDataSets()
            .createOrUpdateWithResponse(resourceGroupName, environmentName, referenceDataSetName, createParameters,
                Context.NONE)
            .getValue();
        return this;
    }

    public ReferenceDataSetResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getReferenceDataSets()
            .createOrUpdateWithResponse(resourceGroupName, environmentName, referenceDataSetName, createParameters,
                context)
            .getValue();
        return this;
    }

    ReferenceDataSetResourceImpl(String name,
        com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager serviceManager) {
        this.innerObject = new ReferenceDataSetResourceInner();
        this.serviceManager = serviceManager;
        this.referenceDataSetName = name;
        this.createParameters = new ReferenceDataSetCreateOrUpdateParameters();
    }

    public ReferenceDataSetResourceImpl update() {
        this.updateReferenceDataSetUpdateParameters = new ReferenceDataSetUpdateParameters();
        return this;
    }

    public ReferenceDataSetResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getReferenceDataSets()
            .updateWithResponse(resourceGroupName, environmentName, referenceDataSetName,
                updateReferenceDataSetUpdateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public ReferenceDataSetResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getReferenceDataSets()
            .updateWithResponse(resourceGroupName, environmentName, referenceDataSetName,
                updateReferenceDataSetUpdateParameters, context)
            .getValue();
        return this;
    }

    ReferenceDataSetResourceImpl(ReferenceDataSetResourceInner innerObject,
        com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.environmentName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "environments");
        this.referenceDataSetName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "referenceDataSets");
    }

    public ReferenceDataSetResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getReferenceDataSets()
            .getWithResponse(resourceGroupName, environmentName, referenceDataSetName, Context.NONE)
            .getValue();
        return this;
    }

    public ReferenceDataSetResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getReferenceDataSets()
            .getWithResponse(resourceGroupName, environmentName, referenceDataSetName, context)
            .getValue();
        return this;
    }

    public ReferenceDataSetResourceImpl withRegion(Region location) {
        this.createParameters.withLocation(location.toString());
        return this;
    }

    public ReferenceDataSetResourceImpl withRegion(String location) {
        this.createParameters.withLocation(location);
        return this;
    }

    public ReferenceDataSetResourceImpl withKeyProperties(List<ReferenceDataSetKeyProperty> keyProperties) {
        this.createParameters.withKeyProperties(keyProperties);
        return this;
    }

    public ReferenceDataSetResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateReferenceDataSetUpdateParameters.withTags(tags);
            return this;
        }
    }

    public ReferenceDataSetResourceImpl
        withDataStringComparisonBehavior(DataStringComparisonBehavior dataStringComparisonBehavior) {
        this.createParameters.withDataStringComparisonBehavior(dataStringComparisonBehavior);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
