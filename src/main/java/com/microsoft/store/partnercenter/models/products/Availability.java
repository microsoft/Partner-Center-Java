// -----------------------------------------------------------------------
// <copyright file="Availability.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.products;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Represents a partner's billing profile.
 */
public class Availability
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Gets or sets the unique availability id.
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
     * Gets or sets the product id.
     */
    private String __ProductId;

    public String getProductId()
    {
        return __ProductId;
    }

    public void setProductId( String value )
    {
        __ProductId = value;
    }

    /**
     * Gets or sets the sku id.
     */
    private String __SkuId;

    public String getSkuId()
    {
        return __SkuId;
    }

    public void setSkuId( String value )
    {
        __SkuId = value;
    }

    /**
     * Gets or sets the id that uniquely identifies this item in the catalog.
     */
    private String __CatalogItemId;

    public String getCatalogItemId()
    {
        return __CatalogItemId;
    }

    public void setCatalogItemId( String value )
    {
        __CatalogItemId = value;
    }

    /**
     * Gets or sets the default currency.
     */
    private CurrencyInfo __DefaultCurrency;

    public CurrencyInfo getDefaultCurrency()
    {
        return __DefaultCurrency;
    }

    public void setDefaultCurrency( CurrencyInfo value )
    {
        __DefaultCurrency = value;
    }

    /**
     * Gets or sets the segment.
     */
    private String __Segment;

    public String getSegment()
    {
        return __Segment;
    }

    public void setSegment( String value )
    {
        __Segment = value;
    }

    /**
     * Gets or sets the country.
     */
    private String __Country;

    public String getCountry()
    {
        return __Country;
    }

    public void setCountry( String value )
    {
        __Country = value;
    }
}