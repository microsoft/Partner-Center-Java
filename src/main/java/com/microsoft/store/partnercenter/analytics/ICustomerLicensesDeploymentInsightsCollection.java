// -----------------------------------------------------------------------
// <copyright file="ICustomerLicensesDeploymentInsightsCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.analytics.CustomerLicensesDeploymentInsights;

/***
 * Encapsulates the operations on the customer's licenses' deployment insights collection.
 */
public interface ICustomerLicensesDeploymentInsightsCollection 
	extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<CustomerLicensesDeploymentInsights, ResourceCollection<CustomerLicensesDeploymentInsights>>
{
}