// -----------------------------------------------------------------------
// <copyright file="CategoryOffersCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.offers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.Offer;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

public class CategoryOffersCollectionOperations 
	extends BasePartnerComponent<Tuple<String, String>>
	implements ICategoryOffersCollection
{

	/***
	 * Initializes a new instance of the CategoryOffersCollectionOperations class.
	 * @param rootPartnerOperations: The root partner operations instance.
	 * @param categoryId: The category ID which contains the offers.
	 * @param country: The country on which to base the offers.
	 */
	public CategoryOffersCollectionOperations( IPartner rootPartnerOperations, String categoryId, String country) 
	{
		super(rootPartnerOperations, new Tuple<String, String>( categoryId, country ));
	}

	/***
	 * Retrieves all the offers in the given offer category.
	 * @return: The offers in the given offer category.
	 */
	@Override
	public ResourceCollection<Offer> get() 
	{
		IPartnerServiceProxy<Offer, ResourceCollection<Offer>> partnerServiceProxy =
				new PartnerServiceProxy<Offer, ResourceCollection<Offer>>(
					new TypeReference<ResourceCollection<Offer>>()
					{
					}, 
				this.getPartner(),
				PartnerService.getInstance().getConfiguration().getApis().get( "GetOffers" ).getPath());

		partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetOffers" ).getParameters().get( "OfferCategoryId" ),
																						this.getContext().getItem1() ) );
		partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetOffers" ).getParameters().get( "Country" ),
																						this.getContext().getItem2() ) );
		return partnerServiceProxy.get();
	}

	/***
	 * Retrieves a subset of offers in the given offer category.
	 * 
	 * @param name="offset": The starting index.
	 * @param name="size": The maximum number of offers to return.
	 * @return: The requested segment of the offers in the given offer category.
	 */
	@Override
	public ResourceCollection<Offer> get(int offset, int size)
	{
		IPartnerServiceProxy<Offer, ResourceCollection<Offer>> partnerServiceProxy =
				new PartnerServiceProxy<Offer, ResourceCollection<Offer>>(new TypeReference<ResourceCollection<Offer>>()
				{
				}, 
				this.getPartner(), 
				PartnerService.getInstance().getConfiguration().getApis().get( "GetOffers" ).getPath());

		partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetOffers" ).getParameters().get( "OfferCategoryId" ),
																						this.getContext().getItem1() ) );
		partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetOffers" ).getParameters().get( "Country" ),
																						this.getContext().getItem2() ) );
		partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetOffers" ).getParameters().get( "Offset" ),
																						Integer.valueOf( offset ).toString() ) );
		partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetOffers" ).getParameters().get( "Size" ),
																						Integer.valueOf( size ).toString() ) );

		return partnerServiceProxy.get();       
	}
}