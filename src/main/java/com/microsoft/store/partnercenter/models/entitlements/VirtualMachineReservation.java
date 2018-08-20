// -----------------------------------------------------------------------
// <copyright file="VirtualMachineReservation.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
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
    private String __DisplayName;

    public String getDisplayName()
    {
        return __DisplayName;
    }

    public void setDisplayName( String value )
    {
        __DisplayName = value;
    }

    /**
     * Gets or sets display name.
     */
    @JsonProperty( "reservationId" )
    private String __ReservationId;

    public String getReservationId()
    {
        return __ReservationId;
    }

    public void setReservationId( String value )
    {
        __ReservationId = value;
    }

    /**
     * Gets or sets applied scopes.
     */
    @JsonProperty( "appliedScopes" )
    private Iterator<String> __AppliedScopes;

    public Iterator<String> getAppliedScopes()
    {
        return __AppliedScopes;
    }

    public void setAppliedScopes( Iterator<String> value )
    {
        __AppliedScopes = value;
    }

    /**
     * Gets or sets scope type.
     */
    @JsonProperty( "scopeType" )
    private String __ScopeType;

    public String getScopeType()
    {
        return __ScopeType;
    }

    public void setScopeType( String value )
    {
        __ScopeType = value;
    }

    /**
     * Gets or sets quantity.
     */
    @JsonProperty( "quantity" )
    private Integer __Quantity;

    public Integer getQuantity()
    {
        return __Quantity;
    }

    public void setQuantity( Integer value )
    {
        __Quantity = value;
    }

    /**
     * Gets or sets expiry date time.
     */
    @JsonProperty( "expiryDateTime" )
    private DateTime __ExpiryDateTime;

    public DateTime getExpiryDateTime()
    {
        return __ExpiryDateTime;
    }

    public void setExpiryDateTime( DateTime value )
    {
        __ExpiryDateTime = value;
    }

    /**
     * Gets or sets effective date time.
     */
    @JsonProperty( "effectiveDateTime" )
    private DateTime __EffectiveDateTime;

    public DateTime getEffectiveDateTime()
    {
        return __ExpiryDateTime;
    }

    public void setEffectiveDateTime( DateTime value )
    {
        __ExpiryDateTime = value;
    }

    /**
     * Gets or sets effective date time.
     */
    @JsonProperty( "provisioningState" )
    private String __ProvisioningState;

    public String getProvisioningState()
    {
        return __ProvisioningState;
    }

    public void setProvisioningState( String value )
    {
        __ProvisioningState = value;
    }
}