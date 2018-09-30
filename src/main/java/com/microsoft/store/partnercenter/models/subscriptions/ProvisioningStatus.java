// -----------------------------------------------------------------------
// <copyright file="ProvisioningStatus.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Lists the available status for a subscription provisioning status.
 */
public enum ProvisioningStatus 
{
    @JsonProperty("none")
    NONE,

    @JsonProperty("success")
    SUCCESS,

    @JsonProperty("pending")
    PENDING,

    @JsonProperty("failed")
    FAILED
}