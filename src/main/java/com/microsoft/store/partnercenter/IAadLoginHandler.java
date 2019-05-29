// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter;

/**
 * Represents the interface for Azure Active Directory Hanlder
 *
 */
public interface IAadLoginHandler
{
    AuthenticationToken authenticate();
}