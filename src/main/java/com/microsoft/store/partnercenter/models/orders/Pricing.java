// -----------------------------------------------------------------------
// <copyright file="Pricing.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.orders;

/**
 * Represents the pricing details for a line item.
 */
public class Pricing
{
    /**
     * The discounted price for the order line item.
     */
    private Double discountedPrice;

    /**
     * The extended price for the order line item.
     */
    private Double extendedPrice;

    /**
     * The list price for the order line item.
     */
    private Double listPrice;

    /**
     * The prorated price for the order line item.
     */
    private Double proratedPrice;

    /**
     * The price for the order line item.
     */
    private Double price;

    /**
     * Gets the discounted price for the order line item.
     * 
     * @return The discounted price for the order line item.
     */
    public Double getDiscountedPrice()
    {
        return discountedPrice;
    }

    /**
     * Gets the extended price for the order line item.
     * 
     * @return The extended price for the order line item.
     */
    public Double getExtendedPrice()
    {
        return extendedPrice;
    }

    /**
     * Gets the list price for the order line item.
     * 
     * @return The list price for the order line item.
     */
    public Double getListPrice()
    {
        return listPrice;
    }
    
    /**
     * Gets the prorated price for the order line item.
     * 
     * @return The prorated price for the order line item.
     */
    public Double getProratedPrice()
    {
        return proratedPrice;
    }

    /**
     * Gets the price for the order line item.
     * 
     * @return The price for the order line item.
     */
    public Double getPrice()
    {
        return price;
    }
}