// -----------------------------------------------------------------------
// <copyright file="Cart.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.carts;

import java.util.List;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/***
 * This class represents a model of a cart object.
 */
public class Cart 
    extends ResourceBaseWithLinks<StandardResourceLinks> {
    /***
     * Gets or sets a unique cart identifier.
     */
	@JsonProperty( "id" )
    private String __Id;

    public String getId()
    {
        return __Id;
    }

    public void setId( String value )
    {
    	__Id = value;
    }

    /***
     * Gets or sets the creation timestamp.
     */
	@JsonProperty( "creationTimestamp" )
    private DateTime __CreationTimestamp;

    public DateTime getCreationTimestamp()
    {
        return __CreationTimestamp;
    }

    public void setCreationTimestamp( DateTime value )
    {
    	__CreationTimestamp = value;
    }

    /***
     *   Gets or sets the last modified timestamp.
     */
    @JsonProperty( "lastModifiedTimestamp" )
    private DateTime __LastModifiedTimestamp;

    public DateTime getLastModifiedTimestamp()
    {
        return __LastModifiedTimestamp;
    }

    public void setLastModifiedTimestamp( DateTime value )
    {
    	__LastModifiedTimestamp = value;
    }

    /***
     *  Gets or sets the expiration timestamp.
     */
    @JsonProperty( "expirationTimestamp" )
    private DateTime __ExpirationTimestamp;

    public DateTime getExpirationTimestamp()
    {
        return __ExpirationTimestamp;
    }

    public void setExpirationTimestamp( DateTime value )
    {
    	__ExpirationTimestamp = value;
    }

    /***
     *  Gets or sets the last modified user or application.
     */
    @JsonProperty( "lineItems" )
    private List<CartLineItem> __LineItems;

    public List<CartLineItem> getLineItems()
    {
        return __LineItems;
    }

    public void setLineItems( List<CartLineItem> value )
    {
    	__LineItems = value;
    }
 }