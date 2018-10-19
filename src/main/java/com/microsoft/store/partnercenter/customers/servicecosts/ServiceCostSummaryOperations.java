// -----------------------------------------------------------------------
// <copyright file="ServiceCostSummaryOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.servicecosts;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.servicecosts.ServiceCostsSummary;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * This class implements the operations for a customer's service costs summary.
 */
public class ServiceCostSummaryOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements IServiceCostSummary
{
    /**
     * Initializes a new instance of the ServiceCostSummaryOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param context The context, including customer id and billing period..
     */
    public ServiceCostSummaryOperations( IPartner rootPartnerOperations, Tuple<String, String> context  )
    {
        super( rootPartnerOperations, context );

        if ( context == null )
        {
            throw new IllegalArgumentException( "context must be set" );
        }
    }

    /**
     * Retrieves a customer's service cost line items.
     * 
     * @return The service cost line items.
     */
    @Override
	public ServiceCostsSummary get()
    {
        IPartnerServiceProxy<ServiceCostsSummary, ServiceCostsSummary> partnerServiceProxy =
        new PartnerServiceProxy<>( new TypeReference<ServiceCostsSummary>()
        {
        }, 
        this.getPartner(), 
        MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerServiceCostsSummary" ).getPath(),
            this.getContext().getItem1(), this.getContext().getItem2() ) );

        return partnerServiceProxy.get();
    }
}