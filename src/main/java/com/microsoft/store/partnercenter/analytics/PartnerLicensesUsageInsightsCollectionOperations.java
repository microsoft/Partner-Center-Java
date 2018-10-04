// -----------------------------------------------------------------------
// <copyright file="CustomerLicensesAnalyticsCollectionOperations.java" company="Microsoft">
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
import com.microsoft.store.partnercenter.models.analytics.PartnerLicensesUsageInsights;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * Implements the operations on partner licenses usage insights collection.
 */
public class PartnerLicensesUsageInsightsCollectionOperations
    extends BasePartnerComponentString
    implements IPartnerLicensesUsageInsightsCollection
{
    /**
     * Initializes a new instance of the PartnerLicensesUsageInsightsCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public PartnerLicensesUsageInsightsCollectionOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Retrieves the collection of partner's licenses' usage insights.
     * 
     * @return Collection of the partner's licenses' usage insights..
     */
    @Override
    public ResourceCollection<PartnerLicensesUsageInsights> get()
    {
        PartnerServiceProxy<PartnerLicensesUsageInsights, ResourceCollection<PartnerLicensesUsageInsights>> partnerServiceProxy =
            new PartnerServiceProxy<PartnerLicensesUsageInsights, ResourceCollection<PartnerLicensesUsageInsights>>( 
                new TypeReference<ResourceCollection<PartnerLicensesUsageInsights>>()
                {
                }, 
                this.getPartner(), 
                MessageFormat.format( 
                    PartnerService.getInstance().getConfiguration().getApis().get( "PartnerLicensesUsageInsights" ).getPath(),
                    this.getContext() ) );
        
        return partnerServiceProxy.get();
    }
  }