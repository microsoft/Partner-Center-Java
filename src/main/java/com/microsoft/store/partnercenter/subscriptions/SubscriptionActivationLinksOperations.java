// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.subscriptions;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.orders.OrderLineItemActivationLink;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements getting customer subscription activation link resource collection
 * for a given subscription.
 */
public class SubscriptionActivationLinksOperations extends BasePartnerComponent<Tuple<String, String>>
		implements ISubscriptionActivationLinks {
	/**
	 * Initializes a new instance of the SubscriptionActivationLinksOperations
	 * class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId            The customer identifier.
	 * @param subscriptionId        The subscription identifier
	 */
	public SubscriptionActivationLinksOperations(IPartner rootPartnerOperations, String customerId,
			String subscriptionId) {
		super(rootPartnerOperations, new Tuple<String, String>(customerId, subscriptionId));

		if (StringHelper.isNullOrWhiteSpace(customerId)) {
			throw new IllegalArgumentException("customerId must be set.");
		}

		if (StringHelper.isNullOrWhiteSpace(subscriptionId)) {
			throw new IllegalArgumentException("subscriptionId must be set.");
		}
	}

	/**
	 * Gets the subscription activation links.
	 * 
	 * @return The subscription activation links.
	 */
	@Override
	public ResourceCollection<OrderLineItemActivationLink> get() 
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<OrderLineItemActivationLink>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetSubscriptionActivationLink").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2()));
	}
}