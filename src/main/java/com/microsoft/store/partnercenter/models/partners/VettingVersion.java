// -----------------------------------------------------------------------
// <copyright file="VettingVersion.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.partners;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum VettingVersion {
    /***
     *  None vetting version
     */
    @JsonProperty( "none" ) 
    None,

    /***
     * Latest vetting information: Will always get the latest vetting information no
     * matter if it is vetted or not
     */
    @JsonProperty( "current" ) 
    Current,

    /***
     * Latest finalized vetting information: Will return the latest vetting information
     * that is either (Authorized or Rejected)
     */
    @JsonProperty( "last_finalized" ) 
    LastFinalized
}