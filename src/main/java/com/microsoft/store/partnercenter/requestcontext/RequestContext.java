// -----------------------------------------------------------------------
// <copyright file="RequestContext.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.requestcontext;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.UUID;

import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Request context implementation.
 */
public class RequestContext
    implements IRequestContext
{
    /**
     * Initializes a new instance of the RequestContext class. Correlation Id will be generated. The request Id
     * will be automatically generated for each service API call.
     */
    public RequestContext()
    {
        this( UUID.randomUUID(), new UUID( 0, 0 ), null );
    }

    /**
     * Initializes a new instance of the RequestContext class with provided locale. Correlation Id will be
     * generated. The request Id will be automatically generated for each service API call.
     * 
     * @param locale The locale.
     */
    public RequestContext( String locale )
    {
        this( UUID.randomUUID(), new UUID( 0, 0 ), locale );
    }

    /**
     * Initializes a new instance of the RequestContext class with a correlation Id. The request Id will be
     * automatically generated and a default Locale is set for each service API call.
     * 
     * @param correlationId The correlation Id. This Id is used to group logical operations together.
     */
    public RequestContext( UUID correlationId )
    {
        this( correlationId, new UUID( 0, 0 ), null );
    }

    /**
     * Initializes a new instance of the RequestContext class with a correlation Id and the provided locale.
     * The request Id will be automatically generated for each service API call.
     * 
     * @param correlationId The correlation Id. This Id is used to group logical operations together.
     * @param locale The locale.
     */
    public RequestContext( UUID correlationId, String locale )
    {
        this( correlationId, new UUID( 0, 0 ), locale );
    }

    /**
     * Initializes a new instance of the RequestContext class with the given correlation, request identifier and
     * locale.
     * 
     * @param correlationId The correlation Id. This Id is used to group logical operations together.
     * @param requestId The request Id. Uniquely identifies the operation.
     * @param locale The locale.
     */
    public RequestContext( UUID correlationId, UUID requestId, String locale )
    {
        if ( StringHelper.isNullOrWhiteSpace( locale ) )
        {
            locale = PartnerService.getInstance().getConfiguration().getDefaultLocale();
        }

        this.setCorrelationId( correlationId );
        this.setRequestId( requestId );
        this.setLocale( locale );
    }

    private UUID __RequestId;
    
    /**
     * Gets the request identifier. Uniquely identifies the operation.
     * 
     * @return the request identifier.
     */
    @Override
    public UUID getRequestId()
    {
        return __RequestId;
    }

    /**
     * Sets the request identifier.
     * 
     * @param value The request identifier.
     */
    public void setRequestId( UUID value )
    {
        __RequestId = value;
    }

    private UUID __CorrelationId;

    /**
     * Gets the correlation identifier. This identifier is used to group logical operations together.
     */
    @Override
    public UUID getCorrelationId()
    {
        return __CorrelationId;
    }

    /**
     * Sets the correlation identifier.
     * 
     * @param value The correlation identifier.
     */
    public void setCorrelationId( UUID value )
    {
        __CorrelationId = value;
    }

    private String __Locale = new String();

    /**
     * Gets the locale.
     * 
     * @return The locale.
     */
    @Override
    public String getLocale()
    {
        return __Locale;
    }

    /**
     * Sets the locale.
     * 
     * @param value The locale.
     */
    public void setLocale( String value )
    {
        __Locale = value;
    }

    /**
     * Returns a string representation of the request context.
     * 
     * @return A string representation of the request context.
     */
    @Override
    public String toString()
    {
        return MessageFormat.format( "Request Id: {0}, Correlation Id: {1}, Locale: {2}"
            + this.getRequestId().toString(), this.getCorrelationId().toString(), this.getLocale(), Locale.US );
    }
}