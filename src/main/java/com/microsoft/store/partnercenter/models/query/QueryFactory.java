// -----------------------------------------------------------------------
// <copyright file="QueryFactory.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query;

import com.microsoft.store.partnercenter.models.query.filters.FieldFilter;
import com.microsoft.store.partnercenter.models.query.sort.Sort;

/**
 * Creates new instances of IQuery objects.
 */
public class QueryFactory
{
    /**
     * A singleton instance of the query factory.
     */
    private static QueryFactory __instance = new QueryFactory();

    /**
     * Prevents a default instance of the QueryFactory class from being created.
     */
    private QueryFactory()
    {
    }
    
    /**
     * Gets an instance of the query factory.
     * 
     * @return An instance of the query factory.
     */
    public static QueryFactory getInstance()
    {
    	return QueryFactory.__instance;
    }

	/**
     * Builds a simple query.
     * 
     * @param filter An optional filter.
     * @param sortOption Optional sorting options.
     * @param token Optional query token.
     * @return A simple query.
     */
    public IQuery buildSimpleQuery( FieldFilter filter, Sort sortOption, Object token )

    {
        IQuery query = new SimpleQuery();
        query.setFilter( filter );
        query.setSort( sortOption );
        query.setToken( token );
        return query;
    }

    /**
     * Builds a simple query.
     * 
     * @param filter An optional filter.
     * @param sortOption Optional sorting options.
     * @return A simple query.
     */
    public IQuery buildSimpleQuery( FieldFilter filter, Sort sortOption )
    {
        return buildSimpleQuery( filter, sortOption, null );
    }

    /**
     * Builds a simple query.
     * 
     * @param filter An optional filter.
     * @return A simple query.
     */
    public IQuery buildSimpleQuery( FieldFilter filter )
    {
        return buildSimpleQuery( filter, null, null );
    }

    /**
     * Builds a simple query.
     * 
     * @return A simple query.
     */
    public IQuery buildSimpleQuery()
    {
        return buildSimpleQuery( null, null, null );
    }

    /**
     * Builds an indexed query.
     * 
     * @param pageSize The number of results to return.
     * @param index The results starting index.
     * @param filter An optional filter.
     * @param sortOption An optional sorting options.
     * @param token An optional query token.
     * @return A paged query.
     */
    public IQuery buildIndexedQuery( int pageSize, int index, FieldFilter filter, Sort sortOption, Object token )
    {
        IQuery query = new IndexedQuery();
        query.setPageSize( pageSize );
        query.setIndex( index );
        query.setFilter( filter );
        query.setSort( sortOption );
        query.setToken( token );
        return query;
    }

    /**
     * Builds an indexed query.
     * 
     * @param pageSize The number of results to return.
     * @param index The results starting index.
     * @param filter An optional filter.
     * @param sortOption An optional sorting options.
     * @return A paged query.
     */
    public IQuery buildIndexedQuery( int pageSize, int index, FieldFilter filter, Sort sortOption )

    {
        return buildIndexedQuery( pageSize, index, filter, sortOption, null );
    }

    /**
     * Builds an indexed query.
     * 
     * @param pageSize The number of results to return.
     * @param index The results starting index.
     * @param filter An optional filter.
     * @return A paged query.
     */
    public IQuery buildIndexedQuery( int pageSize, int index, FieldFilter filter )
    {
        return buildIndexedQuery( pageSize, index, filter, null, null );
    }

    /**
     * Builds an indexed query.
     * 
     * @param pageSize The number of results to return.
     * @param index The results starting index.
     * @return A paged query.
     */
    public IQuery buildIndexedQuery( int pageSize, int index )
    {
        return buildIndexedQuery( pageSize, index, null, null, null );
    }

    /**
     * Builds an indexed query.
     * 
     * @param pageSize The number of results to return.
     * @return A paged query.
     */
    public IQuery buildIndexedQuery( int pageSize )
    {
        return buildIndexedQuery( pageSize, 0, null, null, null );
    }

    /**
     * Builds a count query.
     * 
     * @param filter An optional filter.
     * @param token Optional query token.
     * @return A count query.
     */
    public IQuery buildCountQuery( FieldFilter filter, Object token )
    {
        IQuery query = new CountQuery();
        query.setFilter( filter );
        query.setToken( token );
        return query;
    }
       
    /**
     * Builds a count query.
     * 
     * @param filter An optional filter.
     * @return A count query.
     */
    public IQuery buildCountQuery( FieldFilter filter )
    {
        return buildCountQuery( filter, null );
    }
       
    /**
     * Builds a count query.
     * 
     * @return A count query.
     */
    public IQuery buildCountQuery()
    {
        return buildCountQuery( null, null );
    }

    /**
     * Builds a seek query.
     * 
     * @param seekOperation The seek operation to perform.
     * @param pageSize The desired result page size.
     * @param index The index of the page to retrieve. This is only used if the seek operation specified a page index.
     * @param filter An optional filter to apply.
     * @param sortingOption An optional sorting options.
     * @param token An optional query token.
     * @return The seek query.
     */
    public IQuery buildSeekQuery( SeekOperation seekOperation, int pageSize, int index, FieldFilter filter, Sort sortingOption, Object token )
    {
        IQuery query = new SeekQuery();
        query.setSeekOperation( seekOperation );
        query.setPageSize( pageSize );
        query.setIndex( index );
        query.setFilter( filter );
        query.setSort( sortingOption );
        query.setToken( token );
        return query;
    }

    /**
     * Builds a seek query.
     * 
     * @param seekOperation The seek operation to perform.
     * @param pageSize The desired result page size.
     * @param index The index of the page to retrieve. This is only used if the seek operation specified a page index.
     * @param filter An optional filter to apply.
     * @param sortingOption An optional sorting options.
     * @return The seek query.
     */
    public IQuery buildSeekQuery( SeekOperation seekOperation, int pageSize, int index, FieldFilter filter, Sort sortingOption )
    {
        return buildSeekQuery( seekOperation, pageSize, index, filter, sortingOption, null );
    }

    /**
     * Builds a seek query.
     * 
     * @param seekOperation The seek operation to perform.
     * @param pageSize The desired result page size.
     * @param index The index of the page to retrieve. This is only used if the seek operation specified a page index.
     * @param filter An optional filter to apply.
     * @return The seek query.
     */
    public IQuery buildSeekQuery( SeekOperation seekOperation, int pageSize, int index, FieldFilter filter )
    {
        return buildSeekQuery( seekOperation, pageSize, index, filter, null, null );
    }
    
    /**
     * Builds a seek query.
     * 
     * @param seekOperation The seek operation to perform.
     * @param pageSize The desired result page size.
     * @param index The index of the page to retrieve. This is only used if the seek operation specified a page index.
     * @return The seek query.
     */
    public IQuery buildSeekQuery( SeekOperation seekOperation, int pageSize, int index )

    {
        return buildSeekQuery( seekOperation, pageSize, index, null, null, null );
    }

    /**
     * Builds a seek query.
     * 
     * @param seekOperation The seek operation to perform.
     * @param pageSize The desired result page size.
     * @return The seek query.
     */
    public IQuery buildSeekQuery( SeekOperation seekOperation, int pageSize )
    {
        return buildSeekQuery( seekOperation, pageSize, 0, null, null, null );
    }

    /**
     * Builds a seek query.
     * 
     * @param seekOperation The seek operation to perform.
     * @return The seek query.
     */
    public IQuery buildSeekQuery( SeekOperation seekOperation )
    {
        return buildSeekQuery( seekOperation, 0, 0, null, null, null );
    }
}