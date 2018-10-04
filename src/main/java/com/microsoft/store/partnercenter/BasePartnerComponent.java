// -----------------------------------------------------------------------
// <copyright file="BasePartnerComponent.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter;

/**
 * Holds common partner component properties and behavior. All components should inherit from this class. The context
 * object type.
 */
public abstract class BasePartnerComponent<TContext>
    implements IPartnerComponent<TContext>
{
    /**
     * Initializes a new instance of the BasePartnerComponent class.
     * 
     * @param rootPartnerOperations The root partner operations that created this component.
     * @param componentContext A component context object to work with.
     */
    protected BasePartnerComponent( IPartner rootPartnerOperations, TContext componentContext )
    {
        if ( rootPartnerOperations == null )
        {
            throw new NullPointerException( "rootPartnerOperations null" );
        }

        this.setPartner( rootPartnerOperations );
        this.setContext( componentContext );
    }

    /**
     * Gets a reference to the partner operations instance that generated this component.
     */
    private IPartner __Partner;

    @Override
    public IPartner getPartner()
    {
        return __Partner;
    }

    private void setPartner( IPartner value )
    {
        __Partner = value;
    }

    /**
     * Gets the component context object.
     */
    private TContext __Context;

    @Override
    public TContext getContext()
    {
        return __Context;
    }

    private void setContext( TContext value )
    {
        __Context = value;
    }
}