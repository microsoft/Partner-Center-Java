// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.offers;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.Offer;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Customer Offer operations implementation class.
 */
public class CustomerOfferCollectionOperations 
	extends BasePartnerComponentString 
	implements ICustomerOfferCollection
{
	/**
	 * Initializes a new instance of the CustomerOfferCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer identifer.
	 */
	public CustomerOfferCollectionOperations(IPartner rootPartnerOperations, String customerId )
	{
		super(rootPartnerOperations, customerId);

		if ( StringHelper.isNullOrEmpty( customerId ) )
		{
			throw new IllegalArgumentException("customerId must be set.");
		}
	}

	/**
	 * Gets the offers available to customer from partner.
	 */
	public ResourceCollection<Offer> get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Offer>>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerOffers").getPath(),
				this.getContext()));
	}

	/**
	 *  Gets a segment of the offers available to customer from partner..
	 *  
	 *  @param offset The starting index.
	 *  @param size The desired segment size.
	 *  @return The required offers segment.
	 */
	public ResourceCollection<Offer> get(int offset, int size)
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerOffers").getParameters().get("Offset"),
				String.valueOf(offset)
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerOffers").getParameters().get("Size"),
				String.valueOf(size)
			) 
		);
		
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Offer>>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerOffers").getPath(),
				this.getContext()),
			parameters);
	}
}