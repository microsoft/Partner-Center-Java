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
        @JsonProperty("Path")
        private String Path;

        /**
         * The parameters of the API call.
         */
        @JsonProperty("Parameters")
        private Map<String, String> Parameters;

        /**
         * The additional headers of the API call.
         */
        @JsonProperty("AdditionalHeaders")
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
        public void setPath(String path)
        {
            Path = path;
        }

        public Map<String, String> getParameters()
        {
            return Parameters;
        }

        public void setParameters(Map<String, String> parameters)
        {
            Parameters = parameters;
        }

        public Map<String, String> getAdditionalHeaders()
        {
            return AdditionalHeaders;
        }

        public void setAdditionalHeaders(Map<String, String> additionalHeaders)
        {
            AdditionalHeaders = additionalHeaders;
        }
    }

    @JsonProperty("PartnerCenterClient")
    private String partnerCenterClient;

    @JsonProperty("PartnerServiceApiRoot")
    private String partnerServiceApiRoot;

    @JsonProperty("PartnerServiceApiVersion")
    private String partnerServiceApiVersion;

    @JsonProperty("DefaultMaxRetryAttempts")
    private int defaultMaxRetryAttempts;

    @JsonProperty("DefaultAuthenticationTokenExpiryBufferInSeconds")
    private int defaultAuthenticationTokenExpiryBufferInSeconds;

    @JsonProperty("DefaultLocale")
    private String defaultLocale;

    @JsonProperty("Apis")
    private Map<String, Api> apis;

    @JsonProperty("SdkVersion")
    private String sdkVersion; 

    /**
     * Gets the partner service API root. 
     * 
     * @return The partner service API root.
     */
    public String getPartnerServiceApiRoot()
    {
        return partnerServiceApiRoot;
    }

    /**
     *  The partner service API root.
     * 
     * @param value The partner service API root.
     */
    public void setPartnerServiceApiRoot(String value)
    {
        partnerServiceApiRoot = value;
    }

    /**
     * Gets or sets the Partner Center client name. 
     * 
     * @return The Partner Center client name. 
     */
    public String getPartnerCenterClient()
    {
        return partnerCenterClient;
    }

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
     * Sets the partner service API version. 
     * 
     * @param value The partner service API version.
     */
    public void setPartnerServiceApiVersion(String value)
    {
        partnerServiceApiVersion = value;
    }

    /**
     * Gets the default max retry attempts.
     * 
     * @return The default max retry attempts.
     */
    public int getDefaultMaxRetryAttempts()
    {
        return defaultMaxRetryAttempts;
    }

    /**
     * Sets the default max retry attempts. 
     * 
     * @param value The default max retry attempts.
     */
    public void setDefaultMaxRetryAttempts(int value)
    {
        defaultMaxRetryAttempts = value;
    }

    /**
     * Gets the default authentication token expiry buffer in seconds.
     * 
     * @return The default authentication token expiry buffer in seconds.
     */
    public int getDefaultAuthenticationTokenExpiryBufferInSeconds()
    {
        return defaultAuthenticationTokenExpiryBufferInSeconds;
    }

    /**
     * Sets the default authentication token expiry buffer in seconds.
     * 
     * @param value The default authentication token expiry buffer in seconds.
     */
    public void setDefaultAuthenticationTokenExpiryBufferInSeconds(int value)
    {
        defaultAuthenticationTokenExpiryBufferInSeconds = value;
    }

    /**
     * Gets the default locale.
     * 
     * @return The default locale.
     */
    public String getDefaultLocale()
    {
        return defaultLocale;
    }

    /**
     * Sets the default locale.
     * 
     * @param value The default locale.
     */
    public void setDefaultLocale(String value)
    {
        defaultLocale = value;
    }

    /**
     * Gets the available APIs.
     * 
     * @return The available APIs.
     */
    public Map<String, Api> getApis()
    {
        return apis;
    }
    
    /**
     * Gets the SDK version. 
     * 
     * @return The version of the SDK.
     */
    public String getSdkVersion()
    {
        return sdkVersion;
    }
}