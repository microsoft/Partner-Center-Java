// -----------------------------------------------------------------------
// <copyright file="CustomerCompanyProfile.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.customers;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Customer company profile
 */
public class CustomerCompanyProfile
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    public CustomerCompanyProfile()
    {
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
    public void setTenantId( String value )
    {
        __TenantId = value;
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
    public void setDomain( String value )
    {
        __Domain = value;
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
}