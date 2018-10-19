// -----------------------------------------------------------------------
// <copyright file="IPartnerUsageSummary.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.usage.PartnerUsageSummary;

/**
 * This interface defines the operations available on a partner's usage summary.
 */
public interface IPartnerUsageSummary
    extends IPartnerComponentString, IEntityGetOperations<PartnerUsageSummary>
{
	/**
	 * Retrieves the partner's usage summary.
	 * @return The partner's usage summary.
	 */
    PartnerUsageSummary get();
}
