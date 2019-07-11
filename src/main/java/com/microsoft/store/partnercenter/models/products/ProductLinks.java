// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
     * The SKUs link.
     */
    private Link skus;

    /**
     * Gets the SKUs link.
     * 
     * @return The SKUs link.
     */
    public Link getSkus()
    {
        return skus;
    }

    /**
     * Sets the SKUs links.
     * 
     * @param value The SKUs link.
     */
    public void setSkus(Link value)
    {
        skus = value;
    }
}