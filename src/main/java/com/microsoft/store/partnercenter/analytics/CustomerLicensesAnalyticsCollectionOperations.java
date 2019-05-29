// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements the operations on a customer licenses analytics collection.
 */
public class CustomerLicensesAnalyticsCollectionOperations
    extends BasePartnerComponentString
    implements ICustomerLicensesAnalyticsCollection
{
    /**
     * A lazy reference to the current customer's licenses deployment analytics.
     */
    private ICustomerLicensesDeploymentInsightsCollection deployments;

    /**
     * A lazy reference to the current customer's licenses usage analytics.
     */
    private ICustomerLicensesUsageInsightsCollection usage;

    /**
     * Initializes a new instance of the CustomerLicensesAnalyticsCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The identifier of the customer.
     */
    public CustomerLicensesAnalyticsCollectionOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );
       
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }

        deployments = new CustomerLicensesDeploymentInsightsCollectionOperations( this.getPartner(), this.getContext() );
        usage = new CustomerLicensesUsageInsightsCollectionOperations( this.getPartner(), this.getContext() );
    }

    /**
     * Gets the customer level licenses deployment analytics.
     *
     * @return The customer level licenses deployment analytics
     */
    @Override
    public ICustomerLicensesDeploymentInsightsCollection getDeployment()
    {
        return this.deployments;
    }

    /**
     * Gets the customer level licenses usage analytics.
     *
     * @return The customer level licenses usage analytics.
     */
    @Override
    public ICustomerLicensesUsageInsightsCollection getUsage()
    {
        return this.usage;
    }
  }