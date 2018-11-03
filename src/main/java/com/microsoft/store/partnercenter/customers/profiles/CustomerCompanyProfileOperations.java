// -----------------------------------------------------------------------
// <copyright file="CustomerCompanyProfileOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.profiles;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.customers.CustomerCompanyProfile;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements the customer company profile operations.
 */
public class CustomerCompanyProfileOperations
    extends BasePartnerComponentString
    implements ICustomerReadonlyProfile<CustomerCompanyProfile>
{
    /**
     * Initializes a new instance of the CustomerCompanyProfileOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer tenant identifer.
     */
    public CustomerCompanyProfileOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId cannot be null" );
        }
    }

    /**
     * Gets the customer's company profile.
     * 
     * @return The customer's company profile.
     */
    @Override
    public CustomerCompanyProfile get()
    {
        PartnerServiceProxy<CustomerCompanyProfile, CustomerCompanyProfile> partnerServiceProxy =
            new PartnerServiceProxy<>( new TypeReference<CustomerCompanyProfile>()
            {
            }, 
            this.getPartner(), 
            MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerCompanyProfile" ).getPath(),
                this.getContext() ) );
                
        return partnerServiceProxy.get();
    }
}