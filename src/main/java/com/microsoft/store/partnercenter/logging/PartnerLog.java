// -----------------------------------------------------------------------
// <copyright file="LogManager.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.logging;

import java.util.ArrayList;
import java.util.List;

import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Use this class for logging messages. This class supports pluggable loggers.
 */
public class PartnerLog
    implements ILogger
{
    /**
     * The singleton log manager instance.
     */
    private static PartnerLog LogManagerSingleton = null;

    /**
     * The registered loggers collection.
     */
    private final List<ILogger> registeredLoggers = new ArrayList<ILogger>();

    /**
     * Prevents a default instance of the LogManager class from being created.
     */
    private PartnerLog()
    {
    }

    /**
     * Gets the singleton log manager instance.
     * 
     * @return An instance of the log manager.
     */
    public static PartnerLog getInstance()
    {
        if ( PartnerLog.LogManagerSingleton == null )
        {
            PartnerLog.LogManagerSingleton = new PartnerLog();
        }
        return PartnerLog.LogManagerSingleton;
    }

    /**
     * Gets the registered loggers collection. You can add your custom loggers here.
     * 
     * @return The registered loggers collection.
     */
    public List<ILogger> getLoggers()
    {
        return this.registeredLoggers;
    }

    /**
     * Logs a piece of information.
     * 
     * @param message The informational message.
     */
    public void logInformation( String message )
    {
        if ( !StringHelper.isNullOrWhiteSpace( message ) )
        {
            for ( ILogger logger : this.registeredLoggers )
            {
                logger.logInformation( message );
            }
        }

    }

    /**
     * Logs a warning.
     * 
     * @param message The warning message.
     */
    public void logWarning( String message )
    {
        if ( !StringHelper.isNullOrWhiteSpace( message ) )
        {
            for ( ILogger logger : this.registeredLoggers )
            {
                logger.logWarning( message );
            }
        }

    }

    /**
     * Logs an error.
     * 
     * @param message The error message.
     */
    public void logError( String message )
    {
        if ( !StringHelper.isNullOrWhiteSpace( message ) )
        {
            for ( ILogger logger : this.registeredLoggers )
            {
                logger.logError( message );
            }
        }

    }

}