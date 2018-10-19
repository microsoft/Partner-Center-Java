// -----------------------------------------------------------------------
// <copyright file="ProductKeyArtifactDetails.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Class that represents a product key artifact details.
 */
public class ProductKeyArtifactDetails
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Gets or sets the artifact type.
     */
    @JsonProperty( "type" )
    private ArtifactType __ArtifactType;

    public ArtifactType getType()
    {
        return __ArtifactType;
    }

    public void setType( ArtifactType value )
    {
        __ArtifactType = value;
    }

    /**
     *  Gets or sets product key / token.
     */
    @JsonProperty( "productKey" )
    private String __ProductKey;

    public String getProductKey()
    {
        return __ProductKey;
    }

    public void setProductKey( String value )
    {
        __ProductKey = value;
    }
}