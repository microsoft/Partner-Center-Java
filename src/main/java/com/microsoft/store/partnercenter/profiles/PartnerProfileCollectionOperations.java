// -----------------------------------------------------------------------
// <copyright file="PartnerProfileCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.profiles;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;

/**
 * The partner profile collection operations implementation.
 */
public class PartnerProfileCollectionOperations
    extends BasePartnerComponentString
    implements IPartnerProfileCollection
{
    /**
     * The legal business profile operations.
     */
    private ILegalBusinessProfile legalBusinessProfile;

    /**
     * The partner network profile operations.
     */
    private IMpnProfile mpnProfile;

    /**
     * The partner support profile operations.
     */
    private ISupportProfile supportProfile;

    /**
     * The organization profile operations.
     */
    private IOrganizationProfile organizationProfile;

    /**
     * The partner billing profile operations.
     */
    private IBillingProfile partnerBillingProfile;

    /**
     * Initializes a new instance of the {@link #PartnerProfileCollectionOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public PartnerProfileCollectionOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Gets the operations available for the legal business profile.
     */
    @Override
    public ILegalBusinessProfile getLegalBusinessProfile()
    {
        if ( this.legalBusinessProfile == null )
        {
            this.legalBusinessProfile = new LegalBusinessProfileOperations( this.getPartner() );
        }
        return this.legalBusinessProfile;
    }

    /**
     * Gets the operations available for the partner network profile.
     */
    @Override
    public IMpnProfile getMpnProfile()
    {
        if ( this.mpnProfile == null )
        {
            this.mpnProfile = new MpnProfileOperations( this.getPartner() );
        }
        return this.mpnProfile;
    }

    /**
     * Gets the operations available for the partner network profile.
     */
    @Override
    public ISupportProfile getSupportProfile()
    {
        if ( this.supportProfile == null )
        {
            this.supportProfile = new SupportProfileOperations( this.getPartner() );
        }
        return this.supportProfile;
    }

    /**
     * Gets the operations available for the organization profile.
     */
    @Override
    public IOrganizationProfile getOrganizationProfile()
    {
        if ( this.organizationProfile == null )
        {
            this.organizationProfile = new OrganizationProfileOperations( this.getPartner() );
        }
        return this.organizationProfile;
    }

    /**
     * Gets the operations available for the partner billing profile.
     */
    @Override
    public IBillingProfile getBillingProfile()
    {
        if ( this.partnerBillingProfile == null )
        {
            this.partnerBillingProfile = new BillingProfileOperations( this.getPartner() );
        }
        return this.partnerBillingProfile;
    }

}
