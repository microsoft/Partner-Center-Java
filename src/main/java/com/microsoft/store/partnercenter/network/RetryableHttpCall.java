// -----------------------------------------------------------------------
// <copyright file="RetryableHttpCall.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.network;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.joda.time.LocalTime;

import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.logging.PartnerLog;
import com.microsoft.store.partnercenter.retries.IRetryPolicy;
import com.microsoft.store.partnercenter.retries.IRetryableOperation;

/**
 * Implements retryable HTTP calls. Use this class with the retry policy you need to implement HTTP call retries.
 */
public class RetryableHttpCall
    implements IRetryableOperation<CloseableHttpResponse>
{
    /**
     * Responses with codes listed here will not be retried.
     */
    private final List<Integer> nonRetryableHttpCodes =
        Arrays.asList( HttpStatusCode.BadRequest, HttpStatusCode.Unauthorized, HttpStatusCode.Forbidden,
                       HttpStatusCode.NotFound, HttpStatusCode.Conflict, HttpStatusCode.ExpectationFailed );

    /**
     * Initializes a new instance of the RetryableHttpCall class.
     * 
     * @param retryPolicy An optional retry policy. The default policy will be used if not provided.
     */
    public RetryableHttpCall()
    {
        this.setRetryPolicy( null );
    }

    /**
     * Initializes a new instance of the RetryableHttpCall class.
     * 
     * @param retryPolicy An optional retry policy. The default policy will be used if not provided.
     */
    public RetryableHttpCall( IRetryPolicy retryPolicy )
    {
        this.setRetryPolicy( retryPolicy );
    }

    /**
     * Gets or set the retry policy.
     */
    private IRetryPolicy __RetryPolicy;

    public IRetryPolicy getRetryPolicy()
    {
        return __RetryPolicy;
    }

    public void setRetryPolicy( IRetryPolicy value )
    {
        __RetryPolicy = value;
    }

    /**
     * Executes an HTTP operation with the configured retry policy.
     * 
     * @param request
     * @param partnerServiceClient
     * @param responsePromise
     * @param httpCall The HTTP call.
     * @return The HTTP response.
     * @throws IOException
     * @throws ClientProtocolException
     */

    public CloseableHttpResponse execute( CloseableHttpClient httpClient, HttpUriRequest request )
        throws IOException
    {
        if ( httpClient == null )
        {
            throw new IllegalArgumentException( "Http client is null" );
        }
        if ( request == null )
        {
            throw new IllegalArgumentException( "Http request is null" );
        }
        if ( getRetryPolicy() == null )
        {
            setRetryPolicy( PartnerService.getInstance().getRetryPolicy() );
        }

        int attempts = 0;
        CloseableHttpResponse response = null;
        IOException operationException = null;

        while ( attempts == 0 || this.getRetryPolicy().shouldRetry( attempts ) )
        {

            try
            {
                PartnerLog.getInstance().logInformation( "Starting request. Attempt " + attempts + "\t Time: "
                    + LocalTime.now().toString() );
                response = httpClient.execute( request );
                PartnerLog.getInstance().logInformation( "Request completed            \t Time: "
                    + LocalTime.now().toString() );
                operationException = null;

                if ( HttpStatusCode.isSuccesful( response ) )
                {
                    break;
                }
                else
                {
                    if ( this.nonRetryableHttpCodes.contains( response.getStatusLine().getStatusCode() ) )
                    {
                        break;
                    }
                }
            }
            catch ( IOException e )
            {
                operationException = e;
                PartnerLog.getInstance().logError( MessageFormat.format( "RetryableHttpCall: Attempt {0} failed: {1}",
                                                                         attempts, e, Locale.US ) );
            }
            ++attempts;

            if ( this.getRetryPolicy().shouldRetry( attempts ) )
            {
                try
                {
                    response.close();
                    Thread.sleep( this.getRetryPolicy().getBackOffTime( attempts ).getMillis() );
                }
                catch ( InterruptedException e )
                {

                }
            }
            else
            {
                break;
            }
        }

        if ( operationException != null )
        {
            throw operationException;
        }
        else
        {
            return response;
        }
    }
}
