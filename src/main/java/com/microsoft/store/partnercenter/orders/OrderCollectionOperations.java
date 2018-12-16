// -----------------------------------------------------------------------
// <copyright file="OrderCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.orders;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.orders.Order;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Order collection operations implementation class.
 */
public class OrderCollectionOperations
	extends BasePartnerComponentString
	implements IOrderCollection
{
	/**
	 * Initializes a new instance of the OrderCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer tenant identifier.
	 */
	public OrderCollectionOperations( IPartner rootPartnerOperations, String customerId )
	{
		super( rootPartnerOperations, customerId );
		if ( StringHelper.isNullOrWhiteSpace( customerId ) )
		{
			throw new IllegalArgumentException( "customerId must be set." );
		}
	}

	/**
	 * Places a new order for the customer.
	 * 
	 * @param newOrder The new order.
	 * @return The newly created order.
	 */
	@Override
	public Order create( Order newOrder )
	{
		if ( newOrder == null )
		{
			throw new IllegalArgumentException("The newOrder parameter cannot be null.");
		}

		return this.getPartner().getServiceClient().post(
			this.getPartner(), 
			new TypeReference<Order>(){},
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOrders").getPath(),
				this.getContext()),
			newOrder);
	}

	/**
	 * Obtains a specific order behavior.
	 * 
	 * @param orderId The order id.
	 * @return The order operations.
	 */
	@Override
	public IOrder byId( String orderId )
	{
		return new OrderOperations( this.getPartner(), this.getContext(), orderId );
	}

	/**
	 * Retrieves all the orders the customer made.
	 * 
	 * @return All the customer orders.
	 */
	@Override
	public ResourceCollection<Order> get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Order>>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetOrders").getPath(),
				this.getContext()));
	}
}