// -----------------------------------------------------------------------
// <copyright file="ICountrySelector.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.genericoperations;

/**
 * Returns operations interfaces based on the given country.
 */
public interface ICountrySelector<TOperations> {

	/**
	 * Customizes operations based on the given country.
	 *
	 * @param country The country to be used by the returned operations.
     *
	 * @return An operations interface customized for the provided country.
	 */
	TOperations byCountry( String country );
}