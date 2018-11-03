//-----------------------------------------------------------------------
// <copyright file="CustomerUser.java" company="Microsoft">
//   Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.users;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerUser extends User 
{
    /**
     * Gets or sets usage location, the location where user intends to use the license.
     */
	@JsonProperty("UsageLocation")
    private String usageLocation;
	
    public String getUsageLocation()
    {
        return usageLocation;
    }

    public void setUsageLocation( String value )
    {
    	usageLocation = value;
    }
}