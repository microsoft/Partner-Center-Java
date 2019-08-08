// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.usage;

/**
 * Defines the monthly usage record for an Azure subscription resource.
 */
public class AzureResourceMonthlyUsageRecord
    extends UsageRecordBase
{
    /**
     * Gets or sets the azure resource category.
     */
    private String __Category;

    public String getCategory()
    {
        return __Category;
    }

    public void setCategory(String value)
    {
        __Category = value;
    }

    /**
     * Gets or sets the azure resource sub-category.
     */
    private String __Subcategory;

    public String getSubcategory()
    {
        return __Subcategory;
    }

    public void setSubcategory(String value)
    {
        __Subcategory = value;
    }

    /**
     * Gets or sets the quantity of the Azure resource used.
     */
    private double __QuantityUsed;

    public double getQuantityUsed()
    {
        return __QuantityUsed;
    }

    public void setQuantityUsed(double value)
    {
        __QuantityUsed = value;
    }

    /**
     * Gets or sets the unit of measure for the Azure resource.
     */
    private String __Unit;

    public String getUnit()
    {
        return __Unit;
    }

    public void setUnit(String value)
    {
        __Unit = value;
    }
}