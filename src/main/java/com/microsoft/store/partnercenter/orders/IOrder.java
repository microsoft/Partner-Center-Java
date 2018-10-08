// -----------------------------------------------------------------------
// <copyright file="IOrder.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.orders;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityPatchOperations;
import com.microsoft.store.partnercenter.models.orders.Order;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Encapsulates a customer order behavior.
 */
public interface IOrder
    extends IPartnerComponent<Tuple<String, String>>, IEntityGetOperations<Order>, IEntityPatchOperations<Order>
{
    /***
     * Retrieves the order information.
     * @return The order information
     */
    Order get();

    /***
     * Patches the order.
     * @param partialOrder An order that has the properties to be patched set.
     * @return The updated order
     */
    Order patch(Order partialOrder);
}