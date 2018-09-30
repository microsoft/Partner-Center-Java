// -----------------------------------------------------------------------
// <copyright file="ParticipantType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.carts;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Types of Participants
 */
public enum ParticipantType {
    /***
     * Default value if not known
     */
    @JsonProperty("unknown")
    UNKNOWN,

    /***
     * An indirect reseller with a transaction role.
     */
    @JsonProperty("transaction_reseller")
    TRANSACTION_RESELLER
}