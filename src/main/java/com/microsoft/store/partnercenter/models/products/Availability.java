// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
     * A flag indicating whether the availability is purchasable or not.
     */
    private boolean isPurchasable;

    /**
     * A flag indicating whether the availability is renewable or not.
     */
    private boolean isRenewable;

    /**
     * The terms if applicable to this availability.
     */
    private Iterable<AvailabilityTerm> terms;

    /**
     * Gets a flag indicating whether the availability is purchasable or not.
     * 
     * @return A flag indicating whether the availability is purchasable or not.
     */
    public boolean getIsPurchasable()
    {
        return isPurchasable;
    }

    /**
     * Sets a flag indicating whether the availability is purchasable or not.
     * 
     * @param value A flag indicating whether the availability is purchasable or not.
     */
    public void setIsPurchasable(boolean value)
    {
        isPurchasable = value;   
    }

    /**
     * Gets a flag indicating whether the availability is renewable or not.
     * 
     * @return A flag indicating whether the availability is renewable or not.
     */
    public boolean getIsRenewable()
    {
        return isRenewable;
    }

    /**
     * Sets a flag indicating whether the availability is renewable or not.
     * 
     * @param value A flag indicating whether the availability is renewable or not.
     */
    public void setIsRenewable(boolean value)
    {
        isRenewable = value;   
    }

    /**
     * Gets the terms if applicable to this availability.
     * 
     * @return The terms if applicable to this availability.
     */
    public Iterable<AvailabilityTerm> getTerms()
    {
        return terms;
    }

    /**
     * Sets the terms if applicable to this availability.
     * 
     * @param value The terms if applicable to this availability.
     */
    public void setTerms(Iterable<AvailabilityTerm> value)
    {
        terms = value;   
    }

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