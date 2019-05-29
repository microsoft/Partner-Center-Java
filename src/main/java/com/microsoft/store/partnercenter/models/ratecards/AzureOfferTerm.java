// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.ratecards;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents an offer term tied to an Azure rate card.
 */
public class AzureOfferTerm extends ResourceBase 
{
    /**
     *  Gets or sets the offer name.
     */
    private String __Name;

    public String getName()
    {
        return __Name;
    }

    public void setName( String value )
    {
    	__Name = value;
    }

    /**
     * Gets or sets the applied discount, if any.
     */
    private double __Discount;

    public double getDiscount()
    {
    	return __Discount;
    }
    
    public void setDiscount( double value )
    {
    	__Discount = value;
    }

    /**
     * Gets or sets the excluded meter IDs from the offer term, if any.
     */
    private Iterable<String> __ExcludedMeterIds;
    
    public Iterable<String> getExcludedMeterIds()
    {
    	return __ExcludedMeterIds;
    }
    
    public void setExcludedMeterIds( Iterable<String> value )
    {
    	__ExcludedMeterIds = value;
    }

    /**
     * Gets or sets the date this meter is in effect.
     */
    private DateTime __EffectiveDate;
    
    public DateTime getEffectiveDate()
    {
        return __EffectiveDate;
    }

    public void setEffectiveDate( DateTime value )
    {
    	__EffectiveDate = value;
    }
}