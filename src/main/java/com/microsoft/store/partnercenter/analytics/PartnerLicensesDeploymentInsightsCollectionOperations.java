// -----------------------------------------------------------------------
// <copyright file="CustomerLicensesAnalyticsCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.analytics;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.analytics.PartnerLicensesDeploymentInsights;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * Implements the operations on partner licenses deployment insights collection.
 */
public class PartnerLicensesDeploymentInsightsCollectionOperations
    extends BasePartnerComponentString
    implements IPartnerLicensesDeploymentInsightsCollection
{
    /**
     * Initializes a new instance of the PartnerLicensesDeploymentInsightsCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public PartnerLicensesDeploymentInsightsCollectionOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Retrieves the collection of partner's licenses' deployment insights.
     * 
     * @return Collection of partner's licenses' deployment insights.
     */
    @Override
    public ResourceCollection<PartnerLicensesDeploymentInsights> get()
    {
        PartnerServiceProxy<PartnerLicensesDeploymentInsights, ResourceCollection<PartnerLicensesDeploymentInsights>> partnerServiceProxy =
            new PartnerServiceProxy<>( 
                new TypeReference<ResourceCollection<PartnerLicensesDeploymentInsights>>()
                {
                }, 
                this.getPartner(), 
                MessageFormat.format( 
                    PartnerService.getInstance().getConfiguration().getApis().get( "PartnerLicensesDeploymentInsights" ).getPath(),
                    this.getContext() ) );
        
        return partnerServiceProxy.get();
    }
  }