// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.offers;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.OfferCategory;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class CustomerOfferCategoryCollectionOperations 
	extends BasePartnerComponentString
	implements ICustomerOfferCategoryCollection
{
	/**
	 * Initializes a new instance of the CustomerOfferCategoryCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer identifier.
	 */
	public CustomerOfferCategoryCollectionOperations(IPartner rootPartnerOperations, String customerId)
	{
		super(rootPartnerOperations, customerId);
		if (StringHelper.isNullOrEmpty(customerId))
		{
			throw new IllegalArgumentException("customerId must be set.");
		}
	}

	/**
	 * Gets the offer categories available to customer from partner.
	 * 
	 * @return The offer categories available to customer from partner.
	 */
	@Override
	public ResourceCollection<OfferCategory> get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<OfferCategory>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerOfferCategories").getPath(),
				this.getContext()));
	}
}