// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.offers;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.Offer;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;

public class CategoryOffersCollectionOperations 
	extends BasePartnerComponent<Tuple<String, String>>
	implements ICategoryOffersCollection
{

	/**
	 * Initializes a new instance of the CategoryOffersCollectionOperations class.
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param categoryId The category identifier which contains the offers.
	 * @param country The country on which to base the offers.
	 */
	public CategoryOffersCollectionOperations( IPartner rootPartnerOperations, String categoryId, String country) 
	{
		super(rootPartnerOperations, new Tuple<String, String>( categoryId, country ));
	}

	/**
	 * Retrieves all the offers in the given offer category.
	 * 
	 * @return The offers in the given offer category.
	 */
	@Override
	public ResourceCollection<Offer> get() 
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOffers").getParameters().get("OfferCategoryId"),
				this.getContext().getItem1()
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOffers").getParameters().get("Country"),
				this.getContext().getItem2()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Offer>>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetOffers").getPath(),
			parameters);
	}

	/**
	 * Retrieves a subset of offers in the given offer category.
	 * 
	 * @param offset The starting index.
	 * @param size The maximum number of offers to return.
	 * @return The requested segment of the offers in the given offer category.
	 */
	@Override
	public ResourceCollection<Offer> get(int offset, int size)
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOffers").getParameters().get("OfferCategoryId"),
				this.getContext().getItem1()
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOffers").getParameters().get("Country"),
				this.getContext().getItem2()
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOffers").getParameters().get("Offset"),
				String.valueOf(offset)
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOffers").getParameters().get("Size"),
				String.valueOf(size)
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Offer>>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetOffers").getPath(),
			parameters);
	}
}