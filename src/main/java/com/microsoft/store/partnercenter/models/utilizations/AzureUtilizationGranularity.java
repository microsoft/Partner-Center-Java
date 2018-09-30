// -----------------------------------------------------------------------
// <copyright file="AzureUtilizationGranularity.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.utilizations;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Lists the time granularity options for retrieving A subscription's azure utilization.
 */
public enum AzureUtilizationGranularity
{
	/***
	 * Daily utilization.
	 */
    @JsonProperty("daily")
	DAILY,
	
	/***
	 * Hourly utilization.
	 */
    @JsonProperty("hourly")
	HOURLY
}