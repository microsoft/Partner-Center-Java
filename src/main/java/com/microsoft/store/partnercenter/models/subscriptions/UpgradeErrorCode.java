// -----------------------------------------------------------------------
// <copyright file="UpgradeErrorCode.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum UpgradeErrorCode
{
    /**
     * The type of errors that prevent subscription upgrading from happening General error.
     */
    @JsonProperty( "Other" ) 
    OTHER,
    
    /**
     * Upgrade cannot be performed because administrative permissions have been removed.
     */
    @JsonProperty( "DelegatedAdminPermissionsDisabled" ) 
    DELEGATED_ADMIN_PERMISSIONS_DISABLED,
    
    /**
     * Upgrade cannot be performed because the subscription status is suspended or deleted.
     */
    @JsonProperty( "SubscriptionStatusNotActive" ) 
    SUBSCRIPTION_STATUS_NOT_ACTIVE,
    
    /**
     * Upgrade cannot be performed because of conflicting source service types.
     */
    @JsonProperty( "ConflictingServiceTypes" ) 
    CONFLICTING_SERVICE_TYPES,
    
    /**
     * Upgrade cannot be performed due to concurrent subscription restrictions.
     */
    @JsonProperty( "ConcurrencyConflicts" ) 
    CONCURRENCY_CONFLICTS,
    
    /**
     * Upgrade cannot be performed because the current request is using app context.
     */
    @JsonProperty( "UserContextRequired" ) 
    USER_CONTEXT_REQUIRED,
    
    /**
     * Upgrade cannot be performed because the source subscription has previously purchased add-ons.
     */
    @JsonProperty( "SubscriptionAddOnsPresent" ) 
    SUBSCRIPTION_ADD_ONS_PRESENT,
    
    /**
     * Upgrade cannot be performed because the source subscription does not have upgrade paths.
     */
    @JsonProperty( "SubscriptionDoesNotHaveAnyUpgradePaths" ) 
    SUBSCRIPTION_DOES_NOT_HAVE_ANY_UPGRADE_PATHS,
    
    /**
     * Upgrade cannot be performed because the specified upgrade path is not an available upgrade path.
     */
    @JsonProperty( "SubscriptionTargetOfferNotFound" ) 
    SUBSCRIPTION_TARGET_OFFER_NOT_FOUND,
    
    /**
     * The subscription is not provisioned yet. Happens when the order is still being processed. Eventually the
     * subscription ill be provisioned and an entitlement is created.
     */
    @JsonProperty( "SubscriptionNotProvisioned" ) 
    SUBSCRIPTION_NOT_PROVISIONED
}
