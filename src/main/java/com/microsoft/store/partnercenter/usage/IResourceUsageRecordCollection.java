// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
	/**
	 * Retrieves the subscription's resource usage records.
	 * @return The subscription's resource usage records.
	 */
    ResourceCollection<AzureResourceMonthlyUsageRecord> get();
}
