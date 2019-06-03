// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.analytics;

/**
 * SDK business object model for Insights of license usage at customer level.
 */
public class CustomerLicensesUsageInsights
{
    /**
     * Gets or sets the Workload Code. (Example : Exchange - EXO).
     */
    private String workloadCode;

    public String getWorkloadCode()
    {
        return workloadCode;
    }

    public void setWorkloadCode(String value)
    {
        workloadCode = value;
    }

    /**
     * Gets or sets the Workload name (Example: Exchange).
     */
    private String workloadName;

    public String getWorkloadName()
    {
        return workloadName;
    }

    public void setWorkloadName(String value)
    {
        workloadName = value;
    }

    /**
     * Gets or sets the total active seats as of processed time stamp.
     */
    private long licensesActive;

    public long getLicensesActive()
    {
        return licensesActive;
    }

    public void setLicensesActive(long value)
    {
        licensesActive = value;
    }

    /**
     * Gets or sets the total qualified entitlements as of processed time stamp.
     */
    private long licensesQualified;

    public long getLicensesQualified()
    {
        return licensesQualified;
    }

    public void setLicensesQualified(long value)
    {
        licensesQualified = value;
    }

    /**
     * Gets or sets the usage percent of the given workload.
     */
    private long usagePercent;

    public long getUsagePercent()
    {
        return usagePercent;
    }

    public void setUsagePercent(long value)
    {
        usagePercent = value;
    }
}