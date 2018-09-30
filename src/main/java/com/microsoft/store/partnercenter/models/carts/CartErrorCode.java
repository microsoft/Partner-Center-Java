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
    UNKNOWN,

    /***
     * Currency is not supported for given market
     */
    @JsonProperty("currency_is_not_supported")
    CURRENCY_IS_NOT_SUPPORTED,

    /***
     * Catalog item id is not valid
     */
    @JsonProperty("catalog_item_id_is_not_valid")
    CATALOG_ITEM_ID_IS_NOT_VALID,

    /***
     * Not enough quota available
     */
    @JsonProperty("quota_not_available")
    QUOTA_NOT_AVAILABLE,

    /***
     * Inventory is not available for selected offer
     */
    @JsonProperty("inventory_not_available")
    INVENTORY_NOT_AVAILABLE,

    /***
     * Setting participants is not supported for Partner
     */
    @JsonProperty("participants_is_not_supported_for_partner")
    PARTICIPANTS_IS_NOT_SUPPORTED_FOR_PARTNER,

    /***
     * Unable to process cart line item.
     */
    @JsonProperty("unable_to_process_cart_line_item")
    UNABLE_TO_PROCESS_CART_LINE_ITEM,

    /***
     * Subscription is not valid.
     */
    @JsonProperty("subscription_is_not_valid")
    SUBSCRIPTION_IS_NOT_VALID,

    /***
     * Subscription is not enabled for RI purchase.
     */
    @JsonProperty("subscription_is_not_enabled_for_ri")
    SUBSCRIPTION_IS_NOT_ENABLED_FOR_RI,

    /***
     * The sandbox limit has been exceeded.
     */
    @JsonProperty("sandbox_limit_exceeded")
    SANDBOX_LIMIT_EXCEEDED
}