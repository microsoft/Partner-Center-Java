// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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