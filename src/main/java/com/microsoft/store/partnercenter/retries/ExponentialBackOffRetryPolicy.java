// -----------------------------------------------------------------------
// <copyright file="ExponentialBackOffRetryPolicy.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.retries;

import org.joda.time.Duration;

/**
 * This class implements binary exponential back off retries. Each time an operation fails, the amount of time to wait
 * before executing the next retry increases.
 */
public class ExponentialBackOffRetryPolicy
    implements IRetryPolicy
{
    /**
     * The maximum number of retry attempts.
     */
    private int maxRetries;

    /**
     * Initializes a new instance of the {@link #ExponentialBackOffRetryPolicy} class.
     * 
     * @param maxRetries The maximum number of retries.
     */
    public ExponentialBackOffRetryPolicy( int maxRetries )
    {
        this.setMaxRetries( maxRetries );
    }

    /**
     * Gets or sets the maximum number of retries to perform.
     */
    public int getMaxRetries()
    {
        return this.maxRetries;
    }

    public void setMaxRetries( int value )
    {
        if ( value <= 0 )
        {
            throw new IllegalArgumentException( "MaxRetries must be greater than zero" );
        }

        this.maxRetries = value;
    }

    /**
     * Indicates whether a retry should be performed or not.
     * 
     * @param attempt The attempt number.
     * @return True to retry, false to not.
     */
    public boolean shouldRetry( int attempt )
    {
        return attempt <= this.getMaxRetries();
    }

    /**
     * Indicates the time to hold off before executing the next retry.
     * 
     * @param attempt The attempt number.
     * @return The back off time.
     */
    public Duration getBackOffTime( int attempt )
    {
        // the first retry will wait for: 0.5 seconds, second retry will wait for 1.5 seconds, third retry will wait for
        // 3.5 seconds and so forth
        double exponentialBackOffTime = ( Math.pow( 2, attempt ) - 1 ) / 2;
        return Duration.standardSeconds( (long) exponentialBackOffTime );
    }
}