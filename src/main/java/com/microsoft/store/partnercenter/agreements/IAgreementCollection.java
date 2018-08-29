// -----------------------------------------------------------------------
// <copyright file="IAgreementCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.agreements;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.agreements.Agreement;

public interface IAgreementCollection
        extends IPartnerComponentString,
        IEntireEntityCollectionRetrievalOperations<Agreement, ResourceCollection<Agreement>>
{
    /***
     * Adds accepted agreement.
     *
     * @param newEntity Agreement to add.
     *
     * @return Agreement entity.
     */
    Agreement create( Agreement newEntity );

    /***
     * Retrieves all agreements.
     *
     * @return The agreements.
     */
    ResourceCollection<Agreement> get();
}