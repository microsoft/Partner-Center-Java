// -----------------------------------------------------------------------
// <copyright file="IOrderLineItemActivationLink.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

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