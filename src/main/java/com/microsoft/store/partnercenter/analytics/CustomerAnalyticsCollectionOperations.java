// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.analytics;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements the operations on a Customer analytics collection.
 */
public class CustomerAnalyticsCollectionOperations
    extends BasePartnerComponentString
    implements ICustomerAnalyticsCollection
{
    /**
     * A lazy reference to the current customer's licenses analytics collection operations.
     */
    private ICustomerLicensesAnalyticsCollection licenses;

    /**
     * Initializes a new instance of the CustomerAnalyticsCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The identifier of the customer.
     */
    public CustomerAnalyticsCollectionOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );
       
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }

        licenses = new CustomerLicensesAnalyticsCollectionOperations( this.getPartner(), this.getContext() );
    }

    /**
     * Gets the customer's licenses analytics collection.
     *
     * @return The customer's licenses analytics collection.
     */
    @Override
    public ICustomerLicensesAnalyticsCollection getLicenses()
    {
        return this.licenses;
    }
  }