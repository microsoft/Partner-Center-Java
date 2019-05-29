// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.usage;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.usage.SubscriptionMonthlyUsageRecord;

/**
 * Defines the behavior for a subscription's daily usage records.
 */
public interface ISubscriptionMonthlyUsageRecordCollection
    extends IPartnerComponentString,
    IEntireEntityCollectionRetrievalOperations<SubscriptionMonthlyUsageRecord, ResourceCollection<SubscriptionMonthlyUsageRecord>>
{
    /**
     * Retrieves the customer's subscription usage records.
     * @return The customer's subscription usage records.
     */
    ResourceCollection<SubscriptionMonthlyUsageRecord> get();
}
