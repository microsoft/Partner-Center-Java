// -----------------------------------------------------------------------
// <copyright file="ILogger.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.logging;

/**
 * Defines logger behavior.
 */
public interface ILogger
{
    /**
     * Logs a piece of information.
     * 
     * @param message The informational message.
     */
    void logInformation( String message );

    /**
     * Logs a warning.
     * 
     * @param message The warning message.
     */
    void logWarning( String message );

    /**
     * Logs an error.
     * 
     * @param message The error message.
     */
    void logError( String message );

}
