// -----------------------------------------------------------------------
// <copyright file="UsageRecordBase.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.usage;

import java.util.Locale;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * This class defines the common properties for all usage records.
 */
public class UsageRecordBase
    extends ResourceBase
{
    /**
     * Gets or sets the resource unique identifier.
     */
    private String __Id;

    public String getId()
    {
        return __Id;
    }

    public void setId( String value )
    {
        __Id = value;
    }

    /**
     * Gets or sets the name of the resource.
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
     * Gets or sets the estimated total cost of usage for the resources in the subscription.
     */
    private double __TotalCost;

    public double getTotalCost()
    {
        return __TotalCost;
    }

    public void setTotalCost( double value )
    {
        __TotalCost = value;
    }

    /**
     * Gets or sets the currency locale.
     */
    private Locale __CurrencyLocale;

    public Locale getCurrencyLocale()
    {
        return __CurrencyLocale;
    }

    public void setCurrencyLocale( Locale value )
    {
        __CurrencyLocale = value;
    }

    /**
     * Gets or sets the Last Modified date.
     */
    private DateTime __LastModifiedDate;

    public DateTime getLastModifiedDate()
    {
        return __LastModifiedDate;
    }

    public void setLastModifiedDate( DateTime value )
    {
    	__LastModifiedDate = value;
    }

}
