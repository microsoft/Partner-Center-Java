// -----------------------------------------------------------------------
// <copyright file="ConfigurationPolicyCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.devicesdeployment.ConfigurationPolicy;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
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
    public ConfigurationPolicyCollectionOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );

        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }
    }

	/***
	 * Retrieves a specific customer's devices batch upload status behavior.
	 * 
	 * @param trackingId The tracking identifier.
	 * @return The customer's devices batch upload status operations.
	 */
    @Override 
    public IConfigurationPolicy byId( String policyId )
    {
        return new ConfigurationPolicyOperations(this.getPartner(), this.getContext(), policyId);
    }

    /***
	 * Creates a new configuration policy.
	 * 
     * @param newPolicy The new configuration policy information.
	 * @return The policy information that was just created.
	 */
    @Override
    public ConfigurationPolicy create(ConfigurationPolicy newPolicy)
    {
        IPartnerServiceProxy<ConfigurationPolicy, ConfigurationPolicy> partnerServiceProxy = new PartnerServiceProxy<ConfigurationPolicy, ConfigurationPolicy>(
                new TypeReference<ConfigurationPolicy>() {
                }, this.getPartner(),
                MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("CreateConfigurationPolicy").getPath(),
                        this.getContext()));

        return partnerServiceProxy.post(newPolicy);
    }

    /***
	 * Retrieves all configuration policies.
	 * 
	 * @return The collection of configuration policies.
	 */
    @Override
    public ResourceCollection<ConfigurationPolicy> get()
    {
        IPartnerServiceProxy<ConfigurationPolicy, ResourceCollection<ConfigurationPolicy>> partnerServiceProxy = new PartnerServiceProxy<ConfigurationPolicy, ResourceCollection<ConfigurationPolicy>>(
                new TypeReference<ResourceCollection<ConfigurationPolicy>>() {
                }, this.getPartner(),
                MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("GetConfigurationPolicies").getPath(),
                        this.getContext()));

        return partnerServiceProxy.get();
    }
}