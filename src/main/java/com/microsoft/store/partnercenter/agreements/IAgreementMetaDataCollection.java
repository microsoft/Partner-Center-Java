// -----------------------------------------------------------------------
// <copyright file="IAgreementMetaDataCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.agreements;

import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.agreements.AgreementMetaData;

/**
 * Encapsulates the operations on the Agreement metadata collection.
 */
public interface IAgreementMetaDataCollection
{
    /***
     * Retrieves all current agreement metadata.
     *
     * @return The current agreement metadata.
     */
    ResourceCollection<AgreementMetaData> get();
}