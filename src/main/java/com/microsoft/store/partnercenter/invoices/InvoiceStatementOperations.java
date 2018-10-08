// -----------------------------------------------------------------------
// <copyright file="InvoiceStatementOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class InvoiceStatementOperations
	extends BasePartnerComponentString
	implements IInvoiceStatement
{

    /***
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

	/***
	 * Retrieves the invoice statement. This operation is currently only supported for user based credentials.
	 * 
	 * @return The invoice statement.
	 */
	@Override
	public InputStream get()
	{
        IPartnerServiceProxy<InputStream, InputStream> partnerServiceProxy =
                new PartnerServiceProxy<InputStream, InputStream>( new TypeReference<InputStream>()
                {
                }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoiceStatement" ).getPath(),
                                                            this.getContext(), Locale.US ) );

        partnerServiceProxy.setAccept( "application/pdf" );
        
        return partnerServiceProxy.getFileContent();
	}
}