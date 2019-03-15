// -----------------------------------------------------------------------
// <copyright file="OrderLineItemProvisioningStatus.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.orders;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Order line item provisioning status.
 */
public class OrderLineItemProvisioningStatus
    extends ResourceBase
{
    /**
     * The order line item number.
     */
    private int lineItemNumber; 

    /**
     * The quantity provisioning information.
     */
    private Iterable<QuantityProvisioningStatus> quantityProvisioningInformation;

    /**
     * The status of the order line item number.
     */
    private String status;

    /**
     * Gets the order line item number.
     * 
     * @return The order line item number.
     */
    public int getLineItemNumber()
    {
        return lineItemNumber;
    }

    /**
     * Set the order line item number.
     * 
     * @param value The order line item number.
     */
    public void setLineItemNumber(int value)
    {
        lineItemNumber = value;
    }

    /**
     * Gets the quantity provisioning information.
     * 
     * @return The quantity provisioning information.
     */
    public Iterable<QuantityProvisioningStatus> getQuantityProvisioningInformation()
    {
        return quantityProvisioningInformation;
    }

    /**
     * Set the quantity provisioning information.
     * 
     * @param value The quantity provisioning information.
     */
    public void setQuantityProvisioningInformation(Iterable<QuantityProvisioningStatus> value)
    {
        quantityProvisioningInformation = value;
    }

    /**
     * Gets aggregated state of an order line item.
     * 
     * @return The aggregated state of an order line item.
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * Set the aggregated state of an order line item..
     * 
     * @param value The aggregated state of an order line item.
     */
    public void setStatus(String value)
    {
        status = value;
    }
}