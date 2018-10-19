// -----------------------------------------------------------------------
// <copyright file="User.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.users;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

public class User extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Gets or sets the user object identifier.
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


    /**
     * Gets or sets the first name.
     */
	@JsonProperty( "FirstName" )
	private String __FirstName;
	
	public String getFirstName()
    {
        return __FirstName;
    }

    public void setFirstName( String value )
    {
    	__FirstName = value;
    }

    /**
     * Gets or sets the last name.
     */
	@JsonProperty( "LastName" )
	private String __LastName;
	
	public String getLastName()
    {
        return __LastName;
    }

    public void setLastName( String value )
    {
    	__LastName = value;
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
     * Gets or sets the password profile.
     */
	@JsonProperty( "PasswordProfile" )
	private PasswordProfile __PasswordProfile;
	
	public PasswordProfile getPasswordProfile()
    {
        return __PasswordProfile;
    }

    public void setPasswordProfile( PasswordProfile value )
    {
    	__PasswordProfile = value;
    }

    /**
     * Gets or sets the last directory sync time for the user.
     */
	@JsonProperty( "LastDirectorySyncTime" )
	private DateTime __LastDirectorySyncTime;
	
	public DateTime getLastDirectorySyncTime()
    {
        return __LastDirectorySyncTime;
    }

    public void setLastDirectorySyncTime( DateTime value )
    {
    	__LastDirectorySyncTime = value;
    }

    /**
     * Gets or sets user domain type.
     */
	@JsonProperty( "UserDomainType" )
	private UserDomainType __UserDomainType;
	
	public UserDomainType getUserDomainType()
    {
        return __UserDomainType;
    }

    public void setUserDomainType( UserDomainType value )
    {
    	__UserDomainType = value;
    }

    /**
     * Gets or sets the state of the user, for the deleted user this is "Inactive" and for the normal user it is "Active".
     */
	@JsonProperty( "State" )
    private UserState __State;
	
	public UserState getState()
    {
        return __State;
    }

    public void setState( UserState value )
    {
    	__State = value;
    }

    /**
     * Gets or sets the deleted time for the inactive user.
     */
	@JsonProperty( "softDeletionTime" )
    private DateTime __SoftDeletionTime;
	
	public DateTime getSoftDeletionTime()
    {
        return __SoftDeletionTime;
    }

    public void setSoftDeletionTime( DateTime value )
    {
    	__SoftDeletionTime = value;
    }
}