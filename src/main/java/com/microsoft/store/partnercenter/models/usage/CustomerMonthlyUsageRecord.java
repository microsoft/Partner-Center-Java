// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.usage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class defines the monthly usage record of a customer for all its subscriptions.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CustomerMonthlyUsageRecord
    extends UsageRecordBase
{
    /**
     * Gets or sets the spending budget allocated for a specific customer.
     */
    private SpendingBudget __Budget;

    public SpendingBudget getBudget()
    {
        return __Budget;
    }

    public void setBudget( SpendingBudget value )
    {
        __Budget = value;
    }

    /**
     * Gets or sets the percentage used out of the allocated budget.
     */
    private double __PercentUsed;

    public double getPercentUsed()
    {
        return __PercentUsed;
    }

    public void setPercentUsed( double value )
    {
        __PercentUsed = value;
    }

}
