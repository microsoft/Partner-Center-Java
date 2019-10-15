// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

import org.joda.time.DateTime;

/**
 * Represents the product upgrade line item.
 */
public class ProductUpgradeLineItem
{
    /**
     * The error detail for the product upgrade.
     */
    private ProductUpgradeErrorDetail errorDetails;

    /**
     * The product being upgraded.
     */
    private ProductUpgradeDetail sourceProduct;

    /**
     * The status for the product upgrade.
     */
    private String status;

    /**
     * The target product for the upgrade.
     */
    private ProductUpgradeDetail targetProduct;

    /**
     * The date the product was upgraded.
     */
    private DateTime upgradedDate;

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
     * Gets the product being upgraded.
     * 
     * @return The product being upgraded.
     */
    public ProductUpgradeDetail getSourceProduct()
    {
        return sourceProduct;
    }

    /**
     * Sets the product being upgraded.
     * 
     * @param value The product being upgraded.
     */
    public void setSourceProduct(ProductUpgradeDetail value)
    {
        sourceProduct = value;
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

    /**
     * Gets the target product for the upgrade.
     * 
     * @return The target product for the upgrade.
     */
    public ProductUpgradeDetail getTargetProduct()
    {
        return targetProduct;
    }

    /**
     * Sets the target product for the upgrade.
     * 
     * @param value The target product for the upgrade.
     */
    public void setTargetProduct(ProductUpgradeDetail value)
    {
        targetProduct = value;
    }

    /**
     * Gets the date the product was upgraded.
     * 
     * @return The date the product was upgraded.
     */
    public DateTime getUpgradedDate()
    {
        return upgradedDate;
    }

    /**
     * Sets the date the product was upgraded.
     * 
     * @param value The date the product was upgraded.
     */
    public void setUpgradedDate(DateTime value)
    {
        upgradedDate = value;
    }
}