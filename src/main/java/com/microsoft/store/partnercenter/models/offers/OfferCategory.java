// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
    private String id;

    public String getId()
    {
        return id;
    }

    public void setId( String value )
    {
        id = value;
    }

    /**
     * Gets or sets the category name.
     */
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName( String value )
    {
        name = value;
    }

    /**
     * Gets or sets the category rank in collection This property should be set only in case of offer category
     * collections
     */
    private int rank;

    public int getRank()
    {
        return rank;
    }

    public void setRank( int value )
    {
        rank = value;
    }

    /**
     * Gets or sets the locale to which the offer category applies.
     */
    private String locale;

    public String getLocale()
    {
        return locale;
    }

    public void setLocale( String value )
    {
        locale = value;
    }

    /**
     * Gets or sets the country where the offer category applies
     */
    private String country;

    public String getCountry()
    {
        return country;
    }

    public void setCountry( String value )
    {
        country = value;
    }

    /**
     * Determines whether the specified object, is equal to this instance.
     * 
     * @param obj The object to compare with this instance.
     * @return true if the specified object is equal to this instance; otherwise, false.
     */
    public boolean equals( Object obj )
    {
        if(obj == this) 
        {
            return true; 
        }

        if ( obj == null || getClass() != obj.getClass() )
        {
            return false;
        }

        OfferCategory other = (OfferCategory)obj;

        return this.getId().equalsIgnoreCase( other.getId() );

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