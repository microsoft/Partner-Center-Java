// ----------------------------------------------------------------
// <copyright file="ServiceRequestStatus.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.models.servicerequests;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ServiceRequestStatus
{
    /**
     * Describes service request status Default Service Request Status
     */
    @JsonProperty( "none" ) 
    NONE, 
    
    /**
     * Service Request Status Open
     */
    @JsonProperty( "open" ) 
    OPEN, 
    
    /**
     * Service Request Status Closed
     */
    @JsonProperty( "closed" ) 
    CLOSED, 
    
    /**
     * Service Request Status Action Required
     */
    @JsonProperty( "attention_needed" ) 
    ATTENTION_NEEDED
}