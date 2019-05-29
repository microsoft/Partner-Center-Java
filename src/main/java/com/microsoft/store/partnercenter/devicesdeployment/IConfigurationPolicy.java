// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.devicesdeployment;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityDeleteOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityPatchOperations;
import com.microsoft.store.partnercenter.models.devicesdeployment.ConfigurationPolicy;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents all the operations that can be done on a configuration policy.
 */
public interface IConfigurationPolicy
	extends IPartnerComponent<Tuple<String, String>>, 
    IEntityGetOperations<ConfigurationPolicy>, IEntityPatchOperations<ConfigurationPolicy>, IEntityDeleteOperations<ConfigurationPolicy>
{
    /**
     *  Retrieves the configuration policy.
     * 
     * @return The configuration policy.
     */
    ConfigurationPolicy get();
    
    /**
     *  Patches the configuration policy.
     * 
     * @param policy The policy to be updated.
     * @return The updated configuration policy.
     */
    ConfigurationPolicy patch(ConfigurationPolicy policy);

    /**
     *  Deletes the configuration policy.
     */
    void delete();
}