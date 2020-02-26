// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BillingProvider
{
    /**
     * Different providers of billing information Enum initializer
     */
    NONE("none"),

    /**
    * Bill is provided by Office. Example: Office 365 and Intune.
    */
    OFFICE("office"),

    /**
    * Bill is provided by Azure. Example: Azure Services.
    */
    AZURE("azure"),

    /**
    * Bill is provided for one time purchases.
    */

    ONE_TIME("one_time"),
    
    /**
     * Indicates that the provider is marketplace .
     */
    MARKETPLACE("marketplace"), 
    
    /**
     * Indicates that the provider is both first party and marketplace.
     */
    ALL("all");

    private final String value;

    BillingProvider(String value)
    {
        this.value = value;
    }

    @JsonValue
    public String getValue()
    {
        return value;
    }

    /**
     * Converts the object to a string.
     *
     * @return A string that represents this object.
     */
    @Override
    public String toString()
    {
        return value.replace("_", "");
    }
}
