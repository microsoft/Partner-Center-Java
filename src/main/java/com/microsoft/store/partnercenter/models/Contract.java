// -----------------------------------------------------------------------
// <copyright file="Contract.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
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

    /**
     * Gets or sets the order identifier.
     */
    private String __OrderId = new String();

    public String getOrderId()
    {
        return __OrderId;
    }

    public void setOrderId( String value )
    {
        __OrderId = value;
    }

    /**
     * Gets the contract type.
     */
    public abstract ContractType getContractType();

}
