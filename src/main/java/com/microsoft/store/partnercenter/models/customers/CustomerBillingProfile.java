// -----------------------------------------------------------------------
// <copyright file="CustomerBillingProfile.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.customers;

import com.microsoft.store.partnercenter.models.Address;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Customer billing profile
 */
public class CustomerBillingProfile
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    public CustomerBillingProfile()

    {
    }

    /**
     * Gets or sets the profile identifier.
     */
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
     * Gets or sets the first name.
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
     * Gets or sets the last name.
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
     * Gets or sets the email.
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
     * Gets or sets the culture.
     */
    private String __Culture;

    public String getCulture()
    {
        return __Culture;
    }

    public void setCulture( String value )
    {
        __Culture = value;
    }

    /**
     * Gets or sets the language.
     */
    private String __Language;

    public String getLanguage()
    {
        return __Language;
    }

    public void setLanguage( String value )
    {
        __Language = value;
    }

    /**
     * Gets or sets the name of the company.
     */
    private String __CompanyName;

    public String getCompanyName()
    {
        return __CompanyName;
    }

    public void setCompanyName( String value )
    {
        __CompanyName = value;
    }

    /**
     * Gets or sets the default address for customer
     */
    private Address __DefaultAddress;

    public Address getDefaultAddress()
    {
        return __DefaultAddress;
    }

    public void setDefaultAddress( Address value )
    {
        __DefaultAddress = value;
    }

}
