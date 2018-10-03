// ----------------------------------------------------------------
// <copyright file="ServiceRequestSeverity.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.models.servicerequests;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ServiceRequestSeverity
{
    /**
     * Describes service required status Severity Unknown
     */
    @JsonProperty( "unknown" ) 
    UNKNOWN, 
    
    /**
     * Service Request Impact Critical
     */
    @JsonProperty( "critical" ) 
    CRITICAL, 
    
    /**
     * Service Request Impact Moderate
     */
    @JsonProperty( "moderate" ) 
    MODERATE, 
    
    /**
     * Service Request Impact Minimal
     */
    @JsonProperty( "minimal" ) 
    MINIMAL
}