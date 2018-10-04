// -----------------------------------------------------------------------
// <copyright file="ISubscriptionDailyUsageRecordCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.usage.SubscriptionDailyUsageRecord;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Defines the behavior for a subscription's daily usage records.
 */
public interface ISubscriptionDailyUsageRecordCollection
    extends IPartnerComponent<Tuple<String, String>>,
    IEntireEntityCollectionRetrievalOperations<SubscriptionDailyUsageRecord, ResourceCollection<SubscriptionDailyUsageRecord>>
{
    /***
     * Retrieves the subscription's daily usage records.
     * @return The subscription's daily usage records.
     */
    ResourceCollection<SubscriptionDailyUsageRecord> get();
}
