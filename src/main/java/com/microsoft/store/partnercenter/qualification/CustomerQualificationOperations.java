// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.qualification;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.customers.CustomerQualification;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.validationcodes.ValidationCode;
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
	public CustomerQualificationOperations(IPartner rootPartnerOperations, String customerId)
	{
		super(rootPartnerOperations, customerId);

		if (StringHelper.isNullOrEmpty(customerId))
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
	public CustomerQualification update(CustomerQualification customerQualification)
	{
		if ( customerQualification == null )
		{
			throw new IllegalArgumentException("customerQualification must be set");
		}
		
		return this.getPartner().getServiceClient().put(
			this.getPartner(),
			new TypeReference<CustomerQualification>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("UpdateCustomerQualification").getPath(),
				this.getContext()),
			customerQualification);
	}

	/**
     * Updates the customer qualification. Used for GovernmentCommunityCloud with validation code after successful registration through Microsoft.
     * 
     * @param customerQualification The customer qualification value.
     * @param governmentCommunityCloudValidationCode Validation code necessary to complete only Government Community Cloud customer creation.
     * @return The updated customer qualification.
     */
	public CustomerQualification update(CustomerQualification customerQualification, ValidationCode governmentCommunityCloudValidationCode)
	{
		if (customerQualification == null)
		{
			throw new IllegalArgumentException("customerQualification must be set");
		}
		
		if(governmentCommunityCloudValidationCode == null)
		{
			throw new IllegalArgumentException("governmentCommunityCloudValidationCode must be set");
		}
		
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("UpdateCustomerQualification").getParameters().get("GovernmentCommunityCloudValidationCode"),
				governmentCommunityCloudValidationCode.getValidationId()
			) 
		);

		return this.getPartner().getServiceClient().put(
			this.getPartner(),
			new TypeReference<CustomerQualification>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("UpdateCustomerQualification").getPath(),
				this.getContext()),
			customerQualification);	
	}
}