// -----------------------------------------------------------------------
// <copyright file="IUserMember.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customerdirectoryroles;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityDeleteOperations;
import com.microsoft.store.partnercenter.models.roles.UserMember;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

public interface IUserMember
	extends IPartnerComponent<TripletTuple<String,String,String>>, IEntityDeleteOperations<UserMember>
{
    /***
     * Remove directory user member from directory role.
     */
    void delete();
}
