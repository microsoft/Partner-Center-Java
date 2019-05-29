// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customerdirectoryroles;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents a Directory Role
 *
 */
public interface IDirectoryRole extends IPartnerComponent<Tuple<String, String>>
{
    /**
     * Gets the current directory role's user member collection operations.
     * 
     * @return The current directory role's user member collection operations
     */
    IUserMemberCollection getUserMembers();
}