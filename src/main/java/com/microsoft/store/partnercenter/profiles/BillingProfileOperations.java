// -----------------------------------------------------------------------
// <copyright file="BillingProfileOperations.java" company="Microsoft">
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
import com.microsoft.store.partnercenter.models.partners.BillingProfile;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * The partner billing profile operations implementation.
 */
public class BillingProfileOperations
    extends BasePartnerComponentString
    implements IBillingProfile
{
    /**
     * Initializes a new instance of the BillingProfileOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public BillingProfileOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Retrieves the partner billing profile.
     * 
     * @return The partner billing profile.
     */
    @Override
    public BillingProfile get()
    {
        IPartnerServiceProxy<BillingProfile, BillingProfile> partnerServiceProxy =
            new PartnerServiceProxy<BillingProfile, BillingProfile>( new TypeReference<BillingProfile>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetPartnerBillingProfile" ).getPath(),
                                                        Locale.US ) );

        return partnerServiceProxy.get();
    }

    /**
     * Updates the partner billing profile.
     * 
     * @param updatePayload Payload of the update request.
     * @return Updated partner billing profile.
     */
    @Override
    public BillingProfile update( BillingProfile updatePayload )
    {
        IPartnerServiceProxy<BillingProfile, BillingProfile> partnerServiceProxy =
            new PartnerServiceProxy<BillingProfile, BillingProfile>( new TypeReference<BillingProfile>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "UpdatePartnerBillingProfile" ).getPath(),
                                                        Locale.US ) );

        return partnerServiceProxy.put( updatePayload );
    }

}
