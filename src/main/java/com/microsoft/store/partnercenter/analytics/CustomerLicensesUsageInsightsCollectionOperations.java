// -----------------------------------------------------------------------
// <copyright file="CustomerLicensesUsageInsightsCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.analytics;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.analytics.CustomerLicensesUsageInsights;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements the operations on customer licenses usage insights collection.
 */
public class CustomerLicensesUsageInsightsCollectionOperations
    extends BasePartnerComponentString
    implements ICustomerLicensesUsageInsightsCollection
{
    /**
     * Initializes a new instance of the CustomerLicensesUsageInsightsCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The identifier for the customer.
     */
    public CustomerLicensesUsageInsightsCollectionOperations(IPartner rootPartnerOperations, String customerId)
    {
        super( rootPartnerOperations, customerId );

        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set." );
        }
    }

    /**
     * Retrieves the collection of customer's licenses' deployment insights.
     * 
     * @return Collection of customer licenses deployment insights.
     */
    @Override
    public ResourceCollection<CustomerLicensesUsageInsights> get()
    {
        PartnerServiceProxy<CustomerLicensesUsageInsights, ResourceCollection<CustomerLicensesUsageInsights>> partnerServiceProxy =
            new PartnerServiceProxy<CustomerLicensesUsageInsights, ResourceCollection<CustomerLicensesUsageInsights>>( 
                new TypeReference<ResourceCollection<CustomerLicensesUsageInsights>>()
                {
                }, 
                this.getPartner(), 
                MessageFormat.format( 
                    PartnerService.getInstance().getConfiguration().getApis().get( "CusotmerLicensesUsageInsights" ).getPath(),
                    this.getContext() ) );
        
        return partnerServiceProxy.get();
    }
}