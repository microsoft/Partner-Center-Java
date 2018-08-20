// ----------------------------------------------------------------
// <copyright file="SubscriptionStatus.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SubscriptionStatus
{
    /**
     * Enum representing the available states for a subscription Indicates nothing - no status, used as an initializer
     */
    @JsonProperty( "none" ) NONE, /**
                                   * Subscription state: Active
                                   */
    @JsonProperty( "active" ) ACTIVE, /**
                                       * Subscription state: Suspended
                                       */
    @JsonProperty( "suspended" ) SUSPENDED, /**
                                             * Subscription state: Deleted
                                             */
    @JsonProperty( "deleted" ) DELETED
}