// -----------------------------------------------------------------------
// <copyright file="IRetryPolicy.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.retries;

import org.joda.time.Duration;

/**
 * Defines a retry policy.
 */
public interface IRetryPolicy
{
    /**
     * Indicates whether a retry should be performed or not.
     * 
     * @param attempt The attempt number.
     * @return True to retry, false to not.
     */
    boolean shouldRetry( int attempt );

    /**
     * Indicates the time to hold off before executing the next retry.
     * 
     * @param attempt The attempt number.
     * @return The back off time.
     */
    Duration getBackOffTime( int attempt );
}