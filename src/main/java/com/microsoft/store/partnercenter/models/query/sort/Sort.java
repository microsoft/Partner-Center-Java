// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.query.sort;

import java.text.MessageFormat;

/**
 * Specifies sort field and direction.
 */
public class Sort
{
    /**
     * The field used for sorting.
     */
    private String sortField; 

    /**
     * The direction the resources should be sorted.
     */
    private SortDirection sortDirection;

    /**
     * Initializes a new instance of the Sort class.
     * 
     * @param sortField The sort field.
     * @param sortDirection The sort direction.
     */
    public Sort(String sortField, SortDirection sortDirection)
    {
        this.setSortField(sortField);
        this.setSortDirection(sortDirection);
    }

    /**
     * Gets the sort field.
     * 
     * @return The sort field.
     */
    public String getSortField()
    {
        return sortField;
    }

    /**
     * Gets the sort field. 
     * 
     * @param value The sort field.
     */
    public void setSortField(String value)
    {
        sortField = value;
    }

    /**
     * Sets the sort direction.
     * 
     * @return The sort direction.
     */
    public SortDirection getSortDirection()
    {
        return sortDirection;
    }

    /**
     * Sets the sort direction.
     * 
     * @param value The sort direction.
     */
    public void setSortDirection(SortDirection value)
    {
        sortDirection = value;
    }

    /**
     * Prints the sort details.
     * 
     * @return The sort details.
     */
    public String toString()
    {
        return MessageFormat.format("Sort: {0}, {1}", this.getSortField(), this.getSortDirection());
    }
}