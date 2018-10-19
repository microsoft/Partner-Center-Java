// -----------------------------------------------------------------------
// <copyright file="IUtilizationCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.utilization;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.utils.Tuple;

public interface IUtilizationCollection
	extends IPartnerComponent<Tuple<String, String>>
{
	/**
	 * Gets the Azure subscription utilization behavior.
	 * 
	 * @return The Azure subscription utilization behavior.
	 */
	IAzureUtilizationCollection getAzure();
}
