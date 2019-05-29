// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.licenses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServicePlan {
    /**
     * Gets or sets the localized display name for service plan.
     */
    @JsonProperty( "DisplayName" )
    private String __DisplayName;
	
    public String getDisplayName()
    {
        return __DisplayName;
    }

    public void setDisplayName( String value )
    {
    	__DisplayName = value;
    }

    /**
     * Gets or sets the service name.
     */
    @JsonProperty( "ServiceName" )
    private String __ServiceName;
	
    public String getServiceName()
    {
        return __ServiceName;
    }

    public void setServiceName( String value )
    {
    	__ServiceName = value;
    }

    /**
     * Gets or sets the service plan id.
     */
    @JsonProperty( "Id" )
    private String __Id;
	
    public String getId()
    {
        return __Id;
    }

    public void setId( String value )
    {
    	__Id = value;
    }

    /**
     * Gets or sets the service plan status of a service plan.
     */
    @JsonProperty( "CapabilityStatus" )
    private String __CapabilityStatus;
	
    public String getCapabilityStatus()
    {
        return __CapabilityStatus;
    }

    public void setCapabilityStatus( String value )
    {
    	__CapabilityStatus = value;
    }

    /**
     * Gets or sets the target type of a service plan.
     * It can be used to filter service plans which are applicable to user or tenant.
     * For example, if we need to know all service plans applicable to user , we can filter where target type == "User".
     */
    @JsonProperty( "TargetType" )
    private String __TargetType;
	
    public String getTargetType()
    {
        return __TargetType;
    }

    public void setTargetType( String value )
    {
    	__TargetType = value;
    }
}