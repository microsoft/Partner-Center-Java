// -----------------------------------------------------------------------
// <copyright file="SortDirection.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query.sort;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SortDirection
{
    /**
     * Sort direction enumeration. Ascending sort.
     */
    @JsonProperty( "ascending" ) 
    ASCENDING, 
    
    /**
     * Descending sort.
     */
    @JsonProperty( "descending" ) 
    DESCENDING
}