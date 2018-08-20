// -----------------------------------------------------------------------
// <copyright file="ServiceRequestContact.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.servicerequests;

/**
 * Represents a Contact Profile
 */
public class ServiceRequestContact
{
    /**
     * Gets or sets the organization profile
     */
    private ServiceRequestOrganization __Organization;

    public ServiceRequestOrganization getOrganization()
    {
        return __Organization;
    }

    public void setOrganization( ServiceRequestOrganization value )
    {
        __Organization = value;
    }

    /**
     * Gets or sets the contact identifier.
     */
    private String __ContactId;

    public String getContactId()
    {
        return __ContactId;
    }

    public void setContactId( String value )
    {
        __ContactId = value;
    }

    /**
     * Gets or sets the name of the contact.
     */
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
     * Gets or sets the name of the contact.
     */
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
     * Gets or sets the email id
     */
    private String __Email;

    public String getEmail()
    {
        return __Email;
    }

    public void setEmail( String value )
    {
        __Email = value;
    }

    /**
     * Gets or sets the phone number
     */
    private String __PhoneNumber;

    public String getPhoneNumber()
    {
        return __PhoneNumber;
    }

    public void setPhoneNumber( String value )
    {
        __PhoneNumber = value;
    }

}
