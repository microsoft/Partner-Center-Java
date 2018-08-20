// -----------------------------------------------------------------------
// <copyright file="Sort.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query.sort;

import java.text.MessageFormat;
import java.util.Locale;

/**
 * Specifies sort field and direction.
 */
public class Sort
{
    /**
     * Initializes a new instance of the {@link #Sort} class.
     * 
     * @param sortField The sort field.
     * @param sortDirection The sort direction.
     */
    public Sort( String sortField, SortDirection sortDirection )

    {
        this.setSortField( sortField );
        this.setSortDirection( sortDirection );
    }

    /**
     * Gets or sets the sort field.
     */
    private String __SortField;

    public String getSortField()
    {
        return __SortField;
    }

    public void setSortField( String value )
    {
        __SortField = value;
    }

    /**
     * Gets or sets the sort direction.
     */
    private SortDirection __SortDirection;

    public SortDirection getSortDirection()
    {
        return __SortDirection;
    }

    public void setSortDirection( SortDirection value )
    {
        __SortDirection = value;
    }

    /**
     * Prints the sort details.
     * 
     * @return The sort details.
     */
    public String toString()
    {
        return MessageFormat.format( "Sort: {0}, {1}", this.getSortField(), this.getSortDirection(), Locale.US );

    }

}
