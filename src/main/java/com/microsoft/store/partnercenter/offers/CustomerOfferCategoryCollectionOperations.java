// -----------------------------------------------------------------------
// <copyright file="CustomerOfferCategoryCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.offers;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.OfferCategory;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class CustomerOfferCategoryCollectionOperations 
	extends BasePartnerComponentString
	implements ICustomerOfferCategoryCollection
{
	/***
	 * Initializes a new instance of the CustomerOfferCategoryCollectionOperations class.
	 * 
	 * @param rootPartnerOperations
	 * @param customerId
	 */
	public CustomerOfferCategoryCollectionOperations( IPartner rootPartnerOperations, String customerId )
	{
		super( rootPartnerOperations, customerId );
		if ( StringHelper.isNullOrEmpty( customerId ) )
        {
            throw new IllegalArgumentException("customerId must be set.");
        }
	}

	/***
	 * Gets the offer categories available to customer from partner.
	 */
	@Override
	public ResourceCollection<OfferCategory> get()
	{
        IPartnerServiceProxy<ResourceCollection<OfferCategory>, ResourceCollection<OfferCategory>> partnerServiceProxy =
                new PartnerServiceProxy<ResourceCollection<OfferCategory>, ResourceCollection<OfferCategory>>( 
					new TypeReference<ResourceCollection<OfferCategory>>()
                	{
					}, 
					this.getPartner(), 
					MessageFormat.format( 
						PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerOfferCategories" ).getPath(),
						this.getContext()));

        return partnerServiceProxy.get();
	}
}