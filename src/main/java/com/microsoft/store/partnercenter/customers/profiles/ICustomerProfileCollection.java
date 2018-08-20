// -----------------------------------------------------------------------
// <copyright file="ICustomerProfileCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.profiles;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.customers.CustomerBillingProfile;
import com.microsoft.store.partnercenter.models.customers.CustomerCompanyProfile;

/**
 * Represents customer profiles behavior.
 */
public interface ICustomerProfileCollection
    extends IPartnerComponentString
{
    /**
     * Gets the customer's billing profile operations.
     */
    ICustomerProfile<CustomerBillingProfile> getBilling();

    /**
     * Gets the customer's company profile operations.
     */
    ICustomerReadonlyProfile<CustomerCompanyProfile> getCompany();

}
