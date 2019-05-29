// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.products;

import java.util.List;
import java.util.Map;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Class that represents a sku.
 */
public class Sku
    extends ResourceBaseWithLinks<StandardResourceLinks>
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
     * Gets or sets the product id
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
     * Gets or sets the title.
     */
    private String __Title;

    public String getTitle()
    {
        return __Title;
    }

    public void setTitle( String value )
    {
        __Title = value;
    }

    /**
     * Gets or sets the description.
     */
    private String __Description;

    public String getDescription()
    {
        return __Description;
    }

    public void setDescription( String value )
    {
        __Description = value;
    }

    /**
     * Gets or sets the minimum order quantity.
     */
    private int __MinimumQuantity;

    public int getMinimumQuantity()
    {
        return __MinimumQuantity;
    }

    public void setMinimumQuantity( int value )
    {
        __MinimumQuantity = value;
    }

    /**
     * Gets or sets the maximum order quantity.
     */
    private int __MaximumQuantity;

    public int getMaximumQuantity()
    {
        return __MaximumQuantity;
    }

    public void setMaximumQuantity( int value )
    {
        __MaximumQuantity = value;
    }

    /**
     * Gets or sets a value indicating whether this is a trial sku or not.
     */
    private Boolean __IsTrial;

    public Boolean getIsTrial()
    {
        return __IsTrial;
    }

    public void setIsTrial( Boolean value )
    {
        __IsTrial = value;
    }

    /**
     * Gets or sets the billing cycles supported for the offer.
     */
    private List<BillingCycleType> __SupportedBillingCycles;

    public List<BillingCycleType> getSupportedBillingCycles()
    {
        return __SupportedBillingCycles;
    }

    public void setSupportedBillingCycles( List<BillingCycleType> value )
    {
        __SupportedBillingCycles = value;
    }

    /**
     * Gets or sets the purchase prerequisites.
     */
    private List<String> __PurchasePrerequisites;

    public List<String> getPurchasePrerequisites()
    {
        return __PurchasePrerequisites;
    }

    public void setPurchasePrerequisites( List<String> value )
    {
        __PurchasePrerequisites = value;
    }

    /**
     * Gets or sets the variables needed for inventory check.
     */
    private List<String> __InventoryVariables;

    public List<String> getInventoryVariables()
    {
        return __InventoryVariables;
    }

    public void setInventoryVariables( List<String> value )
    {
        __InventoryVariables = value;
    }

    /**
     * Gets or sets the provisioning variables.
     */
    private List<String> __ProvisioningVariables;

    public List<String> getProvisioningVariables()
    {
        return __ProvisioningVariables;
    }

    public void setProvisioningVariables( List<String> value )
    {
        __ProvisioningVariables = value;
    }

    /**
     * Gets or sets the dynamic attributes.
     */
    private Map<String, String> __DynamicAttributes;

    public Map<String, String> getDynamicAttributes()
    {
        return __DynamicAttributes;
    }

    public void setDynamicAttributes( Map<String, String> value )
    {
        __DynamicAttributes = value;
    }
}