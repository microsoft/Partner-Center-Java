// -----------------------------------------------------------------------
// <copyright file="SubscriptionRegistrationOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.subscriptions;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

import okhttp3.Response;

/**
 * This class implements the operations available on a customer's subscription registration.
 */
public class SubscriptionRegistrationOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements ISubscriptionRegistration
{
    /**
     * Initializes a new instance of the SubscriptionRegistrationOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            The customer identifier.
     * @param subscriptionId        The subscription identifier
     */
    public SubscriptionRegistrationOperations( IPartner rootPartnerOperations, String customerId, String subscriptionId )
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
     * Register a subscription to enable Azure Reserved instance purchase.
     * 
     * @return The location which indicates the URL of the API to query for status.
     */
    public String register()
    {
        Response response = this.getPartner().getServiceClient().post(
            this.getPartner(), 
            new TypeReference<Response>(){}, 
            MessageFormat.format(
                PartnerService.getInstance().getConfiguration().getApis().get("UpdateSubscriptionRegistrationStatus").getPath(),
                this.getContext().getItem1(), 
                this.getContext().getItem2()),
            "success");
        
        return response.header("location");
    }
}