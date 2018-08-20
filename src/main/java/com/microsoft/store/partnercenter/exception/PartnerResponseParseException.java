// -----------------------------------------------------------------------
// <copyright file="PartnerResponseParseException.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.exception;

import java.text.MessageFormat;
import java.util.Locale;

import com.microsoft.store.partnercenter.requestcontext.IRequestContext;

/**
 * This exception is thrown by {@link #IPartnerServiceProxy{TRequest,TResponse}} objects when they fail to parse the
 * response according to the caller's expectations.
 */
public class PartnerResponseParseException
    extends PartnerException
{
    private static final long serialVersionUID = 2L;

    /**
     * Initializes a new instance of the {@link #PartnerResponseParseException} class.
     */
    public PartnerResponseParseException()
    {
        this( "" );
    }

    /**
     * Initializes a new instance of the {@link #PartnerResponseParseException} class.
     * 
     * @param message The exception message.
     */
    public PartnerResponseParseException( String message )
    {
        this( message, null );
    }

    /**
     * Initializes a new instance of the {@link #PartnerResponseParseException} class.
     * 
     * @param message The exception message.
     * @param innerException The exception that is the cause of the current exception, or a null reference if no inner
     *            exception is specified.
     */
    public PartnerResponseParseException( String message, Exception innerException )
    {
        super( message, innerException );
        this.setErrorCategory( PartnerErrorCategory.RESPONSE_PARSING );
    }

    /**
     * Initializes a new instance of the {@link #PartnerResponseParseException} class.
     * 
     * @param response The HTTP response payload which could not be parsed.
     * @param context The partner context.
     * @param message The exception message.
     * @param innerException The exception that is the cause of the current exception, or a null reference if no inner
     *            exception is specified.
     */
    public PartnerResponseParseException( String response, IRequestContext context, String message,
                                          Exception innerException )
    {
        this( message, innerException );
        this.setResponse( response );
        this.setContext( context );
    }

    /**
     * Gets the HTTP response payload which could not be parsed.
     */
    private String __Response;

    public String getResponse()
    {
        return __Response;
    }

    public void setResponse( String value )
    {
        __Response = value;
    }

    /**
     * Displays the partner API network exception details.
     * 
     * @return A string representing the network exception including the base and extended properties.
     */
    @Override
    public String toString()
    {
        return MessageFormat.format( "PartnerApiParsingException: Response: {0}, Base Description: {1}",
                                     this.getResponse().toString(), super.toString(), Locale.US );

    }

}
