// -----------------------------------------------------------------------
// <copyright file="CustomerProfileCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.profiles;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.customers.CustomerBillingProfile;
import com.microsoft.store.partnercenter.models.customers.CustomerCompanyProfile;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements customer profile collection operations.
 */
public class CustomerProfileCollectionOperations
    extends BasePartnerComponentString
    implements ICustomerProfileCollection
{
    /**
     * A lazy reference to a customer billing operations instance.
     */
    private ICustomerProfile<CustomerBillingProfile> billingProfileOperations;

    /**
     * A lazy reference to a customer company operations instance.
     */
    private ICustomerReadonlyProfile<CustomerCompanyProfile> companyProfileOperations;

    /**
     * Initializes a new instance of the CustomerProfileCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     */
    public CustomerProfileCollectionOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId can't be null" );
        }
    }

    /**
     * Gets the customer's billing profile operations.
     */
    @Override
    public ICustomerProfile<CustomerBillingProfile> getBilling()
    {
        if ( this.billingProfileOperations == null )
            this.billingProfileOperations =
                new CustomerBillingProfileOperations( this.getPartner(), this.getContext() );
        return this.billingProfileOperations;
    }

    /**
     * Gets the customer's company profile operations.
     */
    @Override
    public ICustomerReadonlyProfile<CustomerCompanyProfile> getCompany()
    {
        if ( this.companyProfileOperations == null )
            this.companyProfileOperations =
                new CustomerCompanyProfileOperations( this.getPartner(), this.getContext() );
        return this.companyProfileOperations;
    }

}
