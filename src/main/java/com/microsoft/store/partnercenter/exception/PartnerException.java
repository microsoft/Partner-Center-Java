// -----------------------------------------------------------------------
// <copyright file="PartnerException.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.exception;

import java.text.MessageFormat;

import com.microsoft.store.partnercenter.models.ApiFault;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;

/**
 * The standard exception thrown by the partner SDK. This pertains to errors accessing the partner service. Other
 * standard exceptions such as null argument exceptions will also be thrown in case of malformed input.
 */
public class PartnerException
    extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    /**
     * Initializes a new instance of the PartnerException} class.
     */
    public PartnerException()
    {
        super();
        this.setErrorCategory( PartnerErrorCategory.NOT_SPECIFIED );
    }

    /**
     * Initializes a new instance of the PartnerException class.
     * 
     * @param message The exception message.
     */
    public PartnerException( String message )
    {
        this( message, null );
    }

    /**
     * Initializes a new instance of the PartnerException class.
     * 
     * @param message The exception message.
     * @param innerException The exception that is the cause of the current exception, or a null reference if no inner
     *            exception is specified.
     */
    public PartnerException( String message, Exception innerException )
    {
        super( message, innerException );
        this.setErrorCategory( PartnerErrorCategory.NOT_SPECIFIED );
    }

    /**
     * Initializes a new instance of the PartnerException class.
     * 
     * @param message The exception message.
     * @param context The partner context.
     * @param errorCategory The error category.
     */
    public PartnerException( String message, IRequestContext context, PartnerErrorCategory errorCategory )
    {
        this( message, context, errorCategory, null );
    }

    /**
     * Initializes a new instance of the PartnerException class.
     * 
     * @param message The exception message.
     * @param context The partner context.
     * @param errorCategory The error category.
     * @param innerException The inner exception.
     */
    public PartnerException( String message, IRequestContext context, PartnerErrorCategory errorCategory,
                             Exception innerException )
    {
        super( message, innerException );
        this.setErrorCategory( errorCategory );
        this.setContext( context );
    }

    /**
     * Initializes a new instance of the PartnerException class.
     * 
     * @param apiFault The API fault object returned by the partner service.
     * @param context The partner context.
     */
    public PartnerException( ApiFault apiFault, IRequestContext context )
    {
        this( apiFault, context, PartnerErrorCategory.NOT_SPECIFIED, null );
    }

    public PartnerException( ApiFault apiFault, IRequestContext context, PartnerErrorCategory errorCategory )
    {
        this( apiFault, context, errorCategory, null );
    }

    public PartnerException( ApiFault apiFault, IRequestContext context, PartnerErrorCategory errorCategory,
                             Exception innerException )
    {
        this( apiFault != null ? apiFault.getErrorMessage() : "", context, errorCategory, innerException );
        this.setServiceErrorPayload( apiFault );
    }

    /**
     * Gets the error classification that resulted in this exception.
     */
    private PartnerErrorCategory errorCategory;

    public PartnerErrorCategory getErrorCategory()
    {
        return errorCategory;
    }

    public void setErrorCategory( PartnerErrorCategory value )
    {
        errorCategory = value;
    }

    /**
     * Gets the service error payload.
     */
    private ApiFault serviceErrorPayload;

    public ApiFault getServiceErrorPayload()
    {
        return serviceErrorPayload;
    }

    public void setServiceErrorPayload( ApiFault value )
    {
        serviceErrorPayload = value;
    }

    /**
     * Gets the partner context associated with the exception.
     */
    private IRequestContext context;

    public IRequestContext getContext()
    {
        return context;
    }

    public void setContext( IRequestContext value )
    {
        context = value;
    }

    /**
     * Displays the partner exception details.
     * 
     * @return A string representing the partner exception including the base and extended properties.
     */
    @Override
    public String toString()
    {
        return MessageFormat.format( "PartnerException: ErrorCategory: {0}, ServiceErrorPayload: {1}, Context: {2}, Base Description: {3}",
                                     this.getErrorCategory(), 
                                     this.getServiceErrorPayload() != null ? this.getServiceErrorPayload().toString() : "null",
                                     this.getContext(), 
                                     super.toString() );

    }
}