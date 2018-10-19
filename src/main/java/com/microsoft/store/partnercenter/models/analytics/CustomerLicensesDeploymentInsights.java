// -----------------------------------------------------------------------
// <copyright file="CustomerLicensesDeploymentInsights.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.analytics;

/**
 * Holds analytics information about deployment of licenses at the customer level.
 */
public class CustomerLicensesDeploymentInsights
    extends CustomerLicensesInsightsBase
{
    /**
     * Gets or sets the number of License/seats deployed as of processed date.
     */
    private long __LicensesDeployed;

    public long getLicensesDeployed()
    {
        return __LicensesDeployed;
    }

    public void setLicensesDeployed( long value )
    {
        __LicensesDeployed = value;
    }

    /**
     * Gets or sets the number of sold seats/licenses as of processed time stamp.
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
     * Gets or sets the deployment percent of the licenses of the customer.
     */
    private double __DeploymentPercent;

    public double getDeploymentPercent()
    {
        return __DeploymentPercent;
    }

    public void setDeploymentPercent( double value )
    {
        __DeploymentPercent = value;
    }
}