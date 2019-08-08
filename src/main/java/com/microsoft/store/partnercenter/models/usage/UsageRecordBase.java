// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.usage;

import java.util.Locale;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Defines the common properties for all usage records.
 */
public class UsageRecordBase
    extends ResourceBase
{
    /**
     * The locale of the currency.
     */
    private Locale currencyLocale;

    /**
     * The date the usage record was last modified.
     */
    private DateTime lastModifiedDate;

    /**
     * The resource unique identifier.
     */
    private String resourceId;

    /**
     * The name of the resource.
     */
    private String resourceName;

    /**
     * The estimated total cost of usage.
     */
    private double totalCost;

    /**
     * Gets the locale of the currency.
     * 
     * @return The locale of the currency.
     */
    public Locale getCurrencyLocale()
    {
        return currencyLocale;
    }

    /**
     * Sets the locale of the currency.
     * 
     * @param value The locale of the currency.
     */
    public void setCurrencyLocale(Locale value)
    {
        currencyLocale = value;
    }

    /**
     * Sets the date the usage record was last modified.
     * 
     * @param value The date the usage record was last modified.
     */
    public void setLastModifiedDate(DateTime value)
    {
    	lastModifiedDate = value;
    }

    /**
     * Gets the resource unique identifier.
     * 
     * @return The resource unique identifier.
     */
    public String getResourceId()
    {
        return resourceId;
    }

    /**
     * Sets the resource unique identifier.
     * 
     * @param value The resource unique identifier.
     */
    public void setId(String value)
    {
        resourceId = value;
    }

    /**
     * Gets the name of the resource.
     * 
     * @return The name of the resource.
     */
    public String getResourceName()
    {
        return resourceName;
    }

    /**
     * Sets the name of the resource.
     * 
     * @param value The name of the resource.
     */
    public void setResourceName(String value)
    {
        resourceName = value;
    }

    /**
     * Gets the estimated total cost of usage.
     * 
     * @return The estimated total cost of usage.
     */
    public double getTotalCost()
    {
        return totalCost;
    }

    /**
     * Sets the  estimated total cost of usage.
     * 
     * @param value  The estimated total cost of usage.
     */
    public void setTotalCost(double value)
    {
        totalCost = value;
    }

    /**
     * Gets the date the usage record was last modified.
     * 
     * @return The date the usage record was last modified.
     */
    public DateTime getLastModifiedDate()
    {
        return lastModifiedDate;
    }
}