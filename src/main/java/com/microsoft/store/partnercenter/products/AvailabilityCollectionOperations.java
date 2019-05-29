// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.products;

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
import com.microsoft.store.partnercenter.models.utils.TripletTuple;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Availabilities implementation class
 */
public class AvailabilityCollectionOperations
	extends BasePartnerComponent<TripletTuple<String, String, String>>
	implements IAvailabilityCollection
{
	/**
	 * Initializes a new instance of the AvailabilityCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param productId             Identifier for the product.
	 * @param skuId                 Identifier for the SKU.
	 * @param country               The country on which to base the product.
	 */
	public AvailabilityCollectionOperations( IPartner rootPartnerOperations, String productId, String skuId, String country )
	{
		super( rootPartnerOperations, new TripletTuple<String, String, String>(productId, skuId, country) );

		if ( StringHelper.isNullOrWhiteSpace( productId ) )
		{
			throw new IllegalArgumentException( "productId must be set" );
		}

		if ( StringHelper.isNullOrWhiteSpace( skuId ) )
		{
			throw new IllegalArgumentException( "skuId must be set" );
		}

		ParameterValidator.isValidCountryCode(country);
	}

	/**
	 * Retrieves the operations tied with a specific availability.
	 * 
	 * @param availabilityId Identifier for the availability.
	 * @return The availability operations.
	 */    
	public IAvailability byId( String availabilityId )
	{
		return new AvailabilityOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), availabilityId, this.getContext().getItem3());
	}

	/**
	 * Retrieves the operations that can be applied on availabilities filtered by a specific target segment.
	 * 
	 * @param targetSegment The availability segment filter.
	 * @return The availability collection operations by target segment.
	 */    
	public IAvailabilityCollectionByTargetSegment byTargetSegment(String targetSegment)
	{
		return new AvailabilityCollectionByTargetSegmentOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), this.getContext().getItem3(), targetSegment);
	}

	/**
	 * Retrieves all the availabilities for the provided SKU.
	 * 
	 * @return The availabilities for the provided SKU.
	 */
	public ResourceCollection<Availability> get()
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetAvailabilities").getParameters().get("Country"),
				this.getContext().getItem3()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Availability>>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetAvailabilities").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2()),
			parameters);
	}
}