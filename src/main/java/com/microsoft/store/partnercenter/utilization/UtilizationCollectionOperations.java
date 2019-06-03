// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.utilization;

import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class UtilizationCollectionOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements IUtilizationCollection
{
	
    /**
     * A reference to Azure utilization collection object.
     */
    private IAzureUtilizationCollection azureUtilizationOperations;

	/**
	 * Initializes a new instance of the UtilizationCollectionOperations class.
	 * @param rootPartnerOperations The root partner operations.
	 * @param customerId The customer identifier.
	 * @param subscriptionId The subscription identifer.
	 */
	public UtilizationCollectionOperations(IPartner rootPartnerOperations, String customerId, String subscriptionId)
	{
		super(rootPartnerOperations, new Tuple<String, String>(customerId, subscriptionId));

		if (StringHelper.isNullOrWhiteSpace(customerId))
        {
            throw new IllegalArgumentException("customerId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(subscriptionId))
        {
            throw new IllegalArgumentException("subscriptionId must be set");
        }
        
        this.azureUtilizationOperations = 
        		new AzureUtilizationCollectionOperations
        		(
        			this.getPartner(),
        			this.getContext().getItem1(),
        			this.getContext().getItem2()
        		);
	}

	/**
	 * Gets the Azure subscription utilization behavior.
	 * 
	 * @return the Azure subscription utilization behavior.
	 */
	@Override
	public IAzureUtilizationCollection getAzure()
	{
		return this.azureUtilizationOperations;
	}
}