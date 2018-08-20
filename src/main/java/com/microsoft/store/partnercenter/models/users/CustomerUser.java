//-----------------------------------------------------------------------
//<copyright file="CustomerUser.java" company="Microsoft">
//   Copyright (c) Microsoft Corporation.  All rights reserved.
//</copyright>
//-----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.users;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerUser extends User 
{
    /***
     * Gets or sets usage location, the location where user intends to use the license.
     */
	@JsonProperty("UsageLocation")
    private String __UsageLocation;
	
    public String getUsageLocation()
    {
        return __UsageLocation;
    }

    public void setUsageLocation( String value )
    {
    	__UsageLocation = value;
    }
}