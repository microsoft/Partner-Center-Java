// -----------------------------------------------------------------------
// <copyright file="IAadLoginHandler.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter;

public interface IAadLoginHandler
{
    AuthenticationToken authenticate();
}