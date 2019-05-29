// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

import com.microsoft.store.partnercenter.models.Link;

/**
 * Represents a URI and the HTTP method which indicates the desired action for accessing the resource.
 */
public class EstimateLink
{
    /**
     * The description for the link.
     */
    private String description; 

    /** 
     * The URI and HTTP method used for accessing the resource.
     */
    private Link link;

    /**
     * The period associated with the estimate.
     */
    private String period;

    /**
     * The title associated with the estimate.
     */
    private String title;

    /**
     * Gets the description for the link.
     * 
     * @return The description for the link.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the description for the link.
     * 
     * @param value The description for the link.
     */
    public void setDescription(String value)
    {
        description = value;
    }

    /**
     * Gets URI and HTTP method used for accessing the resource.
     * 
     * @return The URI and HTTP method used for accessing the resource.
     */
    public Link getLink()
    {
        return link;
    }

    /**
     * Sets the URI and HTTP method used for accessing the resource.
     * 
     * @param value The URI and HTTP method used for accessing the resource.
     */
    public void setLink(Link value)
    {
        link = value;
    }

    /**
     * Gets the period associated with the estimate.
     * 
     * @return The period associated with the estimate.
     */
    public String getPeriod()
    {
        return period;
    }

    /**
     * Sets the period associated with the estimate.
     * 
     * @param value The period associated with the estimate.
     */
    public void setPeriod(String value)
    {
        period = value;
    }

    /**
     * Gets the title associated with the estimate.
     * 
     * @return The title associated with the estimate.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Sets title associated with the estimate.
     * 
     * @param value The title associated with the estimate.
     */
    public void setTitle(String value)
    {
        title = value;
    }
}