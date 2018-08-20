// -----------------------------------------------------------------------
// <copyright file="AzureRateCard.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.ratecards;

import com.microsoft.store.partnercenter.models.ResourceBase;

/***
 * Represents an offer term tied to an Azure rate card.
 */
public class AzureRateCard extends ResourceBase 
{
    /***
     *  Gets or sets the locale for the localizable properties in the rate card meters.
     */
    private String __Locale;

    public String getLocale()
    {
        return __Locale;
    }

    public void setLocale( String value )
    {
    	__Locale = value;
    }

    /***
     *  Gets or sets the currency for the the meter rates.
     */
    private String __Currency;

    public String getCurrency()
    {
        return __Currency;
    }

    public void setCurrency( String value )
    {
    	__Currency = value;
    }

    /***
     * Gets or sets a value indicating whether the tax is included or not.
     */
    private boolean __IsTaxIncluded;

    public boolean getIsTaxIncluded()
    {
    	return __IsTaxIncluded;
    }
    
    public void setIsTaxIncluded( boolean value )
    {
    	__IsTaxIncluded = value;
    }

    /***
     * Gets or sets a collection of meters.
     */
    private Iterable<AzureMeter> __Meters;
    
    public Iterable<AzureMeter> getMeters()
    {
    	return __Meters;
    }
    
    public void setMeters( Iterable<AzureMeter> value )
    {
    	__Meters = value;
    }

    /***
     * Gets or sets a collection of offer terms.
     */
    private Iterable<AzureOfferTerm> __OfferTerms;
    
    public Iterable<AzureOfferTerm> getOfferTerms()
    {
    	return __OfferTerms;
    }
    
    public void setOfferTerms( Iterable<AzureOfferTerm> value )
    {
    	__OfferTerms = value;
    }

}
