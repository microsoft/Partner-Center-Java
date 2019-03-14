// -----------------------------------------------------------------------
// <copyright file="IEstimateLinkCollectionByCurrency.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.invoices.EstimateLink;

/**
 * Holds operations that can be performed on estimate link collection that belong to a given currency.
 */
public interface IEstimateLinkCollectionByCurrency 
    extends IPartnerComponent<String>, IEntityGetOperations<ResourceCollection<EstimateLink>>
{
}