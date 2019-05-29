// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.logging;

/**
 * A logger that writes to the debug window to aid in debugging.
 */
public class SystemOutLogger
    implements ILogger
{
    /**
     * Logs a piece of information.
     * 
     * @param message The informational message.
     */
    @Override
    public void logInformation( String message )
    {
        System.out.println( "Default logger INFO: " + message );
    }

    /**
     * Logs a warning.
     * 
     * @param message The warning message.
     */
    @Override
    public void logWarning( String message )
    {
        System.out.println( "Default logger WARNING: " + message );
    }

    /**
     * Logs an error.
     * 
     * @param message The error message.
     */
    @Override
    public void logError( String message )
    {
        System.out.println( "Default logger ERROR: " + message );
    }
}