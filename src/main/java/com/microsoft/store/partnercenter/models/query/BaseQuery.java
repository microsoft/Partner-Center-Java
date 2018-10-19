// -----------------------------------------------------------------------
// <copyright file="BaseQuery.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query;

import com.microsoft.store.partnercenter.models.query.filters.FieldFilter;
import com.microsoft.store.partnercenter.models.query.sort.Sort;

/**
 * The base class which all queries should derive from. This class does not support any query capabilities except for
 * the token by default. Therefore, implementation classes will pick and choose what to support.
 */
public abstract class BaseQuery
    implements IQuery
{
    /**
     * Initializes a new instance of the BaseQuery class.
     */
    protected BaseQuery()

    {
        this.setToken( null );
    }

    /**
     * Initializes a new instance of the BaseQuery class.
     * 
     * @param token The query token.
     */
    protected BaseQuery( Object token )

    {
        this.setToken( token );
    }

    /**
     * Gets the query type.
     */
    public QueryType getType()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets or sets the query filter.
     */
    public FieldFilter getFilter()
    {
        throw new UnsupportedOperationException( "Filter is not supported." );
    }

    public void setFilter( FieldFilter value )
    {
        throw new UnsupportedOperationException( "Filter is not supported." );
    }

    /**
     * Gets or sets the query sorting options.
     */
    public Sort getSort()
    {
        throw new UnsupportedOperationException( "Sort is not supported." );
    }

    public void setSort( Sort value )
    {
        throw new UnsupportedOperationException( "Sort is not supported." );
    }

    /**
     * Gets or sets the result starting index.
     */
    public int getIndex()
    {
        throw new UnsupportedOperationException( "Index is not supported." );
    }

    public void setIndex( int value )
    {
        throw new UnsupportedOperationException( "Index is not supported." );
    }

    /**
     * Gets or sets the results page size.
     */
    public int getPageSize()
    {
        throw new UnsupportedOperationException( "PageSize is not supported." );
    }

    public void setPageSize( int value )
    {
        throw new UnsupportedOperationException( "PageSize is not supported." );
    }

    /**
     * Gets or sets the seek token.
     */
    private Object __Token = new Object();

    public Object getToken()
    {
        return __Token;
    }

    public void setToken( Object value )
    {
        __Token = value;
    }

    /**
     * Gets or sets the seek operation that needs to be performed.
     */
    public SeekOperation getSeekOperation()
    {
        throw new UnsupportedOperationException( "SeekOperation is not supported." );
    }

    public void setSeekOperation( SeekOperation value )
    {
        throw new UnsupportedOperationException( "SeekOperation is not supported." );
    }
}