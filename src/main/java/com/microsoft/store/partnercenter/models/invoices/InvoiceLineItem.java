// -----------------------------------------------------------------------
// <copyright file="InvoiceLineItem.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents a line item on an invoice.
 */
public abstract class InvoiceLineItem
    extends ResourceBase
{
    /**
     * Gets the type of invoice line item.
     * 
     * @return The type of invoice line item.
     */
    public abstract InvoiceLineItemType getInvoiceLineItemType();

    /**
     * Gets the billing provider.
     * 
     * @return The billing provider.
     */
    public abstract BillingProvider getBillingProvider();
}