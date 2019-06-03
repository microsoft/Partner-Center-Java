// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.managedservices;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.managedservices.ManagedService;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements a customer's managed services operations.
 */
public class ManagedServiceCollectionOperations
	extends BasePartnerComponentString
	implements IManagedServiceCollection
{
	/**
	 * Initializes a new instance of the ManagedServiceCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer identifier.
	 */
	public ManagedServiceCollectionOperations(IPartner rootPartnerOperations, String customerId)
	{
		super(rootPartnerOperations, customerId);
		
		if (StringHelper.isNullOrWhiteSpace(customerId))
		{
			throw new IllegalArgumentException("customerId must be set");
		}
	}

	/**
	 * Gets managed services for a customer.
	 * 
	 * @return The customer's managed services.
	 */
	@Override
	public ResourceCollection<ManagedService> get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<ManagedService>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerManagedServices").getPath(),
				this.getContext()));
	}

}
