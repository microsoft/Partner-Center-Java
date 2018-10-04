// -----------------------------------------------------------------------
// <copyright file="Link.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

import java.net.URI;
import java.util.Collection;
import java.util.LinkedList;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.utils.UriDeserializer;

/**
 * Link represents a URI and the HTTP method which indicates the desired action for accessing the resource.
 */
public class Link
{
    public Link()
    {
    }

    /**
     * Initializes a new instance of the Link class.
     * 
     * @param uri The URI.
     */
    public Link( URI uri )

    {
        this( uri, "GET" );
    }

    /**
     * Initializes a new instance of the Link class.
     * 
     * @param uri The URI.
     * @param method The HTTP method.
     * @param headers Optional HTTP headers.
     */
    public Link( URI uri, String method, Collection<KeyValuePair<String, String>> headers )

    {
        this.setUri( uri );
        this.setMethod( method );
        this.setHeaders( headers != null ? headers : new LinkedList<KeyValuePair<String, String>>() );
    }

    public Link( URI uri, String string )

    {
        this( uri, string, null );
    }

    /**
     * Gets the URI.
     */
    @JsonDeserialize( using = UriDeserializer.class )
    private URI __Uri;

    public URI getUri()
    {
        return __Uri;
    }

    public void setUri( URI value )
    {
        __Uri = value;
    }

    /**
     * Gets the method.
     */
    private String __Method;

    public String getMethod()
    {
        return __Method;
    }

    public void setMethod( String value )
    {
        __Method = value;
    }

    /**
     * Gets the link headers.
     */
    private Collection<KeyValuePair<String, String>> __Headers;

    public Collection<KeyValuePair<String, String>> getHeaders()
    {
        return __Headers;
    }

    public void setHeaders( Collection<KeyValuePair<String, String>> value )
    {
        __Headers = value;
    }

}
