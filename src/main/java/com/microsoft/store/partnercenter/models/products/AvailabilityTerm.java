// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.products;

/**
 *Represents the terms for an availability.
 */
public class AvailabilityTerm
{
    /**
     * The description for the term.
     */
    private String description;

    /**
     * The ISO standard representation of this term's duration.
     */
    private String duration;

    /**
     * Gets the description for the term.
     * 
     * @return The description for the term.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the description for the term.
     * 
     * @param value The description for the term.
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
    public String getDuration()
    {
        return duration;
    }

    /**
     * Sets the ISO standard representation of this term's duration.
     * 
     * @param value The ISO standard representation of this term's duration. 
     */
    public void setDuration(String value)
    {
        duration = value;
    }
}