// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.entitlements;

import java.util.Iterator;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Class that represents reserved instance artifact.
 */
public class ReservedInstanceArtifactDetails
    extends ResourceBaseWithLinks<StandardResourceLinks> 
{
    @JsonProperty("reservation")
    private Iterator<Reservation> reservations;

    @JsonProperty("type")
    private String type; 

    /**
     * Gets the reservation collection.
     * 
     * @return The reservation collection.
     */
    public Iterator<Reservation> getReservations()
    {
        return reservations;
    }

    /**
     * Sets the reservation collection.
     * 
     * @param value The reservation collection.
     */
    public void setReservations(Iterator<Reservation> value)
    {
        reservations = value;
    }

    /**
     * Gets the artifact type.
     * 
     * @return The artifact type.
     */
    public String getType()
    {
        return type;
    }

    /**
     * Sets the artifact type.
     * 
     * @param value The artifact type.
     */
    public void setType(String value)
    {
        type = value;
    }
}