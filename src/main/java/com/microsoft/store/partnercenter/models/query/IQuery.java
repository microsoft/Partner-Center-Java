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
     */
    QueryType getType();

    /**
     * Gets or sets the query filter.
     */
    FieldFilter getFilter();

    void setFilter( FieldFilter value );

    /**
     * Gets or sets the query sorting options.
     */
    Sort getSort();

    void setSort( Sort value );

    /**
     * Gets or sets the result starting index.
     */
    int getIndex();

    void setIndex( int value );

    /**
     * Gets or sets the results page size.
     */
    int getPageSize();

    void setPageSize( int value );

    /**
     * Gets or sets the query token. The token may hold context used to represent current state with back end services.
     */
    Object getToken();

    void setToken( Object value );

    /**
     * Gets or sets the seek operation that needs to be performed.
     */
    SeekOperation getSeekOperation();

    void setSeekOperation( SeekOperation value );

}
