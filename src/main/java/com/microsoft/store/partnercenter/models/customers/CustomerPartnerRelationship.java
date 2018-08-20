// -----------------------------------------------------------------------
// <copyright file="CustomerPartnerRelationship.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.customers;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CustomerPartnerRelationship
{
    /**
     *  Unknown. Used for initialization.
     */
    @JsonProperty( "unknown" ) UNKNWON, 
    
    /**
     * None. Used to remove reseller relationship between the customer and partner.
     */
    @JsonProperty( "none" ) NONE,
    
    /**
     * The reseller relationship
     */
    @JsonProperty( "reseller" ) RESELLER,
    
    /**
     * The advisor relationship
     */
    @JsonProperty( "advisor" ) ADVISOR,
    
    /**
     * Indicates that the partner is a syndication partner of the customer.
     */
    @JsonProperty( "syndication" ) SYNDICATION,
    
    /**
     * Indicates that the partner is a Microsoft Support agent for the customer.
     */
    @JsonProperty( "microsoftSupport" ) MICROSOFTSUPPORT
}