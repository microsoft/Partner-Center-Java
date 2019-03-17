// -----------------------------------------------------------------------
// <copyright file="IOrder.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
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
    /**
     * Gets the line item collection operations.
     * 
     * @return The line item collection operations.
     */
    IOrderLineItemCollection getOrderLineItems();

    /**
     * Gets the order provisioning status operations.
     * 
     * @return The order provisioning status operations.
     */
    IOrderProvisioningStatus getProvisioningStatus();

    /**
     * Gets the order information.
     * 
     * @param includePrice A flag indicating whether to include pricing details in the order information or not.
     * @return The order information including pricing details (based on access permissions) when requested.
     */
    Order get(Boolean includePrice);
}