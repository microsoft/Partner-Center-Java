// -----------------------------------------------------------------------
// <copyright file="IRetryableOperation.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
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
     * @param httpClient The client used to perform the HTTP operation.
     * @param request The request to be performed.
     * 
     * @return The response from the HTTP operation.
     * @throws IOException If network operation fails.
     */
    T execute(CloseableHttpClient httpClient, HttpUriRequest request) throws IOException;
}