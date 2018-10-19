// -----------------------------------------------------------------------
// <copyright file="MessageType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.serviceincidents;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the status of partner center services.
 */
public enum MessageType
{
    /**
     * Default type none.
     */
    @JsonProperty( "none" ) 
    NONE,
	
    /**
     * Active incident.
     */
    @JsonProperty( "incident" ) 
    INCIDENT,
	
    /**
     * Message center message.
     */
    @JsonProperty( "message_center" ) 
    MESSAGE_CENTER,
	
    /**
     * All types.
     */
    @JsonProperty( "all" ) 
    ALL
}
