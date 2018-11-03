// -----------------------------------------------------------------------
// <copyright file="AuditRecord.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.carts;

import java.util.Collection;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.products.BillingCycleType;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;

/**
 * Represents a line item on a cart.
 */
public class CartLineItem  {
    /**
     * Gets or sets a unique identifier of a cart line item.
     */
	@JsonProperty( "id" )
    private String id;

    public String getId()
    {
        return id;
    }

    public void setId( String value )
    {
    	id = value;
    }

    /**
     * Gets or sets the catalog item identifier.
     */
	@JsonProperty( "catalogItemId" )
    private String catalogItemId;

    public String getCatalogItemId()
    {
        return catalogItemId;
    }

    public void setCatalogItemId( String value )
    {
    	catalogItemId = value;
    }

    /**
     *  Gets or sets the friendly name for the result contract (subscription)
     */
    @JsonProperty( "friendlyName" )
    private String friendlyName;

    public String getFriendlyName()
    {
        return friendlyName;
    }

    public void setFriendlyName( String value )
    {
    	friendlyName = value;
    }

    /**
     *  Gets or sets the product quantity.
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
     *  Gets or sets the currency code.
     */
    @JsonProperty( "currencyCode" )
    private String currencyCode;

    public String getCurrencyCode()
    {
        return currencyCode;
    }

    public void setCurrencyCode( String value )
    {
    	currencyCode = value;
    }

    /**
     * Gets or sets the type of billing cycle for the selected catalog item.
     */
    @JsonProperty( "billingCycle" )
    private BillingCycleType billingCycle;

    public BillingCycleType getBillingCycle()
    {
        return billingCycle;
    }

    public void setBillingCycle( BillingCycleType value )
    {
    	billingCycle = value;
    }

    /**
     * Gets or sets a collection of participants on this purchase.
     */
    @JsonProperty( "participants" )
    private Collection<KeyValuePair<ParticipantType, String>> participants;

    public Collection<KeyValuePair<ParticipantType, String>> getParticipants()
    {
        return participants;
    }

    public void setParticipants( Collection<KeyValuePair<ParticipantType, String>> value )
    {
    	participants = value;
    }

    /**
     *  Gets or sets a context that will be used for provisioning of the catalog item.
     */
    @JsonProperty( "provisioningContext" )
    private Map<String, String> provisioningContext;

    public Map<String, String> getProvisioningContext()
    {
        return provisioningContext;
    }

    public void setProvisioningContext( Map<String, String> value )
    {
    	provisioningContext = value;
    }

    /**
     * Gets or sets the order group which indicates which items can be place in a single order.
     */
    @JsonProperty( "orderGroup" )
    private String orderGroup;

    public String getOrderGroup()
    {
        return orderGroup;
    }

    public void setOrderGroup( String value )
    {
    	orderGroup = value;
    }

    /**
     * Gets or sets an error associated to this cart line item.
     */
    @JsonProperty( "error" )
    private CartError error;

    public CartError getError()
    {
        return error;
    }

    public void setError( CartError value )
    {
    	error = value;
    }
}