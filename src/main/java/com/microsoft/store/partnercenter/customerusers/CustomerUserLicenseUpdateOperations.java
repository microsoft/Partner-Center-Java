// -----------------------------------------------------------------------
// <copyright file="CustomerUserLicenseUpdateOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customerusers;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.licenses.LicenseUpdate;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class CustomerUserLicenseUpdateOperations 
	extends BasePartnerComponent<Tuple<String, String>> 
	implements ICustomerUserLicenseUpdates
{
	/**
	 * Initializes a new instance of the CustomerUserLicenseUpdateOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer identifier.
	 * @param userId The user identifier.
	 */
	public CustomerUserLicenseUpdateOperations( IPartner rootPartnerOperations, String customerId, String userId )
	{
		super( rootPartnerOperations, new Tuple<String, String>( customerId, userId ) );
		if ( StringHelper.isNullOrWhiteSpace( customerId ) )
		{
			throw new IllegalArgumentException( "customerId can't be null" );
		}
		if ( StringHelper.isNullOrWhiteSpace( userId ) )
		{
			throw new IllegalArgumentException( "userId can't be null" );
		}
	}

	/**
	 * Assign licenses to a user.
	 * This method serves three scenarios:
	 * 1. Add license to a customer user.
	 * 2. Remove license from a customer user.
	 * 3. Update existing license for a customer user.
	 * 
	 * @param entity License update object.
	 * @return Returned license update object
	 */
	@Override
	public LicenseUpdate create( LicenseUpdate entity )
	{
		if ( entity == null )
		{
			throw new IllegalArgumentException("The entity parameter cannot be null.");
		}

		return this.getPartner().getServiceClient().post(
			this.getPartner(), 
			new TypeReference<LicenseUpdate>(){},
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("SetCustomerUserLicenseUpdates").getPath(),
				this.getContext().getItem1(),
				this.getContext().getItem2()),
			entity);
	}
}