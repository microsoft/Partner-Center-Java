// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.domains;

import com.microsoft.store.partnercenter.IPartnerComponentString;

public interface IDomainCollection extends IPartnerComponentString
{
    /**
     * Obtains a specific domain behavior.
     * 
     * @param domain The domain.
     * 
     * @return The domain operations.
     */
    IDomain byDomain(String domain);
}