// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.subscriptions;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.subscriptions.Subscription;
import com.microsoft.store.partnercenter.usage.ISubscriptionMonthlyUsageRecordCollection;

/**
 * Represents the behavior of the customer subscriptions as a whole.
 */
public interface ISubscriptionCollection
	extends IPartnerComponentString,
	IEntireEntityCollectionRetrievalOperations<Subscription, ResourceCollection<Subscription>>
{
	/**
	 * Obtains the subscription usage records behavior for the customer.
	 *
	 * @return The customer subscription usage record.
	 */
	ISubscriptionMonthlyUsageRecordCollection getUsageRecords();

	/**
	 * Retrieves a specific customer subscription behavior.
	 *
	 * @param subscriptionId The subscription identifier
	 * @return The customer subscription.
	 */
	ISubscription byId(String subscriptionId);
	
	/**
	 * Retrieves all subscriptions.
	 * @return The subscriptions.
	 */
	ResourceCollection<Subscription> get();

	/**
	 * Groups customer subscriptions by an order.
	 *
	 * @param orderId The order id.
	 * @return The order subscriptions operations.
	 */
	IEntireEntityCollectionRetrievalOperations<Subscription, ResourceCollection<Subscription>> byOrder(String orderId);

	/**
	 * Groups customer subscriptions by a partner.
	 *
	 * @param partnerId The partner id.
	 * @return The partner subscriptions operations.
	 */
	IEntireEntityCollectionRetrievalOperations<Subscription, ResourceCollection<Subscription>> byPartner(String partnerId);

}
