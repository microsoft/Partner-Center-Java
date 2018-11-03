// -----------------------------------------------------------------------
// <copyright file="RetryableHttpCall.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.network;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.logging.PartnerLog;
import com.microsoft.store.partnercenter.retries.IRetryPolicy;
import com.microsoft.store.partnercenter.retries.IRetryableOperation;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.joda.time.LocalTime;

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
        Arrays.asList( HttpStatusCode.BADREQUEST, HttpStatusCode.UNAUTHORIZED, HttpStatusCode.FORBIDDEN,
                       HttpStatusCode.NOTFOUND, HttpStatusCode.CONFLICT, HttpStatusCode.EXPECTATIONFAILED );

    /**
     * Initializes a new instance of the RetryableHttpCall class.
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

    private IRetryPolicy retryPolicy;
    
    /**
     * Gets the retry policy.
     * 
     * @return The retry policy.
     */
    public IRetryPolicy getRetryPolicy()
    {
        return retryPolicy;
    }

    /**
     * Sets the retry policy.
     * 
     * @param value The retry policy.
     */
    public void setRetryPolicy( IRetryPolicy value )
    {
        retryPolicy = value;
    }

    /**
     * Executes an HTTP operation with the configured retry policy.
     * 
     * @param httpClient The client used to perform the HTTP operation.
     * @param request The request to be performed.
     * 
     * @return The response from the HTTP operation.
     * @throws IOException If a new operation fails.
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
                PartnerLog.getInstance().logError(
                     MessageFormat.format(
                         "RetryableHttpCall: Attempt {0} failed: {1}",
                         attempts, 
                         e ) );
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