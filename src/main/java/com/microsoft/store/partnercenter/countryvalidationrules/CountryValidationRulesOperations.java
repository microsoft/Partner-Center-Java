// -----------------------------------------------------------------------
// <copyright file="CountryValidationRulesOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.countryvalidationrules;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.countryvalidationrules.CountryValidationRules;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.ParameterValidator;

/***
 * The country validation rules operations implementation.
 */
public class CountryValidationRulesOperations 
	extends BasePartnerComponentString
	implements ICountryValidationRules 
{

	/***
	 * Initializes a new instance of the CountryValidationRulesOperations class.
	 * @param rootPartnerOperations: The root partner operations instance
	 * @param country: The country
	 */
	protected CountryValidationRulesOperations( IPartner rootPartnerOperations, String country )
	{
		super( rootPartnerOperations, country );
		ParameterValidator.isValidCountryCode( country );
	}

	/***
	 * Gets the market specific validation data by country.
	 */
	@Override
	public CountryValidationRules get() 
	{
        IPartnerServiceProxy<CountryValidationRules, CountryValidationRules> partnerServiceProxy =
                new PartnerServiceProxy<CountryValidationRules, CountryValidationRules>( new TypeReference<CountryValidationRules>()
                {
                }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCountryValidationRulesByCountry" ).getPath(),
                                                            this.getContext(), Locale.US ) );
        return partnerServiceProxy.get();
	}
}