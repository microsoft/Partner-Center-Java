// -----------------------------------------------------------------------
// <copyright file="PartnerServiceRetryStrategy.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.network;

import java.util.Arrays;
import java.util.List;

import com.microsoft.rest.retry.RetryStrategy;
import com.microsoft.store.partnercenter.PartnerService;

import okhttp3.Response;

/**
 * Represents a retry strategy that determines the number of retry attempts and
 * the interval between retries.
 */
public class PartnerServiceRetryStrategy extends RetryStrategy 
{
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
     */
    public PartnerServiceRetryStrategy()
    {
        super(Name, true);
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
        if(retryCount > PartnerService.getInstance().getConfiguration().getDefaultMaxRetryAttempts())
        {
            return false;
        }

        if(nonRetryableHttpCodes.contains(response.code()))
        {
            return false;
        }

        if(response.isSuccessful())
        {
            return false;
        }
        
        return true;
    }
}