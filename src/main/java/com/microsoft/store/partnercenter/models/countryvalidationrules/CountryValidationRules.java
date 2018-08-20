// -----------------------------------------------------------------------
// <copyright file="CountryValidationRules.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.countryvalidationrules;

import com.microsoft.store.partnercenter.models.ResourceBase;

/***
 * Holds validation information for a single country.
 */
public class CountryValidationRules extends ResourceBase 
{
    /***
     * Gets or sets the ISO2 code.
     */
    private String __Iso2Code;

    public String getIso2Code() {
		return __Iso2Code;
	}

	public void setIso2Code(String __Iso2Code) {
		this.__Iso2Code = __Iso2Code;
	}

	/***
     * Gets or sets the default culture.
     */
    private String __DefaultCulture;

	public String getDefaultCulture() {
		return __DefaultCulture;
	}

	public void setDefaultCulture(String __DefaultCulture) {
		this.__DefaultCulture = __DefaultCulture;
	}

    /***
     * Gets or sets a value indicating whether the state is required or not.
     */
    private boolean __IsStateRequired;

	public boolean is__IsStateRequired() {
		return __IsStateRequired;
	}

	public void setIsStateRequired(boolean __IsStateRequired) {
		this.__IsStateRequired = __IsStateRequired;
	}

    /***
     * Gets or sets a list of states in the country.
     */
    private Iterable<String> __SupportedStatesList;

	public Iterable<String> getSupportedStatesList() {
		return __SupportedStatesList;
	}

	public void setSupportedStatesList(Iterable<String> __SupportedStatesList) {
		this.__SupportedStatesList = __SupportedStatesList;
	}

    /***
     * Gets or sets a list of supported languages.
     */
    private Iterable<String> __SupportedLanguagesList;

	public Iterable<String> getSupportedLanguagesList() {
		return __SupportedLanguagesList;
	}

	public void setSupportedLanguagesList(Iterable<String> __SupportedLanguagesList) {
		this.__SupportedLanguagesList = __SupportedLanguagesList;
	}

    /***
     * Gets or sets a list of supported cultures.
     */
    private Iterable<String> __SupportedCulturesList;

	public Iterable<String> getSupportedCulturesList() {
		return __SupportedCulturesList;
	}

	public void setSupportedCulturesList(Iterable<String> __SupportedCulturesList) {
		this.__SupportedCulturesList = __SupportedCulturesList;
	}

    /***
     * Gets or sets a value indicating whether a postal code is required or not.
     */
    private boolean __IsPostalCodeRequired;

	public boolean is__IsPostalCodeRequired() {
		return __IsPostalCodeRequired;
	}

	public void setIsPostalCodeRequired(boolean __IsPostalCodeRequired) {
		this.__IsPostalCodeRequired = __IsPostalCodeRequired;
	}

    /***
     * Gets or sets the postal code regular expression.
     */
    private String __PostalCodeRegex;

	public String getPostalCodeRegex() {
		return __PostalCodeRegex;
	}

	public void setPostalCodeRegex(String __PostalCodeRegex) {
		this.__PostalCodeRegex = __PostalCodeRegex;
	}

    /***
     * Gets or sets a value indicating whether a city is required or not.
     */
    private boolean __IsCityRequired;

	public boolean is__IsCityRequired() {
		return __IsCityRequired;
	}

	public void setIsCityRequired(boolean __IsCityRequired) {
		this.__IsCityRequired = __IsCityRequired;
	}

    /***
     * Gets or sets a value indicating whether a VAT Id is required or not.
     */
    private boolean __IsVatIdSupported;

	public boolean is__IsVatIdSupported() {
		return __IsVatIdSupported;
	}

	public void setIsVatIdSupported(boolean __IsVatIdSupported) {
		this.__IsVatIdSupported = __IsVatIdSupported;
	}

    /***
     * Gets or sets the tax Id format.
     */
    private String __TaxIdFormat;

    public String getTaxIdFormat() {
		return __TaxIdFormat;
	}

	public void setTaxIdFormat(String __TaxIdFormat) {
		this.__TaxIdFormat = __TaxIdFormat;
	}

    /***
     * Gets or sets the tax Id sample.
     */
    private String __TaxIdSample;

	public String getTaxIdSample() {
		return __TaxIdSample;
	}

	public void setTaxIdSample(String __TaxIdSample) {
		this.__TaxIdSample = __TaxIdSample;
	}

    /***
     * Gets or sets the tax Id regular expression.
     */
    private String __VatIdRegex;

	public String getVatIdRegex() {
		return __VatIdRegex;
	}

	public void setVatIdRegex(String __VatIdRegex) {
		this.__VatIdRegex = __VatIdRegex;
	}

    /***
     * Gets or sets the phone number regular expression.
     */
    private String __PhoneNumberRegex;

	public String getPhoneNumberRegex() {
		return __PhoneNumberRegex;
	}

	public void setPhoneNumberRegex(String __PhoneNumberRegex) {
		this.__PhoneNumberRegex = __PhoneNumberRegex;
	}

    /***
     * Gets or sets a value indicating whether a tax Id is supported or not.
     */
    private boolean __IsTaxIdSupported;

	public boolean is__IsTaxIdSupported() {
		return __IsTaxIdSupported;
	}

	public void setIsTaxIdSupported(boolean __IsTaxIdSupported) {
		this.__IsTaxIdSupported = __IsTaxIdSupported;
	}

    /***
     * Gets or sets a value indicating whether a tax Id is optional or not.
     */
    private boolean __IsTaxIdOptional;

	public boolean is__IsTaxIdOptional() {
		return __IsTaxIdOptional;
	}

	public void setIsTaxIdOptional(boolean __IsTaxIdOptional) {
		this.__IsTaxIdOptional = __IsTaxIdOptional;
	}

    /***
     * Gets or sets the country calling codes.
     */
    private Iterable<String> __CountryCallingCodesList;

    public Iterable<String> getCountryCallingCodesList() {
		return __CountryCallingCodesList;
	}

	public void setCountryCallingCodesList(Iterable<String> __CountryCallingCodesList) {
		this.__CountryCallingCodesList = __CountryCallingCodesList;
	}

}
