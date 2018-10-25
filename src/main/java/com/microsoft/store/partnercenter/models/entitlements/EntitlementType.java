// -----------------------------------------------------------------------
// <copyright file="EntitlementType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * List of entitlement artifact types.
 */
public enum EntitlementType
{
    /**
     * Enum initializer.
     */
    UNKNOWN("unknown"),

    /**
     * Virtual machine reserved instance entitlement.
     */
    VIRTUAL_MACHINE_RESERVED_INSTANCE("virtual_machine_reserved_instance"),

    /**
     * Software entitlement.
     */
    SOFTWARE("software");

    private final String value;

    EntitlementType(String value)
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