// -----------------------------------------------------------------------
// <copyright file="VettingSubStatus.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.partners;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum VettingSubStatus {
    /**
     * None vetting sub status
     */
    @JsonProperty( "none" )
    NONE,

    /**
     * The entry step
     */
    @JsonProperty( "entry" ) 
    ENTRY,

    /**
     * Email ownership check for business accounts
     */
    @JsonProperty( "email_ownership" ) 
    EMAIL_OWNERSHIP,

    /**
     * Email Domain for business accounts
     */
    @JsonProperty( "email_domain" ) 
    EMAIL_DOMAIN,

    /**
     * Employment verification sub status
     */
    @JsonProperty( "employment_verification" ) 
    EMPLOYMENT_VERIFICATION,

    /**
     * Decision making process
     */
    @JsonProperty( "decision" ) 
    DECISION,

    /**
     * Other vetting sub status
     */
    @JsonProperty( "other" ) 
    OTHER,

    /**
     * Business verification sub status
     */
    @JsonProperty( "business_verification" ) 
    BUSINESS_VERIFICATION
}