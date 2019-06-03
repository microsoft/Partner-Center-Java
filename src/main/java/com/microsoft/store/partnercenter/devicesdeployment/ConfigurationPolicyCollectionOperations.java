// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.devicesdeployment;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.devicesdeployment.ConfigurationPolicy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements operations that apply to configuration policy collections.
 */
public class ConfigurationPolicyCollectionOperations
	extends BasePartnerComponentString
	implements IConfigurationPolicyCollection
{
	/**
	 * Initializes a new instance of the ConfigurationPolicyCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId Identifier for the customer.
	 */
	public ConfigurationPolicyCollectionOperations(IPartner rootPartnerOperations, String customerId)
	{
		super(rootPartnerOperations, customerId);

		if (StringHelper.isNullOrWhiteSpace(customerId))
		{
			throw new IllegalArgumentException("customerId must be set");
		}
	}

	/**
	 * Retrieves a specific customer's devices batch upload status behavior.
	 * 
	 * @param policyId The policy identifier.
	 * @return The customer's devices batch upload status operations.
	 */
	@Override 
	public IConfigurationPolicy byId(String policyId)
	{
		return new ConfigurationPolicyOperations(this.getPartner(), this.getContext(), policyId);
	}

	/**
	 * Creates a new configuration policy.
	 * 
	 * @param newPolicy The new configuration policy information.
	 * @return The policy information that was just created.
	 */
	@Override
	public ConfigurationPolicy create(ConfigurationPolicy newPolicy)
	{
		if (newPolicy == null)
		{
			throw new IllegalArgumentException("The newPolicy parameter cannot be null");
		}

		return this.getPartner().getServiceClient().post(
			this.getPartner(), 
			new TypeReference<ConfigurationPolicy>(){},
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("CreateConfigurationPolicy").getPath(),
				this.getContext()),
			newPolicy);
	}

	/**
	 * Retrieves all configuration policies.
	 * 
	 * @return The collection of configuration policies.
	 */
	@Override
	public ResourceCollection<ConfigurationPolicy> get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<ConfigurationPolicy>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetConfigurationPolicies").getPath(),
				this.getContext()));
	}
}