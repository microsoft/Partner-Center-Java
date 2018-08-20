// -----------------------------------------------------------------------
// <copyright file="ManagedServiceLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.managedservices;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microsoft.store.partnercenter.models.Link;

/**
 * Bundles a Managed service links.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ManagedServiceLinks
{
    /**
     * Gets or sets the admin service URI.
     */
    private Link __AdminService;

    public Link getAdminService()
    {
        return __AdminService;
    }

    public void setAdminService( Link value )
    {
        __AdminService = value;
    }

    /**
     * Gets or sets the service health URI.
     */
    private Link __ServiceHealth;

    public Link getServiceHealth()
    {
        return __ServiceHealth;
    }

    public void setServiceHealth( Link value )
    {
        __ServiceHealth = value;
    }

    /**
     * Gets or sets the service ticket URI.
     */
    private Link __ServiceTicket;

    public Link getServiceTicket()
    {
        return __ServiceTicket;
    }

    public void setServiceTicket( Link value )
    {
        __ServiceTicket = value;
    }
}