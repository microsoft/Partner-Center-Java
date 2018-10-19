// -----------------------------------------------------------------------
// <copyright file="AggregatePartnerOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter;

import com.microsoft.store.partnercenter.requestcontext.IRequestContext;
import com.microsoft.store.partnercenter.requestcontext.RequestContextFactory;

/**
 * Aggregate partner implementation.
 */
public class AggregatePartnerOperations
    extends PartnerOperations
    implements IAggregatePartner
{
    /**
     * Initializes a new instance of the AggregatePartnerOperations class.
     * 
     * @param credentials The partner credentials.
     */
    public AggregatePartnerOperations( IPartnerCredentials credentials )
    {
        super( credentials, RequestContextFactory.getInstance().create() );
    }

    /**
     * Returns a partner operations object which uses the provided context when executing operations.
     * 
     * @param context An operation context object.
     * @return A partner operations object which uses the provided operation context.
     */
    @Override
    public IPartner with( IRequestContext context )
    {
        if ( context == null )
        {
            throw new IllegalArgumentException( "context null" );
        }

        return new PartnerOperations( this.getCredentials(), context );
    }
}