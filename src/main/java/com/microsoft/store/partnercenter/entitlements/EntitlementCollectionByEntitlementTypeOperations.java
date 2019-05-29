// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.entitlements;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.entitlements.Entitlement;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Entitlement collection by entitlement type operations class.
 */
public class EntitlementCollectionByEntitlementTypeOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements IEntitlementCollectionByEntitlementType
{
	/**
	 * Initializes a new instance of the EntitlementCollectionByEntitlementTypeOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId            Identifier for the customer.
	 * @param entitlementType       The type of entitlement.
	 */
	public EntitlementCollectionByEntitlementTypeOperations( IPartner rootPartnerOperations, String customerId, String entitlementType )
	{
		super(rootPartnerOperations, new Tuple<String, String>(customerId, entitlementType));

		if (StringHelper.isNullOrWhiteSpace(customerId))
		{
			throw new IllegalArgumentException("customerId must be set");
		}

		if (StringHelper.isNullOrWhiteSpace(entitlementType))
		{
			throw new IllegalArgumentException("entitlementType must be set");
		}
	}

    /**
     * Gets an entitlement collection with the given entitlement type.
     * 
     * @return The collection of entitlements corresponding to a specific entitlement type for the customer.
     */
	@Override
	public ResourceCollection<Entitlement> get()
	{
		return get(false);
	}

	/**
     * Gets an entitlement collection with the given entitlement type.
     * 
     * @param showExpiry A flag to indicate if the expiry date is required to be returned along with the entitlement (if applicable).
     * @return The collection of entitlements corresponding to a specific entitlement type for the customer.
     */
	@Override
	public ResourceCollection<Entitlement> get(Boolean showExpiry)
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetEntitlements").getParameters().get("EntitlementType"),
				this.getContext().getItem2()
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetEntitlements").getParameters().get("ShowExpiry"),
				String.valueOf(showExpiry)
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Entitlement>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetEntitlements").getPath(),
				this.getContext().getItem1()),
			parameters);
	}
}