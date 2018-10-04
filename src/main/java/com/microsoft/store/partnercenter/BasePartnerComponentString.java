// -----------------------------------------------------------------------
// <copyright file="BasePartnerComponentString.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter;

/**
 * Holds common partner component properties and behavior. The context is string type by default.
 */
public abstract class BasePartnerComponentString
    extends BasePartnerComponent<String>
{
    /**
     * Initializes a new instance of the BasePartnerComponent class.
     * 
     * @param rootPartnerOperations The root partner operations that created this component.
     */
    protected BasePartnerComponentString( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations, null );
    }

    /**
     * Initializes a new instance of the BasePartnerComponent class.
     * 
     * @param rootPartnerOperations The root partner operations that created this component.
     * @param componentContext A component context object to work with.
     */
    protected BasePartnerComponentString( IPartner rootPartnerOperations, String componentContext )
    {
        super( rootPartnerOperations, componentContext );
    }
}