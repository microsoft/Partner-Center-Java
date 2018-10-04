// -----------------------------------------------------------------------
// <copyright file="LegalBusinessProfileOperations.java" company="Microsoft">
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
import com.microsoft.store.partnercenter.models.partners.LegalBusinessProfile;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * The legal business profile operations implementation.
 */
public class LegalBusinessProfileOperations
    extends BasePartnerComponentString
    implements ILegalBusinessProfile
{
    /**
     * Initializes a new instance of the LegalBusinessProfileOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public LegalBusinessProfileOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Retrieves the legal business profile.
     * 
     * @return The legal business profile.
     */
    @Override
    public LegalBusinessProfile get()
    {
        IPartnerServiceProxy<LegalBusinessProfile, LegalBusinessProfile> partnerServiceProxy =
            new PartnerServiceProxy<LegalBusinessProfile, LegalBusinessProfile>( new TypeReference<LegalBusinessProfile>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetLegalBusinessProfile" ).getPath(),
                                                        Locale.US ) );

        return partnerServiceProxy.get();
    }

    /**
     * Updates the Legal Business Profile.
     * 
     * @param legalBusinessProfile Payload of the update request.
     * @return Updated Legal Business Profile.
     */
    @Override
    public LegalBusinessProfile update( LegalBusinessProfile legalBusinessProfile )
    {
        IPartnerServiceProxy<LegalBusinessProfile, LegalBusinessProfile> partnerServiceProxy =
            new PartnerServiceProxy<LegalBusinessProfile, LegalBusinessProfile>( new TypeReference<LegalBusinessProfile>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetLegalBusinessProfile" ).getPath(),
                                                        Locale.US ) );

        return partnerServiceProxy.put( legalBusinessProfile );
    }

}
