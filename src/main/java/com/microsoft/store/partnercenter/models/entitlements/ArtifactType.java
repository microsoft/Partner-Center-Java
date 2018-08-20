// -----------------------------------------------------------------------
// <copyright file="ArtifactType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of entitlement artifact types.
 */
public enum ArtifactType {
    /***
     * Enum initializer.
     */
    @JsonProperty("unknown")
    Unknown,

    /***
     * Entitlement artifact for a virtual machine reserved instance.
     */
    @JsonProperty("virtual_machine_reserved_instance")
    VirtualMachineReservedInstance,

    /***
     * Entitlement artifact for a product key.
     */
    @JsonProperty("product_key")
    ProductKey
}