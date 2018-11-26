// -----------------------------------------------------------------------
// <copyright file="ResourceUsageRecordCollectionOperations.java" company="Microsoft">
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
import com.microsoft.store.partnercenter.models.usage.AzureResourceMonthlyUsageRecord;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements operations related to a single subscription resource usage records.
 */
public class ResourceUsageRecordCollectionOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements IResourceUsageRecordCollection
{
    /**
     * Initializes a new instance of the ResourceUsageRecordCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param subscriptionId The subscription identifier
     */
    public ResourceUsageRecordCollectionOperations( IPartner rootPartnerOperations, String customerId,
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
     * Retrieves the subscription usage records.
     * 
     * @return Collection of subscription usage records.
     */
    @Override
    public ResourceCollection<AzureResourceMonthlyUsageRecord> get()
    {
        IPartnerServiceProxy<AzureResourceMonthlyUsageRecord, ResourceCollection<AzureResourceMonthlyUsageRecord>> partnerServiceProxy =
            new PartnerServiceProxy<>( new TypeReference<ResourceCollection<AzureResourceMonthlyUsageRecord>>()
            {
            }, 
            this.getPartner(), 
            MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get( "GetSubscriptionResourceUsageRecords" ).getPath(),
                    this.getContext().getItem1(), 
                    this.getContext().getItem2()));

        return partnerServiceProxy.get();
    }
}