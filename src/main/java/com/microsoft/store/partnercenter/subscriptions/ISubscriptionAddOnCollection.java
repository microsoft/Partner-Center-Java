// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.subscriptions;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.subscriptions.Subscription;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Defines the behavior for a subscription's add-ons.
 */
public interface ISubscriptionAddOnCollection
    extends IPartnerComponent<Tuple<String, String>>,
    IEntireEntityCollectionRetrievalOperations<Subscription, ResourceCollection<Subscription>>
{
	/**
	 * Retrieves all subscription add-ons.
	 * @return The subscription add-ons.
	 */
    ResourceCollection<Subscription> get();
}
