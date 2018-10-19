// -----------------------------------------------------------------------
// <copyright file="ICustomerServiceCostsCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.servicecosts;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.servicecosts.ServiceCostsBillingPeriod;

/**
 * Holds customer service costs behavior.
 */
public interface ICustomerServiceCostsCollection
    extends IPartnerComponentString
{
    /**
     * Obtains the service cost operations by billing period.
     * 
     * @param billingPeriod The billing period.
     * @return The service cost operations.
     */
    IServiceCostsCollection byBillingPeriod(ServiceCostsBillingPeriod billingPeriod);
}