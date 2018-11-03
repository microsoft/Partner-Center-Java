// -----------------------------------------------------------------------
// <copyright file="Contract.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

/**
 * Base Contract
 */
public abstract class Contract
    extends ResourceBase
{
    protected Contract()
    {
        super();
    }

    private String orderId;

    /**
     * Gets the order identifier.
     * 
     * @return The order identifier.
     */
    public String getOrderId()
    {
        return orderId;
    }

    /**
     * Sets the order identifier.
     * 
     * @param value The order identifier.
     */
    public void setOrderId( String value )
    {
        orderId = value;
    }

    /**
     * Gets the contract type.
     * 
     * @return The contract type.
     */
    public abstract ContractType getContractType();
}