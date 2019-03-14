// -----------------------------------------------------------------------
// <copyright file="IEstimateCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponent;

/**
 * Represents the operations that can be done on the partner's estimate
 * collection.
 */
public interface IEstimateCollection
    extends IPartnerComponent<String>
{
    /**
     * Gets the estimate links of the recon line items.
     */
    IEstimateLink getLinks();
}