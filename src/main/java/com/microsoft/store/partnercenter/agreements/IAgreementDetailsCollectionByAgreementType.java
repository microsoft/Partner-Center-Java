// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.agreements;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.agreements.AgreementMetaData;
import com.microsoft.store.partnercenter.models.agreements.AgreementType;

/**
 * Encapsulates the operations on the agreement metadata by agreement type collection.
 */
public interface IAgreementDetailsCollectionByAgreementType
        extends IPartnerComponent<AgreementType>,
        IEntireEntityCollectionRetrievalOperations<AgreementMetaData, ResourceCollection<AgreementMetaData>>
{
    /**
     * Retrieves all current agreement metadata for specified agreement type.
     *
     * @return A list of agreement details for specified agreement type.
     */
    ResourceCollection<AgreementMetaData> get();
}