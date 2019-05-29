// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
    private String workloadName;

    public String getWorkloadName()
    {
        return workloadName;
    }

    public void setWorkloadName( String value )
    {
        workloadName = value;
    }

    /**
     *  Gets or sets the usage percentage of the given workload out of qualified 
     * licenses of all customers of the partner.
     */
    private double proratedLicensesUsagePercent;

    public double getProratedLicensesUsagePercent()
    {
        return proratedLicensesUsagePercent;
    }

    public void setProratedLicensesUsagePercent( double value )
    {
        proratedLicensesUsagePercent = value;
    }
}