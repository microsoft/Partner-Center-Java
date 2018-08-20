// -----------------------------------------------------------------------
// <copyright file="IFailedPartnerServiceResponseHandler.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.errorhandling;

import org.apache.http.HttpResponse;

import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;

/**
 * Defines behavior for handling non successful responses from the partner service.
 */
public interface IFailedPartnerServiceResponseHandler
{
    /**
     * Handles failed partner service responses.
     * 
     * @param response The partner service response.
     * @param context An optional partner context.
     * @return The exception to throw.
     */
    PartnerException handleFailedResponse( HttpResponse response );

    PartnerException handleFailedResponse( HttpResponse response, IRequestContext context );

}
