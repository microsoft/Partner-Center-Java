// -----------------------------------------------------------------------
// <copyright file="CartErrorCode.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.carts;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Types of cart error code.
 */
public enum CartErrorCode {
    /***
     * Default value
     */
    @JsonProperty("unknown")
    Unknown,

    /***
     * Currency is not supported for given market
     */
    @JsonProperty("currency_is_not_supported")
    CurrencyIsNotSupported,

    /***
     * Catalog item id is not valid
     */
    @JsonProperty("catalog_item_id_is_not_valid")
    CatalogItemIdIsNotValid,

    /***
     * Not enough quota available
     */
    @JsonProperty("quota_not_available")
    QuotaNotAvailable,

    /***
     * Inventory is not available for selected offer
     */
    @JsonProperty("inventory_not_available")
    InventoryNotAvailable,

    /***
     * Setting participants is not supported for Partner
     */
    @JsonProperty("participants_is_not_supported_for_partner")
    ParticipantsIsNotSupportedForPartner,

    /***
     * Unable to process cart line item.
     */
    @JsonProperty("unable_to_process_cart_line_item")
    UnableToProcessCartLineItem,

    /***
     * Subscription is not valid.
     */
    @JsonProperty("subscription_is_not_valid")
    SubscriptionIsNotValid,

    /***
     * Subscription is not enabled for RI purchase.
     */
    @JsonProperty("subscription_is_not_enabled_for_ri")
    SubscriptionIsNotEnabledForRI,

    /***
     * The sandbox limit has been exceeded.
     */
    @JsonProperty("sandbox_limit_exceeded")
    SandboxLimitExceeded
}