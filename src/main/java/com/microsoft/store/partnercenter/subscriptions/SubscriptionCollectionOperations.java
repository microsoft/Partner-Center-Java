// -----------------------------------------------------------------------
// <copyright file="SubscriptionCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.subscriptions;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.subscriptions.Subscription;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.usage.ISubscriptionMonthlyUsageRecordCollection;
import com.microsoft.store.partnercenter.usage.SubscriptionMonthlyUsageRecordCollectionOperations;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * The customer subscriptions implementation.
 */
public class SubscriptionCollectionOperations
    extends BasePartnerComponentString
    implements ISubscriptionCollection
{
    /**
     * A lazy reference to the current customer's subscription usage records operations.
     */
    private ISubscriptionMonthlyUsageRecordCollection usageRecords;

    /**
     * Initializes a new instance of the SubscriptionCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer Id to whom the subscriptions belong.
     */
    public SubscriptionCollectionOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }
        usageRecords = new SubscriptionMonthlyUsageRecordCollectionOperations( this.getPartner(), this.getContext() );
    }

    /**
     * Obtains the subscription usage records behavior for the customer.
     *
     * @return The customer subscription usage records.
     */
    @Override
    public ISubscriptionMonthlyUsageRecordCollection getUsageRecords()
    {
        return this.usageRecords;
    }

    /**
     * Groups customer subscriptions by an order.
     *
     * @param orderId The order id.
     * @return The order subscriptions operations.
     */
    @Override
    public IEntireEntityCollectionRetrievalOperations<Subscription, ResourceCollection<Subscription>> byOrder( String orderId )
    {
        ParameterValidator.isValidUriQueryValue( orderId, "orderId is an invalid query value" );
        return new OrderSubscriptionCollectionOperations( this.getPartner(), this.getContext(), orderId );
    }

    /**
     * Groups customer subscriptions by a partner.
     *
     * @param partnerId The partner id.
     * @return The partner subscriptions operations.
     */
    @Override
    public IEntityCollectionRetrievalOperations<Subscription, ResourceCollection<Subscription>> byPartner( String partnerId )
    {
        ParameterValidator.isValidUriQueryValue( partnerId, "partnerId is an invalid query value" );
        return new PartnerSubscriptionCollectionOperations( this.getPartner(), this.getContext(), partnerId );
    }

    /**
     * Retrieves a specific customer subscription behavior.
     *
     * @param subscriptionId The subscription id.
     * @return The customer subscription.
     */
    @Override
    public ISubscription byId( String subscriptionId )
    {
        return new SubscriptionOperations( this.getPartner(), this.getContext(), subscriptionId );
    }

    //
    /**
     * Retrieves all subscriptions.
     * 
     * @return The subscriptions.
     */
    @Override
    public ResourceCollection<Subscription> get()
    {
        PartnerServiceProxy<Subscription, ResourceCollection<Subscription>> partnerServiceProxy =
            new PartnerServiceProxy<Subscription, ResourceCollection<Subscription>>( new TypeReference<ResourceCollection<Subscription>>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerSubscriptions" ).getPath(),
                                                        this.getContext(), Locale.US ) );
        return partnerServiceProxy.get();
    }
}