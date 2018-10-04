// -----------------------------------------------------------------------
// <copyright file="ConfigurationPolicyOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.devicesdeployment.ConfigurationPolicy;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Implements operations that apply to configuration policy.
 */
public class ConfigurationPolicyOperations 
    extends BasePartnerComponent<Tuple<String, String>> implements IConfigurationPolicy 
{
    /**
     * Initializes a new instance of the ConfigurationPolicyOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            Identifier for the customer.
     * @param policyId              The policy identifier.
     */
    public ConfigurationPolicyOperations(IPartner rootPartnerOperations, String customerId, String policyId) {
        super(rootPartnerOperations, new Tuple<String, String>(customerId, policyId));

        if (StringHelper.isNullOrWhiteSpace(customerId)) {
            throw new IllegalArgumentException("customerId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(policyId)) {
            throw new IllegalArgumentException("policyId must be set");
        }
    }
    /**
     * Retrieves devices batch upload status of the customer.
     * 
     * @return Devices batch upload status.
     */
    @Override
    public ConfigurationPolicy get() 
    {
        IPartnerServiceProxy<ConfigurationPolicy, ConfigurationPolicy> partnerServiceProxy = new PartnerServiceProxy<ConfigurationPolicy, ConfigurationPolicy>(
                new TypeReference<ConfigurationPolicy>() {
                }, this.getPartner(),
                MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("GetConfigurationPolicy").getPath(),
                        this.getContext().getItem1(), this.getContext().getItem2()));

        return partnerServiceProxy.get();
    }

    /***
     *  Patches the configuration policy.
     * 
     * @param policy The policy to be updated.
     * @return The updated configuration policy.
     */
    @Override
    public ConfigurationPolicy patch(ConfigurationPolicy policy)
    {
        IPartnerServiceProxy<ConfigurationPolicy, ConfigurationPolicy> partnerServiceProxy = new PartnerServiceProxy<ConfigurationPolicy, ConfigurationPolicy>(
            new TypeReference<ConfigurationPolicy>() {
            }, this.getPartner(),
            MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("UpdateConfigurationPolicy").getPath(),
                    this.getContext().getItem1(), this.getContext().getItem2()));

        return partnerServiceProxy.put(policy);
    }

    /***
     *  Deletes the configuration policy.
     */
    public void delete()
    {
        IPartnerServiceProxy<ConfigurationPolicy, ConfigurationPolicy> partnerServiceProxy = new PartnerServiceProxy<ConfigurationPolicy, ConfigurationPolicy>(
            new TypeReference<ConfigurationPolicy>() {
            }, this.getPartner(),
            MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("UpdateConfigurationPolicy").getPath(),
                    this.getContext().getItem1(), this.getContext().getItem2()));

        partnerServiceProxy.delete();
    }
}