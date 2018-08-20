// -----------------------------------------------------------------------
// <copyright file="LicenseAssignment.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.licenses;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Model for licenses and service plans to be assigned to a user.
 */
public class LicenseAssignment {
    /***
     * Gets or sets service plan ids which will not be assigned to the user.
     */
	@JsonProperty( "ExcludedPlans" )
	private Iterable<String> __ExcludedPlans;
    
    public Iterable<String> getExcludedPlans()
    {
        return __ExcludedPlans;
    }

    public void setExcludedPlans( Iterable<String> value )
    {
    	__ExcludedPlans = value;
    }

    /***
     * Gets or sets product id to be assigned to the user.
     */
    @JsonProperty( "SkuId" )
    private String __SkuId;
    
    public String getSkuId()
    {
        return __SkuId;
    }

    public void setSkuId( String value )
    {
    	__SkuId = value;
    }

}
