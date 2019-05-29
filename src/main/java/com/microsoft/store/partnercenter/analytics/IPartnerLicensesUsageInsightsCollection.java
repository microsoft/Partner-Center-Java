// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.analytics.PartnerLicensesUsageInsights;

/**
 * Encapsulates the operations on the partner's licenses' usage insights collection.
 */
public interface IPartnerLicensesUsageInsightsCollection 
	extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<PartnerLicensesUsageInsights, ResourceCollection<PartnerLicensesUsageInsights>>
{
}