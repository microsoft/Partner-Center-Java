// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
    private long licenseDeployed;

    public long getLicensesDeployed()
    {
        return licenseDeployed;
    }

    public void setLicensesDeployed( long value )
    {
        licenseDeployed = value;
    }

    /**
     * Gets or sets the number of sold seats/licenses as of processed time stamp.
     */
    private long licensesSold;

    public long getLicensesSold()
    {
        return licensesSold;
    }

    public void setLicensesSold( long value )
    {
        licensesSold = value;
    }

    /**
     * Gets or sets the deployment percent of the licenses of the customer.
     */
    private double deploymentPercent;

    public double getDeploymentPercent()
    {
        return deploymentPercent;
    }

    public void setDeploymentPercent( double value )
    {
        deploymentPercent = value;
    }
}