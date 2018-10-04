// -----------------------------------------------------------------------
// <copyright file="ManagedServiceCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.managedservices;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.managedservices.ManagedService;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements a customer's managed services operations.
 */
public class ManagedServiceCollectionOperations
    extends BasePartnerComponentString
    implements IManagedServiceCollection
{
    /**
     * Initializes a new instance of the ManagedServiceCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer Id.
     */
    public ManagedServiceCollectionOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }

    }

    /**
     * Gets managed services for a customer.
     * 
     * @return The customer's managed services.
     */
    @Override
    public ResourceCollection<ManagedService> get()
    {

        IPartnerServiceProxy<ManagedService, ResourceCollection<ManagedService>> partnerServiceProxy =
            new PartnerServiceProxy<ManagedService, ResourceCollection<ManagedService>>( new TypeReference<ResourceCollection<ManagedService>>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerManagedServices" ).getPath(),
                                                        this.getContext(), Locale.US ) );
        return partnerServiceProxy.get();
    }

}
