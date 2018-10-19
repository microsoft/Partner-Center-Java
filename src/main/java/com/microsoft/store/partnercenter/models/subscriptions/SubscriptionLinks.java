// -----------------------------------------------------------------------
// <copyright file="SubscriptionLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import com.microsoft.store.partnercenter.models.Link;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Bundles links associated with a subscription.
 */
public class SubscriptionLinks
    extends StandardResourceLinks
{
    /**
     * Gets or sets the offer link associated with the subscription.
     */
    private Link __Offer;

    public Link getOffer()
    {
        return __Offer;
    }

    public void setOffer( Link value )
    {
        __Offer = value;
    }

    /**
     * Gets or sets the parent subscription link.
     */
    private Link __ParentSubscription;

    public Link getParentSubscription()
    {
        return __ParentSubscription;
    }

    public void setParentSubscription( Link value )
    {
        __ParentSubscription = value;
    }
}