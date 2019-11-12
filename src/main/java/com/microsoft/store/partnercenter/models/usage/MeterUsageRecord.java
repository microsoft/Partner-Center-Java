// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.usage;

/**
 * Defines the estimated monetary cost of a subscription's meter level usage in the current billing cycle.
 */
public class MeterUsageRecord
    extends UsageRecordBase
{
    /**
     * The category for the Azure resource.
     */
    private String category;

    /**
     * The identifier for the meter.
     */
    private String meterId;

    /**
     * The name for the meter.
     */
    private String meterName;

    /**
     * The quantity of the Azure resource used.
     */
    private double quantityUsed;

    /**
     * The sub-category for the Azure resource.
     */
    private String subcategory;

    /**
     * The identifier for the subscription.
     */
    private String subscriptionId;

    /**
     * The unit of measure for the Azure resource.
     */
    private String unit;

    /**
     * Gets the category for the Azure resource.
     * 
     * @return The category for the Azure resource.
     */
    public String getCategory()
    {
        return category;
    }

    /**
     * Sets the category for the Azure resource.
     * 
     * @param value The category for the Azure resource.
     */
    public void setCategory(String value)
    {
        category = value; 
    }

    /**
     * Gets the identifier for the meter.
     * 
     * @return The identifier for the meter.
     */
    public String getMeterId()
    {
        return meterId;
    }

    /**
     * Sets the identifier for the meter.
     * 
     * @param value The identifier for the meter.
     */
    public void setMeterId(String value)
    {
        meterId = value; 
    }

    /**
     * Gets the name for the meter.
     * 
     * @return The name for the meter.
     */
    public String getMeterName()
    {
        return meterName;
    }

    /**
     * Sets the name for the meter.
     * 
     * @param value The name for the meter.
     */
    public void setMeterName(String value)
    {
        meterName = value; 
    }

    /**
     * Gets the quantity of the Azure resource used.
     * 
     * @return The quantity of the Azure resource used.
     */
    public double getQuantityUsed()
    {
        return quantityUsed;
    }

    /**
     * Sets the quantity of the Azure resource used.
     * 
     * @param value The quantity of the Azure resource used.
     */
    public void setQuantityUsed(double value)
    {
        quantityUsed = value; 
    }

    /**
     * Gets the sub-category for the Azure resource.
     * 
     * @return The sub-category for the Azure resource.
     */
    public String getSubcategory()
    {
        return subcategory;
    }

    /**
     * Sets the sub-category for the Azure resource.
     * 
     * @param value The sub-category for the Azure resource.
     */
    public void setSubcategory(String value)
    {
        subcategory = value; 
    }

    /**
     * Gets the identifier for the subscription.
     * 
     * @return The identifier for the subscription.
     */
    public String getSubscriptionId()
    {
        return subscriptionId;
    }

    /**
     * Sets the identifier for the subscription.
     * 
     * @param value The identifier for the subscription.
     */
    public void setSubscriptionId(String value)
    {
        subscriptionId = value; 
    }

    /**
     * Gets the unit of measure for the Azure resource.
     * 
     * @return The unit of measure for the Azure resource.
     */
    public String getUnit()
    {
        return unit;
    }

    /**
     * Sets the unit of measure for the Azure resource.
     * 
     * @param value The unit of measure for the Azure resource.
     */
    public void setUnit(String value)
    {
        unit = value; 
    }
}