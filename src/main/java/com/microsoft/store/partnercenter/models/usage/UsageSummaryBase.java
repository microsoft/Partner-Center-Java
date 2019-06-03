// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.usage;

import java.util.Locale;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * This class defines the common properties for all usage summary
 */
public abstract class UsageSummaryBase
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Gets or sets the resource unique identifier. In the context of CustomerMonthlyUsageRecord this id is the customer
     * id.
     */
    private String __ResourceId;

    public String getResourceId()
    {
        return __ResourceId;
    }

    public void setResourceId(String value)
    {
        __ResourceId = value;
    }

    /**
     * Gets or sets the name of the resource. In the context of CustomerMonthlyUsageRecord this name is the customer
     * name.
     */
    private String __ResourceName;

    public String getResourceName()
    {
        return __ResourceName;
    }

    public void setResourceName(String value)
    {
        __ResourceName = value;
    }

    /**
     * Gets or sets the start date of the current billing period.
     */
    private DateTime __BillingStartDate;

    public DateTime getBillingStartDate()
    {
        return __BillingStartDate;
    }

    public void setBillingStartDate(DateTime value)
    {
        __BillingStartDate = value;
    }

    /**
     * Gets or sets the end date of the current billing period.
     */
    private DateTime __BillingEndDate;

    public DateTime getBillingEndDate()
    {
        return __BillingEndDate;
    }

    public void setBillingEndDate(DateTime value)
    {
        __BillingEndDate = value;
    }

    /**
     * Gets or sets the total estimated cost based on current usage from the start of the billing period.
     */
    private double __TotalCost;

    public double getTotalCost()
    {
        return __TotalCost;
    }

    public void setTotalCost(double value)
    {
        __TotalCost = value;
    }

    /**
     * Gets or sets the currency locale.
     */
    private Locale __CurrencyLocale;

    public Locale getCurrencyLocale()
    {
        return __CurrencyLocale;
    }

    public void setCurrencyLocale(Locale value)
    {
        __CurrencyLocale = value;
    }

    /**
     * Gets or sets the Last Modified date.
     */
    private DateTime __LastModifiedDate;

    public DateTime getLastModifiedDate()
    {
        return __LastModifiedDate;
    }

    public void setLastModifiedDate(DateTime value)
    {
    	__LastModifiedDate = value;
    }

}
