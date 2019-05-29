// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.usage;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.usage.CustomerUsageSummary;

/**
 * This interface defines the operations available on a customer's usage summary.
 */
public interface ICustomerUsageSummary
    extends IPartnerComponentString, IEntityGetOperations<CustomerUsageSummary>
{
	/**
	 * Retrieves the customer usage summary.
	 * @return The customer usage summary.
	 */
    CustomerUsageSummary get();
}
