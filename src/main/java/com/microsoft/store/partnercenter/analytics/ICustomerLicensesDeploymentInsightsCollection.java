// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.analytics.CustomerLicensesDeploymentInsights;

/**
 * Encapsulates the operations on the customer's licenses' deployment insights collection.
 */
public interface ICustomerLicensesDeploymentInsightsCollection 
	extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<CustomerLicensesDeploymentInsights, ResourceCollection<CustomerLicensesDeploymentInsights>>
{
}