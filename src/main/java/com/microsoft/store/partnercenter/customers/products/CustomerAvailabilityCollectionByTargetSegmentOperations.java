// -----------------------------------------------------------------------
// <copyright file="CustomerAvailabilityCollectionByTargetSegmentOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.products;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Availability;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.QuadrupleTuple;
import com.microsoft.store.partnercenter.products.IAvailabilityCollectionByTargetSegment;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Holds operations that can be performed on products that apply to a given
 * customer.
 */
public class CustomerAvailabilityCollectionByTargetSegmentOperations
	extends BasePartnerComponent<QuadrupleTuple<String, String, String, String>>
	implements IAvailabilityCollectionByTargetSegment
{
	/**
	 * Initializes a new instance of the CustomerAvailabilityCollectionByTargetSegmentOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId Identifier for the customer.
	 * @param productId Identifier for the product.
	 * @param skuId Identifier for the SKU. 
	 * @param targetSegment The target segment used for filtering the availabilities.
	 */
	public CustomerAvailabilityCollectionByTargetSegmentOperations( IPartner rootPartnerOperations, String customerId, String productId, String skuId, String targetSegment )
	{
		super( rootPartnerOperations, new QuadrupleTuple<String, String, String, String>( customerId, productId, skuId, targetSegment ) );

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

		if ( StringHelper.isNullOrWhiteSpace( targetSegment ) )
		{
			throw new IllegalArgumentException( "targetSegment must be set" );
		}
	}

	/**
	 * Retrieves all the availabilities for the provided sku on a specific target segment.
	 * 
	 * @return The availability for the provided sku on a specific target segment.
	 */
	@Override
	public ResourceCollection<Availability> get()
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerAvailabilities").getParameters().get("TargetSegment"),
				this.getContext().getItem4()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Availability>>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerAvailabilities").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2(), 
				this.getContext().getItem3()),
			parameters);
	}
}