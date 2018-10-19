// -----------------------------------------------------------------------
// <copyright file="Artifact.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.Link;

/**
 * Class that represents product key artifact.
 */
public class ProductKeyArtifact
    extends Artifact
{
    /**
     * Gets or sets artifact link.
     */
    @JsonProperty( "link" )
    private Link __Link;

    public Link getLink()
    {
        return __Link;
    }

    public void setLink( Link value )
    {
        __Link = value;
    }

    /**
     * Gets or sets reason associated with key state.
     */
    @JsonProperty( "reason" )
    private String __Reason;

    public String getReason()
    {
        return __Reason;
    }

    public void setReason( String value )
    {
        __Reason = value;
    }

    /**
     * Gets or sets reason associated with key state.
     */
    @JsonProperty( "state" )
    private String __State;

    public String getState()
    {
        return __State;
    }

    public void setState( String value )
    {
        __State = value;
    }
}