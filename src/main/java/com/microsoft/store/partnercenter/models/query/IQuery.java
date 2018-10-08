// -----------------------------------------------------------------------
// <copyright file="IQuery.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query;

import com.microsoft.store.partnercenter.models.query.filters.FieldFilter;
import com.microsoft.store.partnercenter.models.query.sort.Sort;

/**
 * Represents a query on an entity. All different queries should implement this contract.
 */
public interface IQuery
{
    /**
     * Gets the query type.
     * 
     * @return The query type.
     */
    QueryType getType();

    /**
     * Gets the query filter.
     * 
     * @return The query filter.
     */
    FieldFilter getFilter();

    /**
     * The query filter.
     * 
     * @param value The query filter.
     */
    void setFilter( FieldFilter value );

    /**
     * Gets the query sorting options.
     * 
     * @return The query sorting options.
     */
    Sort getSort();

    /**
     * Sets the query sorting options.
     * 
     * @param value The query sorting options.
     */
    void setSort( Sort value );

    /**
     * Gets the result starting index.
     * 
     * @return The result starting index.
     */
    int getIndex();

    /**
     * Sets the result starting index.
     * 
     * @param value The result starting index.
     */
    void setIndex( int value );

    /**
     * Gets the results page size.
     * 
     * @return The result page size.
     */
    int getPageSize();

    /**
     * Sets the results page size.
     * 
     * @param value The results page size.
     */
    void setPageSize( int value );

    /**
     * Gets the query token. The token may hold context used to represent current state with back end services.
     * 
     * @return The query token.
     */
    Object getToken();

    /**
     * Sets the query token.
     * 
     * @param value The query token.
     */
    void setToken( Object value );

    /**
     * Gets or sets the seek operation that needs to be performed.
     * 
     * @return The seek operation that needs to be performed.
     */
    SeekOperation getSeekOperation();

    /**
     * Sets the seek operation that needs to be performed.
     * 
     * @param value The seek operation that needs to be performed.
     */
    void setSeekOperation( SeekOperation value );
}