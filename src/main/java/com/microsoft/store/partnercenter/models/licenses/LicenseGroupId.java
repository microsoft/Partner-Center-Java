// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.licenses;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * License Group Id.
 */
public enum LicenseGroupId
{
    /**
     * Indicates nothing - no type, used as an initializer. If any invalid value is
     * passed, then it will be defaulted to this.
     */
    NONE("none"),

    /**
     * Azure Active Directory This indicates that product SKU is managed by Azure AD.
     */
    GROUP1("group1"),

    /**
     * Store for Business This indicates that product SKU is not managed by Azure AD.
     */
    GROUP2("group2");

    private final String value;

    LicenseGroupId(String value)
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