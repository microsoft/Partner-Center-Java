// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BillingPeriod
{
    /**
     * Default period, does not mean anything.
     */
    NONE("none"),

    /**
    * The current period that is ongoing.
    */
    CURRENT("current"),

    /**
    * The previous period.
    */
    PREVIOUS("previous");

    private final String value;

    BillingPeriod(String value)
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
