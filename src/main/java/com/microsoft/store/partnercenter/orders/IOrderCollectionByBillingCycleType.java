// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.orders;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.orders.Order;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.BillingCycleType;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Holds operations that can be performed on orders given a billing cycle type.
 */
public interface IOrderCollectionByBillingCycleType
    extends IPartnerComponent<Tuple<String, BillingCycleType>>,  IEntireEntityCollectionRetrievalOperations<Order, ResourceCollection<Order>>
{
    /**
     * Gets all customer orders.
     * 
     * @return The customer orders.
     */
    ResourceCollection<Order> get();

    /**
     * Gets all customer orders.
     * 
     * @param includePrice A flag indicating whether to include pricing details in the order information or not.
     * @return The customer orders.
     */
    ResourceCollection<Order> get(boolean includePrice);
}