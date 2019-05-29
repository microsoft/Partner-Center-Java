// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.carts;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Types of cart error code.
 */
public enum CartErrorCode {
    /**
     * Default value
     */
    UNKNOWN(0),

    /**
     * Currency is not supported for given market
     */
    CURRENCY_IS_NOT_SUPPORTED(10000),

    /**
     * Catalog item id is not valid
     */
    CATALOG_ITEM_ID_IS_NOT_VALID(10001),

    /**
     * Not enough quota available
     */
    QUOTA_NOT_AVAILABLE(10002),

    /**
     * Inventory is not available for selected offer
     */
    INVENTORY_NOT_AVAILABLE(10003),

    /**
     * Setting participants is not supported for Partner
     */
    PARTICIPANTS_IS_NOT_SUPPORTED_FOR_PARTNER(10004),

    /**
     * Unable to process cart line item.
     */
    UNABLE_TO_PROCESS_CART_LINE_ITEM(10006),

    /**
     * Subscription is not valid.
     */
    SUBSCRIPTION_IS_NOT_VALID(10007),

    /**
     * Subscription is not enabled for RI purchase.
     */
    SUBSCRIPTION_IS_NOT_ENABLED_FOR_RI(10008),

    /**
     * The sandbox limit has been exceeded.
     */
    SANDBOX_LIMIT_EXCEEDED(10009);

    private final int value;

    CartErrorCode(final int value) {
        this.value = value;
    }

    @JsonCreator
    public static CartErrorCode valueOf(final int i) {
        for (final CartErrorCode item : CartErrorCode.values()) {
            if (item.intValue() == i) {
                return item;
            }
        }

        return null;
    }

    @JsonValue
    public int intValue() {
        return value;
    }
}