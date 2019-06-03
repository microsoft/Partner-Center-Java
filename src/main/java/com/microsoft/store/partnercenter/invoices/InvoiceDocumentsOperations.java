// ----------------------------------------------------------------
// <copyright file="InvoiceDocumentsOperations.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class InvoiceDocumentsOperations 
	extends BasePartnerComponentString
	implements IInvoiceDocuments
{
	
	/**
	 * Initializes a new instance of the InvoiceDocumentsOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
     * @param invoiceId The invoice identifier.
	 */
	public InvoiceDocumentsOperations(IPartner rootPartnerOperations, String invoiceId)
	{
		super(rootPartnerOperations, invoiceId);
	    
        if (StringHelper.isNullOrWhiteSpace(invoiceId))
        {
            throw new IllegalArgumentException("invoiceId has to be set.");
        }
	}

	/**
	 * Gets an invoice statement operations.
	 */
	@Override
	public IInvoiceStatement getStatement()
	{
		return new InvoiceStatementOperations(this.getPartner(), this.getContext());
	}

}
