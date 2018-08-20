// -----------------------------------------------------------------------
// <copyright file="IOrderCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.orders;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.orders.Order;

/**
 * Encapsulates customer orders behavior.
 */
public interface IOrderCollection
    extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<Order, ResourceCollection<Order>>,
    IEntityCreateOperations<Order, Order>, IEntitySelector<IOrder>
{
    /**
     * Obtains a specific order behavior.
     * 
     * @param orderId The order id.
     * @return The order operations.
     */
    IOrder byId( String orderId );

    /***
     * Places a new order for the customer.
     * @param newOrder The new order information.
     * @return The order that was just placed.
     */
    Order create(Order newOrder);

    /***
     * Retrieves all customer orders.
     * @return The customer orders.
     */
    ResourceCollection<Order> get();
}