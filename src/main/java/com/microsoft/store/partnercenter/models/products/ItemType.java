// -----------------------------------------------------------------------
// <copyright file="ItemType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.products;

/**
 * Class that represents an item's type.
 */
public class ItemType
{
    /**
     * Gets or sets the id.
     */
    private String __Id;

    public String getId()
    {
        return __Id;
    }

    public void setId( String value )
    {
        __Id = value;
    }

    /**
     * Gets or sets the display name.
     */
    private String __DisplayName;

    public String getDisplayName()
    {
        return __DisplayName;
    }

    public void setDisplayName( String value )
    {
        __DisplayName = value;
    }
    
    /**
     * Gets or sets the sub-type if applicable.
     */
    private ItemType __SubType;

    public ItemType getSubType()
    {
        return __SubType;
    }

    public void setSubType( ItemType value )
    {
        __SubType = value;
    }
}