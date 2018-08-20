// -----------------------------------------------------------------------
// <copyright file="FieldType.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query.filters;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FieldType
{
    /**
     * Enumerates supported field types. String Type
     */
    @JsonProperty( "String" ) STRING, /**
             * Integer Type
             */
    @JsonProperty( "Integer" ) INTEGER, /**
              * Enum Type
              */
    @JsonProperty( "Enum" ) ENUM, /**
           * DateTimeOffset Type
           */
    @JsonProperty( "DateTimeOffset" ) DATE_TIME_OFFSET
}
