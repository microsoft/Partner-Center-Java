// -----------------------------------------------------------------------
// <copyright file="ConversionErrorCode.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * The type of errors that prevent trial subscription conversion from happening.
 */
public enum ConversionErrorCode {
    @JsonProperty("other")
    Other,

    @JsonProperty("conversions_not_found")
    ConversionsNotFound,

    @JsonProperty("pending")
    Pending,

    @JsonProperty("failed")
    Failed
}