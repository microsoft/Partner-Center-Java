// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.analytics;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.analytics.PartnerLicensesUsageInsights;

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
        return this.getPartner().getServiceClient().get(
            this.getPartner(),
            new TypeReference<ResourceCollection<PartnerLicensesUsageInsights>>(){}, 
            PartnerService.getInstance().getConfiguration().getApis().get( "PartnerLicensesUsageInsights" ).getPath());
    }
  }