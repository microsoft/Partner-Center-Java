// -----------------------------------------------------------------------
// <copyright file="Cart.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

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
    private List<Order> __Orders;

    public List<Order> getOrders()
    {
        return __Orders;
    }

    public void setOrders( List<Order> value )
    {
    	__Orders = value;
    }

    /**
     * Gets or sets a collection of order failure information.
     */
	@JsonProperty( "orderErrors" )
    private List<OrderError> __OrderErrors;

    public List<OrderError> getOrderErrors()
    {
        return __OrderErrors;
    }

    public void setOrderErrors( List<OrderError> value )
    {
    	__OrderErrors = value;
    }
 }