// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.servicerequests;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.servicerequests.SupportTopic;

/**
 * Represents the behavior of support topics. Support Topics operations are localizable.
 */
public interface ISupportTopicsCollection
    extends IPartnerComponentString,
    IEntireEntityCollectionRetrievalOperations<SupportTopic, ResourceCollection<SupportTopic>>
{
	/**
	 * Retrieves all the support topics.
	 * @return The support topics.
	 */
    ResourceCollection<SupportTopic> get();
}
