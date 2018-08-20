// -----------------------------------------------------------------------
// <copyright file="VirtualMachineReservedInstanceArtifact.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.Link;

/**
 * Class that represents virtual machine reserved instance artifact.
 */
public class VirtualMachineReservedInstanceArtifact
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
     *  Gets or sets resourceId (reservation order id).
     */
    @JsonProperty( "resourceId" )
    private String __ResourceId;

    public String getResourceId()
    {
        return __ResourceId;
    }

    public void setResourceId( String value )
    {
        __ResourceId = value;
    }
}