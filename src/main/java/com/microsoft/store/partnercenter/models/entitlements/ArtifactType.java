// -----------------------------------------------------------------------
// <copyright file="ArtifactType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * List of entitlement artifact types.
 */
public enum ArtifactType
{
    /**
     * Enum initializer.
     */
    UNKNOWN("unknown"),

    /**
     * Entitlement artifact for a virtual machine reserved instance.
     */
    VIRTUAL_MACHINE_RESERVED_INSTANCE("virtual_machine_reserved_instance"),

    /**
     * Entitlement artifact for a product key.
     */
    PRODUCT_KEY("product_key");

    private final String value;

    ArtifactType(String value)
    {
        this.value = value;
    }

    /**
     * Converts the object to a string.
     *
     * @return A string that represents this object.
     */
    @JsonValue
    @Override
    public String toString()
    {
        return value;
    }
}