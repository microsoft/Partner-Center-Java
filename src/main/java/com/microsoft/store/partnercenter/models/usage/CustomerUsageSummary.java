// -----------------------------------------------------------------------
// <copyright file="CustomerUsageSummary.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.usage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class defines the usage summary for a specific customer.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CustomerUsageSummary
    extends UsageSummaryBase
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

    public void setResourceId( String value )
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

    public void setResourceName( String value )
    {
        __ResourceName = value;
    }

    /**
     * Gets or sets the spending budget allocated to a customer.
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

}
