// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.users;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

public class User
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * The display name for the user.
     */
    private String displayName; 

    /**
     * The first name for the user.
     */
	private String firstName;

    /**
     * The object identifier for the user.
     */
    private String id; 

    /**
     * The immutable identifier for the user.
     */
    private String immutableId;

    /**
     * The last time that information for this user was synced between Azure Active Directory 
     * and on-premises Active Directory.  
     */
    private DateTime lastDirectorySyncTime;
	
    /**
     * The last name for the user.
     */
    private String lastName;

    /**
     * The password profile for the user.
     */
	private PasswordProfile passwordProfile;

    /**
     * The phone number for the user.
     */
    private String phoneNumber;

    /**
     * The deleted time for the inactive user.
     */
    private DateTime softDeletionTime;

    /**
     * The state for the user. If the user is deleted the state is inactive; otherwise, the state is active.
     */
    private UserState state;

    /**
     * The user domain type.
     */
	private UserDomainType userDomainType;

    /**
     * The user principal name (UPN) for the user.
     */
	private String userPrincipalName;

    /**
     * Gets the display name for the user.
     * 
     * @return The display name for the user.
     */
	public String getDisplayName()
    {
        return displayName;
    }

    /**
     * Sets the display name for the user.
     * 
     * @param value The display name for the user. 
     */
    public void setDisplayName(String value)
    {
    	displayName = value;
    }

    /**
     * Gets the first name for the user.
     * 
     * @return The first name for the user.
     */
	public String getFirstName()
    {
        return firstName;
    }

    /**
     * Sets the first name for the user.
     * 
     * @param value The first name for the user.
     */
    public void setFirstName(String value)
    {
    	firstName = value;
    }

    /**
     * Gets the object identifier for the user.
     * 
     * @return The object identifier for the user.
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the object identifier for the user.
     * 
     * @param value The object identifier for the user.
     */
    public void setId(String value)
    {
    	id = value;
    }

    /**
     * Gets the immutable identifier for the user.
     * 
     * @return The immutable identifier for the user.
     */
    public String getImmutableId()
    {
        return immutableId;
    }    

    /**
     * Sets the immutable identifier for the user.
     * 
     * @param value The immutable identifier for the user.
     */
    public void setImmutableId(String value)
    {
        immutableId = value;
    }

    /**
     * Gets the last time that information for this user was synced between Azure Active Directory and on-premises Active Directory.
     * 
     * @return The last time that information for this user was synced between Azure Active Directory and on-premises Active Directory.
     */
	public DateTime getLastDirectorySyncTime()
    {
        return lastDirectorySyncTime;
    }

    /**
     * Sets the last time that information for this user was synced between Azure Active Directory and on-premises Active Directory.
     * 
     * @param value The last time that information for this user was synced between Azure Active Directory and on-premises Active Directory.
     */
    public void setLastDirectorySyncTime(DateTime value)
    {
    	lastDirectorySyncTime = value;
    }

    /**
     * Gets the last name for the user.
     * 
     * @return The last name for the user.
     */
	public String getLastName()
    {
        return lastName;
    }

    /**
     * Sets the last name for the user.
     * 
     * @param value The last name for the user.
     */
    public void setLastName(String value)
    {
    	lastName = value;
    }

    /**
     * Gets the password profile for the user.
     * 
     * @return The password profile for the user.
     */
	public PasswordProfile getPasswordProfile()
    {
        return passwordProfile;
    }

    /**
     * Sets the password profile for the user.
     * 
     * @param value The password profile for the user.
     */
    public void setPasswordProfile(PasswordProfile value)
    {
        passwordProfile = value;
    }

    /**
     * Gets the phone number for the user.
     * 
     * @return The phone number for the user.
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * Sets the phone number for the user.
     * 
     * @param value The phone number for the user.
     */
    public void setPhoneNumber(String value)
    {
        phoneNumber = value;
    }

    /**
     * Gets the deleted time for the inactive user.
     * 
     * @return The deleted time for the inactive user.
     */
	public DateTime getSoftDeletionTime()
    {
        return softDeletionTime;
    }
    
    /**
     * Sets the deleted time for the inactive user.
     * 
     * @param value The deleted time for the inactive user.
     */
    public void setSoftDeletionTime(DateTime value)
    {
    	softDeletionTime = value;
    }

    /**
     * Gets the state for the user. If the user is deleted the state is inactive; otherwise, the state is active.
     * 
     * @return The state for the user. If the user is deleted the state is inactive; otherwise, the state is active.
     */
	public UserState getState()
    {
        return state;
    }

    /**
     * Sets the state for the user. If the user is deleted the state is inactive; otherwise, the state is active.
     * 
     * @param value The state for the user. If the user is deleted the state is inactive; otherwise, the state is active.
     */
    public void setState(UserState value)
    {
    	state = value;
    }

    /**
     * Gets the user domain type. 
     * 
     * @return The user domain type.
     */
    public UserDomainType getUserDomainType()
    {
        return userDomainType;
    }

    /**
     * Sets the user domain type.
     * 
     * @param value The user domain type.
     */
    public void setUserDomainType(UserDomainType value)
    {
    	userDomainType = value;
    }

    /**
     * Gets the user principal name (UPN) for the user.
     * 
     * @return The user principal name (UPN) for the user.
     */
    public String getUserPrincipalName()
    {
        return userPrincipalName;
    }

    /**
     * Sets the user principal name (UPN) for the user.
     * 
     * @param value The user principal name (UPN) for the user.
     */
    public void setUserPrincipalName(String value)
    {
    	userPrincipalName = value;
    }
}