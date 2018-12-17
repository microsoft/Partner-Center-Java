// -----------------------------------------------------------------------
// <copyright file="IFailedPartnerServiceResponseHandler.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.errorhandling;

import okhttp3.Response;

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
     * @return The exception to throw.
     */
    PartnerException handleFailedResponse( Response response );

    /**
     * Handles failed partner service responses.
     * 
     * @param response The partner service response.
     * @param context The reqeust context.
     * @return The exception to throw.
     */
    PartnerException handleFailedResponse( Response response, IRequestContext context );
}