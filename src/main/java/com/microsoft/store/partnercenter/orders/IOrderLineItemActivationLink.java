// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.orders;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.orders.OrderLineItemActivationLink;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Represents the customer order line item activation link operations.
 */
public interface IOrderLineItemActivationLink
    extends IPartnerComponent<TripletTuple<String, String, Integer>>, IEntityGetOperations<ResourceCollection<OrderLineItemActivationLink>>
{
}