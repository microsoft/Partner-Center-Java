// -----------------------------------------------------------------------
// <copyright file="OrderLineItemActivationLink.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.orders;

import com.microsoft.store.partnercenter.models.Link;

/**
 * Represents the activation link for the order line item.
 */
public class OrderLineItemActivationLink
{
    /**
     * The order line item number.
     */
    private int lineItemNumber;

    /**
     * The activation link for the order line item.
     */
    private Link link;

    /**
     * Gets the order line item number.
     * 
     * @return The order line item number.
     */
    public int getLineItemNumber()
    {
        return lineItemNumber;
    }

    /**
     * Sets the order line item number.
     * 
     * @param value The order line item number.
     */
    public void setLineItemNumber(int value)
    {
        lineItemNumber = value;
    }

    /**
     * Gets the activation link.
     * 
     * @return The activation link for the order line item.
     */
    public Link getLink()
    {
        return link;
    }

    /**
     * Sets the activation link.
     * 
     * @param value The activation link.
     */
    public void setLink(Link value)
    {
        link = value;
    }
}