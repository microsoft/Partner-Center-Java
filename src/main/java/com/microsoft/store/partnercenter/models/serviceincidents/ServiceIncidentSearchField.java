// -----------------------------------------------------------------------
// <copyright file="ServiceIncidentSearchField.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.serviceincidents;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Lists the supported service incident search fields.
 */
public enum ServiceIncidentSearchField
{
    /***
     * Search by service health incidents resolved status.
     */
	@JsonProperty( "Resolved" ) RESOLVED

}
