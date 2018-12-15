// -----------------------------------------------------------------------
// <copyright file="CustomerQualificationOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.qualification;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.customers.CustomerQualification;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * This class implements the operations available on a customer's qualification.
 */
public class CustomerQualificationOperations
	extends BasePartnerComponentString
	implements ICustomerQualification
{
	/**
	 * Initializes a new instance of the CustomerQualificationOperationsclass.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer identifier.
	 */
	public CustomerQualificationOperations( IPartner rootPartnerOperations, String customerId )
	{
		super( rootPartnerOperations, customerId );

		if ( StringHelper.isNullOrEmpty( customerId ) )
		{
			throw new IllegalArgumentException("customerId must be set.");
		}
	}

	/**
	 * Gets the customer qualification.
	 * 
	 * @return The customer qualification.
	 */
	@Override
	public CustomerQualification get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<CustomerQualification>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerQualification").getPath(),
				this.getContext()));
	}

	/**
	 * Updates the customer qualification.
	 * 
	 * @param customerQualification Customer qualification to be updated.
	 * @return The updated customer qualification.
	 */
	@Override
	public CustomerQualification update( CustomerQualification customerQualification )
	{
		if ( customerQualification == null )
		{
			throw new IllegalArgumentException( "customerQualification null" );
		}
		
		return this.getPartner().getServiceClient().put(
			this.getPartner(),
			new TypeReference<CustomerQualification>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("UpdateCustomerQualification").getPath(),
				this.getContext()),
			customerQualification);
	}
}