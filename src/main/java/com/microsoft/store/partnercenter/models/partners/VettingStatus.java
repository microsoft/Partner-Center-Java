// -----------------------------------------------------------------------
// <copyright file="VettingStatus.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.partners;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum VettingStatus {
    /***
     * None vetting status
     */
	@JsonProperty( "none" ) NONE,

    /***
     * Pending vetting status
     */
	@JsonProperty( "pending" ) PENDING,

    /***
     * Authorized vetting status
     */
	@JsonProperty( "authorized" ) AUTHORIZED,

    /***
     * Rejected vetting status
     */
	@JsonProperty( "rejected" ) REJECTED
}