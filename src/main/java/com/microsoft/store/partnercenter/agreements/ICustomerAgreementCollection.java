// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.agreements;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.agreements.Agreement;
import com.microsoft.store.partnercenter.models.agreements.AgreementType;

/**
 * Encapsulates the operations on the Agreement collection.
 */
public interface ICustomerAgreementCollection
        extends IPartnerComponentString,
        IEntireEntityCollectionRetrievalOperations<Agreement, ResourceCollection<Agreement>>
{
    /**
     * Creates an agreement between the partner and customer.
     *
     * @param newEntity The agreement to be created.
     * @return The newly created agreement.
     */
    Agreement create(Agreement newEntity);

    /**
     * Gets the list of agreements between a partner and customer.
     *
     * @return The list of the customer's agreements.
     */
    ResourceCollection<Agreement> get();

    /**
     * Retrieves the operations tied with a specified agreement type.
     *
     * @param agreementType The agreement type used to filter.
     * @return The available operations for agreement details.
     */
    ICustomerAgreementCollectionByAgreementType byAgreementType(String agreementType);
}