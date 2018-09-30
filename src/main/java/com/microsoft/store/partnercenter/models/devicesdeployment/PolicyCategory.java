// -----------------------------------------------------------------------
// <copyright file="PolicyCategory.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.devicesdeployment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the policy type that can be assigned to a device.
 */
public enum PolicyCategory {
    /***
     * Default settings for the policy.
     */
    @JsonProperty("none")
    NONE,

    /***
     * OOBE - Out of box experience policy setting.
     */
    @JsonProperty("o_o_b_e")
    OOBE
}