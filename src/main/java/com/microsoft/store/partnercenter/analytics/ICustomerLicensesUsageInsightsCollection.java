// -----------------------------------------------------------------------
// <copyright file="ICustomerLicensesUsageInsightsCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.analytics.CustomerLicensesUsageInsights;

/**
 * Encapsulates the operations on the customer's licenses' usage insights collection.
 */
public interface ICustomerLicensesUsageInsightsCollection 
	extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<CustomerLicensesUsageInsights, ResourceCollection<CustomerLicensesUsageInsights>>
{
}