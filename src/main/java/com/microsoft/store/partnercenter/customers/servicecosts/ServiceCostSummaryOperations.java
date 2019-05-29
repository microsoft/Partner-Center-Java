// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.servicecosts;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.servicecosts.ServiceCostsSummary;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * This class implements the operations for a customer's service costs summary.
 */
public class ServiceCostSummaryOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements IServiceCostSummary
{
	/**
	 * Initializes a new instance of the ServiceCostSummaryOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param context The context, including customer id and billing period..
	 */
	public ServiceCostSummaryOperations( IPartner rootPartnerOperations, Tuple<String, String> context  )
	{
		super( rootPartnerOperations, context );

		if ( context == null )
		{
			throw new IllegalArgumentException( "context must be set" );
		}
	}

	/**
	 * Retrieves a customer's service cost line items.
	 * 
	 * @return The service cost line items.
	 */
	@Override
	public ServiceCostsSummary get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ServiceCostsSummary>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerServiceCostsSummary").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2()));
	}
}