// -----------------------------------------------------------------------
// <copyright file="InventoryItem.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.products;

import java.util.List;

/**
 * Class that represents an inventory item.
 */
public class InventoryItem
{
    /**
     * Gets or sets the item product id.
     */
    private String __ProductId;

    public String getProductId()
    {
        return __ProductId;
    }

    public void setProductId( String value )
    {
        __ProductId = value;
    }

    /**
     *  Gets or sets the item sku id.
     */
    private String __SkuId;

    public String getSkuId()
    {
        return __SkuId;
    }

    public void setSkuId( String value )
    {
        __SkuId = value;
    }

    /**
     *  Gets or sets a value indicating whether this item currently has any inventory restrictions.
     */
    private String __IsRestricted;

    public String getIsRestricted()
    {
        return __IsRestricted;
    }

    public void setIsRestricted( String value )
    {
        __IsRestricted = value;
    }
 
    /**
     *  Gets or sets the restrictions for this item if any.
     */
    private List<InventoryRestriction> __Restrictions;

    public List<InventoryRestriction> getRestrictions()
    {
        return __Restrictions;
    }

    public void setRestrictions( List<InventoryRestriction> value )
    {
        __Restrictions = value;
    }
}