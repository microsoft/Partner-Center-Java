// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.subscriptions;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.subscriptions.SupportContact;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * This class implements the operations for a customer's subscription support contact.
 */
public class SubscriptionSupportContactOperations 
	extends BasePartnerComponent<Tuple<String, String>>
	implements ISubscriptionSupportContact
{
	/**
	 * Initializes a new instance of the SubscriptionSupportContactOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId            The customer identifier.
	 * @param subscriptionId        The subscription identifier
	 */
	public SubscriptionSupportContactOperations( IPartner rootPartnerOperations, String customerId, String subscriptionId )
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
	 * Retrieves the support contact of the customer's subscription.
	 * 
	 * @return The subscription's support contact.
	 */
	public SupportContact get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<SupportContact>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetSubscriptionSupportContact").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2()));
	}

	/**
	 * Updates the support contact of the customer's subscription.
	 * 
	 * @param supportContact The support contact
	 * @return The updated support contact.
	 */
	public SupportContact update(SupportContact supportContact)
	{
		return this.getPartner().getServiceClient().put(
			this.getPartner(),
			new TypeReference<SupportContact>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("UpdateSubscriptionSupportContact").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2()),
			supportContact);
	}
}