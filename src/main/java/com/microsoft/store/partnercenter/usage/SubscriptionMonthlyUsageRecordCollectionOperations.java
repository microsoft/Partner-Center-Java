// -----------------------------------------------------------------------
// <copyright file="SubscriptionMonthlyUsageRecordCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.usage.SubscriptionMonthlyUsageRecord;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements operations related to a single subscription monthly usage records.
 */
public class SubscriptionMonthlyUsageRecordCollectionOperations
    extends BasePartnerComponentString
    implements ISubscriptionMonthlyUsageRecordCollection
{
    /**
     * Initializes a new instance of the SubscriptionMonthlyUsageRecordCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     */
    public SubscriptionMonthlyUsageRecordCollectionOperations( IPartner rootPartnerOperations,
                                                             String customerId )
    {
        super( rootPartnerOperations, customerId );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId should be set." );
        }
    }

    /**
     * Retrieves the subscription monthly usage records.
     * 
     * @return Collection of subscription monthly usage records.
     */
    @Override
    public ResourceCollection<SubscriptionMonthlyUsageRecord> get()
    {
        PartnerServiceProxy<SubscriptionMonthlyUsageRecord, ResourceCollection<SubscriptionMonthlyUsageRecord>> partnerServiceProxy =
            new PartnerServiceProxy<>( new TypeReference<ResourceCollection<SubscriptionMonthlyUsageRecord>>()
            {
            }, 
            this.getPartner(), 
            MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get( "GetSubscriptionUsageRecords" ).getPath(),
                this.getContext()));

        return partnerServiceProxy.get();
    }
}