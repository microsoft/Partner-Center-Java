// -----------------------------------------------------------------------
// <copyright file="OrderCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.orders;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.BillingCycleType;
import com.microsoft.store.partnercenter.models.orders.Order;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
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
	 * Gets a specific order behavior.
	 * 
	 * @param orderId The order identifier.
	 * @return The order operations.
	 */
	@Override
	public IOrder byId( String orderId )
	{
		return new OrderOperations( this.getPartner(), this.getContext(), orderId );
	}

	/**
     * Gets the order collection behavior given a billing cycle type.
     * 
     * @param billingCycleType The billing cycle type.
     * @return The order collection by billing cycle type.
     */
	@Override
	public IOrderCollectionByBillingCycleType byBillingCycleType(BillingCycleType billingCycleType)
	{
		return new OrderCollectionByBillingCycleTypeOperations(this.getPartner(), this.getContext(), billingCycleType);
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
     * Gets a collection of orders.
     * 
     * @return The collection of orders.
     */
	@Override
	public ResourceCollection<Order> get()
	{
		return this.get(false);
	}

    /**
     * Gets a collection of orders.
     * 
     * @param includePrice A flag indicating whether to include pricing details in the order information or not.
     * @return The collection of orders.
     */
	@Override
	public ResourceCollection<Order> get(Boolean includePrice)
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add(
			new KeyValuePair<String, String>(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOrders").getParameters().get("IncludePrice"),
				String.valueOf(includePrice)));   

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Order>>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetOrders").getPath(),
				this.getContext()), 
			parameters);
	}
}