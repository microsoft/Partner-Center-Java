// -----------------------------------------------------------------------
// <copyright file="ISubscriptionUsageSummary.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.usage.SubscriptionUsageSummary;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * This interface defines the operations available on a customer's subscription usage summary.
 */
public interface ISubscriptionUsageSummary
    extends IPartnerComponent<Tuple<String, String>>, IEntityGetOperations<SubscriptionUsageSummary>
{
	/***
	 * Retrieves the customer's subscription usage summary.
	 * @return The customer's subscription usage summary.
	 */
	SubscriptionUsageSummary get();
}
