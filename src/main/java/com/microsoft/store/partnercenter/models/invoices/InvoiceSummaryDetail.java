// -----------------------------------------------------------------------
// <copyright file="InvoiceSummaryDetail.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

/**
 * Represent a summary of individual details for an invoice type. for example recurring perpetual.
 */
public class InvoiceSummaryDetail
{
    /**
     * Gets or sets the invoice type. example, recurring, perpetual.
     */
    private String __InvoiceType;

    public String getInvoiceType()
    {
        return __InvoiceType;
    }

    public void setInvoiceType( String value )
    {
        __InvoiceType = value;
    }

    /**
     * Gets or sets summary on Partner's monthly bills for a particular invoice type.
     */
    private InvoiceSummary __Summary;

    public InvoiceSummary getSummary()
    {
        return __Summary;
    }

    public void setSummary( InvoiceSummary value )
    {
        __Summary = value;
    }
}