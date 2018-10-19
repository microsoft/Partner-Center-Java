// -----------------------------------------------------------------------
// <copyright file="CustomerLicensesAnalyticsCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;

/**
 * Implements the operations on a customer licenses analytics collection.
 */
public class PartnerLicensesAnalyticsCollectionOperations
    extends BasePartnerComponentString
    implements IPartnerLicensesAnalyticsCollection
{
    /**
     * A lazy reference to the partner's licenses' deployment insights collection operations.
     */
    private IPartnerLicensesDeploymentInsightsCollection deployments;

    /**
     * A lazy reference to the partner's licenses' usage insights collection operations.
     */
    private IPartnerLicensesUsageInsightsCollection usage;

    /**
     * Initializes a new instance of the PartnerLicensesAnalyticsCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public PartnerLicensesAnalyticsCollectionOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );

        deployments = new PartnerLicensesDeploymentInsightsCollectionOperations( this.getPartner() );
        usage = new PartnerLicensesUsageInsightsCollectionOperations( this.getPartner() );
    }

    /**
     * Gets the partner's licenses' deployment insights collection operations.
     *
     * @return The partner's licenses' deployment insights collection operations.
     */
    @Override
    public IPartnerLicensesDeploymentInsightsCollection getDeployment()
    {
        return this.deployments;
    }

    /**
     * Gets the partner's licenses' usage insights collection operations.
     *
     * @return The partner's licenses' usage insights collection operations.
     */
    @Override
    public IPartnerLicensesUsageInsightsCollection getUsage()
    {
        return this.usage;
    }
  }