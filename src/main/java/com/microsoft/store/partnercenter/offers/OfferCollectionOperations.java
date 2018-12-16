// -----------------------------------------------------------------------
// <copyright file="OfferCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.offers;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.Offer;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.utils.ParameterValidator;

/**
 * Offer Collection operations implementation.
 */
public class OfferCollectionOperations
	extends BasePartnerComponentString
	implements IOfferCollection
{
	/**
	 * Initializes a new instance of the OfferCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param country The country on which to base the offers
	 */
	public OfferCollectionOperations( IPartner rootPartnerOperations, String country )
	{
		super( rootPartnerOperations, country );
		
		ParameterValidator.isValidCountryCode( country );
	}

	/**
	 * Retrieves the operations tied with a specific offer.
	 * 
	 * @param offerId The offer id.
	 * @return The offer operations.
	 */
	@Override
	public IOffer byId( String offerId )
	{
		return new OfferOperations( this.getPartner(), offerId, this.getContext() );
	}

	/**
	 * Retrieves all the offers for the provided country.
	 * 
	 * @return All offers for the provided country.
	 */
	@Override
	public ResourceCollection<Offer> get()
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOffers").getParameters().get("Country"),
				this.getContext()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Offer>>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetOffers").getPath(),
			parameters);
	}

	/**
	 * Retrieves all the offers for the provided country.
	 * 
	 * @param offset The starting index.
	 * @param size The maximum number of offers to return.
	 * @return All offers for the provided country.
	 */
	@Override
	public ResourceCollection<Offer> get(int offset, int size)
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOffers").getParameters().get("Country"),
				this.getContext()
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

	/**
	 * Retrieves the operations that can be applied on offers the belong to an offer category.
	 * @param categoryId The offer category Id.
	 * @return The category offers operations.
	 */
	public ICategoryOffersCollection byCategory( String categoryId )
	{
		return new CategoryOffersCollectionOperations( this.getPartner(), categoryId, this.getContext() );
	}
}