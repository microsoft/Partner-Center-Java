// -----------------------------------------------------------------------
// <copyright file="QueryType.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query;

public enum QueryType
{
    /**
     * Enumerates query types. A standard query that supports filtering and sorting.
     */
    SIMPLE,
    /**
     * A query that supports paging using an index and a page size in addition to the standard filtering and sorting.
     */
    INDEXED,
    /**
     * A query that returns the count of results according to an optional filter.
     */
    COUNT, /**
            * A query that is a continuation of a previous one. Used to retrieve more records of the same query relative
            * to the last made query by seeking to pages.
            */
    SEEK
}
