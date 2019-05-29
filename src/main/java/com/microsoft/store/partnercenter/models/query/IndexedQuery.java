// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.query;

import java.text.MessageFormat;

/**
 * A query that supports pagination. Use this for huge datasets.
 */
public class IndexedQuery
    extends SimpleQuery
{
    protected IndexedQuery( Object token )

    {
        super( token );
    }

    protected IndexedQuery()

    {
        super();
    }

    /**
     * The starting index of the results to return.
     */
    private int index;

    /**
     * The number of results to return.
     */
    private int pageSize;

    /**
     * Gets the query type.
     */
    public QueryType getType()

    {
        return QueryType.INDEXED;
    }

    /**
     * Gets or sets the starting index of the results to return.
     */
    public int getIndex()

    {
        return this.index;
    }

    public void setIndex( int value )

    {
        this.index = Math.max( value, 0 );
    }

    /**
     * Gets or sets the number of results to return.
     */
    public int getPageSize()

    {
        return this.pageSize;
    }

    public void setPageSize( int value )

    {
        this.pageSize = Math.max( value, 0 );
    }

    /**
     * Returns a string representation of the query.
     * 
     * @return A string representation of the query.
     */
    public String toString()
    {
        StringBuilder result = new StringBuilder();

        result.append( MessageFormat.format( 
            "Index: {0}, Page size: {1}", 
            this.getIndex(), 
            this.getPageSize())
            + "\n" );

        result.append( super.toString() + "\n" );
        return result.toString();
    }
}