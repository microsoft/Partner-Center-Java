// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

import java.util.List;

/**
 * Represents a product upgrade status.
 */
public class ProductUpgradeStatus
{
    /**
     * The error detail for the product upgrade.
     */
    private ProductUpgradeErrorDetail errorDetails; 

    /**
     * Gets the identifier for the product upgrade.
     */
    private String id; 

    /**
     * The line item for the product upgrade.
     */
    private List<ProductUpgradeLineItem> lineItems;

    /**
     * The family for the product.
     */
    private String productFamily;

    /**
     * The status for the product upgrade.
     */
    private String status;

    /**
     * Gets the error detail for the product upgrade.
     * 
     * @return The error detail for the product upgrade.
     */
    public ProductUpgradeErrorDetail getErrorDetails()
    {
        return errorDetails;
    }

    /**
     * Sets the error detail for the product upgrade.
     * 
     * @param value The error detail for the product upgrade.
     */
    public void setErrorDetails(ProductUpgradeErrorDetail value)
    {
        errorDetails = value;
    }

    /**
     * Gets the identifier for the product upgrade.
     * 
     * @return The identifier for the product upgrade.
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the identifier for the product upgrade.
     * 
     * @param value The identifier for the product upgrade.
     */
    public void setId(String value)
    {
        id = value;
    }

    /**
     * Gets the line items for the product upgrade.
     * 
     * @return The line items for the product upgrade.
     */
    public List<ProductUpgradeLineItem> getLineItems()
    {
        return lineItems;
    }

    /**
     * Sets the line items for the product upgrade.
     * 
     * @param value The line items for the product upgrade.
     */
    public void setLineItems(List<ProductUpgradeLineItem> value)
    {
        lineItems = value;
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

    /**
     * Gets the status for the product upgrade.
     * 
     * @return The status for the product upgrade.
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * Sets the status for the product upgrade.
     * 
     * @param value The status for the product upgrade.
     */
    public void setStatus(String value)
    {
        status = value;
    }
}