// -----------------------------------------------------------------------
// <copyright file="ISubscriptionUsageRecordCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

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