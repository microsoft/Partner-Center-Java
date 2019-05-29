// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.usage;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.usage.SubscriptionUsageSummary;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * This class implements the operations for a customer's subscription.
 */
public class SubscriptionUsageSummaryOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements ISubscriptionUsageSummary
{
	/**
	 * Initializes a new instance of the SubscriptionUsageSummaryOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer identifier.
	 * @param subscriptionId The subscription identifier
	 */
	public SubscriptionUsageSummaryOperations( IPartner rootPartnerOperations, String customerId,
											   String subscriptionId )
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
	 * Gets the subscription usage summary.
	 * 
	 * @return The subscription usage summary.
	 */
	@Override
	public SubscriptionUsageSummary get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<SubscriptionUsageSummary>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetSubscriptionUsageSummary").getPath(),
				this.getContext().getItem1(),
				this.getContext().getItem2()));
	}
}