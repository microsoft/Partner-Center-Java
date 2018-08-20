// -----------------------------------------------------------------------
// <copyright file="IRetryableOperation.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.retries;

import java.io.IOException;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 * Defines a retryable operation..
 */
public interface IRetryableOperation<T>
{
    /**
     * Executes the operation with retries.
     * 
     * @param attempt The operation to execute.
     * @return The operation's result.
     */
    T execute(CloseableHttpClient httpClient, HttpUriRequest request) throws IOException;
}