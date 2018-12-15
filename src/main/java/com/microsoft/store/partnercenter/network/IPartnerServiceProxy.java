// -----------------------------------------------------------------------
// <copyright file="IPartnerServiceProxy.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.network;

import java.io.InputStream;
import java.util.Collection;
import java.util.UUID;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;

/**
 * This interface acts as a mediator between the SDK and the partner API service. It automatically adds customer HTTP
 * headers and allows configuring them before executing the requests. It also handles responses in a standard manner.
 * The type of content that will be passed to the partner service API.The type of response produced from the partner
 * service API.
 */
public interface IPartnerServiceProxy<TRequest, TResponse>
    extends IPartnerComponentString
{
    /**
     * Gets the request identifer.
     * 
     * @return The request identifier.
     */
    UUID getRequestId();

    /**
     * Sets the request identifier.
     * 
     * @param value The reqeust identifier.
     */
    void setRequestId( UUID value );

    /**
     * Gets the correlation identifier.
     * 
     * @return The correlation identifier.
     */
    UUID getCorrelationId();

    /**
     * Sets the correlation identifier.
     * 
     * @param value The correlation identifier.
     */
    void setCorrelationId( UUID value );

    /**
     * Gets the locale.
     * 
     * @return The locale
     */
    String getLocale();

    /**
     * Sets the locale.
     * 
     * @param value The locale.
     */
    void setLocale( String value );

    /**
     * Gets the e-tag used for concurrency control.
     * 
     * @return The e-tag used for concurrency control.
     */
    String getIfMatch();

    /**
     * Sets the e-tag used for concurrency control.
     * 
     * @param value The e-tag used for concurrency control.
     */
    void setIfMatch( String value );

    /**
     * Gets the request content type.
     * 
     * @return The request content type.
     */
    String getContentType();

    /**
     * Sets the request content type.
     * 
     * @param value The request content type.
     */
    void setContentType( String value );

    /**
     * Gets the accepted response type.
     * 
     * @return The accepted response type.
     */
    String getAccept();

    /**
     * Sets the accepted response type.
     * 
     * @param value The accepted response type.
     */
    void setAccept( String value );

    /**
     * Gets the additional request headers.
     * 
     * @return The additional request headers.
     */
    Collection<KeyValuePair<String, String>> getAdditionalRequestHeaders();

    /**
     * Gets a collection of Uri parameters which will be added to the request query string. You can add your own uri
     * parameters to this collection.
     * 
     * @return A collection of URI parameters.
     */
    Collection<KeyValuePair<String, String>> getUriParameters();

    /**
     * Gets the resource path which will be appended to the root URL.
     * 
     * @return The resource path which will be appended to the root URL.
     */
    String getResourcePath();

    /**
     * Sets the resource path which will be appended to the root URL.
     * 
     * @param value The resource path which will be appended to the root URL.
     */
    void setResourcePath( String value );

    /**
     * Executes a GET request against the partner service.
     * 
     * @return The GET response.
     */
    TResponse get();

    /**
     * Executes a file content request against the partner service.
     * 
     * @return The file content stream.
     */
    InputStream getFileContent();
}