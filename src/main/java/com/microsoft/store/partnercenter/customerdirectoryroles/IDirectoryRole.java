// -----------------------------------------------------------------------
// <copyright file="IDirectoryRole.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customerdirectoryroles;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.utils.Tuple;

public interface IDirectoryRole extends IPartnerComponent<Tuple<String, String>>
{
    /***
     * Gets the current directory role's user member collection operations.
     * @return
     */
    IUserMemberCollection getUserMembers();
}
