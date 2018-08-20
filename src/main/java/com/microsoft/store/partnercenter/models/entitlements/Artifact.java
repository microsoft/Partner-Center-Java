// -----------------------------------------------------------------------
// <copyright file="Artifact.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Class that represents an entitlement artifact.
 */
public class Artifact
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Gets or sets Artifact Type.
     */
    @JsonProperty( "artifactType" )
    private ArtifactType __ArtifactType;

    public ArtifactType getArtifactType()
    {
        return __ArtifactType;
    }

    public void setArtifactType( ArtifactType value )
    {
        __ArtifactType = value;
    }
}