// -----------------------------------------------------------------------
// <copyright file="PartnerErrorCategory.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.exception;

public enum PartnerErrorCategory
{
    /**
     * Defines the error categories of the partner SDK. Unknown error type.
     */
    NOT_SPECIFIED, 
    
    /**
     * The error was due to bad inputs from the user.
     */
    BAD_INPUT, 
    
    /**
     * The user is not authorized to perform the requested action.
     */
    UNAUTHORIZED,
    
    /**
     * The operation was not granted to the caller.
     */
    FORBIDDEN, 
    
    /**
     * The resource was not found.
     */
    NOT_FOUND,
    
    /**
     * The resource already exists.
     */
    ALREADY_EXISTS, 
    
    /**
     * The requested operation is invalid.
     */
    INVALID_OPERATION, 
    
    /**
     * The partner service failed to process the request.
     */
    SERVER_ERROR, 
    
    /**
     * The partner service is overloaded currently.
     */
    SERVER_BUSY, 
    
    /**
     * The partner service did not respond in a timely manner.
     */
    TIMEOUT, 
    
    /**
     * The partner service response could not be parsed according to the preset expectation.
     */
    RESPONSE_PARSING, 
    
    /**
     * The partner service request body could not be parsed according to the preset expectation.
     */
    REQUEST_PARSING
}