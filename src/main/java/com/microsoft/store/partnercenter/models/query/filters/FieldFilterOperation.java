// -----------------------------------------------------------------------
// <copyright file="FieldFilterOperation.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query.filters;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FieldFilterOperation
{
    /**
     * Enumerates supported filter operations. Equals filter.
     */
    @JsonProperty( "Equals" ) 
    EQUALS, 
    
    /**
     * Not equals filter.
     */
    @JsonProperty( "NotEquals" ) 
    NOT_EQUALS, 
    
    /**
     * Greater than filter.
     */
    @JsonProperty( "GreaterThan" ) 
    GREATER_THAN,
    
    /**
     * Greater than or equal filter.
     */
    @JsonProperty( "GreaterThanOrEquals" ) 
    GREATER_THAN_OR_EQUALS, 
    
    /**
     * Less than filter.
     */
    @JsonProperty( "LessThan" )
    LESS_THAN, 
    
    /**
     * Less than or equals filter.
     */
    @JsonProperty( "LessThanOrEquals" ) 
    LESS_THAN_OR_EQUALS, 
    
    /**
     * Substring filter.
     */
    @JsonProperty( "Substring" ) 
    SUBSTRING, 
    
    /**
     * And filter.
     */
    @JsonProperty( "And" ) 
    AND, 
    
    /**
     * Or filter.
     */
    @JsonProperty( "Or" ) OR, 
    
    /**
     * String starts with filter.
     */
    @JsonProperty( "StartsWith" ) 
    STARTS_WITH, 
    
    /**
     * String does not starts with filter.
     */
    @JsonProperty( "NotStartsWith" ) 
    NOT_STARTS_WITH
}