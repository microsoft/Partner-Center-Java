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
public enum ProvisioningStatus {
    @JsonProperty("none")
    None,

    @JsonProperty("success")
    Success,

    @JsonProperty("pending")
    Pending,

    @JsonProperty("failed")
    Failed
}