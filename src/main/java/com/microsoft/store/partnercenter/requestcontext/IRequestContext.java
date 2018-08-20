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
     * Gets the request Id. Uniquely identifies the partner service operation.
     */
    UUID getRequestId();

    /**
     * Gets the correlation Id. This Id is used to group logical operations together.
     */
    UUID getCorrelationId();

    /**
     * Gets the Locale.
     */
    String getLocale();

}
