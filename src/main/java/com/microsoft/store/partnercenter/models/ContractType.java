// ----------------------------------------------------------------
// <copyright file="ContractType.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ContractType
{
    /**
     * Describes the type of contract Refers to a contract which provides subscription for the order item placed
     */
    @JsonProperty( "subscription" ) 
    SUBSCRIPTION,
    
    /**
     * Refers to a contract which provides a product key result for the order item placed
     */
    @JsonProperty( "productkey" ) 
    PRODUCTKEY,
    
    /**
     * Refers to a contract which provides Redemption code result for the order item placed.
     */
    @JsonProperty( "redemptioncode" ) 
    REDEMPTIONCODE
}