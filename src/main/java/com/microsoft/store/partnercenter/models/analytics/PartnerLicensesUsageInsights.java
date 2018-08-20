// -----------------------------------------------------------------------
// <copyright file="PartnerLicensesUsageInsights.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.analytics;

/**
 * Holds the analytics information about the usage of all the customers' 
 * licenses of the given partner.
 */
public class PartnerLicensesUsageInsights
    extends LicensesInsightsBase
{
    /**
     * Gets or sets the Workload name. For example: Exchange.
     */
    private String __WorkloadName;

    public String getWorkloadName()
    {
        return __WorkloadName;
    }

    public void setWorkloadName( String value )
    {
        __WorkloadName = value;
    }

    /**
     *  Gets or sets the usage percentage of the given workload out of qualified 
     * licenses of all customers of the partner.
     */
    private double __ProratedLicensesUsagePercent;

    public double getProratedLicensesUsagePercent()
    {
        return __ProratedLicensesUsagePercent;
    }

    public void setProratedLicensesUsagePercent( double value )
    {
        __ProratedLicensesUsagePercent = value;
    }
}