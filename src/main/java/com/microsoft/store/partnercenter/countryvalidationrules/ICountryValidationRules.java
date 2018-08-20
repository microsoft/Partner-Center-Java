// -----------------------------------------------------------------------
// <copyright file="ICountryValidationRules.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.countryvalidationrules;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.countryvalidationrules.CountryValidationRules;

/***
 * Represents the behavior of a specific country validation rules.
 */
public interface ICountryValidationRules 
	extends IPartnerComponentString, IEntityGetOperations<CountryValidationRules>
{
    /***
     * Retrieves the country validation rules.
     * @return: The validation rules for the country.
     */
    CountryValidationRules get();
}