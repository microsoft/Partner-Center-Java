// -----------------------------------------------------------------------
// <copyright file="PartnerService.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.configuration.Configuration;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.factory.IPartnerFactory;
import com.microsoft.store.partnercenter.factory.StandardPartnerFactory;
import com.microsoft.store.partnercenter.logging.PartnerLog;
import com.microsoft.store.partnercenter.logging.SystemOutLogger;
import com.microsoft.store.partnercenter.retries.ExponentialBackOffRetryPolicy;
import com.microsoft.store.partnercenter.retries.IRetryPolicy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * This class contains the partner SDK properties and acts as the main entry point to create partners.
 */
public class PartnerService
{
    /**
     * A singleton instance of the partner service.
     */
    private static PartnerService instance = new PartnerService();

    /**
     * Prevents a default instance of the PartnerService class from being created.
     */
    private PartnerService()
    {
        // set the global partner service properties, for now we point to Krishna's server
        setConfiguration( readPartnerSdkConfiguration() );
        setApiRootUrl( configuration.getPartnerServiceApiRoot() );
        setPartnerServiceApiVersion( configuration.getPartnerServiceApiVersion() );    	
        // initialize the partner factory
        setFactory( new StandardPartnerFactory() );
        // define the default retry policy as exponential with 3 retry attempts
        setRetryPolicy( new ExponentialBackOffRetryPolicy( getConfiguration().getDefaultMaxRetryAttempts() ) );
        // log to the debugger window
        PartnerLog.getInstance().getLoggers().add( new SystemOutLogger() );
    }
    
    /**
     * Gets an instance of the partner service.
     * 
     * @return An instance of the partner service.
     */
    public static PartnerService getInstance()
    {
        return PartnerService.instance;
    }

	private String __ApiRootUrl;

    /**
     * Gets the API root URL.
     * 
     * @return The API root URL.
     */
    public String getApiRootUrl()
    {
        return __ApiRootUrl;
    }

    /**
     * Sets the API root URL.
     * 
     * @param value The API root URL.
     */
    public void setApiRootUrl( String value )
    {
        __ApiRootUrl = value;
    }

    private String partnerServiceApiVersion;

    /**
     * Gets the partner service API version. 
     * 
     * @return The partner service API version.
     */
    public String getPartnerServiceApiVersion()
    {
        return partnerServiceApiVersion;
    }

    /**
     * Set the partner service API version.
     * 
     * @param value The partner service API version.
     */
    private void setPartnerServiceApiVersion( String value )
    {
        partnerServiceApiVersion = value;
    }

    private String applicationName;

    public String getApplicationName()
    {
        return applicationName;
    }

    @SuppressWarnings("unused")
	private void setApplicationName( String value )
    {
    	applicationName = value;
    }

    private Configuration configuration;

    /**
     * Gets the partner service configuration.
     * 
     * @return The partner service configuration.
     */
    public Configuration getConfiguration()
    {
        return configuration;
    }

    private void setConfiguration( Configuration value )
    {
        configuration = value;
    }

    private IPartnerFactory factory;

    public IPartnerFactory getFactory()
    {
        return factory;
    }

    void setFactory( IPartnerFactory value )
    {
        factory = value;
    }

    private IPartnerCredentials refreshCredentialsHandler;

    public IPartnerCredentials getRefreshCredentialsHandler()
    {
        return refreshCredentialsHandler;
    }

    public void setRefreshCredentialsHandler( IPartnerCredentials partnerCredentials )
    {
        refreshCredentialsHandler = partnerCredentials;
    }

    /**
     * Gets the default retry policy used by the partner SDK.
     */
    private IRetryPolicy retryPolicy;

    public IRetryPolicy getRetryPolicy()
    {
        return retryPolicy;
    }

    public void setRetryPolicy( IRetryPolicy value )
    {
        retryPolicy = value;
    }
    
    private String proxyHostName;
    
    public String getProxyHostName()
    {
        return proxyHostName;
    }
    
    private Integer proxyPort;
    
    public Integer getProxyPort()
    {
        return proxyPort;
    }
    
    public void setProxyOptions(String hostName, Integer port)
    {
        if (StringHelper.isNullOrWhiteSpace( hostName ))
        {
            throw new PartnerException("The hostName should be set");
        }
        
        proxyHostName = hostName;
        proxyPort = port;
    }
    
    public void clearProxyOptions()
    {
        proxyHostName = null;
        proxyPort = null;
    }

    /**
     * Creates a {@link IPartner} instance and configures it using the provided partner credentials.
     * 
     * @param credentials The partner credentials.
     * @return A configured partner operations object.
     */
    public IAggregatePartner createPartnerOperations( IPartnerCredentials credentials )
    {
        return getFactory().build( credentials );
    }
    
    /**
     * Reads the partner SDK configuration from the embedded resource file and massages its fields to be easily
     * accessible.
     * 
     * @return The partner SDK configuration.
     */
    private Configuration readPartnerSdkConfiguration()
    {
        ObjectMapper mapper = new ObjectMapper();
        InputStream is =
            PartnerService.class.getClassLoader().getResourceAsStream( "PartnerSdkConfiguration.json" );
        try
        {
            return mapper.readValue( is, Configuration.class );
        }
        catch ( IOException e )
        {
            throw new PartnerException( "Problem reading PartnerSDK configuration file", e );
        }
    }
}