// -----------------------------------------------------------------------
// <copyright file="VirtualMachineReservedInstanceArtifactDetails.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import java.util.Iterator;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 *  Class that represents virtual machine reserved instance artifact details.
 */
public class VirtualMachineReservedInstanceArtifactDetails
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
     *  Gets or sets virtual machine reservation collection.
     */
    @JsonProperty( "virtualMachineReservations" )
    private Iterator<VirtualMachineReservation> __VirtualMachineReservations;

    public Iterator<VirtualMachineReservation> getVirtualMachineReservations()
    {
        return __VirtualMachineReservations;
    }

    public void setVirtualMachineReservations( Iterator<VirtualMachineReservation> value )
    {
        __VirtualMachineReservations = value;
    }
}