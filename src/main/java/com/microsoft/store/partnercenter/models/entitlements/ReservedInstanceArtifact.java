// -----------------------------------------------------------------------
// <copyright file="ReservedInstanceArtifact.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.Link;

/**
 * Class that represents reserved instance artifact.
 */
public class ReservedInstanceArtifact
     extends Artifact
{
    @JsonProperty("link")
    private Link link;

    @JsonProperty("resourceId")
    private String resourceId; 

    /**
     * Gets the link for the reserved instance artifact.
     * 
     * @return The link for the reserved instance artifact.
     */
    public Link getLink()
    {
        return link;
    }

    /**
     * Sets the link for the reserved instance artifact.
     * 
     * @param value The link for the reserved instance artifact.
     */
    public void setLink(Link value)
    {
        link = value;
    }

    /**
     * Gets the resource identifier for the reserved instance artifact.
     * 
     * @return The resource identifier for the reserved instance artifact.
     */
    public String getResourceId()
    {
        return resourceId;
    }

    /**
     * Sets the resource identifier for the reserved instance artifact.
     * 
     * @param value The resource identifier for the reserved instance artifact.
     */
    public void setResourceId(String value)
    {
        resourceId = value;
    }
}