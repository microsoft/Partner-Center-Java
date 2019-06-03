// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.domains;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.exception.PartnerErrorCategory;
import com.microsoft.store.partnercenter.exception.PartnerException;

public class DomainOperations extends BasePartnerComponentString implements IDomain
 {
	/**
	 * Initializes a new instance of the DomainOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance
	 * @param domain The domain
	 */
	protected DomainOperations(IPartner rootPartnerOperations, String domain)
	{
		super(rootPartnerOperations, domain);
		
		if(domain == null || domain.trim().isEmpty())
		{
			throw new IllegalArgumentException("Domain string cannot be null or empty");
		}
	}

	/**
	 * Checks the availability of a domain.
	 * 
	 * @return A boolean value to indicate if the domain is available.
	 */
	@Override
	public boolean exists()
	{
		try
		{
			this.getPartner().getServiceClient().head(
				this.getPartner(),
				new TypeReference<String>(){}, 
				MessageFormat.format(
					PartnerService.getInstance().getConfiguration().getApis().get("CheckDomainAvailability").getPath(),
					this.getContext()));
		}
		catch(PartnerException ex)
		{
			if(ex.getErrorCategory().equals(PartnerErrorCategory.NOT_FOUND))
			{
				return false;
			}
			
			throw ex;
		}
		
		return true;
	}
}