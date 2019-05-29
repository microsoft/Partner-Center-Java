// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.usage;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Defines the behavior for a customer's subscription usage records.
 */
public interface ISubscriptionUsageRecordCollection
    extends IPartnerComponent<Tuple<String, String>>
{
	/**
	 * Gets the subscription usage records grouped by resources.
     * 
     * @return The subscription usage records grouped by resources.
	 */
    IResourceUsageRecordCollection getResources();
    
    /**
     * Gets the subscription usage records grouped by days.
     * 
     * @return The subscription usage records grouped by days.
     */
    ISubscriptionDailyUsageRecordCollection getDaily();
}