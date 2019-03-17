// -----------------------------------------------------------------------
// <copyright file="IOrderCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.orders;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.BillingCycleType;
import com.microsoft.store.partnercenter.models.orders.Order;

/**
 * Encapsulates customer orders behavior.
 */
public interface IOrderCollection
    extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<Order, ResourceCollection<Order>>,
    IEntityCreateOperations<Order, Order>, IEntitySelector<String, IOrder>
{
    /**
     * Gets the order collection behavior given a billing cycle type.
     * 
     * @param billingCycleType The billing cycle type.
     * @return The order collection by billing cycle type.
     */
    IOrderCollectionByBillingCycleType byBillingCycleType(BillingCycleType billingCycleType);

    /**
     * Gets a collection of orders.
     * 
     * @param includePrice A flag indicating whether to include pricing details in the order information or not.
     * @return The collection of orders including pricing details (based on access permissions) when requested.
     */
    ResourceCollection<Order> get(Boolean includePrice);
}