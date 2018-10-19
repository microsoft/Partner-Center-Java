// -----------------------------------------------------------------------
// <copyright file="ISubscriptionMonthlyUsageRecordCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

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
