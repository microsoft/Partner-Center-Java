// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.subscriptions;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityUpdateOperations;
import com.microsoft.store.partnercenter.models.subscriptions.SupportContact;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Defines the operations available on a customer's subscription support contact.
 */
public interface ISubscriptionSupportContact
    extends IPartnerComponent<Tuple<String, String>>,  IEntityGetOperations<SupportContact>, IEntityUpdateOperations<SupportContact>
{
    /**
     * Retrieves the support contact of the customer's subscription.
     * 
     * @return The subscription's support contact.
     */
    SupportContact get();

    /**
     * Updates the support contact of the customer's subscription.
     * 
     * @param supportContact The support contact
     * @return The updated support contact.
     */
    SupportContact update(SupportContact supportContact);
}