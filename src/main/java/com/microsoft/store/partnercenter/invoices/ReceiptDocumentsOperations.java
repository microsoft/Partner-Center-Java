// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class ReceiptDocumentsOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements IReceiptDocuments
{
	/**
	 * Initializes a new instance of the ReceiptDocumentsOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param invoiceId The invoice identifier.
     * @param receiptId The receipt identifier.
	 */
	public ReceiptDocumentsOperations(IPartner rootPartnerOperations, String invoiceId, String receiptId)
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
     * Gets an invoice receipt statement operations.
     * 
     * @return The invoice receipt statement operations.
     */
    @Override
    public IReceiptStatement getStatement() {
        return new ReceiptStatementOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2());
    }
}