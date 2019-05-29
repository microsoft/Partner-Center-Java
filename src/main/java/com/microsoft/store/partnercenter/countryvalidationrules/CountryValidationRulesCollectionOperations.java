// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.countryvalidationrules;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;

/**
 * Implementation of Country Rules Validation 
 *
 */
public class CountryValidationRulesCollectionOperations 
	extends BasePartnerComponentString
	implements ICountryValidationRulesCollection 
{
	/**
	 * Initializes a new instance of the CountryValidationRulesCollectionOperations class.
	 * @param rootPartnerOperations The root partner operation instance.
	 */
	public CountryValidationRulesCollectionOperations( IPartner rootPartnerOperations ) 
	{
		super(rootPartnerOperations);
	}

	/**
	 * Obtains a specific behavior for country validation rules.
	 * 
	 * @param country The country
	 * @return The country validation rules operations
	 */
	@Override
	public ICountryValidationRules byCountry( String country ) {
		return new CountryValidationRulesOperations( this.getPartner(), country );
	}
}