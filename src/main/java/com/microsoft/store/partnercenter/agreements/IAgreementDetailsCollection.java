// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.agreements;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.agreements.AgreementMetaData;

/**
 * Encapsulates the operations on the agreement metadata collection.
 */
public interface IAgreementDetailsCollection
        extends IPartnerComponentString,
        IEntireEntityCollectionRetrievalOperations<AgreementMetaData, ResourceCollection<AgreementMetaData>>
{
    /**
     * Gets the agreement details.
     *
     * @return The current agreement metadata.
     */
    ResourceCollection<AgreementMetaData> get();

    /**
     * Retrieves the operations tied with a specified agreement type.
     *
     * @param agreementType The agreement type filter.
     * @return The available operations for agreement details.
     */
    IAgreementDetailsCollection byAgreementType(String agreementType);
}