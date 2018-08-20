// -----------------------------------------------------------------------
// <copyright file="OrderError.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.carts;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/***
 * Represents an error with an order.
 */
public class OrderError 
    extends ResourceBase
{
    /***
     * Gets or sets the order group identifier with failure.
     */
	@JsonProperty( "orderGroupId" )
    private String __OrderGroupId;

    public String getOrderGroupId()
    {
        return __OrderGroupId;
    }

    public void setOrderGroupId( String value )
    {
    	__OrderGroupId = value;
    }

    /***
     * Gets or sets the error code associated with the issue.
     */
	@JsonProperty( "code" )
    private int __Code;

    public int getCode()
    {
        return __Code;
    }

    public void setCode( int value )
    {
    	__Code = value;
    }

    /***
     * Gets or sets the description of the issue.
     */
	@JsonProperty( "description" )
    private String __Description;

    public String getDescription()
    {
        return __Description;
    }

    public void setDescription( String value )
    {
    	__Description = value;
    }
 }