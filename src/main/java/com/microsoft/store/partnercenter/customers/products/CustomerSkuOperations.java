// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.products;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.products.Sku;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;
import com.microsoft.store.partnercenter.products.IAvailabilityCollection;
import com.microsoft.store.partnercenter.products.ISku;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements operations for a single customer SKU.
 */
public class CustomerSkuOperations extends BasePartnerComponent<TripletTuple<String, String, String>>
	implements ISku
{
	private IAvailabilityCollection availabilities;

	/**
	 * Initializes a new instance of the CustomerSkuOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer id for which to retrieve the SKU.
	 * @param productId The product id for which to retrieve its SKU.
	 * @param skuId Identifier for the SKU.
	 */
	public CustomerSkuOperations( IPartner rootPartnerOperations, String customerId, String productId, String skuId )
	{
		super( rootPartnerOperations, new TripletTuple<String, String, String>( customerId, productId, skuId ) );

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
	}

	/**
	 * Retrieves the operations for the current SKU's availabilities.
	 * 
	 * @return The operations for the current SKU's availabilities.
	 */    
	@Override
	public IAvailabilityCollection getAvailabilities()
	{
		if(availabilities == null)
		{
			availabilities = new CustomerAvailabilityCollectionOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), this.getContext().getItem3());
		}

		return availabilities;
	}

	/**
	 * Retrieves the SKU information.
	 * 
	 * @return The SKUs information.
	 */
	@Override
	public Sku get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<Sku>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerSku").getPath(),
				this.getContext().getItem1(),
				this.getContext().getItem2(),
				this.getContext().getItem3()));
	}
}