// -----------------------------------------------------------------------
// <copyright file="IAadLoginHandler.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter;

/**
 * Represents the interface for Azure Active Directory Hanlder
 *
 */
public interface IAadLoginHandler
{
    AuthenticationToken authenticate();
}