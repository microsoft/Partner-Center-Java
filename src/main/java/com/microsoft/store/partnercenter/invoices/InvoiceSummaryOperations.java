// -----------------------------------------------------------------------
// <copyright file="InvoiceSummaryOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.invoices.InvoiceSummary;

public class InvoiceSummaryOperations
	extends BasePartnerComponentString
	implements IInvoiceSummary
{

	/**
	 * Initializes a new instance of the InvoiceSummaryOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
	public InvoiceSummaryOperations(IPartner rootPartnerOperations)
	{
		super(rootPartnerOperations);
	}

	/**
	 * Retrieves summary of the partner's billing information.
	 */
	@Override
	public InvoiceSummary get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<InvoiceSummary>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetInvoiceSummary").getPath());
	}
}
