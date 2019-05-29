// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.usage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.usage.CustomerMonthlyUsageRecord;

/**
 * Implements operations related to a partner's customers usage record.
 */
public class CustomerUsageRecordCollectionOperations
	extends BasePartnerComponentString
	implements ICustomerUsageRecordCollection
{
	/**
	 * Initializes a new instance of the CustomerUsageRecordCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
	public CustomerUsageRecordCollectionOperations( IPartner rootPartnerOperations )
	{
		super( rootPartnerOperations );
	}

	/**
	 * Retrieves the collection of customer monthly usage records for a partner.
	 * 
	 * @return The collection of customer monthly usage records.
	 */
	@Override
	public ResourceCollection<CustomerMonthlyUsageRecord> get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<CustomerMonthlyUsageRecord>>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerUsageRecords" ).getPath());
	}
}