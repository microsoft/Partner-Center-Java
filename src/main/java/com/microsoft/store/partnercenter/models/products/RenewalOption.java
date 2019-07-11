// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.products;

/**
 * Represents a conversion option.
 */
public class RenewalOption
{
    /**
     * The renewal option term duration description.
     */
    private String description;

    /**
     * The ISO standard representation of this term's duration.
     */
    private String termDuration;

    /**
     * Gets the renewal option term duration description.
     * 
     * @return The renewal option term duration description.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the renewal option term duration description.
     * 
     * @param value The renewal option term duration description.
     */
    public void setDescription(String value)
    {
        description = value;
    }

    /**
     * Gets the ISO standard representation of this term's duration.
     * 
     * @return The ISO standard representation of this term's duration.
     */
    public String getTermDuration()
    {
        return termDuration; 
    }

    /**
     * Sets the ISO standard representation of this term's duration.
     * 
     * @param value The ISO standard representation of this term's duration.
     */
    public void setTermDuration(String value)
    {
        termDuration = value;
    }
}