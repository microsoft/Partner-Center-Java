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
    private String __Id;

    public String getId()
    {
        return __Id;
    }

    public void setId( String value )
    {
    	__Id = value;
    }

    /**
     * Gets or sets the catalog item identifier.
     */
	@JsonProperty( "catalogItemId" )
    private String __CatalogItemId;

    public String getCatalogItemId()
    {
        return __CatalogItemId;
    }

    public void setCatalogItemId( String value )
    {
    	__CatalogItemId = value;
    }

    /**
     *  Gets or sets the friendly name for the result contract (subscription)
     */
    @JsonProperty( "friendlyName" )
    private String __FriendlyName;

    public String getFriendlyName()
    {
        return __FriendlyName;
    }

    public void setFriendlyName( String value )
    {
    	__FriendlyName = value;
    }

    /**
     *  Gets or sets the product quantity.
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
     *  Gets or sets the currency code.
     */
    @JsonProperty( "currencyCode" )
    private String __CurrencyCode;

    public String getCurrencyCode()
    {
        return __CurrencyCode;
    }

    public void setCurrencyCode( String value )
    {
    	__CurrencyCode = value;
    }

    /**
     * Gets or sets the type of billing cycle for the selected catalog item.
     */
    @JsonProperty( "billingCycle" )
    private BillingCycleType __BillingCycle;

    public BillingCycleType getBillingCycle()
    {
        return __BillingCycle;
    }

    public void setBillingCycle( BillingCycleType value )
    {
    	__BillingCycle = value;
    }

    /**
     * Gets or sets a collection of participants on this purchase.
     */
    @JsonProperty( "participants" )
    private Collection<KeyValuePair<ParticipantType, String>> __Participants;

    public Collection<KeyValuePair<ParticipantType, String>> getParticipants()
    {
        return __Participants;
    }

    public void setParticipants( Collection<KeyValuePair<ParticipantType, String>> value )
    {
    	__Participants = value;
    }

    /**
     *  Gets or sets a context that will be used for provisioning of the catalog item.
     */
    @JsonProperty( "provisioningContext" )
    private Map<String, String> __ProvisioningContext;

    public Map<String, String> getProvisioningContext()
    {
        return __ProvisioningContext;
    }

    public void setProvisioningContext( Map<String, String> value )
    {
    	__ProvisioningContext = value;
    }

    /**
     * Gets or sets the order group which indicates which items can be place in a single order.
     */
    @JsonProperty( "orderGroup" )
    private String __OrderGroup;

    public String getOrderGroup()
    {
        return __OrderGroup;
    }

    public void setOrderGroup( String value )
    {
    	__OrderGroup = value;
    }

    /**
     * Gets or sets an error associated to this cart line item.
     */
    @JsonProperty( "error" )
    private CartError __Error;

    public CartError getError()
    {
        return __Error;
    }

    public void setError( CartError value )
    {
    	__Error = value;
    }
}