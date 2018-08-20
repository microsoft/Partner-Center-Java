// -----------------------------------------------------------------------
// <copyright file="SupportTopicsCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.servicerequests;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.servicerequests.SupportTopic;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * The operations that can be performed on support topics. Support Topics operations are localizable.
 */
public class SupportTopicsCollectionOperations
    extends BasePartnerComponentString
    implements ISupportTopicsCollection
{
    /**
     * Initializes a new instance of the {@link #SupportTopicsCollectionOperations} class with default locale.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public SupportTopicsCollectionOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Gets a collection of available support topics to create service request.
     * 
     * @return Collection of Support Topic Info.
     */
    @Override
    public ResourceCollection<SupportTopic> get()
    {
        IPartnerServiceProxy<SupportTopic, ResourceCollection<SupportTopic>> partnerServiceProxy =
            new PartnerServiceProxy<SupportTopic, ResourceCollection<SupportTopic>>( new TypeReference<ResourceCollection<SupportTopic>>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetServiceRequestSupportTopics" ).getPath(),
                                                        Locale.US ) );

        return partnerServiceProxy.get();
    }

}
