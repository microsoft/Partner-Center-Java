// -----------------------------------------------------------------------
// <copyright file="VettingSubStatus.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.partners;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum VettingSubStatus {
    /***
     * None vetting sub status
     */
    @JsonProperty( "none" )
    None,

    /***
     * The entry step
     */
    @JsonProperty( "entry" ) 
    Entry,

    /***
     * Email ownership check for business accounts
     */
    @JsonProperty( "email_ownership" ) 
    EmailOwnership,

    /***
     * Email Domain for business accounts
     */
    @JsonProperty( "email_domain" ) 
    EmailDomain,

    /***
     * Employment verification sub status
     */
    @JsonProperty( "employment_verification" ) 
    EmploymentVerification,

    /***
     * Decision making process
     */
    @JsonProperty( "decision" ) 
    Decision,

    /***
     * Other vetting sub status
     */
    @JsonProperty( "other" ) 
    Other,

    /***
     * Business verification sub status
     */
    @JsonProperty( "business_verification" ) 
    BusinessVerification
}