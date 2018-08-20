// -----------------------------------------------------------------------
// <copyright file="InvoiceSummary.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Represent the current balance based on Partner's monthly bills.
 */
public class InvoiceSummary
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Gets or sets the balance amount. This is the total amount of unpaid bills.
     */
    private double __BalanceAmount;

    public double getBalanceAmount()
    {
        return __BalanceAmount;
    }

    public void setBalanceAmount( double value )
    {
        __BalanceAmount = value;
    }

    /**
     * Gets or sets the currency code for the balance amount.
     */
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
     * Gets or sets the currency symbol used for all invoice item amounts and totals.
     */
    private String __CurrencySymbol;

    public String getCurrencySymbol()
    {
        return __CurrencySymbol;
    }

    public void setCurrencySymbol( String value )
    {
        __CurrencySymbol = value;
    }

    /**
     * Gets or sets the date the balance amount was last updated.
     */
    private DateTime __AccountingDate;

    public DateTime getAccountingDate()
    {
        return __AccountingDate;
    }

    public void setAccountingDate( DateTime value )
    {
    	__AccountingDate = value;
    }

    /**
     * Gets or sets the date the balance amount was last updated.
     */
    private DateTime __FirstInvoiceCreationDate;

    public DateTime getFirstInvoiceCreationDate()
    {
        return __FirstInvoiceCreationDate;
    }

    public void setFirstInvoiceCreationDate( DateTime value )
    {
        __FirstInvoiceCreationDate = value;
    }

    /**
     *  Gets or sets the last payment date.
     */
    private DateTime __LastPaymentDate;

    public DateTime getLastPaymentDate()
    {
        return __LastPaymentDate;
    }

    public void setLastPaymentDate( DateTime value )
    {
        __LastPaymentDate = value;
    }

    /**
     *  Gets or sets the last payment amount.
     */
    private double __LastPaymentAmount;

    public double getLastPaymentAmount()
    {
        return __LastPaymentAmount;
    }

    public void setLastPaymentAmount( double value )
    {
        __LastPaymentAmount = value;
    }

    /**
     *  Gets or sets the date of latest invoice.
     */
    private DateTime __LatestInvoiceDate;

    public DateTime getLatestInvoiceDate()
    {
        return __LatestInvoiceDate;
    }

    public void setLatestInvoiceDate( DateTime value )
    {
        __LatestInvoiceDate = value;
    }
}