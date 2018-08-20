// -----------------------------------------------------------------------
// <copyright file="EntitlementCollectionByEntitlementTypeOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.entitlements;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.entitlements.Entitlement;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Entitlement collection by entitlement type operations class.
 */
public class EntitlementCollectionByEntitlementTypeOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements IEntireEntityCollectionRetrievalOperations<Entitlement, ResourceCollection<Entitlement>>
{
    /**
     * Initializes a new instance of the {@link #EntitlementCollectionByEntitlementTypeOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            Identifier for the customer.
     * @param entitlementType       The type of entitlment.
     */
    public EntitlementCollectionByEntitlementTypeOperations( IPartner rootPartnerOperations, String customerId, String entitlementType )
    {
        super( rootPartnerOperations, new Tuple<String, String>(customerId, entitlementType) );

        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( entitlementType ) )
        {
            throw new IllegalArgumentException( "entitlementType must be set" );
        }
    }

    /***
     * Retrieves entitlement collection with the given entitlement type.
     * 
     * @return: The entitlement collection with the given entitlement type.
     */
    @Override
    public ResourceCollection<Entitlement> get()
    {
        IPartnerServiceProxy<Entitlement, ResourceCollection<Entitlement>> partnerServiceProxy = new PartnerServiceProxy<Entitlement, ResourceCollection<Entitlement>>(
                new TypeReference<ResourceCollection<Entitlement>>() {
                }, this.getPartner(),
                MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("GetEntitlements").getPath(),
                        this.getContext().getItem1() ));

        partnerServiceProxy.getUriParameters().add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get( "GetEntitlements" ).getParameters().get( "EntitlementType" ),
                    this.getContext().getItem2() ));

        return partnerServiceProxy.get();
    }
}