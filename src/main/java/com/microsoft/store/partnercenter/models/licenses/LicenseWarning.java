// -----------------------------------------------------------------------
// <copyright file="LicenseWarning.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.licenses;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model for license warnings.
 */
public class LicenseWarning {
    /**
     * Gets or sets the warning code.
     */
    @JsonProperty( "Code" )
	private String __Code;

    public String getCode()
    {
        return __Code;
    }

    public void setCode( String value )
    {
    	__Code = value;
    }



    /**
     * Gets or sets the warning message.
     */
    @JsonProperty( "Message" )
    private String __Message;
    
    public String getMessage()
    {
        return __Message;
    }

    public void setMessage( String value )
    {
    	__Message = value;
    }


    /**
     * Gets or sets the list of service plan names.
     */
    @JsonProperty( "ServicePlans" )
    private Iterable<String> __ServicePlans;
    
    public Iterable<String> getServicePlans()
    {
        return __ServicePlans;
    }

    public void setServicePlans( Iterable<String> value )
    {
    	__ServicePlans = value;
    }
}