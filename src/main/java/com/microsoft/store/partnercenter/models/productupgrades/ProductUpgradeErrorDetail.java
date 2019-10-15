// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

/**
 * Represents error details for a product upgrade.
 */
public class ProductUpgradeErrorDetail
{
    /**
     * The error code of the product upgrade.
     */
    private String code;

    /**
     * The description of the product upgrade.
     */
    private String description;

    /**
     * Gets the error code of the product upgrade.
     * 
     * @return The error code of the product upgrade.
     */
    public String getCode()
    {
        return code;
    }

    /**
     * Sets the error code of the product upgrade.
     * 
     * @param value The error code of the product upgrade.
     */
    public void setCode(String value)
    {
        code = value;
    }

    /**
     * Gets the description of the product upgrade.
     * 
     * @return The description of the product upgrade.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the description of the product upgrade.
     * 
     * @param value The description of the product upgrade.
     */
    public void setDescription(String value)
    {
        description = value;
    }
}