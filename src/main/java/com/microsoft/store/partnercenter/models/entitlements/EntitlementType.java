// -----------------------------------------------------------------------
// <copyright file="EntitlementType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of entitlement artifact types.
 */
public enum EntitlementType {
    /***
     * Enum initializer.
     */
    @JsonProperty("unknown")
    Unknown,

    /***
     * Virtual machine reserved instance entitlement.
     */
    @JsonProperty("virtual_machine_reserved_instance")
    VirtualMachineReservedInstance,

    /***
     * Software entitlement.
     */
    @JsonProperty("software")
    Software
}