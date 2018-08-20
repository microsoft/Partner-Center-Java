// -----------------------------------------------------------------------
// <copyright file="IPartnerServiceProxy.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
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
     * Gets or sets the assigned Microsoft Id.
     */
    UUID getRequestId();

    void setRequestId( UUID value );

    /**
     * Gets or sets the assigned Microsoft correlation Id.
     */
    UUID getCorrelationId();

    void setCorrelationId( UUID value );

    /**
     * Gets or sets the assigned Locale.
     */
    String getLocale();

    void setLocale( String value );

    /**
     * Gets or sets the e-tag used for concurrency control.
     */
    String getIfMatch();

    void setIfMatch( String value );

    /**
     * Gets or sets the request content type.
     */
    String getContentType();

    void setContentType( String value );

    /**
     * Gets or sets the accepted response type.
     */
    String getAccept();

    void setAccept( String value );

    /**
     * Gets the additional request headers.
     */
    Collection<KeyValuePair<String, String>> getAdditionalRequestHeaders();

    /**
     * Gets a collection of Uri parameters which will be added to the request query string. You can add your own uri
     * parameters to this collection.
     */
    Collection<KeyValuePair<String, String>> getUriParameters();

    /**
     * Gets or sets the resource path which will be appended to the root URL.
     */
    String getResourcePath();

    void setResourcePath( String value );

    /**
     * Executes a GET request against the partner service.
     * 
     * @return The GET response.
     */
    TResponse get();

    /***
     * Executes a file content request against the partner service.
     * @return: The file content stream.
     */
    InputStream getFileContent();

    /**
     * Executes a POST request against the partner service.
     * 
     * @param content The request body content.
     * @return The POST response.
     */
    TResponse post( TRequest content );

    /**
     * Executes a PATCH request against the partner service.
     *
     * @param content The request body content.
     * @return The PATCH response.
     */
    TResponse patch( TRequest content );

    /**
     * Executes a PUT request against the partner service.
     *
     * @param content The request body content.
     * @return The PUT response.
     */
    TResponse put( TRequest content );

    /**
     * Executes a DELETE request against the partner service.
     * @return: The DELETE response.
     */
    void delete();

    /***
     * Executes a HEAD request against the partner service.
     * @return: The HEAD response.
     */
    void head();
}