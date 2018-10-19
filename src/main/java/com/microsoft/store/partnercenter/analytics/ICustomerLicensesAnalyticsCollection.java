// -----------------------------------------------------------------------
// <copyright file="ICustomerLicensesAnalyticsCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.IPartnerComponentString;

/**
 * Encapsulates collection of customer level analytics.
 */
public interface ICustomerLicensesAnalyticsCollection 
	extends IPartnerComponentString
{
    /**
     * Gets the customer level licenses deployment analytics.
     *
     * @return The customer level licenses deployment analytics
     */
	ICustomerLicensesDeploymentInsightsCollection getDeployment();

    /**
     * Gets the customer level licenses usage analytics.
     *
     * @return The customer level licenses usage analytics.
     */
	ICustomerLicensesUsageInsightsCollection getUsage();
}