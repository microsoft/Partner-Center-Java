// -----------------------------------------------------------------------
// <copyright file="CustomerUsageRecordCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.usage.CustomerMonthlyUsageRecord;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * Implements operations related to a partner's customers usage record.
 */
public class CustomerUsageRecordCollectionOperations
    extends BasePartnerComponentString
    implements ICustomerUsageRecordCollection
{
    /**
     * Initializes a new instance of the CustomerUsageRecordCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public CustomerUsageRecordCollectionOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Retrieves the collection of customer monthly usage records for a partner.
     * 
     * @return The collection of customer monthly usage records.
     */
    @Override
    public ResourceCollection<CustomerMonthlyUsageRecord> get()
    {
        IPartnerServiceProxy<CustomerMonthlyUsageRecord, ResourceCollection<CustomerMonthlyUsageRecord>> partnerServiceProxy =
            new PartnerServiceProxy<CustomerMonthlyUsageRecord, ResourceCollection<CustomerMonthlyUsageRecord>>( new TypeReference<ResourceCollection<CustomerMonthlyUsageRecord>>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerUsageRecords" ).getPath(),
                                                        Locale.US ) );
        return partnerServiceProxy.get();
    }

}
