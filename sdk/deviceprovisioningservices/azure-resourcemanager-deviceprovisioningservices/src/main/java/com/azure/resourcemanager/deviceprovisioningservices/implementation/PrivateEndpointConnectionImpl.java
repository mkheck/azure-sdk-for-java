// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.deviceprovisioningservices.models.PrivateEndpointConnection;
import com.azure.resourcemanager.deviceprovisioningservices.models.PrivateEndpointConnectionProperties;

public final class PrivateEndpointConnectionImpl
    implements PrivateEndpointConnection, PrivateEndpointConnection.Definition, PrivateEndpointConnection.Update {
    private PrivateEndpointConnectionInner innerObject;

    private final com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PrivateEndpointConnectionProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private String privateEndpointConnectionName;

    public PrivateEndpointConnectionImpl withExistingProvisioningService(String resourceGroupName,
        String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    public PrivateEndpointConnection create() {
        this.innerObject = serviceManager.serviceClient()
            .getIotDpsResources()
            .createOrUpdatePrivateEndpointConnection(resourceGroupName, resourceName, privateEndpointConnectionName,
                this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateEndpointConnection create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getIotDpsResources()
            .createOrUpdatePrivateEndpointConnection(resourceGroupName, resourceName, privateEndpointConnectionName,
                this.innerModel(), context);
        return this;
    }

    PrivateEndpointConnectionImpl(String name,
        com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
    }

    public PrivateEndpointConnectionImpl update() {
        return this;
    }

    public PrivateEndpointConnection apply() {
        this.innerObject = serviceManager.serviceClient()
            .getIotDpsResources()
            .createOrUpdatePrivateEndpointConnection(resourceGroupName, resourceName, privateEndpointConnectionName,
                this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateEndpointConnection apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getIotDpsResources()
            .createOrUpdatePrivateEndpointConnection(resourceGroupName, resourceName, privateEndpointConnectionName,
                this.innerModel(), context);
        return this;
    }

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner innerObject,
        com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "provisioningServices");
        this.privateEndpointConnectionName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "privateEndpointConnections");
    }

    public PrivateEndpointConnection refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getIotDpsResources()
            .getPrivateEndpointConnectionWithResponse(resourceGroupName, resourceName, privateEndpointConnectionName,
                Context.NONE)
            .getValue();
        return this;
    }

    public PrivateEndpointConnection refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getIotDpsResources()
            .getPrivateEndpointConnectionWithResponse(resourceGroupName, resourceName, privateEndpointConnectionName,
                context)
            .getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl withProperties(PrivateEndpointConnectionProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
