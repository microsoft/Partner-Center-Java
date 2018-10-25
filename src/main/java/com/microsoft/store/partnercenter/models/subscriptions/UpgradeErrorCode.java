// -----------------------------------------------------------------------
// <copyright file="UpgradeErrorCode.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UpgradeErrorCode
{
    /**
     * The type of errors that prevent subscription upgrading from happening General error.
     */
    OTHER("Other"),

    /**
     * Upgrade cannot be performed because administrative permissions have been removed.
     */
    DELEGATED_ADMIN_PERMISSIONS_DISABLED("DelegatedAdminPermissionsDisabled"),

    /**
     * Upgrade cannot be performed because the subscription status is suspended or deleted.
     */
    SUBSCRIPTION_STATUS_NOT_ACTIVE("SubscriptionStatusNotActive"),

    /**
     * Upgrade cannot be performed because of conflicting source service types.
     */
    CONFLICTING_SERVICE_TYPES("ConflictingServiceTypes"),

    /**
     * Upgrade cannot be performed due to concurrent subscription restrictions.
     */
    CONCURRENCY_CONFLICTS("ConcurrencyConflicts"),

    /**
     * Upgrade cannot be performed because the current request is using app context.
     */
    USER_CONTEXT_REQUIRED("UserContextRequired"),

    /**
     * Upgrade cannot be performed because the source subscription has previously purchased add-ons.
     */
    SUBSCRIPTION_ADD_ONS_PRESENT("SubscriptionAddOnsPresent"),

    /**
     * Upgrade cannot be performed because the source subscription does not have upgrade paths.
     */
    SUBSCRIPTION_DOES_NOT_HAVE_ANY_UPGRADE_PATHS("SubscriptionDoesNotHaveAnyUpgradePaths"),

    /**
     * Upgrade cannot be performed because the specified upgrade path is not an available upgrade path.
     */
    SUBSCRIPTION_TARGET_OFFER_NOT_FOUND("SubscriptionTargetOfferNotFound"),

    /**
     * The subscription is not provisioned yet. Happens when the order is still being processed. Eventually the
     * subscription ill be provisioned and an entitlement is created.
     */
    SUBSCRIPTION_NOT_PROVISIONED("SubscriptionNotProvisioned");

    private final String value;

    UpgradeErrorCode(String value)
    {
        this.value = value;
    }

    /**
     * Converts the object to a string.
     *
     * @return A string that represents this object.
     */
    @JsonValue
    @Override
    public String toString()
    {
        return value;
    }
}
