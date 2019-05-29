// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.subscriptions;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.orders.OrderLineItemActivationLink;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * A resource collection of subscription activation links.
 */
public interface ISubscriptionActivationLinks
    extends IPartnerComponent<Tuple<String, String>>,
    IEntireEntityCollectionRetrievalOperations<OrderLineItemActivationLink, ResourceCollection<OrderLineItemActivationLink>>
{
}