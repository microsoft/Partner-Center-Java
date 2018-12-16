// -----------------------------------------------------------------------
// <copyright file="CustomerAvailabilityOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.products;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.products.Availability;
import com.microsoft.store.partnercenter.models.utils.QuadrupleTuple;
import com.microsoft.store.partnercenter.products.IAvailability;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Single customer availability operations implementation.
 */
public class CustomerAvailabilityOperations
	extends BasePartnerComponent<QuadrupleTuple<String, String, String, String>>
	implements IAvailability
{
	/**
	 * Initializes a new instance of the CustomerAvailabilityOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId Identifier for the customer.
	 * @param productId Identifier for the product. 
	 * @param skuId Identifier for the SKU. 
	 * @param availabilityId Identifier for the availability.
	 */
	public CustomerAvailabilityOperations( IPartner rootPartnerOperations, String customerId, String productId, String skuId, String availabilityId )
	{
		super( rootPartnerOperations, new QuadrupleTuple<String, String, String, String>( customerId, productId, skuId, availabilityId ) );

		if ( StringHelper.isNullOrWhiteSpace( customerId ) )
		{
			throw new IllegalArgumentException( "customerId must be set" );
		}

		if ( StringHelper.isNullOrWhiteSpace( productId ) )
		{
			throw new IllegalArgumentException( "productId must be set" );
		}

		if ( StringHelper.isNullOrWhiteSpace( skuId ) )
		{
			throw new IllegalArgumentException( "skuId must be set" );
		}

		if ( StringHelper.isNullOrWhiteSpace( availabilityId ) )
		{
			throw new IllegalArgumentException( "availabilityId must be set" );
		}
	}

	/**
	 * Retrieves the availability information.
	 * 
	 * @return The availability information.
	 */
	@Override
	public Availability get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<Availability>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerAvailabilities").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2(), 
				this.getContext().getItem3(),
				this.getContext().getItem4()));
	}
}