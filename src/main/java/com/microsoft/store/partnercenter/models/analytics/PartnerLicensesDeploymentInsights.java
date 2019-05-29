// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
     * Gets or sets the percentage of licenses deployed by all the customers 
     * of this partner.
     */
    private double proratedDeploymentPercent;

    public double getProratedDeploymentPercent()
    {
        return proratedDeploymentPercent;
    }

    public void setProratedDeploymentPercent( double value )
    {
        proratedDeploymentPercent = value;
    }
}