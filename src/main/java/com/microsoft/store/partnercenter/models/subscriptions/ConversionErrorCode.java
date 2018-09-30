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
    OTHER,

    @JsonProperty("conversions_not_found")
    CONVERSIONS_NOT_FOUND,

    @JsonProperty("pending")
    PENDING,

    @JsonProperty("failed")
    FAILED
}