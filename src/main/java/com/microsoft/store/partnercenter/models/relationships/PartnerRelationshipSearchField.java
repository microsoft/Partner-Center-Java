// -----------------------------------------------------------------------
// <copyright file="PartnerRelationshipSearchField.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.relationships;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Lists the supported partner relationship search fields.
 */
public enum PartnerRelationshipSearchField 
{
    NAME("name");

    private final String value;

    PartnerRelationshipSearchField(String value)
    {
        this.value = value;
    }

    /**
     * Converts the object to a string.
     *
     * @return A string that represents this object.
     */
    @JsonValue
    @Override
    public String toString()
    {
        return value;
    }
}