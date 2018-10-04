//-----------------------------------------------------------------------
//<copyright file="Configuration.java" company="Microsoft">
//   Copyright (c) Microsoft Corporation.  All rights reserved.
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
         * @return
         */
        public String getPath()
        {
            return Path;
        }

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
     * Gets or sets the Partner Service API root. 
     * 
     */
    public String getPartnerServiceApiRoot()
    {
        return PartnerServiceApiRoot;
    }

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
     * Gets or sets the Partner Service API version. 
     * 
     * @return The Partner Service API version. 
     */
    public String getPartnerServiceApiVersion()
    {
        return PartnerServiceApiVersion;
    }

    public void setPartnerServiceApiVersion( String partnerServiceApiVersion )
    {
        PartnerServiceApiVersion = partnerServiceApiVersion;
    }

    public int getDefaultMaxRetryAttempts()
    {
        return DefaultMaxRetryAttempts;
    }

    public void setDefaultMaxRetryAttempts( int defaultMaxRetryAttempts )
    {
        DefaultMaxRetryAttempts = defaultMaxRetryAttempts;
    }

    public int getDefaultAuthenticationTokenExpiryBufferInSeconds()
    {
        return DefaultAuthenticationTokenExpiryBufferInSeconds;
    }

    public void setDefaultAuthenticationTokenExpiryBufferInSeconds( int defaultAuthenticationTokenExpiryBufferInSeconds )
    {
        DefaultAuthenticationTokenExpiryBufferInSeconds = defaultAuthenticationTokenExpiryBufferInSeconds;
    }

    public String getDefaultLocale()
    {
        return DefaultLocale;
    }

    public void setDefaultLocale( String defaultLocale )
    {
        DefaultLocale = defaultLocale;
    }

    public Map<String, Api> getApis()
    {
        return Apis;
    }

    public void setApis( Map<String, Api> apis )
    {
        Apis = apis;
    }
}