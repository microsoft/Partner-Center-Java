// -----------------------------------------------------------------------
// <copyright file="BasePartnerComponent.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
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
    private IPartner partner;

    @Override
    public IPartner getPartner()
    {
        return partner;
    }

    private void setPartner( IPartner value )
    {
        partner = value;
    }

    /**
     * Gets the component context object.
     */
    private TContext context;

    @Override
    public TContext getContext()
    {
        return context;
    }

    private void setContext( TContext value )
    {
        context = value;
    }
}