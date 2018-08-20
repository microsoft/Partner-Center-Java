// -----------------------------------------------------------------------
// <copyright file="IPartnerLicensesDeploymentInsightsCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.analytics.PartnerLicensesDeploymentInsights;

/***
 * Encapsulates the operations on the partner's licenses' deployment insights collection.
 */
public interface IPartnerLicensesDeploymentInsightsCollection 
	extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<PartnerLicensesDeploymentInsights, ResourceCollection<PartnerLicensesDeploymentInsights>>
{
}