// -----------------------------------------------------------------------
// <copyright file="VirtualMachineReservation.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import java.util.Iterator;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

import org.joda.time.DateTime;

/**
 * Class that represents a virtual machine reservation.
 */
public class VirtualMachineReservation
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Gets or sets display name.
     */
    @JsonProperty( "displayName" )
    private String displayName;

    public String getDisplayName()
    {
        return displayName;
    }

    public void setDisplayName( String value )
    {
        displayName = value;
    }

    /**
     * Gets or sets display name.
     */
    @JsonProperty( "reservationId" )
    private String reservationId;

    public String getReservationId()
    {
        return reservationId;
    }

    public void setReservationId( String value )
    {
        reservationId = value;
    }

    /**
     * Gets or sets applied scopes.
     */
    @JsonProperty( "appliedScopes" )
    private Iterator<String> appliedScopes;

    public Iterator<String> getAppliedScopes()
    {
        return appliedScopes;
    }

    public void setAppliedScopes( Iterator<String> value )
    {
        appliedScopes = value;
    }

    /**
     * Gets or sets scope type.
     */
    @JsonProperty( "scopeType" )
    private String scopeType;

    public String getScopeType()
    {
        return scopeType;
    }

    public void setScopeType( String value )
    {
        scopeType = value;
    }

    /**
     * Gets or sets quantity.
     */
    @JsonProperty( "quantity" )
    private Integer quantity;

    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity( Integer value )
    {
        quantity = value;
    }

    /**
     * Gets or sets expiry date time.
     */
    @JsonProperty( "expiryDateTime" )
    private DateTime expiryDateTime;

    public DateTime getExpiryDateTime()
    {
        return expiryDateTime;
    }

    public void setExpiryDateTime( DateTime value )
    {
        expiryDateTime = value;
    }

    /**
     * Gets or sets effective date time.
     */
    @JsonProperty( "effectiveDateTime" )
    private DateTime effectiveDateTime;

    public DateTime getEffectiveDateTime()
    {
        return effectiveDateTime;
    }

    public void setEffectiveDateTime( DateTime value )
    {
        effectiveDateTime = value;
    }

    /**
     * Gets or sets effective date time.
     */
    @JsonProperty( "provisioningState" )
    private String provisioningState;

    public String getProvisioningState()
    {
        return provisioningState;
    }

    public void setProvisioningState( String value )
    {
        provisioningState = value;
    }
}