// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.enumerators;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.factory.IResourceCollectionEnumeratorFactory;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.utilizations.AzureUtilizationRecord;

/**
 * Groups all supported utilization record enumerators for usage based subscriptions.
 */
public interface IUtilizationCollectionEnumeratorContainer
	extends IPartnerComponentString
{
    /**
     * Gets a factory that creates Azure utilization record collection enumerators.
     * 
     * @return A factory that creates Azure utilization record collection enumerators.
     */
    IResourceCollectionEnumeratorFactory<ResourceCollection<AzureUtilizationRecord>> getAzure();
}