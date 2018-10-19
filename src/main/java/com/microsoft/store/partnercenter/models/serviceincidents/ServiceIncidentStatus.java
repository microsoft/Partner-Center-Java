// -----------------------------------------------------------------------
// <copyright file="ServiceIncidentStatus.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.serviceincidents;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the status of partner center services.
 */
public enum ServiceIncidentStatus
{
    /**
     * Default status - normal.
     */
    @JsonProperty( "normal" ) 
    NORMAL,

    /**
     * Informational status.
     */
    @JsonProperty( "information" ) 
    INFORMATION,

    /**
     * Warning status.
     */
    @JsonProperty( "warning" ) 
    WARNING,

    /**
     * Critical status.
     */
    @JsonProperty( "critical" ) 
    CRITICAL
}