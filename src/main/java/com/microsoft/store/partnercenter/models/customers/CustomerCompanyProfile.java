// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.customers;

import com.microsoft.store.partnercenter.models.Address;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Customer company profile
 */
public class CustomerCompanyProfile
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Initializes a new instance of the CustomerCompanyProfile class.
     */
    public CustomerCompanyProfile()
    {
    }

    private Address __Address; 

    /**
     * Gets the address of the customer.
     * 
     * @return The address of the customer.
     */
    public Address getAddress()
    {
        return __Address;
    }

    /**
     * Sets the address of the customer.
     * 
     * @param value The address of the customer.
     */
    public void setAddress(Address value)
    {
        __Address = value;
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
    public void setCompanyName(String value)
    {
        __CompanyName = value;
    }

    private String __Domain;

    /**
     * Gets the domain.
     * 
     * @return The domain.
     */
    public String getDomain()
    {
        return __Domain;
    }

    /**
     * Sets the domain.
     * 
     * @param value The domain.
     */
    public void setDomain(String value)
    {
        __Domain = value;
    }

    private String __Email; 

    /**
     * Gets the email address of the contact at the customer.
     * 
     * @return The name email address of the contact at the customer.
     */
    public String getEmail()
    {
        return __Email;        
    }

    /**
     * Sets the email address of the contact at the customer.
     * 
     * @param value The email address of the contact at the customer.
     */
    public void setEmail (String value)
    {
        __Email = value;        
    }

    private String __TenantId;

    /**
     * Gets the tenant identifier.
     * 
     * @return The tenant identifier.
     */
    public String getTenantId()
    {
        return __TenantId;
    }

    /**
     * Sets the tenant identifier.
     * 
     * @param value The tenant identifier.
     */
    public void setTenantId(String value)
    {
        __TenantId = value;
    }
}