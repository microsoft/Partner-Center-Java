// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.countryvalidationrules;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Holds validation information for a single country.
 */
public class CountryValidationRules extends ResourceBase 
{
    /**
     * Gets or sets the ISO2 code.
     */
    private String iso2Code;

    public String getIso2Code() {
		return iso2Code;
	}

	public void setIso2Code(String value) {
		iso2Code = value;
	}

	/**
     * Gets or sets the default culture.
     */
    private String defaultCulture;

	public String getDefaultCulture() {
		return defaultCulture;
	}

	public void setDefaultCulture(String value) {
		defaultCulture = value;
	}

    /**
     * Gets or sets a value indicating whether the state is required or not.
     */
    private boolean isStateRequired;

	public boolean getIsStateRequired() {
		return isStateRequired;
	}

	public void setIsStateRequired(boolean value) {
		isStateRequired = value;
	}

    /**
     * Gets or sets a list of states in the country.
     */
    private Iterable<String> supportedStatesList;

	public Iterable<String> getSupportedStatesList() {
		return supportedStatesList;
	}

	public void setSupportedStatesList(Iterable<String> value) {
		supportedStatesList = value;
	}

    /**
     * Gets or sets a list of supported languages.
     */
    private Iterable<String> supportedLanguagesList;

	public Iterable<String> getSupportedLanguagesList() {
		return supportedLanguagesList;
	}

	public void setSupportedLanguagesList(Iterable<String> value) {
		supportedLanguagesList = value;
	}

    /**
     * Gets or sets a list of supported cultures.
     */
    private Iterable<String> supportedCulturesList;

	public Iterable<String> getSupportedCulturesList() {
		return supportedCulturesList;
	}

	public void setSupportedCulturesList(Iterable<String> value) {
		supportedCulturesList = value;
	}

    /**
     * Gets or sets a value indicating whether a postal code is required or not.
     */
    private boolean isPostalCodeRequired;

	public boolean getIsPostalCodeRequired() {
		return isPostalCodeRequired;
	}

	public void setIsPostalCodeRequired(boolean value) {
		isPostalCodeRequired = value;
	}

    /**
     * Gets or sets the postal code regular expression.
     */
    private String postalCodeRegex;

	public String getPostalCodeRegex() {
		return postalCodeRegex;
	}

	public void setPostalCodeRegex(String value) {
		postalCodeRegex = value;
	}

    /**
     * Gets or sets a value indicating whether a city is required or not.
     */
    private boolean isCityRequired;

	public boolean getIsCityRequired() {
		return isCityRequired;
	}

	public void setIsCityRequired(boolean value) {
		isCityRequired = value;
	}

    /**
     * Gets or sets a value indicating whether a VAT Id is required or not.
     */
    private boolean isVatIdSupported;

	public boolean getIsVatIdSupported() {
		return isVatIdSupported;
	}

	public void setIsVatIdSupported(boolean value) {
		this.isVatIdSupported = value;
	}

    /**
     * Gets or sets the tax Id format.
     */
    private String taxIdFormat;

    public String getTaxIdFormat() {
		return taxIdFormat;
	}

	public void setTaxIdFormat(String value) {
		taxIdFormat = value;
	}

    /**
     * Gets or sets the tax Id sample.
     */
    private String taxIdSample;

	public String getTaxIdSample() {
		return taxIdSample;
	}

	public void setTaxIdSample(String value) {
		taxIdSample = value;
	}

    /**
     * Gets or sets the tax Id regular expression.
     */
    private String vatIdRegex;

	public String getVatIdRegex() {
		return vatIdRegex;
	}

	public void setVatIdRegex(String value) {
		vatIdRegex = value;
	}

    /**
     * Gets or sets the phone number regular expression.
     */
    private String phoneNumberRegex;

	public String getPhoneNumberRegex() {
		return phoneNumberRegex;
	}

	public void setPhoneNumberRegex(String value) {
		phoneNumberRegex = value;
	}

    /**
     * Gets or sets a value indicating whether a tax Id is supported or not.
     */
    private boolean isTaxIdSupported;

	public boolean getIsTaxIdSupported() {
		return isTaxIdSupported;
	}

	public void setIsTaxIdSupported(boolean value) {
		isTaxIdSupported = value;
	}

    /**
     * Gets or sets a value indicating whether a tax Id is optional or not.
     */
    private boolean isTaxIdOptional;

	public boolean getIsTaxIdOptional() {
		return isTaxIdOptional;
	}

	public void setIsTaxIdOptional(boolean value) {
		isTaxIdOptional = value;
	}

    /**
     * Gets or sets the country calling codes.
     */
    private Iterable<String> countryCallingCodesList;

    public Iterable<String> getCountryCallingCodesList() {
		return countryCallingCodesList;
	}

	public void setCountryCallingCodesList(Iterable<String> value) {
		countryCallingCodesList = value;
	}
}