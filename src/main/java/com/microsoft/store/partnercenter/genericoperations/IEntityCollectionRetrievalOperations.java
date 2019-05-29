// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.genericoperations;

import com.microsoft.store.partnercenter.models.ResourceBase;
import com.microsoft.store.partnercenter.models.ResourceCollection;

/**
 * Groups all operations related to retrieving a collection of entities. The entity type.The entity collection type.
 */
public interface IEntityCollectionRetrievalOperations<T extends ResourceBase, TResourceCollection extends ResourceCollection<T>>
    extends IEntireEntityCollectionRetrievalOperations<T, TResourceCollection>,
    IPagedEntityCollectionRetrievalOperations<T, TResourceCollection>
{
}
