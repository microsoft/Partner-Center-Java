// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.products;

import java.util.Map;

/**
 * Class that represents an inventory restriction.
 */
public class InventoryRestriction
{
    /**
     * Gets or sets the reason code.
     */
    private String __ReasonCode;

    public String getReasonCode()
    {
        return __ReasonCode;
    }

    public void setReasonCode( String value )
    {
        __ReasonCode = value;
    }

    /**
     * Gets or sets the description.
     */
    private String __Description;

    public String getDescription()
    {
        return __Description;
    }

    public void setDescription( String value )
    {
        __Description = value;
    }

    /**
     * Gets or sets the set of properties that further describe this restriction.
     */
    private Map<String, String> __Properties;

    public Map<String, String> getProperties()
    {
        return __Properties;
    }

    public void setProperties( Map<String, String> value )
    {
        __Properties = value;
    }
}