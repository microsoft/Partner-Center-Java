// -----------------------------------------------------------------------
// <copyright file="PartnerAnalyticsCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;

/**
 * Implements the operations on partner analytics collection.
 */
public class PartnerAnalyticsCollectionOperations
    extends BasePartnerComponentString
    implements IPartnerAnalyticsCollection
{
    /**
     * A lazy reference to the operations on partner's licenses' analytics collection.
     */
    private IPartnerLicensesAnalyticsCollection licenses;

    /**
     * Initializes a new instance of the {@link #PartnerAnalyticsCollectionOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public PartnerAnalyticsCollectionOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );

        licenses = new PartnerLicensesAnalyticsCollectionOperations( this.getPartner() );
    }

    /**
     * Gets the operations on partner's licenses' analytics collection.
     *
     * @return The operations on partner's licenses' analytics collection.
     */
    @Override
    public IPartnerLicensesAnalyticsCollection getLicenses()
    {
        return this.licenses;
    }
  }