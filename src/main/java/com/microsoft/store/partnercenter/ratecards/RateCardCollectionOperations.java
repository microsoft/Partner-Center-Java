// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.ratecards;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;

public class RateCardCollectionOperations extends BasePartnerComponentString implements IRateCardCollection {

	private IAzureRateCard __azureRateCardOperations;
	
	/**
	 * Initializes a new instance of the RateCardCollectionOperationsclass.
	 * @param rootPartnerOperations The root partner operations instance.
	 */
	public RateCardCollectionOperations(IPartner rootPartnerOperations)
	{
		super(rootPartnerOperations);
		
		__azureRateCardOperations = new AzureRateCardOperations(rootPartnerOperations);
	}

	/**
	 * Gets the Azure rate card operations.
	 * 
	 * @return The Azure rate card operations.
	 */
	@Override
	public IAzureRateCard getAzure()
	{
		return __azureRateCardOperations;
	}
}