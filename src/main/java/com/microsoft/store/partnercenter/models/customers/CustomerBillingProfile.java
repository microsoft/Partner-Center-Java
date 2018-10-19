// -----------------------------------------------------------------------
// <copyright file="CustomerBillingProfile.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
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

    private String __Id;

    /**
     * Gets the profile identifier.
     * 
     * @return The profile identifier.
     */
    public String getId()
    {
        return __Id;
    }

    /**
     * Sets the profile identifier.
     * 
     * @param value The profile identifier.
     */
    public void setId( String value )
    {
        __Id = value;
    }

    private String __FirstName;

    /**
     * Gets the first name.
     * 
     * @return The first name.
     */
    public String getFirstName()
    {
        return __FirstName;
    }

    /**
     * Sets the first name.
     * 
     * @param value The first name.
     */
    public void setFirstName( String value )
    {
        __FirstName = value;
    }

    private String __LastName;
    
    /**
     * Gets the last name.
     * 
     * @return The last name.
     */
    public String getLastName()
    {
        return __LastName;
    }

    /**
     * Sets the last name.
     * 
     * @param value The last name.
     */
    public void setLastName( String value )
    {
        __LastName = value;
    }

    private String __Email;

    /**
     * Gets the email address.
     * 
     * @return The email address.
     */
    public String getEmail()
    {
        return __Email;
    }

    /**
     * Sets the email address.
     * 
     * @param value The email address.
     */
    public void setEmail( String value )
    {
        __Email = value;
    }

    private String __Culture;

    /**
     * Gets the culture.
     * 
     * @return The culture.
     */
    public String getCulture()
    {
        return __Culture;
    }

    /**
     * Sets the culture.
     * 
     * @param value The culture.
     */
    public void setCulture( String value )
    {
        __Culture = value;
    }

    private String __Language;

    /**
     * Gets the language.
     * 
     * @return The language.
     */
    public String getLanguage()
    {
        return __Language;
    }

    /**
     * Sets the language.
     * 
     * @param value The language.
     */
    public void setLanguage( String value )
    {
        __Language = value;
    }

    private String __CompanyName;

    /**
     * Gets the name of the company.
     * 
     * @return The name of the company.
     */
    public String getCompanyName()
    {
        return __CompanyName;
    }

    /**
     * Sets the name of the company.
     * 
     * @param value The name of the company.
     */
    public void setCompanyName( String value )
    {
        __CompanyName = value;
    }

    private Address __DefaultAddress;

    /**
     * Gets the default address for the customer.
     * 
     * @return The default address for the customer.
     */
    public Address getDefaultAddress()
    {
        return __DefaultAddress;
    }

    /**
     * Sets the default address for the customer.
     * 
     * @param value The default address for the customer.
     */
    public void setDefaultAddress( Address value )
    {
        __DefaultAddress = value;
    }
}