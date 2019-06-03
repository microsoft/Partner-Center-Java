// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.carts;

import java.util.List;

import com.microsoft.store.partnercenter.models.ResourceBase;
import com.microsoft.store.partnercenter.models.orders.Order;

/**
 * Represents a result of a cart checkout.
 */
public class CartCheckoutResult 
    extends ResourceBase
{
    /**
     * The orders that were created.
     */
    private List<Order> orders;

    /**
     * The collection of order failure information.
     */
    private List<OrderError> orderErrors;

    /**
     * Gets the order that were created.
     * 
     * @return The orders that were created.
     */
    public List<Order> getOrders()
    {
        return orders;
    }

    /**
     * Sets the orders that were created.
     * 
     * @param value The orders that were created. 
     */
    public void setOrders(List<Order> value)
    {
    	orders = value;
    }

    /**
     * Gets the collection of order failure information.
     * 
     * @return The collection of order failure information.
     */
    public List<OrderError> getOrderErrors()
    {
        return orderErrors;
    }

    /**
     * Sets the collection of order failure information.
     * 
     * @param value The collection of order failure information.
     */
    public void setOrderErrors(List<OrderError> value)
    {
    	orderErrors = value;
    }
 }