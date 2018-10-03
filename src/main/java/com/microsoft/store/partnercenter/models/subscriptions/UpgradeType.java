// -----------------------------------------------------------------------
// <copyright file="UpgradeType.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum UpgradeType
{
    /**
     * Represents a form of upgrade for a subscription Default value
     */
    @JsonProperty( "none" ) 
    NONE, 
    
    /**
     * Only subscription upgrade
     */
    @JsonProperty( "upgrade_only" ) 
    UPGRADE_ONLY, 
    
    /**
     * Subscription upgrade and license transfer
     */
    @JsonProperty( "upgrade_with_license_transfer" ) 
    UPGRADE_WITH_LICENSE_TRANSFER
}