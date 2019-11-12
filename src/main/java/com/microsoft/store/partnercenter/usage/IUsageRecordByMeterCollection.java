// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.usage;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.usage.MeterUsageRecord;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the operations for a subscription's meter usage records.
 */
public interface IUsageRecordByMeterCollection
    extends IPartnerComponent<Tuple<String, String>>, IEntireEntityCollectionRetrievalOperations<MeterUsageRecord, ResourceCollection<MeterUsageRecord>>
{
}