// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.invoices.BillingPeriod;
import com.microsoft.store.partnercenter.models.invoices.BillingProvider;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItem;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItemType;
import com.microsoft.store.partnercenter.models.query.SeekOperation;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Represents the operations that can be done on partner's reconciliation line items.
 */
public class ReconciliationLineItemCollectionOperations 
    extends BasePartnerComponent<String>
    implements IReconciliationLineItemCollection 
{
    /**
     * The maximum page size for recon line items.
     */
    private final int maxPageSizeReconLineItems = 2000;

    /**
     * The type of billing provider.
     */
    private BillingProvider billingProvider;

    /**
     * The currency code.
     */
    private String currencyCode;

    /**
     * The type of invoice line item.
     */
    private InvoiceLineItemType invoiceLineItemType;

    /**
     * The page size;
     */
    private int pageSize; 

    /**
     * The billing period.
     */
    private BillingPeriod period;

	/**
	 * Initializes a new instance of the ReconciliationLineItemCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param invoiceId The invoice identifier.
     * @param billingProvider The billing provider type.
     * @param invoiceLineItemType The invoice line item type.
     * @param currencyCode The currency code.
     * @param period The billing period.
	 */
	public ReconciliationLineItemCollectionOperations(IPartner rootPartnerOperations, String invoiceId, BillingProvider billingProvider, InvoiceLineItemType invoiceLineItemType, String currencyCode, BillingPeriod period)
	{
        super(rootPartnerOperations, invoiceId);

        if (StringHelper.isNullOrWhiteSpace(invoiceId))
		{
			throw new IllegalArgumentException("invoiceId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(currencyCode))
        {
			throw new IllegalArgumentException("currencyCode must be set");
        }

        this.billingProvider = billingProvider;
        this.invoiceLineItemType = invoiceLineItemType;
        this.currencyCode = currencyCode;
        this.period = period;

        pageSize = maxPageSizeReconLineItems;
    }

    /**
	 * Initializes a new instance of the ReconciliationLineItemCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param invoiceId The invoice identifier.
     * @param billingProvider The billing provider type.
     * @param invoiceLineItemType The invoice line item type.
     * @param currencyCode The currency code.
     * @param period The billing period.
     * @param pageSize The number of records returned in a single operation.
	 */
	public ReconciliationLineItemCollectionOperations(IPartner rootPartnerOperations, String invoiceId, BillingProvider billingProvider, InvoiceLineItemType invoiceLineItemType, String currencyCode, BillingPeriod period, int pageSize)
	{
        super(rootPartnerOperations, invoiceId);

        if (StringHelper.isNullOrWhiteSpace(invoiceId))
		{
			throw new IllegalArgumentException("invoiceId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(currencyCode))
        {
			throw new IllegalArgumentException("currencyCode must be set");
        }

        this.billingProvider = billingProvider;
        this.invoiceLineItemType = invoiceLineItemType;
        this.currencyCode = currencyCode;
        this.period = period;

        this.pageSize = pageSize;
    }

    /**
     * Gets the recon line items collection of the partner.
     *
     * @return The collection of recon line items.
     */
    @Override
    public SeekBasedResourceCollection<InvoiceLineItem> get()
    {
        return get(null, null);
    }

    /**
     * Seek the recon line items collection of the partner.
     * 
     * @return The collection of recon line items.
     */
    @Override
    public SeekBasedResourceCollection<InvoiceLineItem> get(String continuationToken, SeekOperation seekOperation)
    {
        Map<String, String> headers = new HashMap<>();
        Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add(
			new KeyValuePair<String, String>(
				PartnerService.getInstance().getConfiguration().getApis().get("GetReconciliationLineItems").getParameters().get("CurrencyCode"),
                currencyCode));
        
        parameters.add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get("GetReconciliationLineItems").getParameters().get("InvoiceLineItemType"),
                invoiceLineItemType.toString()));

        parameters.add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get("GetReconciliationLineItems").getParameters().get("Period"),
                period.toString()));

        parameters.add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get("GetReconciliationLineItems").getParameters().get("Provider"),
                billingProvider.toString()));

        parameters.add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get("GetReconciliationLineItems").getParameters().get("Size"),
                String.valueOf(pageSize)));

        if (!StringHelper.isNullOrWhiteSpace(continuationToken))
        {
            if (seekOperation == null)
            {
                throw new IllegalArgumentException("SeekOperation can not be null");
            }

            headers.put(
                    PartnerService.getInstance().getConfiguration().getApis().get("GetReconciliationLineItems").getAdditionalHeaders().get("ContinuationToken"),
                    continuationToken);

            parameters.add(
                    new KeyValuePair<String, String>(
                            PartnerService.getInstance().getConfiguration().getApis().get("GetReconciliationLineItems").getParameters().get("SeekOperation"),
                            seekOperation.toString()));
        }

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<SeekBasedResourceCollection<InvoiceLineItem>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetReconciliationLineItems").getPath(),
                this.getContext()),
            headers,
            parameters);
    }
}
