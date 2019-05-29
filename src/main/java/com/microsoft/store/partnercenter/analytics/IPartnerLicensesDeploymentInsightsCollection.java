// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.analytics.PartnerLicensesDeploymentInsights;

/**
 * Encapsulates the operations on the partner's licenses' deployment insights collection.
 */
public interface IPartnerLicensesDeploymentInsightsCollection 
	extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<PartnerLicensesDeploymentInsights, ResourceCollection<PartnerLicensesDeploymentInsights>>
{
}