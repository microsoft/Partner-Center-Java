// -----------------------------------------------------------------------
// <copyright file="IPartnerComponent.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter;

/**
 * Represents a partner SDK component. The type of the component's context object.
 */
public interface IPartnerComponent<TContext>
{
    /**
     * Gets a reference to the partner operations instance that generated this component.
     * 
     * @return A reference to the partner operations instance that generated this component.
     */
    IPartner getPartner();

    /**
     * Gets the component context object.
     * 
     * @return The component context object.
     */
    TContext getContext();
}