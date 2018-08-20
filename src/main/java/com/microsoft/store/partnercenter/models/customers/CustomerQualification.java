// -----------------------------------------------------------------------
// <copyright file="CustomerQualification.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.customers;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * When a partner creates a new customer by default the customer is assigned "CustomerQualification.None". If the partner validates that the customer
 * belongs to Education segment they can set the qualification of the Customer to "CustomerQualification.Education". This operation is irreversible and
 * the partner will not be allowed to override the customer qualification once set.
 */
public enum CustomerQualification
{
    /***
     * No Qualification
     */
	@JsonProperty( "none" ) NONE,

    /***
     * Education Qualification
     */
    @JsonProperty( "education" ) EDUCATION,
    
    /***
     *  Non-Profit / Charity Qualification
     */
    @JsonProperty( "nonprofit" ) NONPROFIT
}
