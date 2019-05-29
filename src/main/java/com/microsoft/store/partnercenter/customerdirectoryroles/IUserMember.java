// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customerdirectoryroles;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityDeleteOperations;
import com.microsoft.store.partnercenter.models.roles.UserMember;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Represents a Directory User
 *
 */
public interface IUserMember
	extends IPartnerComponent<TripletTuple<String,String,String>>, IEntityDeleteOperations<UserMember>
{
    /**
     * Remove directory user member from directory role.
     */
    void delete();
}
