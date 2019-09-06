// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.agreements;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.agreements.Agreement;
import com.microsoft.store.partnercenter.models.agreements.AgreementType;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Encapsulates the operations on the Agreement collection by agreement type.
 */
public interface ICustomerAgreementCollectionByAgreementType
        extends IPartnerComponent<Tuple<String, AgreementType>>,
        IEntireEntityCollectionRetrievalOperations<Agreement, ResourceCollection<Agreement>>
{
    /**
     * Retrieves all agreements for specified agreement type.
     *
     * @return The agreements for specified agreement type.
     */
    ResourceCollection<Agreement> get();
}