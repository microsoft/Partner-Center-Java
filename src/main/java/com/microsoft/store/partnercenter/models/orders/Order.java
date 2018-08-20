// -----------------------------------------------------------------------
// <copyright file="Order.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.orders;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.models.offers.BillingCycleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Order represents collection of information needed to purchase offers represented by each order line items.
 */
public class Order
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Gets or sets the order identifier.
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
     * Gets or sets the reference customer identifier.
     */
    @JsonProperty( "referenceCustomerId" )
    private String __ReferenceCustomerId;

    public String getReferenceCustomerId()
    {
        return __ReferenceCustomerId;
    }

    public void setReferenceCustomerId( String value )
    {
        __ReferenceCustomerId = value;
    }

    /**
     * Gets or sets the Order line items. Each order line item refers to one offer purchase data.
     */
    @JsonProperty( "lineItems" )
    private Iterable<OrderLineItem> __LineItems;

    public Iterable<OrderLineItem> getLineItems()
    {
        return __LineItems;
    }

    public void setLineItems( Iterable<OrderLineItem> value )
    {
        __LineItems = value;
    }

    /**
     * Gets or sets the creation date of the order
     */
    @JsonProperty( "creationDate" )
    private DateTime __CreationDate;

    public DateTime getCreationDate()
    {
        return __CreationDate;
    }

    public void setCreationDate( DateTime value )
    {
        __CreationDate = value;
    }

    /**
     * Gets or sets the currency code.
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
     * Gets or sets the order status.
     */
    @JsonProperty( "status" )
    private String __Status;

    public String getStatus()
    {
        return __Status;
    }

    public void setStatus( String value )
    {
        __Status = value;
    }

    /**
     * Gets or sets the links corresponding to the order.
     */
    @JsonProperty( "links" )
    private OrderLinks __Links;

    public OrderLinks getLinks()
    {
        return __Links;
    }

    public void setLinks( OrderLinks value )
    {
        __Links = value;
    }

    /**
     * Gets or sets the type of billing cycle for the selected offers.
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
}