// -----------------------------------------------------------------------
// <copyright file="SubscriptionRegistrationStatusOperations.java" company="Microsoft">
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
import com.microsoft.store.partnercenter.models.subscriptions.SubscriptionRegistrationStatus;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * This class implements the operations available on a customer's subscription registration status.
 */
public class SubscriptionRegistrationStatusOperations 
    extends BasePartnerComponent<Tuple<String, String>>
    implements ISubscriptionRegistrationStatus
{
    /**
     * Initializes a new instance of the SubscriptionRegistrationStatusOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            The customer identifier.
     * @param subscriptionId        The subscription id.
     */
    public SubscriptionRegistrationStatusOperations( IPartner rootPartnerOperations, String customerId, String subscriptionId )
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
     * Retrieves a subscription registration status.
     * 
     * @return The subscription registration status details.
     */
    public SubscriptionRegistrationStatus get()
    {
        IPartnerServiceProxy<SubscriptionRegistrationStatus, SubscriptionRegistrationStatus> partnerServiceProxy =
            new PartnerServiceProxy<>(
                new TypeReference<SubscriptionRegistrationStatus>()
                {
                }, 
                this.getPartner(), 
                MessageFormat.format(
                    PartnerService.getInstance().getConfiguration().getApis().get( "GetSubscriptionRegistrationStatus" ).getPath(),
                    this.getContext().getItem1(), this.getContext().getItem2(),
                    Locale.US ) );

        return partnerServiceProxy.get();
    }
}