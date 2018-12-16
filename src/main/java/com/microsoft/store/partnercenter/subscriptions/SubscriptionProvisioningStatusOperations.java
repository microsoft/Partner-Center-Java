// -----------------------------------------------------------------------
// <copyright file="SubscriptionProvisioningStatusOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.subscriptions;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.subscriptions.SubscriptionProvisioningStatus;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements getting customer subscription provisioning status details for a given subscription.
 */
public class SubscriptionProvisioningStatusOperations 
	extends BasePartnerComponent<Tuple<String, String>>
	implements ISubscriptionProvisioningStatus
{
	/**
	 * Initializes a new instance of the SubscriptionProvisioningStatusOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId            The customer identifier.
	 * @param subscriptionId        The subscription identifier
	 */
	public SubscriptionProvisioningStatusOperations( IPartner rootPartnerOperations, String customerId, String subscriptionId )
	{
		super( rootPartnerOperations, new Tuple<String, String>( customerId, subscriptionId ) );

		if ( StringHelper.isNullOrWhiteSpace( customerId ) )
		{
			throw new IllegalArgumentException( "customerId must be set." );
		}

		if ( StringHelper.isNullOrWhiteSpace( subscriptionId ) )
		{
			throw new IllegalArgumentException( "subscriptionId must be set." );
		}
	}

	/**
	 * Retrieves all subscription provisioning status details.
	 * 
	 * @return The subscription provisioning status details.
	 */
	public SubscriptionProvisioningStatus get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<SubscriptionProvisioningStatus>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetSubscriptionProvisioningStatus").getPath(),
				this.getContext().getItem1(),
				this.getContext().getItem2()));
	}
}