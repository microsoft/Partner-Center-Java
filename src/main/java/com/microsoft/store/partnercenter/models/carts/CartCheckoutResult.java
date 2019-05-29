// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.carts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;
import com.microsoft.store.partnercenter.models.orders.Order;

/**
 * Represents a result of a cart checkout.
 */
public class CartCheckoutResult 
    extends ResourceBase
{
    /**
     * Gets or sets the orders created.
     */
	@JsonProperty( "orders" )
    private List<Order> orders;

    public List<Order> getOrders()
    {
        return orders;
    }

    public void setOrders( List<Order> value )
    {
    	orders = value;
    }

    /**
     * Gets or sets a collection of order failure information.
     */
	@JsonProperty( "orderErrors" )
    private List<OrderError> orderErrors;

    public List<OrderError> getOrderErrors()
    {
        return orderErrors;
    }

    public void setOrderErrors( List<OrderError> value )
    {
    	orderErrors = value;
    }
 }