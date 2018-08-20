// -----------------------------------------------------------------------
// <copyright file="SubscriptionUsageSummaryOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.usage.SubscriptionUsageSummary;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * This class implements the operations for a customer's subscription.
 */
public class SubscriptionUsageSummaryOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements ISubscriptionUsageSummary
{
    /**
     * Initializes a new instance of the {@link #SubscriptionUsageSummaryOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer Id.
     * @param subscriptionId The subscription id.
     */
    public SubscriptionUsageSummaryOperations( IPartner rootPartnerOperations, String customerId,
                                               String subscriptionId )
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
     * Gets the subscription usage summary.
     * 
     * @return The subscription usage summary.
     */
    @Override
    public SubscriptionUsageSummary get()
    {

        PartnerServiceProxy<SubscriptionUsageSummary, SubscriptionUsageSummary> partnerServiceProxy =
            new PartnerServiceProxy<SubscriptionUsageSummary, SubscriptionUsageSummary>( new TypeReference<SubscriptionUsageSummary>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetSubscriptionUsageSummary" ).getPath(),
                                                        this.getContext().getItem1(), this.getContext().getItem2(),
                                                        Locale.US ) );
        return partnerServiceProxy.get();
    }

}
