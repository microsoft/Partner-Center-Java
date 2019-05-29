// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.query;

/**
 * Represents a seek query. The seek query can be used to seek through sets of results using the given seek operation.
 */
public class SeekQuery
    extends IndexedQuery
{
    protected SeekQuery( Object token )

    {
        super( token );
    }

    protected SeekQuery()

    {
        super();
    }

    /**
     * Gets the query type.
     */
    public QueryType getType()

    {
        return QueryType.SEEK;
    }

    /**
     * Gets or sets the seek operation.
     */
    private SeekOperation __SeekOperation = SeekOperation.NEXT;

    public SeekOperation getSeekOperation()
    {
        return __SeekOperation;
    }

    public void setSeekOperation( SeekOperation value )
    {
        __SeekOperation = value;
    }

}
