// -----------------------------------------------------------------------
// <copyright file="Reservation.java" company="Microsoft">
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
 * Class that represents a reservation.
 */
public class Reservation
     extends ResourceBaseWithLinks<StandardResourceLinks> 
{
    @JsonProperty("appliedScopes")
    private Iterator<String> appliedScopes;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("effectiveDateTime")
    private DateTime effectiveDateTime;

    @JsonProperty("expiryDateTime")
    private DateTime expiryDateTime;

    @JsonProperty("provisioningState")
    private String provisioningState;

    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("reservationId")
    private String reservationId;

    @JsonProperty("scopeType")
    private String scopeType;

    /**
     * Gets the applied scopes for the reservation.
     * 
     * @return The applied scopes for the reservation.
     */
    public Iterator<String> getAppliedScopes()
    {
        return appliedScopes;
    }

    /**
     * Sets the applied scopes for the reservation.
     * 
     * @param value The applied scopes for the reservation.
     */
    public void setAppliedScopes(Iterator<String> value)
    {
        appliedScopes = value;
    }

    /**
     * Gets the display name for the reservation.
     * 
     * @return The display for the reservation.
     */
    public String getDisplayName()
    {
        return displayName;
    } 

    /**
     * Sets the display name for the reservation.
     * 
     * @param value The display name for the reservation.
     */
    public void setDisplayName(String value)
    {
        displayName = value;
    }

    /**
     * Gets the effective date and time.
     * 
     * @return The effective date and time for the reservation.
     */
    public DateTime getEffectiveDateTime()
    {
        return effectiveDateTime;
    }

    /**
     * Sets the effective date and time.
     * 
     * @param value The effective date and time for the reservation.
     */
    public void setEffectDateTime(DateTime value)
    {
        effectiveDateTime = value;
    }

    /**
     * Gets the expiry date and time.
     * 
     * @return The expiry date and time for the reservation.
     */
    public DateTime getExpiryDateTime()
    {
        return expiryDateTime;
    }

    /**
     * Sets the expiry date and time.
     * 
     * @param value The expiry date and time for the reservation.
     */
    public void setExpiryDateTime(DateTime value)
    {
            expiryDateTime = value;
    }

    /**
     * Gets the provisioning state for the reservation.
     * 
     * @return The provisoning state for the reservation.
     */
    public String getProvisioningState()
    {
        return provisioningState;
    }

    /**
     * Sets the provisioning state for the reservation.
     * 
     * @param value The provisioning state for the reservation.
     */
    public void setProvisioningState(String value)
    {
        provisioningState = value;
    }

    /**
     * Gets the quantity.
     * 
     * @return The quantity for the reservation.
     */
    public Integer getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the quantity.
     * 
     * @param value The quantity for the reservation.
     */
    public void setQuantity(Integer value)
    {
        quantity = value;
    }

    /**
     * Gets the identifier for the reservation.
     * 
     * @return The identifier for the reservation.
     */
    public String getReservationId()
    {
        return reservationId;
    }

    /**
     * Sets the identifier for the reservation.
     * 
     * @param value The identifier for the reservation.
     */
    public void setReservationId(String value)
    {
        reservationId = value;
    }

    /**
     * Gets the scope type for the reservation.
     * 
     * @return The scope type for the reservation.
     */
    public String getScopeType()
    {
        return scopeType;
    }

    /**
     * Sets the scope type for the reservation.
     * 
     * @param value The scope type for the reservation.
     */
    public void setScopeType(String value)
    {
        scopeType = value;
    }
}