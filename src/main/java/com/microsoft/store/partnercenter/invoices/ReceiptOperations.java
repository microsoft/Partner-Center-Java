// -----------------------------------------------------------------------
// <copyright file="ReceiptOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class ReceiptOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements IReceipt
{
	/**
	 * Initializes a new instance of the ReceiptOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param invoiceId The invoice identifier.
     * @param receiptId The receipt identifier.
	 */
	public ReceiptOperations(IPartner rootPartnerOperations, String invoiceId, String receiptId)
	{
		super(rootPartnerOperations, new Tuple<String, String>(invoiceId, receiptId));
		
		if (StringHelper.isNullOrWhiteSpace(invoiceId))
		{
			throw new IllegalArgumentException("invoiceId has to be set.");
        }

        if (StringHelper.isNullOrWhiteSpace(receiptId))
		{
			throw new IllegalArgumentException("receiptId has to be set.");
        }
    }

    /**
     * Gets the available receipt document operations.
     * 
     * @return The available receipt document operations. 
     */
    @Override
    public IReceiptDocuments getDocuments() {
        return new ReceiptDocumentsOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2());
    }
}