// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.validations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Holds validation information for a single country.
 */
@JsonIgnoreProperties({ "states", "supportedCultures", "supportedLanguages", "countryCallingCodes" })
public class CountryInformation
    extends ResourceBase
{
    /**
     * Gets or sets the extension data.
     */
    private String __ExtensionData;

    public String getExtensionData()
    {
        return __ExtensionData;
    }

    public void setExtensionData(String value)
    {
        __ExtensionData = value;
    }

    /**
     * Gets or sets the ISO2 code.
     */
    private String __Iso2Code;

    public String getIso2Code()
    {
        return __Iso2Code;
    }

    public void setIso2Code(String value)
    {
        __Iso2Code = value;
    }

    /**
     * Gets or sets the ISO 3 code.
     */
    private String __Iso3Code;

    public String getIso3Code()
    {
        return __Iso3Code;
    }

    public void setIso3Code(String value)
    {
        __Iso3Code = value;
    }

    /**
     * Gets or sets the default culture.
     */
    private String __DefaultCulture;

    public String getDefaultCulture()
    {
        return __DefaultCulture;
    }

    public void setDefaultCulture(String value)
    {
        __DefaultCulture = value;
    }

    /**
     * Gets or sets a value indicating whether the state is required or not.
     */
    private Boolean __IsStateRequired;

    public Boolean getIsStateRequired()
    {
        return __IsStateRequired;
    }

    public void setIsStateRequired(Boolean value)
    {
        __IsStateRequired = value;
    }

    /**
     * Gets or sets a list of states in the country.
     */
    private Iterable<String> __SupportedStatesList;

    public Iterable<String> getSupportedStatesList()
    {
        return __SupportedStatesList;
    }

    public void setSupportedStatesList(Iterable<String> value)
    {
        __SupportedStatesList = value;
    }

    /**
     * Gets or sets a list of supported languages.
     */
    private Iterable<String> __SupportedLanguagesList;

    public Iterable<String> getSupportedLanguagesList()
    {
        return __SupportedLanguagesList;
    }

    public void setSupportedLanguagesList(Iterable<String> value)
    {
        __SupportedLanguagesList = value;
    }

    /**
     * Gets or sets a list of supported cultures.
     */
    private Iterable<String> __SupportedCulturesList;

    public Iterable<String> getSupportedCulturesList()
    {
        return __SupportedCulturesList;
    }

    public void setSupportedCulturesList(Iterable<String> value)
    {
        __SupportedCulturesList = value;
    }

    /**
     * Gets or sets a value indicating whether a postal code is required or not.
     */
    private Boolean __IsPostalCodeRequired;

    public Boolean getIsPostalCodeRequired()
    {
        return __IsPostalCodeRequired;
    }

    public void setIsPostalCodeRequired(Boolean value)
    {
        __IsPostalCodeRequired = value;
    }

    /**
     * Gets or sets the postal code regular expression.
     */
    private String __PostalCodeRegex;

    public String getPostalCodeRegex()
    {
        return __PostalCodeRegex;
    }

    public void setPostalCodeRegex(String value)
    {
        __PostalCodeRegex = value;
    }

    /**
     * Gets or sets a value indicating whether a city is required or not.
     */
    private Boolean __IsCityRequired;

    public Boolean getIsCityRequired()
    {
        return __IsCityRequired;
    }

    public void setIsCityRequired(Boolean value)
    {
        __IsCityRequired = value;
    }

    /**
     * Gets or sets a value indicating whether a VAT Id is required or not.
     */
    private Boolean __IsVatIdSupported;

    public Boolean getIsVatIdSupported()
    {
        return __IsVatIdSupported;
    }

    public void setIsVatIdSupported(Boolean value)
    {
        __IsVatIdSupported = value;
    }

    /**
     * Gets or sets the tax Id format.
     */
    private String __TaxIdFormat;

    public String getTaxIdFormat()
    {
        return __TaxIdFormat;
    }

    public void setTaxIdFormat(String value)
    {
        __TaxIdFormat = value;
    }

    /**
     * Gets or sets the tax Id sample.
     */
    private String __TaxIdSample;

    public String getTaxIdSample()
    {
        return __TaxIdSample;
    }

    public void setTaxIdSample(String value)
    {
        __TaxIdSample = value;
    }

    /**
     * Gets or sets the tax Id regular expression.
     */
    private String __VatIdRegex;

    public String getVatIdRegex()
    {
        return __VatIdRegex;
    }

    public void setVatIdRegex(String value)
    {
        __VatIdRegex = value;
    }

    /**
     * Gets or sets the phone number regular expression.
     */
    private String __PhoneNumberRegex;

    public String getPhoneNumberRegex()
    {
        return __PhoneNumberRegex;
    }

    public void setPhoneNumberRegex(String value)
    {
        __PhoneNumberRegex = value;
    }

    /**
     * Gets or sets a value indicating whether a registration number is supported or not.
     */
    private Boolean __IsRegistrationNumberSupported;

    public Boolean getIsRegistrationNumberSupported()
    {
        return __IsRegistrationNumberSupported;
    }

    public void setIsRegistrationNumberSupported(Boolean value)
    {
        __IsRegistrationNumberSupported = value;
    }

    /**
     * Gets or sets a value indicating whether a tax Id is supported or not.
     */
    private Boolean __IsTaxIdSupported;

    public Boolean getIsTaxIdSupported()
    {
        return __IsTaxIdSupported;
    }

    public void setIsTaxIdSupported(Boolean value)
    {
        __IsTaxIdSupported = value;
    }

    /**
     * Gets or sets the reseller agreement region.
     */
    private String __ResellerAgreementRegion;

    public String getResellerAgreementRegion()
    {
        return __ResellerAgreementRegion;
    }

    public void setResellerAgreementRegion(String value)
    {
        __ResellerAgreementRegion = value;
    }

    /**
     * Gets or sets the geographic region.
     */
    private String __GeographicRegion;

    public String getGeographicRegion()
    {
        return __GeographicRegion;
    }

    public void setGeographicRegion(String value)
    {
        __GeographicRegion = value;
    }

    /**
     * Gets or sets the country calling codes.
     */
    private Iterable<String> __CountryCallingCodesList;

    public Iterable<String> getCountryCallingCodesList()
    {
        return __CountryCallingCodesList;
    }

    public void setCountryCallingCodesList(Iterable<String> value)
    {
        __CountryCallingCodesList = value;
    }

}
