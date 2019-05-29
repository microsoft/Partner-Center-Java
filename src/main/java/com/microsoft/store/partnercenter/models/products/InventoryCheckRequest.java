// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.products;

import java.util.List;
import java.util.Map;

/**
 * Class that represents an inventory check request.
 */
public class InventoryCheckRequest
{
    /**
     * Gets or sets the target items for the inventory check.
     */
    private List<InventoryItem> __TargetItems;

    public List<InventoryItem> getTargetItems()
    {
        return __TargetItems;
    }

    public void setTargetItems( List<InventoryItem> value )
    {
        __TargetItems = value;
    }

    /**
     * Gets or sets any context values that apply towards inventory check of the provided items.
     */
    private Map<String, String> __InventoryContext;

    public Map<String, String> getInventoryContext()
    {
        return __InventoryContext;
    }

    public void setInventoryContext( Map<String, String> value )
    {
        __InventoryContext = value;
    }
}