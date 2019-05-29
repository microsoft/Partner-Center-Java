// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.IPartnerComponentString;

/**
 * Encapsulates collection of partner level licenses' analytics.
 */
public interface IPartnerLicensesAnalyticsCollection 
	extends IPartnerComponentString
{
    /**
     * Gets the partner's licenses' deployment analytics.
     *
     * @return The partner's licenses' deployment analytics.
     */
	IPartnerLicensesDeploymentInsightsCollection getDeployment();

    /**
     * Gets the partner's licenses' usage analytics.
     *
     * @return The partner's licenses' usage analytics.
     */
	IPartnerLicensesUsageInsightsCollection getUsage();
}