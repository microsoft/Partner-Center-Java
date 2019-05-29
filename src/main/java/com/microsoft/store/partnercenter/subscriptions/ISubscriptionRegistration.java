// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.subscriptions;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Defines the operations available on a customer's subscription registrations.
 */
public interface ISubscriptionRegistration
    extends IPartnerComponent<Tuple<String, String>>
{
    /**
     * Register a subscription to enable Azure Reserved instance purchase.
     * 
     * @return The location which indicates the URL of the API to query for status.
     */
    String register();
}