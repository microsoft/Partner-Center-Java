// ----------------------------------------------------------------
// <copyright file="ContractType.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ContractType
{
    /**
     * Describes the type of contract Refers to a contract which provides subscription for the order item placed
     */
    SUBSCRIPTION("subscription"),
    
    /**
     * Refers to a contract which provides a product key result for the order item placed
     */
    PRODUCTKEY("productkey"),
    
    /**
     * Refers to a contract which provides Redemption code result for the order item placed.
     */
    REDEMPTIONCODE("redemptioncode");

    private final String value;

    ContractType(String value)
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