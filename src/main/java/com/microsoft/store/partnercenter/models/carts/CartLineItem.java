// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.carts;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.microsoft.store.partnercenter.models.products.BillingCycleType;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;

/**
 * Represents a line item on a cart.
 */
public class CartLineItem  
{
    /**
     * A list of items that depend on this one, so they have to be purchased subsequently.
     */
    private List<CartLineItem> addOnItems;

    /**
     * The type of billing cycle for the selected catalog item.
     */
    private BillingCycleType billingCycle;

    /**
     * The catalog item identifier.
     */
    private String catalogItemId;

    /**
     * The currency code.
     */
    private String currencyCode;

    /**
     * An error associated to this cart line item.
     */
    private CartError error;

    /**
     * The friendly name for the result contract (subscription).
     */
    private String friendlyName;

    /**
     * The unique identifier of a cart line item.
     */
    private int id; 

    /**
     * The order group which indicates which items can be place in a single order.
     */
    private String orderGroup;

    /**
     * A collection of participants on this purchase.
     */
    private Collection<KeyValuePair<ParticipantType, String>> participants;

    /**
     * The context that will be used for provisioning of the catalog item.
     */
    private Map<String, String> provisioningContext;

    /**
     * The product quantity.
     */
    private int quantity;

    /**
     * The renews to value.
     */
    private RenewsTo renewsTo;

    /** 
     * The term duration if applicable.
     */
    private String termDuration;

    /**
     * Gets a list of items that depend on this one, so they have to be purchased subsequently.
     * 
     * @return A list of items that depend on this one, so they have to be purchased subsequently.
     */
    public List<CartLineItem> getAddOnItems()
    {
        return addOnItems;
    }

    /**
     * Sets a list of items that depend on this one, so they have to be purchased subsequently.
     * 
     * @param value  A list of items that depend on this one, so they have to be purchased subsequently.
     */
    public void setAddOnItems(List<CartLineItem> value)
    {
        addOnItems = value;
    }

    /**
     * Gets the type of billing cycle for the selected catalog item.
     * 
     * @return The type of billing cycle for the selected catalog item.
     */
    public BillingCycleType getBillingCycle()
    {
        return billingCycle;
    }

    /**
     * Sets the type of billing cycle for the selected catalog item.
     * 
     * @param value The type of billing cycle for the selected catalog item.
     */
    public void setBillingCycle(BillingCycleType value)
    {
        billingCycle = value;
    }

    /**
     * Gets the catalog item identifier.
     * 
     * @return The catalog item identifier.
     */
    public String getCatalogItemId()
    {
        return catalogItemId;
    }

    /**
     * Sets the catalog item identifier.
     * 
     * @param value The catalog item identifier.
     */
    public void setCatalogItemId(String value)
    {
        catalogItemId = value;
    }

    /**
     * Gets the currency code.
     * 
     * @return The currency code.
     */
    public String getCurrencyCode()
    {
        return currencyCode;
    }

    /**
     * Sets the currency code.
     * 
     * @param value The currency code.
     */
    public void setCurrencyCode(String value)
    {
        currencyCode = value;
    }

    /**
     * Gets the error associated to this cart line item.
     * 
     * @return The error associated to this cart line item.
     */
    public CartError getError()
    {
        return error;
    }

    /**
     * Sets the error associated to this cart line item.
     * 
     * @param value The error associated to this cart line item.
     */
    public void setError(CartError value)
    {
        error = value; 
    }

    /**
     * Gets the friendly name for the result contract (subscription).
     * 
     * @return The friendly name for the result contract (subscription).
     */
    public String getFriendlyName()
    {
        return friendlyName;
    }

    /**
     * Sets the friendly name for the result contract (subscription).
     * 
     * @param value The friendly name for the result contract (subscription).
     */
    public void setFriendlyName(String value)
    {
        friendlyName = value;
    }

    /**
     * Gets the unique identifier of a cart line item.
     * 
     * @return The unique identifier of a cart line item.
     */
    public int getId()
    {
        return id;
    }

    /**
     * Sets the unique identifier of a cart line item.
     * 
     * @param value The unique identifier of a cart line item.
     */
    public void setId(int value)
    {
        id = value;
    }

    /**
     * Gets the order group which indicates which items can be place in a single order.
     * 
     * @return The order group which indicates which items can be place in a single order.
     */
    public String getOrderGroup()
    {
        return orderGroup;
    }

    /**
     * Sets the order group which indicates which items can be place in a single order.
     * 
     * @param value The order group which indicates which items can be place in a single order.
     */
    public void setOrderGroup(String value)
    {
        orderGroup = value;
    }

    /**
     * Gets the collection of participants on this purchase.
     * 
     * @return The collection of participants on this purchase.
     */
    public Collection<KeyValuePair<ParticipantType, String>> getParticipants()
    {
        return participants;
    }

    /**
     * Sets the collection of participants on this purchase.
     * 
     * @param value The collection of participants on this purchase.
     */
    public void setParticipants(Collection<KeyValuePair<ParticipantType, String>> value)
    {
        participants = value;
    }

    /**
     * Gets the context that will be used for provisioning of the catalog item.
     * 
     * @return The context that will be used for provisioning of the catalog item.
     */
    public Map<String, String> getProvisioningContext()
    {
        return provisioningContext;
    }

    /**
     * Sets the context that will be used for provisioning of the catalog item.
     * 
     * @param value The context that will be used for provisioning of the catalog item.
     */
    public void setProvisioningContext(Map<String, String> value)
    {
        provisioningContext = value;
    }

    /**
     * Gets the product quantity.
     * 
     * @return The product quantity.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the product quantity.
     * 
     * @param value The product quantity.
     */
    public void setQuantity(int value)
    {
        quantity = value;
    }

    /**
     * Gets the renews to value.
     * 
     * @return The renews to value.
     */
    public RenewsTo getRenewsTo()
    {
        return renewsTo;
    }

    /**
     * Sets the renews to value.
     * 
     * @param value The renews to value.
     */
    public void setRenewsTo(RenewsTo value)
    {
        renewsTo = value;
    }

    /**
     * Gets the term duration if applicable.
     * 
     * @return The term duration if applicable.
     */
    public String getTermDuration()
    {
        return termDuration;
    }

    /**
     * Sets the term duration if applicable.
     * 
     * @param value The term duration if applicable.
     */
    public void setTermDuration(String value)
    {
        termDuration = value;
    }
}