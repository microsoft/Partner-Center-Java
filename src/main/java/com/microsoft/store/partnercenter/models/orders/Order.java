// -----------------------------------------------------------------------
// <copyright file="Order.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
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
     * The currency symbol.
     */
    private String currencySymbol; 

    /**
     * The order identifier.
     */
    private String id;

    /**
     * The order line items. Each order line item refers to one offer purchase data.
     */
    private Iterable<OrderLineItem> lineItems;

    /**
     * Gets or sets the reference customer identifier.
     */
    private String referenceCustomerId;

    /**
     * The total price for the order.
     */
    private double totalPrice;

	/** 
     * The transaction type for the order.
     */
    private String transactionType;

    /**
     * Gets the order identifier.
     * 
     * @return The order identifier.
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the order identifier.
     * 
     * @param value The order identifier.
     */
    public void setId(String value)
    {
        id = value;
    }

    /**
     * Gets the order line items. Each order line item refers to one offer purchase data.
     * 
     * @return The order line items. Each order line item refers to one offer purchase data.
     */
    public Iterable<OrderLineItem> getLineItems()
    {
        return lineItems;
    }

    /**
     * Sets the order line items. Each order line item refers to one offer purchase data.
     * 
     * @param value The order line items. Each order line item refers to one offer purchase data.
     */
    public void setLineItems(Iterable<OrderLineItem> value)
    {
        lineItems = value;
    }

    /**
     * Gets the reference customer identifier.
     * 
     * @return The reference customer identifier.
     */
    public String getReferenceCustomerId()
    {
        return referenceCustomerId;
    }

    /**
     * Sets the reference customer identifier.
     * 
     * @param value The reference customer identifier.
     */
    public void setReferenceCustomerId(String value)
    {
        referenceCustomerId = value;
    }





    /**
     * Gets or sets the creation date of the order
     */
    @JsonProperty("creationDate")
    private DateTime __CreationDate;

    public DateTime getCreationDate()
    {
        return __CreationDate;
    }

    public void setCreationDate(DateTime value)
    {
        __CreationDate = value;
    }

    /**
     * Gets or sets the currency code.
     */
    @JsonProperty("currencyCode")
    private String __CurrencyCode;

    public String getCurrencyCode()
    {
        return __CurrencyCode;
    }

    public void setCurrencyCode(String value)
    {
        __CurrencyCode = value;
    }

    /**
     * Gets or sets the order status.
     */
    @JsonProperty("status")
    private String __Status;

    public String getStatus()
    {
        return __Status;
    }

    public void setStatus(String value)
    {
        __Status = value;
    }

    /**
     * Gets or sets the links corresponding to the order.
     */
    @JsonProperty("links")
    private OrderLinks __Links;

    public OrderLinks getLinks()
    {
        return __Links;
    }

    public void setLinks(OrderLinks value)
    {
        __Links = value;
    }

    /**
     * Gets or sets the type of billing cycle for the selected offers.
     */
    @JsonProperty("billingCycle")
    private BillingCycleType __BillingCycle;

    public BillingCycleType getBillingCycle()
    {
        return __BillingCycle;
    }

    public void setBillingCycle(BillingCycleType value)
    {
        __BillingCycle = value;
    }

    /**
     * Gets the currency symbol.
     * 
     * @return The currency symbol.
     */
    public String getCurrencySymbol()
    {
        return currencySymbol;
    }    

    /**
     * Sets the currency symbol.
     * 
     * @param value The currency sybmol.
     */
    public void setCurrencySymbol(String value)
    {
        currencySymbol = value;
    }

    /**
     * Gets the total price for the order. Order price (will not be returned unless explicitly asked for) Note: this information is PRE-TAX.
     *
     * @return The total price for the order.
     */
    public double getTotalPrice()
    {
        return totalPrice;
    }

    /** 
     * Sets the total price for the order.
     * 
     * @param value The total price for the order.
     */
    public void setsTotalPrice(double value)
    {
        totalPrice = value;
    }

    /**
     * Gets the transaction type for the order.
     * 
     * @return The transaction type for the order.
     */
    public String getTransactionType()
    {
        return transactionType;
    }

    /** 
     * Sets the transaction type for the order.
     * 
     * @param value The transaction type for the order.
     */
    public void setsTransactionType(String value)
    {
        transactionType = value;
    }
}