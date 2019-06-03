// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.usage;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.usage.CustomerUsageSummary;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * This class implements the operations for a customer's summary of usage-based subscriptions.
 */
public class CustomerUsageSummaryOperations
	extends BasePartnerComponentString
	implements ICustomerUsageSummary
{
	/**
	 * Initializes a new instance of the CustomerUsageSummaryOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer identifier.
	 */
	public CustomerUsageSummaryOperations(IPartner rootPartnerOperations, String customerId)
	{
		super(rootPartnerOperations, customerId);

		if (StringHelper.isNullOrWhiteSpace(customerId))
		{
			throw new IllegalArgumentException("customerId must be set.");
		}
	}

	/**
	 * Gets the customer usage summary.
	 * 
	 * @return The customer usage summary.
	 */
	@Override
	public CustomerUsageSummary get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<CustomerUsageSummary>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerUsageSummary").getPath(),
				this.getContext()));
	}
}