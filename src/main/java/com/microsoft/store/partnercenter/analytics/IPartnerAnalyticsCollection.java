// -----------------------------------------------------------------------
// <copyright file="IPartnerAnalyticsCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.IPartnerComponentString;

/***
 * Encapsulates collection of partner's analytics.
 */
public interface IPartnerAnalyticsCollection 
	extends IPartnerComponentString
{
    /**
     * Gets the partner's licenses analytics collection.
     *
     * @return The partner's licenses analytics collection.
     */
	IPartnerLicensesAnalyticsCollection getLicenses();
}