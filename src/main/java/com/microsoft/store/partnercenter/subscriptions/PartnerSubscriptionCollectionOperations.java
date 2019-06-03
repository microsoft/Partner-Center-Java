// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.subscriptions;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.subscriptions.Subscription;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements customer subscription operations grouped by a Microsoft partner.
 */
public class PartnerSubscriptionCollectionOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements IEntireEntityCollectionRetrievalOperations<Subscription, ResourceCollection<Subscription>>
{
	/**
	 * Initializes a new instance of the PartnerSubscriptionCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer identifier.
	 * @param partnerId The partner identifier.
	 */
	public PartnerSubscriptionCollectionOperations(IPartner rootPartnerOperations, String customerId, String partnerId)
	{
		super(rootPartnerOperations, new Tuple<String, String>(customerId, partnerId));
		
		if (StringHelper.isNullOrWhiteSpace(customerId))
		{
			throw new IllegalArgumentException("customerId must be set.");
		}

		if (StringHelper.isNullOrWhiteSpace(partnerId))
		{
			throw new IllegalArgumentException("partnerId must be set.");
		}

	}

	/**
	 * Gets the subscriptions for the given partner.
	 * 
	 * @return The partner subscriptions.
	 */
	@Override
	public ResourceCollection<Subscription> get()
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerSubscriptionsByPartner").getParameters().get("PartnerId"),
				this.getContext().getItem2()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Subscription>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerSubscriptionsByPartner").getPath(),
				this.getContext().getItem1()),
			parameters);
	}
}