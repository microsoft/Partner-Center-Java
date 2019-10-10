// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

/**
 * Represents a product upgrade eligibility.
 */
public class ProductUpgradesEligibility
{
    /**
     * The identifier for the customer.
     */
    private String customerId;

    /**
     * A flag indicating whether the upgrade is eligible.
     */
    private boolean isEligible;

    /**
     * The family for the product.
     */
    private String productFamily;

    /**
     * The reason if the customer is not eligible for upgrade.
     */
    private String reason;

    /**
     * The identifier for the upgrade.
     */
    private String upgradeId;

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
     * Gets a flag indicating whether the upgrade is eligible.
     *  
     * @return A flag indicating whether the upgrade is eligible.
     */
    public boolean getIsEligible()
    {
        return isEligible;
    }

    /**
     * Sets a flag indicating whether the upgrade is eligible.
     * 
     * @param value A flag indicating whether the upgrade is eligible.
     */
    public void setIsEligible(boolean value)
    {
        isEligible = value;
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
     * Gets the reason if the customer is not eligible for upgrade.
     * 
     * @return The reason if the customer is not eligible for upgrade.
     */
    public String getReason()
    {
        return reason;
    }

    /**
     * Sets the reason if the customer is not eligible for upgrade.
     * 
     * @param value The reason if the customer is not eligible for upgrade.
     */
    public void setReason(String value)
    {
        reason = value;
    }

    /**
     * Gets the identifier for the upgrade.
     * 
     * @return The identifier for the upgrade.
     */
    public String getUpgradeId()
    {
        return upgradeId;
    }

    /**
     * Sets the identifier for the upgrade.
     * 
     * @param value The identifier for the upgrade.
     */
    public void setUpgradeId(String value)
    {
        upgradeId = value;
    }
}