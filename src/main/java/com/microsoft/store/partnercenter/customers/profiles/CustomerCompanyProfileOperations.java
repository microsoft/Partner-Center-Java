// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.profiles;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.customers.CustomerCompanyProfile;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements the customer company profile operations.
 */
public class CustomerCompanyProfileOperations
	extends BasePartnerComponentString
	implements ICustomerReadonlyProfile<CustomerCompanyProfile>
{
	/**
	 * Initializes a new instance of the CustomerCompanyProfileOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer tenant identifer.
	 */
	public CustomerCompanyProfileOperations(IPartner rootPartnerOperations, String customerId)
	{
		super(rootPartnerOperations, customerId);
		if (StringHelper.isNullOrWhiteSpace(customerId))
		{
			throw new IllegalArgumentException("customerId cannot be null");
		}
	}

	/**
	 * Gets the customer's company profile.
	 * 
	 * @return The customer's company profile.
	 */
	@Override
	public CustomerCompanyProfile get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<CustomerCompanyProfile>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerCompanyProfile").getPath(),
				this.getContext()));
	}
}