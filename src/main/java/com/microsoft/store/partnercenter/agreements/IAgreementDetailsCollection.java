// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.agreements;

import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.agreements.AgreementMetaData;

/**
 * Encapsulates the operations on the agreement metadata collection.
 */
public interface IAgreementDetailsCollection
{
    /**
     * Retrieves all current agreement metadata.
     *
     * @return The current agreement metadata.
     */
    ResourceCollection<AgreementMetaData> get();
}