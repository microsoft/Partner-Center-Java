// -----------------------------------------------------------------------
// <copyright file="OfferLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.orders;

import com.microsoft.store.partnercenter.models.Link;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Bundles offer links.
 */
public class OrderLinks
    extends StandardResourceLinks
{
    /**
     * Gets or sets the link to the provisioning status of an order.
     */
    private Link __ProvisioningStatus;

    public Link getProvisioningStatus()
    {
        return __ProvisioningStatus;
    }

    public void setProvisioningStatus( Link value )
    {
        __ProvisioningStatus = value;
    }
}