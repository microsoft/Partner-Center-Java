// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.invoices.InvoiceSummary;

/**
 * Represents the operations that can be done on invoice summary collection.
 */
public class InvoiceSummaryCollectionOperations
	extends BasePartnerComponentString
	implements IInvoiceSummaryCollection
{
	/**
	 * Initializes a new instance of the InvoiceSummaryCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The partner operations.
	 */
	public InvoiceSummaryCollectionOperations( IPartner rootPartnerOperations )
	{
		super( rootPartnerOperations, null );
	}

	/**
	 * Retrieves the invoice summary collection. This operation is currently only supported for user based credentials.
	 */
	public ResourceCollection<InvoiceSummary> get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<InvoiceSummary>>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetInvoiceSummaries").getPath());
	}
}