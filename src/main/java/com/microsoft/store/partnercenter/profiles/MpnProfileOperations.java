// -----------------------------------------------------------------------
// <copyright file="MpnProfileOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.profiles;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.partners.MpnProfile;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * Class which contains operations for Partner Network Profile
 */
public class MpnProfileOperations
    extends BasePartnerComponentString
    implements IMpnProfile
{
    /**
     * Initializes a new instance of the MpnProfileOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public MpnProfileOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Retrieves the logged in reseller's MpnProfile.
     * 
     * @return The partner network profile.
     */
    @Override
    public MpnProfile get()
    {
        IPartnerServiceProxy<MpnProfile, MpnProfile> partnerServiceProxy =
            new PartnerServiceProxy<>( new TypeReference<MpnProfile>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetMpnProfile" ).getPath(),
                                                        Locale.US ) );

        return partnerServiceProxy.get();
    }

    /**
     * Retrieves a MpnProfile by MPN Id.
     * 
     * @param mpnId The MPN Id.
     * @return The partner network profile.
     */
    @Override
    public MpnProfile get( String mpnId )
    {
        IPartnerServiceProxy<MpnProfile, MpnProfile> partnerServiceProxy =
            new PartnerServiceProxy<MpnProfile, MpnProfile>( new TypeReference<MpnProfile>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetMpnProfile" ).getPath(),
                                                        Locale.US ) );

        partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetMpnProfile" ).getParameters().get( "MpnId" ),
                                                                                      mpnId ) );

        return partnerServiceProxy.get();
    }

}
