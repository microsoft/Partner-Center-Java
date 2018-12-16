// -----------------------------------------------------------------------
// <copyright file="ServiceCostsCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.servicecosts;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.servicecosts.ServiceCostLineItem;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the behavior of the customer service cost line items as a whole.
 */
public class ServiceCostLineItemsOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements IServiceCostLineItemsCollection
{
	/**
	 * Initializes a new instance of the ServiceCostLineItemsOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param context The context, including customer id and billing period..
	 */
	public ServiceCostLineItemsOperations( IPartner rootPartnerOperations, Tuple<String, String> context  )
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
	public ResourceCollection<ServiceCostLineItem> get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<ServiceCostLineItem>>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerServiceCostLineItems").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2()));
	}
}