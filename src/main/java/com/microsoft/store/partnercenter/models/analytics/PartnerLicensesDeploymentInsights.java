// -----------------------------------------------------------------------
// <copyright file="PartnerLicensesDeploymentInsights.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.analytics;

/**
 * Holds the analytics information about the deployment of all customers' 
 * licenses of the given partner.
 */
public class PartnerLicensesDeploymentInsights
    extends LicensesInsightsBase
{
    /**
     * Gets or sets the number of licenses sold as of processed time stamp.
     */
    private long __LicensesSold;

    public long getLicensesSold()
    {
        return __LicensesSold;
    }

    public void setLicensesSold( long value )
    {
        __LicensesSold = value;
    }

    /**
     * Gets or sets the percentage of licenses deployed by all the customers 
     * of this partner.
     */
    private double __ProratedDeploymentPercent;

    public double getProratedDeploymentPercent()
    {
        return __ProratedDeploymentPercent;
    }

    public void setProratedDeploymentPercent( double value )
    {
        __ProratedDeploymentPercent = value;
    }
}