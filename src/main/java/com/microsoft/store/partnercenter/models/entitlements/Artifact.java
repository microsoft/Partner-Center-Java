// -----------------------------------------------------------------------
// <copyright file="Artifact.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Class that represents an entitlement artifact.
 */
public class Artifact
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    @JsonProperty("artifactType")
    private String artifactType;

    @JsonProperty("dynamicAttributes")
    private Map<String, Object> dynamicAttributes;
    
    /**
     * Gets the artifact type.
     * 
     * @return The artifact type.
     */
    public String getArtifactType()
    {
        return artifactType;
    }

    /**
     * Sets the artifact type.
     * 
     * @param value The type of artifact.
     */
    public void setArtifactType(String value)
    {
        artifactType = value;
    }

    /**
     * Gets the dynamic attributes
     * 
     * @return The dynamic attributes.
     */
    public Map<String, Object> getDynamicAttributes()
    {
        return dynamicAttributes;
    }

    /**
     * Sets the dynamic attributes.
     * 
     * @param value The available dynamic attributes.
     */
    public void setDynamicAttributes(Map<String, Object> value)
    {
        dynamicAttributes = value;
    }
}