// -----------------------------------------------------------------------
// <copyright file="ProductLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.products;

import com.microsoft.store.partnercenter.models.Link;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Navigation links for Product.
 */
public class ProductLinks
    extends StandardResourceLinks
{
    /**
     * Gets or sets the skus link.
     */
    private Link __Skus;

    public Link getSkus()
    {
        return __Skus;
    }

    public void setSkus( Link value )
    {
        __Skus = value;
    }
}