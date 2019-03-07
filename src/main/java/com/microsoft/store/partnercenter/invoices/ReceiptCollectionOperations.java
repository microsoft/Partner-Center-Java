// -----------------------------------------------------------------------
// <copyright file="ReceiptCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class ReceiptCollectionOperations
	extends BasePartnerComponentString
	implements IReceiptCollection
{
	/**
	 * Initializes a new instance of the ReceiptCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param invoiceId The invoice identifier.
     * @param receiptId
	 */
	public ReceiptCollectionOperations(IPartner rootPartnerOperations, String invoiceId)
	{
		super(rootPartnerOperations, invoiceId);
		
		if (StringHelper.isNullOrWhiteSpace(invoiceId))
		{
			throw new IllegalArgumentException("invoiceId has to be set.");
        }
    }

    /**
     * Retrieves a specific Invoice receipt behavior.
     * 
     * @param id The receipt identifier.
     * @return The available receipt operations
     */
    @Override
    public IReceipt byId(String id) {
        return new ReceiptOperations(this.getPartner(), this.getContext(), id);
    }
}