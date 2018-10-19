// -----------------------------------------------------------------------
// <copyright file="UserMember.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.roles;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

@JsonIgnoreProperties( { "roleId" } )
public class UserMember extends ResourceBase {
    /**
     * Gets or sets the id of the member.
     */
	@JsonProperty( "id" )
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
     * Gets or sets the display name.
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
     * Gets or sets the name of the user principal.
     */
	@JsonProperty( "UserPrincipalName" )
    private String __UserPrincipalName;
    
    public String getUserPrincipalName()
    {
    	return __UserPrincipalName;
    }

    public void setUserPrincipalName( String value )
    {
    	__UserPrincipalName = value;
    }
}