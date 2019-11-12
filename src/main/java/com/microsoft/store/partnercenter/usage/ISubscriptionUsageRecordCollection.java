// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.usage;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the operations for a customer's subscription usage records.
 */
public interface ISubscriptionUsageRecordCollection
    extends IPartnerComponent<Tuple<String, String>>
{
    /**
     * Gets the subscription usage records grouped by meter.
     * 
     * @return The subscription usage records grouped by meter.
     */
    IUsageRecordByMeterCollection byMeter();

    /**
     * Gets the subscription usage records grouped by resource.
     * 
     * @return Gets the subscription usage records grouped by resource. 
     */
    IUsageRecordByResourceCollection byResource();
}