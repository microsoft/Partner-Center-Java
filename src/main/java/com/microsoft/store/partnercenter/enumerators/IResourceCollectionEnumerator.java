// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.enumerators;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceCollectionLinks;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;

/**
 * Provides resource collection enumeration capabilities. This interface can page through results and determines whether
 * the current page is the first or last page or not. The enumeration result type.
 */
public interface IResourceCollectionEnumerator<T extends ResourceBaseWithLinks<StandardResourceCollectionLinks>>
{
    /**
     * Gets whether the current result collection is the first page of results or not.
     * 
     * @return A flag indicating whether or not the result collect is the fist page of results or not.
     */
    boolean isFirstPage();

    /**
     * Gets whether the current result collection is the last page of results or not.
     * 
     * @return A flag indicating whether the current result collection is the last page of results or not.
     */
    boolean isLastPage();

    /**
     * Gets whether the current result collection has a value or not. This indicates if the collection has been fully
     * enumerated or not.
     * 
     * @return A flag indicating whether the current result collection has a value or not.
     */
    boolean hasValue();

    /**
     * The current resource collection.
     * 
     * @return The current resoure collection.
     */
    T getCurrent();

    /**
     * Retrieves the next result set.
     */
    void next();

    /**
     * Retrieves the next result set.
     * 
     * @param context An optional request context. If not provided, the context associated with the partner operations
     *            will be used.
     */
    void next( IRequestContext context );

    /**
     * Retrieves the previous result set.
     */
    void previous();

    /**
     * Retrieves the previous result set.
     * 
     * @param context An optional request context. If not provided, the context associated with the partner operations
     *            will be used.
     */
    void previous( IRequestContext context );
}
