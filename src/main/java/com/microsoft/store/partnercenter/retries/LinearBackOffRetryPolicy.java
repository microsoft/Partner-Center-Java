// -----------------------------------------------------------------------
// <copyright file="LinearBackOffRetryPolicy.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.retries;

import org.joda.time.Duration;

/**
 * A linear back off policy waits for a constant amount of time between retries.
 */
public class LinearBackOffRetryPolicy
    implements IRetryPolicy
{
    /**
     * The maximum number of retry attempts.
     */
    private int maxRetries;

    /**
     * Initializes a new instance of the LinearBackOffRetryPolicy class.
     * 
     * @param backOff The back off time between retries.
     * @param maxRetries The maximum number of retries.
     */
    public LinearBackOffRetryPolicy( Duration backOff, int maxRetries )
    {
        this.setBackOff( backOff );
        this.setMaxRetries( maxRetries );
    }

    /**
     * Gets or sets the back off time between retries.
     */
    private Duration __BackOff;

    public Duration getBackOff()
    {
        return __BackOff;
    }

    public void setBackOff( Duration value )
    {
        __BackOff = value;
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
        return this.getBackOff();
    }
}