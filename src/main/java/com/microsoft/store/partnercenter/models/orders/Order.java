// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.orders;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.models.offers.BillingCycleType;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Order represents collection of information needed to purchase offers represented by each order line items.
 */
public class Order
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * The type of billing cycle for the selected offers.
     */
    private BillingCycleType billingCycle;

    /**
     * The creation date of the order.
     */
    private DateTime creationDate;

    /**
     * The currency code.
     */
    private String currencyCode;

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
     * The links corresponding to the order.
     */
    private OrderLinks links;

    /**
     * The reference customer identifier.
     */
    private String referenceCustomerId;

    /**
     * The status of the order.
     */
    private String status;

    /**
     * The total price for the order.
     */
    private double totalPrice;

	/** 
     * The transaction type for the order.
     */
    private String transactionType;

    /**
     * Gets the type of billing cycle for the selected offers.
     * 
     * @return The type of billing cycle for the selected offers.
     */
    public BillingCycleType getBillingCycle()
    {
        return billingCycle;
    }

    /**
     * Sets the type of billing cycle for the selected offers.
     * 
     * @param value The type of billing cycle for the selected offers.
     */
    public void setBillingCycle(BillingCycleType value)
    {
        billingCycle = value;
    }

    /**
     * Gets the creation date of the order.
     *
     * @return The creation date of the order.
     */
    public DateTime getCreationDate()
    {
        return creationDate;
    }

    /**
     * Sets the creation date of the order.
     * 
     * @param value The creation date of the order.
     */
    public void setCreationDate(DateTime value)
    {
        creationDate = value;
    }

    /**
     * Gets the currency code.
     * 
     * @return The currency code for the order.
     */
    public String getCurrencyCode()
    {
        return currencyCode;
    }

    /**
     * Sets the currency code.
     * 
     * @param value The currency code for the order.
     */
    public void setCurrencyCode(String value)
    {
        currencyCode = value;
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
     * @param value The currency symbol.
     */
    public void setCurrencySymbol(String value)
    {
        currencySymbol = value;
    }

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
     * Gets the links corresponding to the order.
     * 
     * @return The links corresponding to the order.
     */
    public OrderLinks getLinks()
    {
        return links;
    }

    /**
     * Sets the links corresponding to the order.
     * 
     * @param value The links corresponding to the order.
     */
    public void setLinks(OrderLinks value)
    {
        links = value;
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
     * Gets the status of the order.
     * 
     * @return The status of the order.
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * Sets the status of the order.
     * 
     * @param value The status of the order.
     */
    public void setStatus(String value)
    {
        status = value;
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