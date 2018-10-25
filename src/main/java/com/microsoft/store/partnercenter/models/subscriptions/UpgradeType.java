// -----------------------------------------------------------------------
// <copyright file="UpgradeType.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UpgradeType
{
    /**
     * Represents a form of upgrade for a subscription Default value
     */
    NONE("none"),

    /**
     * Only subscription upgrade
     */
    UPGRADE_ONLY("upgrade_only"),

    /**
     * Subscription upgrade and license transfer
     */
    UPGRADE_WITH_LICENSE_TRANSFER("upgrade_with_license_transfer");

    private final String value;

    UpgradeType(String value)
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