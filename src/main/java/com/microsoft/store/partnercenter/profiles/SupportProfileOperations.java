// -----------------------------------------------------------------------
// <copyright file="SupportProfileOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.profiles;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.partners.SupportProfile;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * The partner support profile operations implementation.
 */
public class SupportProfileOperations
    extends BasePartnerComponentString
    implements ISupportProfile
{
    /**
     * Initializes a new instance of the SupportProfileOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public SupportProfileOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Retrieves the partner support profile.
     * 
     * @return The partner support profile.
     */
    @Override
    public SupportProfile get()
    {
        IPartnerServiceProxy<SupportProfile, SupportProfile> partnerServiceProxy =
            new PartnerServiceProxy<SupportProfile, SupportProfile>( new TypeReference<SupportProfile>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetSupportProfile" ).getPath(),
                                                        Locale.US ) );

        return partnerServiceProxy.get();
    }

    /**
     * Updates the Partner Support Profile
     * 
     * @param updatePayload Payload of the update request
     * @return Updated SupportProfile
     */
    @Override
    public SupportProfile update( SupportProfile updatePayload )
    {
        IPartnerServiceProxy<SupportProfile, SupportProfile> partnerServiceProxy =
            new PartnerServiceProxy<SupportProfile, SupportProfile>( new TypeReference<SupportProfile>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "UpdateSupportProfile" ).getPath(),
                                                        Locale.US ) );

        return partnerServiceProxy.put( updatePayload );
    }

}
