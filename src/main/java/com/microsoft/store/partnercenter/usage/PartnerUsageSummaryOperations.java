// -----------------------------------------------------------------------
// <copyright file="PartnerUsageSummaryOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.usage.PartnerUsageSummary;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * This class implements the operations available on a partner's usage summary.
 */
public class PartnerUsageSummaryOperations
    extends BasePartnerComponentString
    implements IPartnerUsageSummary
{
    /**
     * Initializes a new instance of the PartnerUsageSummaryOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public PartnerUsageSummaryOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Gets the partner's usage summary.
     * 
     * @return The partner's usage summary.
     */
    @Override
    public PartnerUsageSummary get()
    {
        IPartnerServiceProxy<PartnerUsageSummary, PartnerUsageSummary> partnerServiceProxy =
            new PartnerServiceProxy<>( new TypeReference<PartnerUsageSummary>()
            {
            }, 
            this.getPartner(), 
            PartnerService.getInstance().getConfiguration().getApis().get( "GetPartnerUsageSummary" ).getPath());

        return partnerServiceProxy.get();
    }
}