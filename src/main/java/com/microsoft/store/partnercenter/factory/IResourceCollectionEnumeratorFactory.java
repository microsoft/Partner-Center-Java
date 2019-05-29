// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.factory;

import com.microsoft.store.partnercenter.enumerators.IResourceCollectionEnumerator;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceCollectionLinks;

/**
 * Creates resource collection enumerators which can enumerate through resource collections. The collection type.
 */
public interface IResourceCollectionEnumeratorFactory<T extends ResourceBaseWithLinks<StandardResourceCollectionLinks>>
{
    /**
     * Creates a customer collection enumerator capable of traversing customers.
     * 
     * @param customerResourceCollection The initial customer resource collection to start from.
     * @return A customer collection enumerator capable of traversing customers.
     */
    IResourceCollectionEnumerator<T> create( T customerResourceCollection );
}