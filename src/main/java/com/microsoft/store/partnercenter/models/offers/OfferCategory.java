// -----------------------------------------------------------------------
// <copyright file="OfferCategory.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.offers;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents offer's category. Also contains the category ranking for priority over other offer categories for the same
 * product line
 */
public class OfferCategory
    extends ResourceBase
{
    /**
     * Gets or sets the category identifier.
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
     * Gets or sets the category name.
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
     * Gets or sets the category rank in collection This property should be set only in case of offer category
     * collections
     */
    private int __Rank;

    public int getRank()
    {
        return __Rank;
    }

    public void setRank( int value )
    {
        __Rank = value;
    }

    /**
     * Gets or sets the locale to which the offer category applies.
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

    /**
     * Gets or sets the country where the offer category applies
     */
    private String __Country;

    public String getCountry()
    {
        return __Country;
    }

    public void setCountry( String value )
    {
        __Country = value;
    }

    /**
     * Determines whether the specified {@link #System.Object} , is equal to this instance.
     * 
     * @param obj The {@link #System.Object} to compare with this instance.
     * @return {@code true} if the specified {@link #System.Object} is equal to this instance; otherwise, {@code false}
     *         .
     */
    public boolean equals( OfferCategory obj )
    {
        if ( obj == null )
        {
            return false;
        }

        return this.getId().equalsIgnoreCase( obj.getId() );

    }

    /**
     * Returns a hash code for this instance.
     * 
     * @return A hash code for this instance, suitable for use in hashing algorithms and data structures like a hash
     *         table.
     */
    public int hashCode()
    {
        return this.getId().hashCode();
    }

}
