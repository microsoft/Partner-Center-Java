// -----------------------------------------------------------------------
// <copyright file="DefaultPartnerServiceErrorHandler.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.errorhandling;

import java.io.IOException;
import java.text.MessageFormat;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.exception.PartnerErrorCategory;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.logging.PartnerLog;
import com.microsoft.store.partnercenter.models.ApiFault;
import com.microsoft.store.partnercenter.network.HttpStatusCode;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;
import com.microsoft.store.partnercenter.utils.StringHelper;

import okhttp3.Response;

/**
 * The default handling policy for failed partner service responses.
 */
public class DefaultPartnerServiceErrorHandler
    implements IFailedPartnerServiceResponseHandler
{
    /**
     * Handles failed partner service responses.
     * 
     * @param response The partner service response.
     * @return The exception to throw.
     */
    @Override
    public PartnerException handleFailedResponse( Response response )
    {
        return handleFailedResponse( response, null );
    }

    /**
     * Handles failed partner service responses.
     * 
     * @param response The partner service response.
     * @param context An optional partner context.
     * @return The exception to throw.
     */
    @Override
    public PartnerException handleFailedResponse(Response response, IRequestContext context)
    {
        if ( response == null )
        {
            throw new IllegalArgumentException( "Response is null" );
        }

        if ( response.code() < 400 )
        {
            throw new IllegalArgumentException( "DefaultPartnerServiceErrorHandler: response is successful." );
        }

        String responsePayload;

        try
        {
        	if ( response.body() == null || response.body().contentLength() == 0 )
        	{
        		throw new IllegalArgumentException( "Response entity is null" );
            }
            
            responsePayload = response.body().string();
        }
        catch ( Exception e )
        {
            responsePayload = "";
        }

        ApiFault apiFault = null;
        PartnerException partnerException = null;

        // log the failed response
        PartnerLog.getInstance().logError(MessageFormat.format("Partner service failed response:{0}", responsePayload));

        // attempt to deserialize the response into an ApiFault object as this is what the partner service is
        // expected to do when it errors out
        ObjectMapper mapper = new ObjectMapper();

        try
        {
            apiFault = mapper.readValue(responsePayload, ApiFault.class);
        }
        catch ( IOException e )
        {
            PartnerLog.getInstance().logError("Could not parse error response: " + e.toString() );
        }

        PartnerErrorCategory errorCategory;

        errorCategory = toPartnerErrorCategory( response.code() );
        partnerException = apiFault != null ? new PartnerException( apiFault, context, errorCategory )
                        : new PartnerException( StringHelper.isNullOrWhiteSpace( responsePayload )
                                        ? response.message() : responsePayload, context,
                                                errorCategory );

        return partnerException;
    }

    /**
     * Generates the partner error category based on the HTTP response code.
     * 
     * @param statusCode The HTTP response code.
     * @return The partner error category.
     */
    private static PartnerErrorCategory toPartnerErrorCategory( int statusCode )
    {
        PartnerErrorCategory errorCategory;
        
        switch ( statusCode )
        {
            case HttpStatusCode.BADREQUEST:
                errorCategory = PartnerErrorCategory.BAD_INPUT;
                break;
            case HttpStatusCode.UNAUTHORIZED:
                errorCategory = PartnerErrorCategory.UNAUTHORIZED;
                break;
            case HttpStatusCode.FORBIDDEN:
                errorCategory = PartnerErrorCategory.FORBIDDEN;
                break;
            case HttpStatusCode.NOTFOUND:
                errorCategory = PartnerErrorCategory.NOT_FOUND;
                break;
            case HttpStatusCode.CONFLICT:
                errorCategory = PartnerErrorCategory.ALREADY_EXISTS;
                break;
            case HttpStatusCode.SERVICEUNAVAILABLE:
                errorCategory = PartnerErrorCategory.SERVER_BUSY;
                break;
            default:
                errorCategory = PartnerErrorCategory.SERVER_ERROR;
                break;
        }

        return errorCategory;
    }
}