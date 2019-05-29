// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.relationships;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The types of relationships between partners for two tier partner scenario.
 */
public enum PartnerRelationshipType 
{
    /**
     * Is indirect reseller of.
     */
    IS_INDIRECT_RESELLER_OF("is_indirect_reseller_of"),

    /**
     * Is indirect cloud solution provider of.
     */
    IS_INDIRECT_CLOUD_SOLUTION_PROVIDER_OF("is_indirect_cloud_solution_provider_of");

    private final String value;

    PartnerRelationshipType(String value)
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