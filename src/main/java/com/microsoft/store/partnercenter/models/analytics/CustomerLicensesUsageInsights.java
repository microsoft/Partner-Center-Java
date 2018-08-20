// -----------------------------------------------------------------------
// <copyright file="CustomerLicensesUsageInsights.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.analytics;

/**
 * SDK business object model for Insights of license usage at customer level.
 */
public class CustomerLicensesUsageInsights
{
    /**
     * Gets or sets the Workload Code. (Example : Exchange - EXO).
     */
    private String __WorkloadCode;

    public String getWorkloadCode()
    {
        return __WorkloadCode;
    }

    public void setWorkloadCode( String value )
    {
        __WorkloadCode = value;
    }

    /**
     * Gets or sets the Workload name (Example: Exchange).
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
     * Gets or sets the total active seats as of processed time stamp.
     */
    private long __LicensesActive;

    public long getLicensesActive()
    {
        return __LicensesActive;
    }

    public void setLicensesActive( long value )
    {
        __LicensesActive = value;
    }

    /**
     * Gets or sets the total qualified entitlements as of processed time stamp.
     */
    private long __LicensesQualified;

    public long getLicensesQualified()
    {
        return __LicensesQualified;
    }

    public void setLicensesQualified( long value )
    {
        __LicensesQualified = value;
    }

    /**
     * Gets or sets the usage percent of the given workload.
     */
    private long __UsagePercent;

    public long getUsagePercent()
    {
        return __UsagePercent;
    }

    public void setUsagePercent( long value )
    {
        __UsagePercent = value;
    }
}