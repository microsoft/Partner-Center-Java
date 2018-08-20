// -----------------------------------------------------------------------
// <copyright file="ICustomerAnalyticsCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.IPartnerComponentString;

/***
 * Holds operations that apply to customer analytics collection.
 */
public interface ICustomerAnalyticsCollection 
	extends IPartnerComponentString
{
    /**
     * Gets the customer's licenses analytics collection.
     *
     * @return The customer's licenses analytics collection.
     */
	ICustomerLicensesAnalyticsCollection getLicenses();
}