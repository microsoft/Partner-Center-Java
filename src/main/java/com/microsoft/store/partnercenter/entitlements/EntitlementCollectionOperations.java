// -----------------------------------------------------------------------
// <copyright file="EntitlementCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.entitlements;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.entitlements.Entitlement;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
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

	/***
	 * Retrieves the operations that can be applied on entitlements with a given entitlement type.
	 * 
	 * @param entitlementType The type of entiltment.
	 * @return The entitlement collection operations by entitlement type.
	 */
    @Override
     public IEntireEntityCollectionRetrievalOperations<Entitlement, ResourceCollection<Entitlement>> byEntitlementType(String entitlementType)
    {
        return new EntitlementCollectionByEntitlementTypeOperations(this.getPartner(), this.getContext(), entitlementType);
    }

    /***
     * Retrieves the entitlement collection.
     * 
     * @return The entitlement collection.
     */
    @Override
    public ResourceCollection<Entitlement> get()
    {
        IPartnerServiceProxy<Entitlement, ResourceCollection<Entitlement>> partnerServiceProxy = new PartnerServiceProxy<Entitlement, ResourceCollection<Entitlement>>(
                new TypeReference<ResourceCollection<Entitlement>>() {
                }, this.getPartner(),
                MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("GetEntitlements").getPath(),
                        this.getContext() ));

        return partnerServiceProxy.get();
    }
}