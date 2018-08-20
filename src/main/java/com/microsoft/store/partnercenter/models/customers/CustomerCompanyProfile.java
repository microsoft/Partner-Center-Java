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

    /**
     * Gets or sets the tenant identifier. This is also referred as MicrosoftID
     */
    private String __TenantId;

    public String getTenantId()
    {
        return __TenantId;
    }

    public void setTenantId( String value )
    {
        __TenantId = value;
    }

    /**
     * Gets or sets the domain.
     */
    private String __Domain;

    public String getDomain()
    {
        return __Domain;
    }

    public void setDomain( String value )
    {
        __Domain = value;
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
}