// -----------------------------------------------------------------------
// <copyright file="CustomerUserRoleCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customerusers;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.roles.DirectoryRole;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class CustomerUserRoleCollectionOperations 
	extends BasePartnerComponent<Tuple<String,String>> 
	implements ICustomerUserRoleCollection 
{

	/**
	 * Initializes a new instance of the CustomerUserRoleCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer identifier.
	 * @param userId The user identifier.
	 */
	public CustomerUserRoleCollectionOperations( IPartner rootPartnerOperations, String customerId, String userId )
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

	@Override
	public ResourceCollection<DirectoryRole> get() 
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<DirectoryRole>>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("CustomerUserDirectoryRoles").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2()));
	}
}