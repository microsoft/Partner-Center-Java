// -----------------------------------------------------------------------
// <copyright file="EntitlementCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.entitlements;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.entitlements.Entitlement;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Entitlement collection operations implementation class.
 */
public class EntitlementCollectionOperations
	extends BasePartnerComponentString
	implements IEntitlementCollection
{
	/**
	 * Initializes a new instance of the EntitlementCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId            Identifier for the customer.
	 */
	public EntitlementCollectionOperations( IPartner rootPartnerOperations, String customerId )
	{
		super( rootPartnerOperations, customerId );

		if ( StringHelper.isNullOrWhiteSpace( customerId ) )
		{
			throw new IllegalArgumentException( "customerId must be set" );
		}
	}

	/**
	 * Retrieves the operations that can be applied on entitlements with a given entitlement type.
	 * 
	 * @param entitlementType The type of entitlement.
	 * @return The entitlement collection operations by entitlement type.
	 */
	@Override
	 public IEntireEntityCollectionRetrievalOperations<Entitlement, ResourceCollection<Entitlement>> byEntitlementType(String entitlementType)
	{
		return new EntitlementCollectionByEntitlementTypeOperations(this.getPartner(), this.getContext(), entitlementType);
	}

    /**
     * Gets the entitlements for a customer.
     * 
     * @return The collection of entitlements for the customer.
     */
	@Override
	public ResourceCollection<Entitlement> get()
	{	
		return get(false);
	}

	/**
     * Gets the entitlements for a customer.
     * 
     * @param showExpiry A flag to indicate if the expiry date is required to be returned along with the entitlement (if applicable).
     * @return The collection of entitlements for the customer.
     */
	@Override
	public ResourceCollection<Entitlement> get(Boolean showExpiry)
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

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
				this.getContext()),
			parameters);
	}
}