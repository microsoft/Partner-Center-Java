// -----------------------------------------------------------------------
// <copyright file="OfferLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.offers;

import com.microsoft.store.partnercenter.models.Link;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Bundles offer links.
 */
public class OfferLinks
    extends StandardResourceLinks
{
    /**
     * Gets or sets the learn more link.
     */
    private Link __LearnMore;

    public Link getLearnMore()
    {
        return __LearnMore;
    }

    public void setLearnMore( Link value )
    {
        __LearnMore = value;
    }
}