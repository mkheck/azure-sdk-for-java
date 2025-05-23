// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The application client type.
 */
public final class ClientType extends ExpandableStringEnum<ClientType> {
    /**
     * Static value none for ClientType.
     */
    public static final ClientType NONE = fromString("none");

    /**
     * Static value dotnet for ClientType.
     */
    public static final ClientType DOTNET = fromString("dotnet");

    /**
     * Static value java for ClientType.
     */
    public static final ClientType JAVA = fromString("java");

    /**
     * Static value python for ClientType.
     */
    public static final ClientType PYTHON = fromString("python");

    /**
     * Static value go for ClientType.
     */
    public static final ClientType GO = fromString("go");

    /**
     * Static value php for ClientType.
     */
    public static final ClientType PHP = fromString("php");

    /**
     * Static value ruby for ClientType.
     */
    public static final ClientType RUBY = fromString("ruby");

    /**
     * Static value django for ClientType.
     */
    public static final ClientType DJANGO = fromString("django");

    /**
     * Static value nodejs for ClientType.
     */
    public static final ClientType NODEJS = fromString("nodejs");

    /**
     * Static value springBoot for ClientType.
     */
    public static final ClientType SPRING_BOOT = fromString("springBoot");

    /**
     * Static value kafka-springBoot for ClientType.
     */
    public static final ClientType KAFKA_SPRING_BOOT = fromString("kafka-springBoot");

    /**
     * Creates a new instance of ClientType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClientType() {
    }

    /**
     * Creates or finds a ClientType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ClientType.
     */
    public static ClientType fromString(String name) {
        return fromString(name, ClientType.class);
    }

    /**
     * Gets known ClientType values.
     * 
     * @return known ClientType values.
     */
    public static Collection<ClientType> values() {
        return values(ClientType.class);
    }
}
