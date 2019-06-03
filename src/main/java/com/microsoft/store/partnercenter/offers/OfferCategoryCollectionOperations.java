// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.offers;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.OfferCategory;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.utils.ParameterValidator;

/**
 * Offers categories implementation.
 */
public class OfferCategoryCollectionOperations
	extends BasePartnerComponentString
	implements IOfferCategoryCollection
{
	/**
	 * Initializes a new instance of the OfferCategoryCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param country The country on which to base the offer categories
	 */
	public OfferCategoryCollectionOperations(IPartner rootPartnerOperations, String country)
	{
		super(rootPartnerOperations, country);
		
		ParameterValidator.isValidCountryCode(country);    	
	}

	/**
	 * Retrieves all offer categories available to the partner for the provided country.
	 * 
	 * @return All offer categories for the provided country.
	 */
	@Override
	public ResourceCollection<OfferCategory> get()
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOfferCategories").getParameters().get("Country"),
				this.getContext()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<OfferCategory>>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetOfferCategories").getPath(),
			parameters);
	}
}