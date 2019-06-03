// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.invoices.BillingPeriod;
import com.microsoft.store.partnercenter.models.invoices.BillingProvider;
import com.microsoft.store.partnercenter.models.invoices.Invoice;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItemType;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Operations available for the reseller's invoice.
 */
public class InvoiceOperations
	extends BasePartnerComponentString
	implements IInvoice
{
	/**
	 * Initializes a new instance of the InvoiceOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param invoiceId The invoice identifier.
	 */
	public InvoiceOperations(IPartner rootPartnerOperations, String invoiceId)
	{
		super(rootPartnerOperations, invoiceId);
		if (StringHelper.isNullOrWhiteSpace(invoiceId))
		{
			throw new IllegalArgumentException("invoiceId has to be set.");
		}
	}

	/**
	 * Gets an invoice documents operations.
	 */
	@Override
	public IInvoiceDocuments getDocuments()
	{
		return new InvoiceDocumentsOperations(this.getPartner(), this.getContext());
	}

	/**
     * Gets the available receipt operations.
     * 
     * @return The available receipt operations.
     */    
	@Override
	public IReceiptCollection getReceipts()
	{
		return new ReceiptCollectionOperations(this.getPartner(), this.getContext());
	}

	/**
	 * Creates an invoice line item collection operation given a billing provider and invoice line item type.
	 * 
	 * @param billingProvider The billing provider.
	 * @param invoiceLineItemType The invoice line item type.
	 * @return The invoice line item collection operations.
	 */
	public IInvoiceLineItemCollection by(BillingProvider billingProvider, InvoiceLineItemType invoiceLineItemType)
	{
		return new InvoiceLineItemCollectionOperations(this.getPartner(), this.getContext(), billingProvider, invoiceLineItemType);
	}

    /**
     * Creates an invoice line item collection operations given a billing provider and invoice line item type.
     * 
     * @param provider The type of billing provider.
     * @param invoiceLineItemType The type of invoice line item type.
     * @param currencyCode The currency code.
     * @param period The period for unbilled recon.
     */
	public IReconciliationLineItemCollection By(BillingProvider provider, InvoiceLineItemType invoiceLineItemType, String currencyCode, BillingPeriod period)
	{
		return new ReconciliationLineItemCollectionOperations(
			this.getPartner(), 
			this.getContext(), 
			provider, 
			invoiceLineItemType, 
			currencyCode, 
			period);
	}

    /**
     * Creates an invoice line item collection operations given a billing provider and invoice line item type.
     * 
     * @param provider The type of billing provider.
     * @param invoiceLineItemType The type of invoice line item type.
     * @param currencyCode The currency code.
     * @param period The period for unbilled recon.
     * @param pageSize The number of records returned in a single operation.
     */
	public IReconciliationLineItemCollection By(BillingProvider provider, InvoiceLineItemType invoiceLineItemType, String currencyCode, BillingPeriod period, int pageSize)
	{
		return new ReconciliationLineItemCollectionOperations(
			this.getPartner(), 
			this.getContext(), 
			provider, 
			invoiceLineItemType, 
			currencyCode, 
			period, 
			pageSize);
	}

	/**
	 * Retrieves information about a specific invoice.
	 * 
	 * @return The invoice.
	 */
	@Override
	public Invoice get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<Invoice>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetInvoice").getPath(),
				this.getContext()));
	}
}