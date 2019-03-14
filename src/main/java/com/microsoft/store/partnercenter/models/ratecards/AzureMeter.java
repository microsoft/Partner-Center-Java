// -----------------------------------------------------------------------
// <copyright file="AzureMeter.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.ratecards;

import java.util.Map;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents a record of operation performed by a 
 * Partner user or application
 */
public class AzureMeter 
    extends ResourceBase 
{
    /**
     * Gets or sets the meter unique identifier.
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
     *  Gets or sets the name of meter.
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
     * Gets or sets the meter rates. 
     * The dictionary key is the meter quantity and the value is the meter rate.
     */
    private Map<Double, Double> __Rates;

    public Map<Double, Double> getRates()
    {
    	return __Rates;
    }
    
    public void setRates( Map<Double, Double> value )
    {
    	__Rates = value;
    }

    /**
     * Gets or sets the azure meter tags.
     */
    private Iterable<String> __Tags;
    
    public Iterable<String> getTags()
    {
    	return __Tags;
    }
    
    public void setTags( Iterable<String> value )
    {
    	__Tags = value;
    }

    /**
     * Gets or sets the category of the meter.
     * Example: Storage.
     */
    private String __Category;
    
    public String getCategory()
    {
        return __Category;
    }

    public void setCategory( String value )
    {
    	__Category = value;
    }

    /**
     * Gets or sets the subcategory of the meter.
     * Example: SKU.
     */
    private String __Subcategory;
    
    public String getSubcategory()
    {
        return __Subcategory;
    }

    public void setSubcategory( String value )
    {
    	__Subcategory = value;
    }

    /**
     * Gets or sets the region.
     */
    private String __Region;
    
    public String getRegion()
    {
        return __Region;
    }

    public void setRegion( String value )
    {
    	__Region = value;
    }

    /**
     * Gets or sets the base unit for the rates.
     */
    private String __Unit;
    
    public String getUnit()
    {
        return __Unit;
    }

    public void setUnit( String value )
    {
    	__Unit = value;
    }

    /**
     * Gets or sets the included quantity which is free of charge.
     */
    private double __IncludedQuantity;
    
    public double getIncludedQuantity()
    {
        return __IncludedQuantity;
    }

    public void setIncludedQuantity( double value )
    {
    	__IncludedQuantity = value;
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