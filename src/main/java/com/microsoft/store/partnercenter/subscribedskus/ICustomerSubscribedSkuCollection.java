// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.subscribedskus;

import java.util.List;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.licenses.LicenseGroupId;
import com.microsoft.store.partnercenter.models.licenses.SubscribedSku;

/**
 * Represents the behavior of the customers users
 */
public interface ICustomerSubscribedSkuCollection     
	extends IPartnerComponentString, 
	IEntireEntityCollectionRetrievalOperations<SubscribedSku, ResourceCollection<SubscribedSku>>
{
    /** 
     * Retrieves all the customer subscribed products.
     * 
     * @return All the customer subscribed products.
     */
    ResourceCollection<SubscribedSku> get();

    /** 
     * Retrieves all the customer subscribed products.
     * 
     * @param licenseGroupIds group identifiers.
     * @return All the customer subscribed products.
     */
    ResourceCollection<SubscribedSku> get(List<LicenseGroupId> licenseGroupIds);
}