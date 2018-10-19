//-----------------------------------------------------------------------
//<copyright file="Configuration.java" company="Microsoft">
//   Copyright (c) Microsoft Corporation. All rights reserved.
//</copyright>
//-----------------------------------------------------------------------

package com.microsoft.store.partnercenter.configuration;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A configuration holder that keeps a map of API's and some default configuration values
 */
public class Configuration
{
    public static class Api
    {
        /**
         * The URI path of the API.
         */
        @JsonProperty( "Path" )
        private String Path;

        /**
         * The parameters of the API call.
         */
        @JsonProperty( "Parameters" )
        private Map<String, String> Parameters;

        /**
         * The additional headers of the API call.
         */
        @JsonProperty( "AdditionalHeaders" )
        private Map<String, String> AdditionalHeaders;

        /**
         * Get the URI path of the API.
         * 
         * @return The URI path of the API.
         */
        public String getPath()
        {
            return Path;
        }

        /**
         * Set the URI path of the API.
         * 
         * @param path The URI path of the API.
         */
        public void setPath( String path )
        {
            Path = path;
        }

        public Map<String, String> getParameters()
        {
            return Parameters;
        }

        public void setParameters( Map<String, String> parameters )
        {
            Parameters = parameters;
        }

        public Map<String, String> getAdditionalHeaders()
        {
            return AdditionalHeaders;
        }

        public void setAdditionalHeaders( Map<String, String> additionalHeaders )
        {
            AdditionalHeaders = additionalHeaders;
        }
    }

    @JsonProperty("PartnerCenterClient")
    private String PartnerCenterClient;

    @JsonProperty( "PartnerServiceApiRoot" )
    private String PartnerServiceApiRoot;

    @JsonProperty( "PartnerServiceApiVersion" )
    private String PartnerServiceApiVersion;

    @JsonProperty( "DefaultMaxRetryAttempts" )
    private int DefaultMaxRetryAttempts;

    @JsonProperty( "DefaultAuthenticationTokenExpiryBufferInSeconds" )
    private int DefaultAuthenticationTokenExpiryBufferInSeconds;

    @JsonProperty( "DefaultLocale" )
    private String DefaultLocale;

    @JsonProperty( "Apis" )
    private Map<String, Api> Apis;

    /**
     * Gets the partner service API root. 
     * 
     * @return The partner service API root.
     */
    public String getPartnerServiceApiRoot()
    {
        return PartnerServiceApiRoot;
    }

    /**
     *  The partner service API root.
     * 
     * @param partnerServiceApiRoot The partner service API root.
     */
    public void setPartnerServiceApiRoot( String partnerServiceApiRoot )
    {
        PartnerServiceApiRoot = partnerServiceApiRoot;
    }

    /**
     * Gets or sets the Partner Center client name. 
     * 
     * @return The Partner Center client name. 
     */
    public String getPartnerCenterClient()
    {
        return PartnerCenterClient;
    }

    /**
     * Gets the partner service API version. 
     * 
     * @return The partner service API version. 
     */
    public String getPartnerServiceApiVersion()
    {
        return PartnerServiceApiVersion;
    }

    /**
     * Sets the partner service API version. 
     * 
     * @param partnerServiceApiVersion The partner service API version.
     */
    public void setPartnerServiceApiVersion( String partnerServiceApiVersion )
    {
        PartnerServiceApiVersion = partnerServiceApiVersion;
    }

    /**
     * Gets the default max retry attempts.
     * 
     * @return The default max retry attempts.
     */
    public int getDefaultMaxRetryAttempts()
    {
        return DefaultMaxRetryAttempts;
    }

    /**
     * Sets the default max retry attempts. 
     * 
     * @param defaultMaxRetryAttempts The default max retry attempts.
     */
    public void setDefaultMaxRetryAttempts( int defaultMaxRetryAttempts )
    {
        DefaultMaxRetryAttempts = defaultMaxRetryAttempts;
    }

    /**
     * Gets the default authentication token expiry buffer in seconds.
     * 
     * @return The default authentication token expiry buffer in seconds.
     */
    public int getDefaultAuthenticationTokenExpiryBufferInSeconds()
    {
        return DefaultAuthenticationTokenExpiryBufferInSeconds;
    }

    /**
     * Sets the default authentication token expiry buffer in seconds.
     * 
     * @param defaultAuthenticationTokenExpiryBufferInSeconds The default authentication token expiry buffer in seconds.
     */
    public void setDefaultAuthenticationTokenExpiryBufferInSeconds( int defaultAuthenticationTokenExpiryBufferInSeconds )
    {
        DefaultAuthenticationTokenExpiryBufferInSeconds = defaultAuthenticationTokenExpiryBufferInSeconds;
    }

    /**
     * Gets the default locale.
     * 
     * @return The default locale.
     */
    public String getDefaultLocale()
    {
        return DefaultLocale;
    }

    /**
     * Sets the default locale.
     * 
     * @param defaultLocale The default locale.
     */
    public void setDefaultLocale( String defaultLocale )
    {
        DefaultLocale = defaultLocale;
    }

    /**
     * Gets the available APIs.
     * 
     * @return The available APIs.
     */
    public Map<String, Api> getApis()
    {
        return Apis;
    }

    /**
     * Sets the available APIs. 
     * 
     * @param apis The available APIs.
     */
    public void setApis( Map<String, Api> apis )
    {
        Apis = apis;
    }
}