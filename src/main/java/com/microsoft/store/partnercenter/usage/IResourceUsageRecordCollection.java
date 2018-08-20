// -----------------------------------------------------------------------
// <copyright file="IResourceUsageRecordCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.usage.AzureResourceMonthlyUsageRecord;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Defines the behavior for a subscription's resource usage records.
 */
public interface IResourceUsageRecordCollection
    extends IPartnerComponent<Tuple<String, String>>,
    IEntireEntityCollectionRetrievalOperations<AzureResourceMonthlyUsageRecord, ResourceCollection<AzureResourceMonthlyUsageRecord>>
{
	/***
	 * Retrieves the subscription's resource usage records.
	 * @return The subscription's resource usage records.
	 */
    ResourceCollection<AzureResourceMonthlyUsageRecord> get();
}
