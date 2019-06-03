// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.offers;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.genericoperations.ICountrySelector;
import com.microsoft.store.partnercenter.utils.ParameterValidator;

public class OfferCategoryCountrySelector 
	extends BasePartnerComponentString 
	implements ICountrySelector<IOfferCategoryCollection>
{

	/**
	 * Initializes a new instance of the OfferCountrySelector class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
	public OfferCategoryCountrySelector(IPartner rootPartnerOperations) 
	{
		super(rootPartnerOperations);
	}

	/**
	 * Scopes offers behavior to a specific country.
	 */
	@Override
	public IOfferCategoryCollection byCountry(String country)
	{
		ParameterValidator.isValidCountryCode(country);

        return new OfferCategoryCollectionOperations(this.getPartner(), country);
	}

}
