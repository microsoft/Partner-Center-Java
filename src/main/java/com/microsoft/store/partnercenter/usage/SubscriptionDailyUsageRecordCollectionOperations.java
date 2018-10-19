// -----------------------------------------------------------------------
// <copyright file="SubscriptionDailyUsageRecordCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.usage.SubscriptionDailyUsageRecord;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements operations related to a single subscription daily usage records.
 */
public class SubscriptionDailyUsageRecordCollectionOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements ISubscriptionDailyUsageRecordCollection
{
    /**
     * Initializes a new instance of the SubscriptionDailyUsageRecordCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param subscriptionId The subscription identifier.
     */
    public SubscriptionDailyUsageRecordCollectionOperations( IPartner rootPartnerOperations,
                                                             String customerId, String subscriptionId )
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
     * Retrieves the subscription daily usage records.
     * 
     * @return Collection of subscription daily usage records.
     */
    @Override
    public ResourceCollection<SubscriptionDailyUsageRecord> get()
    {
        PartnerServiceProxy<SubscriptionDailyUsageRecord, ResourceCollection<SubscriptionDailyUsageRecord>> partnerServiceProxy =
            new PartnerServiceProxy<>( new TypeReference<ResourceCollection<SubscriptionDailyUsageRecord>>()
            {
            }, 
            this.getPartner(),
            MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get( "GetSubscriptionDailyUsageRecords" ).getPath(),
                this.getContext().getItem1(), 
                this.getContext().getItem2()));

        return partnerServiceProxy.get();
    }
}