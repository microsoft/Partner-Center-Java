// -----------------------------------------------------------------------
// <copyright file="CustomerOfferCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.offers;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.Offer;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
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
        IPartnerServiceProxy<ResourceCollection<Offer>, ResourceCollection<Offer>> partnerServiceProxy =
                new PartnerServiceProxy<>( 
					new TypeReference<ResourceCollection<Offer>>()
					{
					}, 
					this.getPartner(),
					MessageFormat.format( 
						PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerOffers" ).getPath(),
						this.getContext()) );

        return partnerServiceProxy.get();
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
		IPartnerServiceProxy<ResourceCollection<Offer>, ResourceCollection<Offer>> partnerServiceProxy =
		new PartnerServiceProxy<ResourceCollection<Offer>, ResourceCollection<Offer>>( 
			new TypeReference<ResourceCollection<Offer>>()
			{
			}, 
			this.getPartner(),
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerOffers" ).getPath(),
				this.getContext()) );

		partnerServiceProxy.getUriParameters().add(
			new KeyValuePair<String, String>(
				PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerOffers" ).getParameters().get( "Offset" ),
				Integer.toString(offset)));

		partnerServiceProxy.getUriParameters().add(
			new KeyValuePair<String, String>(
				PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerOffers" ).getParameters().get( "Size" ),
				Integer.toString(size)));

		return partnerServiceProxy.get();
	}
}