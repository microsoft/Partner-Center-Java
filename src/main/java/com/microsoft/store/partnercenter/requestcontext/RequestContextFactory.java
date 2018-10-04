//-----------------------------------------------------------------------
//<copyright file="RequestContextFactory.java" company="Microsoft">
//   Copyright (c) Microsoft Corporation.  All rights reserved.
//</copyright>
//-----------------------------------------------------------------------

package com.microsoft.store.partnercenter.requestcontext;

import java.util.UUID;

public class RequestContextFactory
{
    /***
     * A singleton instance of the request context factory.
     */
    private static RequestContextFactory __instance = new RequestContextFactory();

    /***
     * Prevents a default instance of the <see cref="RequestContextFactory"/> class from being created.
     */
    private RequestContextFactory()
    {
    }

    /***
     * Gets an instance of the request context factory.
     */
    public static RequestContextFactory getInstance()
    {
        return RequestContextFactory.__instance;
    }

    /**
     * Creates a request context object which will use a randomly generated correlation Id and a unique request Id for
     * each partner API call.
     * 
     * @return A request context object.
     */
    public IRequestContext create()
    {
        return new RequestContext();
    }

    /**
     * Creates a request context object which will use a randomly generated correlation Id, a unique request Id and
     * provided locale for each partner API call.
     * 
     * @param locale The locale.
     * @return A request context object.
     */
    public IRequestContext create( String locale )
    {
        return new RequestContext( locale );
    }

    /**
     * Creates a request context object with the provided correlation Id and a unique request Id for each partner API
     * call.
     * 
     * @param correlationId The correlation Id.
     * @return A request context object.
     */
    public IRequestContext create( UUID correlationId )
    {
        return new RequestContext( correlationId );
    }

    /**
     * Creates a request context object with the provided correlation Id, a unique request Id and provided locale for
     * each partner API call.
     * 
     * @param correlationId The correlation Id.
     * @param locale The locale
     * @return A request context object.
     */
    public IRequestContext create( UUID correlationId, String locale )
    {
        return new RequestContext( correlationId, locale );
    }

    /**
     * Creates a request context object with the provided correlation and request Ids.
     * 
     * @param correlationId The correlation Id.
     * @param requestId The request Id.
     * @return A request context object.
     */
    public IRequestContext create( UUID correlationId, UUID requestId )
    {
        return new RequestContext( correlationId, requestId, null );
    }

    /**
     * Creates a request context object with the provided correlation, request Ids and locale.
     * 
     * @param correlationId The correlation Id.
     * @param requestId The request Id.
     * @param locale The locale.
     * @return A request context object.
     */
    public IRequestContext create( UUID correlationId, UUID requestId, String locale )
    {
        return new RequestContext( correlationId, requestId, locale );
    }

}
