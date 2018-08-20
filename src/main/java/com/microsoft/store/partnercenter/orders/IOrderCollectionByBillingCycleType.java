// -----------------------------------------------------------------------
// <copyright file="IOrderCollectionByBillingCycleType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

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
    /***
     * Retrieves all customer orders.
     * @return The customer orders.
     */
    ResourceCollection<Order> get();
}