// -----------------------------------------------------------------------
// <copyright file="OrderLineItemLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.orders;

import com.microsoft.store.partnercenter.models.Link;

/**
 * Bundles the links for an order line item.
 */
public class OrderLineItemLinks
{
    /**
     * Gets or sets the subscription link for the order line item.
     */
    private Link __Subscription;

    public Link getSubscription()
    {
        return __Subscription;
    }

    public void setSubscription( Link value )
    {
        __Subscription = value;
    }

    /**
     * Gets or sets the SKU link for the order line item.
     */
    private Link __Sku;

    public Link getSku()
    {
        return __Sku;
    }

    public void setSku( Link value )
    {
        __Sku = value;
    }

    /**
     * Gets or sets the provisioning status link for the order line item.
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