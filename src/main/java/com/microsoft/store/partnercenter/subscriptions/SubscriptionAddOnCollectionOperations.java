// -----------------------------------------------------------------------
// <copyright file="SubscriptionAddOnCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.subscriptions;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.subscriptions.Subscription;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements operations related to a single subscription add-ons.
 */
public class SubscriptionAddOnCollectionOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements ISubscriptionAddOnCollection
{
    /**
     * Initializes a new instance of the SubscriptionAddOnCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param subscriptionId The subscription id.
     */
    public SubscriptionAddOnCollectionOperations( IPartner rootPartnerOperations, String customerId,
                                                  String subscriptionId )
    {
        super( rootPartnerOperations, new Tuple<String, String>( customerId, subscriptionId ) );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId should be set." );
        }

        if ( StringHelper.isNullOrWhiteSpace( subscriptionId ) )
        {
            throw new IllegalArgumentException( "subscriptionId should be set." );
        }

    }

    /**
     * Retrieves the add-on subscriptions.
     * 
     * @return Collection of add-on subscriptions.
     */
    @Override
    public ResourceCollection<Subscription> get()
    {
        PartnerServiceProxy<Subscription, ResourceCollection<Subscription>> partnerServiceProxy =
            new PartnerServiceProxy<>( new TypeReference<ResourceCollection<Subscription>>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetAddOnSubscriptions" ).getPath(),
                                                        this.getContext().getItem1(), this.getContext().getItem2(),
                                                        Locale.US ) );
        return partnerServiceProxy.get();
    }

}
