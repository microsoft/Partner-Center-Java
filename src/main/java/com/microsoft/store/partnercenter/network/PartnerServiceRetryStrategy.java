// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.network;

import java.util.Arrays;
import java.util.List;

import com.microsoft.rest.retry.RetryStrategy;

import okhttp3.Response;

/**
 * Represents a retry strategy that determines the number of retry attempts and
 * the interval between retries.
 */
public class PartnerServiceRetryStrategy extends RetryStrategy 
{
    /**
     * The maximum number of retry attempts. 
     */
    private int maxRetryAttempts;

    /**
     * The name of the retry strategy.
     */
    static final String Name = "Partner Service Retry Strategy";

    /**
     * The response codes that should not be retried. 
     */
    static final List<Integer> nonRetryableHttpCodes =
        Arrays.asList(
            HttpStatusCode.BADREQUEST, 
            HttpStatusCode.UNAUTHORIZED, 
            HttpStatusCode.FORBIDDEN,
            HttpStatusCode.NOTFOUND, 
            HttpStatusCode.CONFLICT, 
            HttpStatusCode.EXPECTATIONFAILED);

    /**
     * Initializes a new instance of the {@link PartnerServiceRetryStrategy} class.
     * 
     * @param maxRetryAttempts The maximum number of retry attempts.
     */
    public PartnerServiceRetryStrategy(int maxRetryAttempts)
    {
        super(Name, true);

        this.maxRetryAttempts = maxRetryAttempts;
    }   

    /**
     * Returns if a request should be retried based on the retry count, current response,
     * and the current strategy.
     *
     * @param retryCount The current retry attempt count.
     * @param response The exception that caused the retry conditions to occur.
     * @return true if the request should be retried; false otherwise.
     */
    @Override
    public boolean shouldRetry(int retryCount, Response response)
    {
        double exponentialBackOffTime = (Math.pow(2, retryCount) - 1) / 2;

        if(nonRetryableHttpCodes.contains(response.code()))
        {
            return false;
        }
        if(retryCount > maxRetryAttempts)
        {
            return false;
        }

        if(response.isSuccessful())
        {
            return false;
        }

        try
        {
            Thread.sleep((long)exponentialBackOffTime);
        }
        catch (InterruptedException ex)
        {
        }
        
        return true;
    }
}