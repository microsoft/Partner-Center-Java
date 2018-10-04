// -----------------------------------------------------------------------
// <copyright file="CustomerUsageSummaryOperations.java" company="Microsoft">
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
import com.microsoft.store.partnercenter.models.usage.CustomerUsageSummary;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * This class implements the operations for a customer's summary of usage-based subscriptions.
 */
public class CustomerUsageSummaryOperations
    extends BasePartnerComponentString
    implements ICustomerUsageSummary
{
    /**
     * Initializes a new instance of the CustomerUsageSummaryOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     */
    public CustomerUsageSummaryOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set." );
        }

    }

    /**
     * Gets the customer usage summary.
     * 
     * @return The customer usage summary.
     */
    @Override
    public CustomerUsageSummary get()
    {
        IPartnerServiceProxy<CustomerUsageSummary, CustomerUsageSummary> partnerServiceProxy =
            new PartnerServiceProxy<CustomerUsageSummary, CustomerUsageSummary>( new TypeReference<CustomerUsageSummary>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerUsageSummary" ).getPath(),
                                                        this.getContext(), Locale.US ) );

        return partnerServiceProxy.get();
    }

}
