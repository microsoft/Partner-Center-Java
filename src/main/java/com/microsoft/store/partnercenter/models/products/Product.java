// -----------------------------------------------------------------------
// <copyright file="Product.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.products;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Class that represents a product.
 */
public class Product
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Gets or sets the id.
     */
    private String __Id;

    public String getId()
    {
        return __Id;
    }

    public void setId( String value )
    {
        __Id = value;
    }

    /**
     * Gets or sets the title.
     */
    private String __Title;

    public String getTitle()
    {
        return __Title;
    }

    public void setTitle( String value )
    {
        __Title = value;
    }

    /**
     * Gets or sets the description.
     */
    private String __Description;

    public String getDescription()
    {
        return __Description;
    }

    public void setDescription( String value )
    {
        __Description = value;
    }

    /**
     * Gets or sets the product type.
     */
    private ItemType __ProductType;

    public ItemType getProductType()
    {
        return __ProductType;
    }

    public void setProductType( ItemType value )
    {
        __ProductType = value;
    }
}