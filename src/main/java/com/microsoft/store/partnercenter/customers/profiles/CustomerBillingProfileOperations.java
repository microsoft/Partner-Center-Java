// -----------------------------------------------------------------------
// <copyright file="CustomerBillingProfileOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.profiles;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.customers.CustomerBillingProfile;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements the customer billing profile operations.
 */
public class CustomerBillingProfileOperations
    extends BasePartnerComponentString
    implements ICustomerProfile<CustomerBillingProfile>
{
    /**
     * Initializes a new instance of the CustomerBillingProfileOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     */
    public CustomerBillingProfileOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId can't be null" );
        }
    }

    /**
     * Gets the customer's billing profile.
     * 
     * @return The customer's billing profile.
     */
    @Override
    public CustomerBillingProfile get()
    {
        PartnerServiceProxy<CustomerBillingProfile, CustomerBillingProfile> partnerServiceProxy =
            new PartnerServiceProxy<CustomerBillingProfile, CustomerBillingProfile>( new TypeReference<CustomerBillingProfile>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerBillingProfile" ).getPath(),
                                                        this.getContext() ) );
        return partnerServiceProxy.get();
    }

    /**
     * Updates the customer's billing profile.
     * 
     * @param billingProfile A customer billing profile with updated fields.
     * @return The updated customer billing profile.
     */
    @Override
    public CustomerBillingProfile update( CustomerBillingProfile billingProfile )
    {
        if ( billingProfile == null )
        {
            throw new IllegalArgumentException( "billingProfile null" );
        }
        PartnerServiceProxy<CustomerBillingProfile, CustomerBillingProfile> partnerServiceProxy =
            new PartnerServiceProxy<CustomerBillingProfile, CustomerBillingProfile>( new TypeReference<CustomerBillingProfile>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "UpdateCustomerBillingProfile" ).getPath(),
                                                        this.getContext() ) );
        return partnerServiceProxy.put( billingProfile );
    }
}