// -----------------------------------------------------------------------
// <copyright file="SubscriptionSupportContactOperations.java" company="Microsoft">
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
import com.microsoft.store.partnercenter.models.subscriptions.SupportContact;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
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
     * @param subscriptionId        The subscription id.
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
        IPartnerServiceProxy<SupportContact, SupportContact> partnerServiceProxy =
            new PartnerServiceProxy<>(
                new TypeReference<SupportContact>()
                {
                }, 
                this.getPartner(), 
                MessageFormat.format(
                    PartnerService.getInstance().getConfiguration().getApis().get( "GetSubscriptionSupportContact" ).getPath(),
                    this.getContext().getItem1(), this.getContext().getItem2(),
                    Locale.US ) );

        return partnerServiceProxy.get();
    }

    /**
     * Updates the support contact of the customer's subscription.
     * 
     * @param supportContact The support contact
     * @return The updated support contact.
     */
    public SupportContact update(SupportContact supportContact)
    {
        IPartnerServiceProxy<SupportContact, SupportContact> partnerServiceProxy =
        new PartnerServiceProxy<>(
            new TypeReference<SupportContact>()
            {
            }, 
            this.getPartner(), 
            MessageFormat.format(
                PartnerService.getInstance().getConfiguration().getApis().get( "UpdateSubscriptionSupportContact" ).getPath(),
                this.getContext().getItem1(), this.getContext().getItem2(),
                Locale.US ) );

        return partnerServiceProxy.put(supportContact);
    }
}