// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Status of developer portal in this API Management service.
 */
public final class DeveloperPortalStatus extends ExpandableStringEnum<DeveloperPortalStatus> {
    /**
     * Static value Enabled for DeveloperPortalStatus.
     */
    public static final DeveloperPortalStatus ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for DeveloperPortalStatus.
     */
    public static final DeveloperPortalStatus DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of DeveloperPortalStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeveloperPortalStatus() {
    }

    /**
     * Creates or finds a DeveloperPortalStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DeveloperPortalStatus.
     */
    public static DeveloperPortalStatus fromString(String name) {
        return fromString(name, DeveloperPortalStatus.class);
    }

    /**
     * Gets known DeveloperPortalStatus values.
     * 
     * @return known DeveloperPortalStatus values.
     */
    public static Collection<DeveloperPortalStatus> values() {
        return values(DeveloperPortalStatus.class);
    }
}
