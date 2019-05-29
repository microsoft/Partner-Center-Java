// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import java.io.InputStream;
import java.text.MessageFormat;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class InvoiceStatementOperations
	extends BasePartnerComponentString
	implements IInvoiceStatement
{

	/**
	 * Initializes a new instance of the InvoiceStatementOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param invoiceId The invoice identifier.
	 */
	public InvoiceStatementOperations( IPartner rootPartnerOperations, String invoiceId )
	{
		super( rootPartnerOperations, invoiceId );
		
		if ( StringHelper.isNullOrWhiteSpace( invoiceId ) )
		{
			throw new IllegalArgumentException( "invoiceId has to be set." );
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
				PartnerService.getInstance().getConfiguration().getApis().get("GetInvoiceStatement").getPath(),
				this.getContext()), 
			"application/pdf");
	}
}