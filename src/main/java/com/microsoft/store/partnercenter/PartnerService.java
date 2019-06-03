// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
		// set the global partner service properties
		setConfiguration(readPartnerServiceConfiguration());
		setApiRootUrl(configuration.getPartnerServiceApiRoot());
		setPartnerServiceApiVersion(configuration.getPartnerServiceApiVersion());    	

		// initialize the partner factory
		setFactory(new StandardPartnerFactory());

		// Set the SDK value based on data from the configuration file.
		sdkVersion = configuration.getSdkVersion();

		// log to the debugger window
		PartnerLog.getInstance().getLoggers().add(new SystemOutLogger());
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

	private String apiRootUrl;

	/**
	 * Gets the API root URL.
	 * 
	 * @return The API root URL.
	 */
	public String getApiRootUrl()
	{
		return apiRootUrl;
	}

	/**
	 * Sets the API root URL.
	 * 
	 * @param value The API root URL.
	 */
	public void setApiRootUrl(String value)
	{
		apiRootUrl = value;
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
	private void setPartnerServiceApiVersion(String value)
	{
		partnerServiceApiVersion = value;
	}

	private String applicationName;

	public String getApplicationName()
	{
		return applicationName;
	}

	@SuppressWarnings("unused")
	private void setApplicationName(String value)
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

	private void setConfiguration(Configuration value)
	{
		configuration = value;
	}

	private IPartnerFactory factory;

	public IPartnerFactory getFactory()
	{
		return factory;
	}

	void setFactory(IPartnerFactory value)
	{
		factory = value;
	}

	private IPartnerCredentials refreshCredentialsHandler;

	public IPartnerCredentials getRefreshCredentialsHandler()
	{
		return refreshCredentialsHandler;
	}

	public void setRefreshCredentialsHandler(IPartnerCredentials partnerCredentials)
	{
		refreshCredentialsHandler = partnerCredentials;
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
	
	private String sdkVersion;

	/**
	 * Gets the SDK version.
	 * 
	 * @return The SDK version.
	 */
	public String getSdkVersion()
	{
		return sdkVersion; 
	}

	public void setProxyOptions(String hostName, Integer port)
	{
		if (StringHelper.isNullOrWhiteSpace(hostName))
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
	public IAggregatePartner createPartnerOperations(IPartnerCredentials credentials)
	{
		return getFactory().build(credentials);
	}
	
	/**
	 * Reads the partner SDK configuration from the embedded resource file and massages its fields to be easily
	 * accessible.
	 * 
	 * @return The partner SDK configuration.
	 */
	private Configuration readPartnerServiceConfiguration()
	{
		ObjectMapper mapper = new ObjectMapper();
		InputStream is =
			PartnerService.class.getClassLoader().getResourceAsStream("PartnerService.json");
		try
		{
			return mapper.readValue(is, Configuration.class);
		}
		catch (IOException e)
		{
			throw new PartnerException("Problem reading PartnerSDK configuration file", e);
		}
	}
}