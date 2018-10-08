// -----------------------------------------------------------------------
// <copyright file="IRequestContext.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.requestcontext;

import java.util.UUID;

/**
 * Bundles context information which is amended to the partner SDK operations.
 */
public interface IRequestContext
{
    /**
     * Gets the request identifier. Uniquely identifies the partner service operation.
     * 
     * @return The request identifier.
     */
    UUID getRequestId();

    /**
     * Gets the correlation identifier. This identifier is used to group logical operations together.
     * 
     * @return The correlation identifier.
     */
    UUID getCorrelationId();

    /**
     * Gets the locale.
     * 
     * @return The locale.
     */
    String getLocale();

}
