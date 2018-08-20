// -----------------------------------------------------------------------
// <copyright file="CustomerAvailabilityCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.servicecosts;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.servicecosts.ServiceCostsBillingPeriod;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Holds customer service costs behavior.
 */
public class CustomerServiceCostsCollectionOperations
    extends BasePartnerComponentString
    implements ICustomerServiceCostsCollection
{
    /**
     * Initializes a new instance of the {@link #CustomerServiceCostsCollectionOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId Identifier for the customer.
     */
    public CustomerServiceCostsCollectionOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );

        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }
    }

    /***
     * Obtains the service cost operations by billing period.
     * 
     * @param billingPeriod The billing period.
     * @return: The service cost operations.
     */
    @Override
    public IServiceCostsCollection byBillingPeriod(ServiceCostsBillingPeriod billingPeriod)
    {
        return new ServiceCostsCollectionOperations(this.getPartner(), this.getContext(), billingPeriod);
    }
}