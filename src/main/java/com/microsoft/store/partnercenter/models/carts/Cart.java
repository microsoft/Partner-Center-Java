// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.carts;

import java.util.List;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * This class represents a model of a cart object.
 */
public class Cart 
    extends ResourceBaseWithLinks<StandardResourceLinks> {
    /**
     * Gets or sets a unique cart identifier.
     */
	@JsonProperty( "id" )
    private String id;

    public String getId()
    {
        return id;
    }

    public void setId( String value )
    {
    	id = value;
    }

    /**
     * Gets or sets the creation timestamp.
     */
	@JsonProperty( "creationTimestamp" )
    private DateTime creationTimestamp;

    public DateTime getCreationTimestamp()
    {
        return creationTimestamp;
    }

    public void setCreationTimestamp( DateTime value )
    {
    	creationTimestamp = value;
    }

    /**
     *   Gets or sets the last modified timestamp.
     */
    @JsonProperty( "lastModifiedTimestamp" )
    private DateTime lastModifiedTimestamp;

    public DateTime getLastModifiedTimestamp()
    {
        return lastModifiedTimestamp;
    }

    public void setLastModifiedTimestamp( DateTime value )
    {
    	lastModifiedTimestamp = value;
    }

    /**
     *  Gets or sets the expiration timestamp.
     */
    @JsonProperty( "expirationTimestamp" )
    private DateTime expirationTimestamp;

    public DateTime getExpirationTimestamp()
    {
        return expirationTimestamp;
    }

    public void setExpirationTimestamp( DateTime value )
    {
    	expirationTimestamp = value;
    }
    /**
     *  Gets or sets the user who last updated the cart.
     */
    @JsonProperty( "lastModifiedUser" )
    private String lastModifiedUser;

    public String getLastModifiedUser()
    {
        return lastModifiedUser;
    }

    public void setLastModifiedUser( String value )
    {
        lastModifiedUser = value;
    }

    /**
     *  Gets or sets the status.
     */
    @JsonProperty( "status" )
    private String status;

    public String getStatus()
    {
        return status;
    }

    public void setStatus( String value )
    {
        status = value;
    }

    /**
     *  Gets or sets the last modified user or application.
     */
    @JsonProperty( "lineItems" )
    private List<CartLineItem> lineItems;

    public List<CartLineItem> getLineItems()
    {
        return lineItems;
    }

    public void setLineItems( List<CartLineItem> value )
    {
    	lineItems = value;
    }
 }