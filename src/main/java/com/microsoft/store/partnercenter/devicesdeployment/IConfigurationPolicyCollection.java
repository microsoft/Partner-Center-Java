// -----------------------------------------------------------------------
// <copyright file="IBatchJobStatusCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.devicesdeployment.ConfigurationPolicy;

/**
 * RRepresents the operations that can be done on the partner's configuration policies.
 */
public interface IConfigurationPolicyCollection 
    extends IPartnerComponentString,
    IEntireEntityCollectionRetrievalOperations<ConfigurationPolicy,ResourceCollection<ConfigurationPolicy>>, IEntityCreateOperations<ConfigurationPolicy, ConfigurationPolicy>, IEntitySelector<String, IConfigurationPolicy>
{
	/**
	 * Retrieves a specific customer's devices batch upload status behavior.
	 * 
	 * @param policyId The policy identifier.
	 * @return The customer's devices batch upload status operations.
	 */
    IConfigurationPolicy byId( String policyId );

    /**
	 * Retrieves all configuration policies.
	 * 
	 * @return The collection of configuration policies.
	 */
    ResourceCollection<ConfigurationPolicy> get();
}