// -----------------------------------------------------------------------
// <copyright file="ICustomerUsageRecordCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.usage.CustomerMonthlyUsageRecord;

/**
 * Defines the behavior of a customer usage record collection operations.
 */
public interface ICustomerUsageRecordCollection
    extends IPartnerComponentString,
    IEntireEntityCollectionRetrievalOperations<CustomerMonthlyUsageRecord, ResourceCollection<CustomerMonthlyUsageRecord>>
{
	/**
	 * Retrieves all customer usage records.
	 * @return The customer usage records.
	 */
    ResourceCollection<CustomerMonthlyUsageRecord> get();
}
