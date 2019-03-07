// -----------------------------------------------------------------------
// <copyright file="ReceiptStatementOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import java.io.InputStream;
import java.text.MessageFormat;

import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class ReceiptStatementOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements IReceiptStatement
{

	/**
	 * Initializes a new instance of the ReceiptStatementOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param invoiceId The invoice identifier.
     * @param receiptId
	 */
	public ReceiptStatementOperations(IPartner rootPartnerOperations, String invoiceId, String receiptId)
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
	 * Retrieves the invoice statement. This operation is currently only supported for user based credentials.
	 * 
	 * @return The invoice statement.
	 */
	@Override
	public InputStream get()
	{
		return this.getPartner().getServiceClient().getFileContents(
			this.getPartner(), 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetInvoiceTaxReceiptStatement").getPath(),
				this.getContext()), 
			"application/pdf");
	}
}