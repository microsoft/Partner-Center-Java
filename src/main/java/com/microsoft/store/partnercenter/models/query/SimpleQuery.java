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
    private FieldFilter __Filter;

    public FieldFilter getFilter()
    {
        return __Filter;
    }

    public void setFilter( FieldFilter value )
    {
        __Filter = value;
    }

    /**
     * Gets or sets the query sorting options.
     */
    private Sort __Sort;

    public Sort getSort()
    {
        return __Sort;
    }

    public void setSort( Sort value )
    {
        __Sort = value;
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
        // return StringHelper.isNullOrWhiteSpace(result) ? super.ToString() : result;
        return result == null || result.isEmpty() ? super.toString() : result;

    }

}
