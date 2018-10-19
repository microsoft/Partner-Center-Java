// -----------------------------------------------------------------------
// <copyright file="PartnerSubscriptionCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.subscriptions;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.genericoperations.IEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.subscriptions.Subscription;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements customer subscription operations grouped by a Microsoft partner.
 */
public class PartnerSubscriptionCollectionOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements IEntityCollectionRetrievalOperations<Subscription, ResourceCollection<Subscription>>
{
    /**
     * Initializes a new instance of the PartnerSubscriptionCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param partnerId The partner Id.
     */
    public PartnerSubscriptionCollectionOperations( IPartner rootPartnerOperations, String customerId,
                                                    String partnerId )
    {
        super( rootPartnerOperations, new Tuple<String, String>( customerId, partnerId ) );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set." );
        }

        if ( StringHelper.isNullOrWhiteSpace( partnerId ) )
        {
            throw new IllegalArgumentException( "partnerId must be set." );
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
        return this.get( 0, Integer.MAX_VALUE );
    }

    /**
     * Gets a segment of the subscriptions for the given partner.
     * 
     * @param offset The starting index.
     * @param size The desired segment size.
     * @return The required subscriptions segment.
     */
    @Override
    public ResourceCollection<Subscription> get( int offset, int size )
    {
        PartnerServiceProxy<Subscription, ResourceCollection<Subscription>> partnerServiceProxy =
            new PartnerServiceProxy<>( new TypeReference<ResourceCollection<Subscription>>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerSubscriptionsByPartner" ).getPath(),
                                                        this.getContext().getItem1() ) );

        partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerSubscriptionsByPartner" ).getParameters().get( "PartnerId" ),
                                                                                      this.getContext().getItem2() ) );
        partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerSubscriptionsByPartner" ).getParameters().get( "Offset" ),
                                                                                      String.valueOf( offset ) ) );
        partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerSubscriptionsByPartner" ).getParameters().get( "Size" ),
                                                                                      String.valueOf( size ) ) );
        return partnerServiceProxy.get();
    }

}
