// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

/**
 * Represents an upgraded product's details.
 */
public class ProductUpgradeDetail
{
    /**
     * The identifier for the product upgrade.
     */
    private String id;

    /**
     * The name of the product to upgrade.
     */
    private String name;

    /**
     * Gets the identifier for the product upgrade.
     * 
     * @return The identifier for the product upgrade.
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the identifier for the product upgrade.
     * 
     * @param value The identifier for the product upgrade.
     */
    public void setId(String value)
    {
        id = value;
    }

    /**
     * Gets the name of the product to upgrade.
     * 
     * @return The name of the product to upgrade.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name of the product to upgrade.
     * 
     * @param value The name of the product to upgrade.
     */
    public void setName(String value)
    {
        name = value;
    }
}