// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.applicationconsents;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityDeleteOperations;
import com.microsoft.store.partnercenter.models.applicationconsents.ApplicationConsent;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents an application consent
 */
public interface IApplicationConsent
        extends IPartnerComponent<Tuple<String, String>>,
        IEntityDeleteOperations<ApplicationConsent>
{
    /**
     * Remove application consent.
     */
    void delete();
}
