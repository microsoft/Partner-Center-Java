// -----------------------------------------------------------------------
// <copyright file="SimpleQuery.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query;

import com.microsoft.store.partnercenter.models.query.filters.FieldFilter;
import com.microsoft.store.partnercenter.models.query.sort.Sort;

/**
 * A standard query that returns entities according to sort and filter options (Does not do paging).
 */
public class SimpleQuery
    extends BaseQuery
{
    protected SimpleQuery()

    {
        super();
    }

    protected SimpleQuery( Object token )

    {
        super( token );
    }

    /**
     * Gets the query type.
     */
    public QueryType getType()

    {
        return QueryType.SIMPLE;
    }

    /**
     * Gets or sets the query filter.
     */
    private FieldFilter filter;

    public FieldFilter getFilter()
    {
        return filter;
    }

    public void setFilter( FieldFilter value )
    {
        filter = value;
    }

    /**
     * Gets or sets the query sorting options.
     */
    private Sort sort;

    public Sort getSort()
    {
        return sort;
    }

    public void setSort( Sort value )
    {
        sort = value;
    }

    /**
     * Returns a string representation of the query.
     * 
     * @return A string representation of the query.
     */
    public String toString()
    {
        StringBuilder stringRepresentation = new StringBuilder();
        if ( this.getSort() != null )
        {
            stringRepresentation.append( this.getSort().toString() + "/n" );
        }

        if ( this.getFilter() != null )
        {
            stringRepresentation.append( this.getFilter().toString() + "\n" );
        }

        String result = stringRepresentation.toString();
        return result == null || result.isEmpty() ? super.toString() : result;
    }
}