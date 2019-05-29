// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.usage;

import org.joda.time.DateTime;

/**
 * This class defines the daily usage record of a specific subscription.
 */
public class SubscriptionDailyUsageRecord
    extends UsageRecordBase
{
    /**
     * Gets or sets the subscription ID.
     */
	private String __ResourceId;

    public String getResourceId()
    {
        return __ResourceId;
    }

    public void setResourceId( String value )
    {
    	__ResourceId = value;
    }

    /**
     * Gets or sets the subscription name.
     */
    private String __ResourceName;

    public String getResourceName()
    {
        return __ResourceName;
    }

    public void setResourceName( String value )
    {
    	__ResourceName = value;
    }

    /**
     * Gets or sets the estimated total cost of daily usage for the subscription.
     */
    private double __TotalCost;

    public double getTotalCost()
    {
        return __TotalCost;
    }

    public void setTotalCost( double value )
    {
    	__TotalCost = value;
    }

    /**
     * Gets or sets the usage date.
     */
    private DateTime __DateUsed;

    public DateTime getDateUsed()
    {
        return __DateUsed;
    }

    public void setDateUsed( DateTime value )
    {
        __DateUsed = value;
    }

}
