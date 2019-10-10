// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

/**
 * Represents a product upgrade request.
 */
public class ProductUpgradesRequest
{
    /**
     * The identifier for the customer.
     */
    private String customerId;

    /**
     * The family for the product.
     */
    private String productFamily;

    /**
     * Gets the identifier for the customer.
     * 
     * @return The identifier for the customer.
     */
    public String getCustomerId()
    {
        return customerId;
    }

    /**
     * Sets the identifier for the customer.
     * 
     * @param value The identifier for the customer.
     */
    public void setCustomerId(String value)
    {
        customerId = value;
    }

    /**
     * Gets the family for the product.
     * 
     * @return The family for the product.
     */
    public String getProductFamily()
    {
        return productFamily;
    }

    /**
     * Sets the family for the product.
     * 
     * @param value The family for the product.
     */
    public void setProductFamily(String value)
    {
        productFamily = value;
    }
}