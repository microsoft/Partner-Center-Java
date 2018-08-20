// -----------------------------------------------------------------------
// <copyright file="SupportProfile.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.partners;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Partner Support Profile
 */
public class SupportProfile
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
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
     * Gets or sets the telephone.
     */
    private String __Telephone;

    public String getTelephone()
    {
        return __Telephone;
    }

    public void setTelephone( String value )
    {
        __Telephone = value;
    }

    /**
     * Gets or sets the website.
     */
    private String __Website;

    public String getWebsite()
    {
        return __Website;
    }

    public void setWebsite( String value )
    {
        __Website = value;
    }
}