// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.profiles;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.customers.CustomerBillingProfile;
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
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<CustomerBillingProfile>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerBillingProfile").getPath(),
				this.getContext()));
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
		
		return this.getPartner().getServiceClient().put(
			this.getPartner(),
			new TypeReference<CustomerBillingProfile>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("UpdateCustomerBillingProfile").getPath(),
				this.getContext()),
			billingProfile);
	}
}