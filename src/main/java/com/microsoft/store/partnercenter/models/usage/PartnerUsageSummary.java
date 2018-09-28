// -----------------------------------------------------------------------
// <copyright file="PartnerUsageSummary.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.usage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class defines the usage summary of a partner for all its customers with an Azure subscription
 */
@JsonIgnoreProperties( { "customersWithUsageBasedSubscription", "lastModifiedDate", "id", "name" } )
public class PartnerUsageSummary
    extends UsageSummaryBase
{
    /**
     * Gets or sets the Azure Active Directory tenant Id of the partner this usage summary applies to.
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
     * Gets or sets the name of the partner this usage summary applies to.
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
     * Gets or sets the list of email addresses for notifications.
     */
    private Iterable<String> __EmailsToNotify;

    public Iterable<String> getEmailsToNotify()
    {
        return __EmailsToNotify;
    }

    public void setEmailsToNotify( Iterable<String> value )
    {
        __EmailsToNotify = value;
    }

    /**
     * Gets or sets the number of customers that are over budget.
     */
    private long __CustomersOverBudget;

    public long getCustomersOverBudget()
    {
        return __CustomersOverBudget;
    }

    public void setCustomersOverBudget( long value )
    {
        __CustomersOverBudget = value;
    }

    /**
     * Gets or sets the number of customers that are close to going over budget.
     */
    private long __CustomersTrendingOver;

    public long getCustomersTrendingOver()
    {
        return __CustomersTrendingOver;
    }

    public void setCustomersTrendingOver( long value )
    {
        __CustomersTrendingOver = value;
    }
    
    /***
     * Gets or sets the number of customers with a usage-based subscription.
     */
    private long __CustomersWithUsageBasedSubscription;

    public long getCustomersWithUsageBasedSubscription()
    {
        return __CustomersWithUsageBasedSubscription;
    }

    public void setCustomersWithUsageBasedSubscription( long value )
    {
    	__CustomersWithUsageBasedSubscription = value;
    }
    
}
