// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

/**
 * Billing Line Items for Usage Based subscriptions
 */
public class UsageBasedLineItem
    extends BaseUsageBasedLineItem
{
    /**
     * Gets or sets the detail line item Id. Uniquely identifies the line items for cases where calculation is different
     * for units consumed. Example: Total consumed = 1338, 1024 is charged with one rate, 314 is charge with a different
     * rate.
     */
    private int __DetailLineItemId;

    public int getDetailLineItemId()
    {
        return __DetailLineItemId;
    }

    public void setDetailLineItemId( int value )
    {
        __DetailLineItemId = value;
    }

    /**
     * Gets or sets the service SKU.
     */
    private String __Sku;

    public String getSku()
    {
        return __Sku;
    }

    public void setSku( String value )
    {
        __Sku = value;
    }

    /**
     * Gets or sets the units included in the order.
     */
    private double __IncludedQuantity;

    public double getIncludedQuantity()
    {
        return __IncludedQuantity;
    }

    public void setIncludedQuantity( double value )
    {
        __IncludedQuantity = value;
    }

    /**
     * Gets or sets the quantity consumed above allowed usage.
     */
    private double __OverageQuantity;

    public double getOverageQuantity()
    {
        return __OverageQuantity;
    }

    public void setOverageQuantity( double value )
    {
        __OverageQuantity = value;
    }

    /**
     * Gets or sets the price of each unit.
     */
    private double __ListPrice;

    public double getListPrice()
    {
        return __ListPrice;
    }

    public void setListPrice( double value )
    {
        __ListPrice = value;
    }

    /**
     * Gets or sets the price of quantity consumed.
     */
    private double __ConsumptionPrice;

    public double getConsumptionPrice()
    {
        return __ConsumptionPrice;
    }

    public void setConsumptionPrice( double value )
    {
        __ConsumptionPrice = value;
    }

    /**
     * Gets or sets the discount on consumption.
     */
    private double __ConsumptionDiscount;

    public double getConsumptionDiscount()
    {
        return __ConsumptionDiscount;
    }

    public void setConsumptionDiscount( double value )
    {
        __ConsumptionDiscount = value;
    }

    /**
     * Gets or sets the currency associated with the prices.
     */
    private String __Currency;

    public String getCurrency()
    {
        return __Currency;
    }

    public void setCurrency( String value )
    {
        __Currency = value;
    }

    /**
     * Gets or sets the price charged before taxes.
     */
    private double __PretaxCharges;

    public double getPretaxCharges()
    {
        return __PretaxCharges;
    }

    public void setPretaxCharges( double value )
    {
        __PretaxCharges = value;
    }

    /**
     * Gets or sets the amount of tax charged.
     */
    private double __TaxAmount;

    public double getTaxAmount()
    {
        return __TaxAmount;
    }

    public void setTaxAmount( double value )
    {
        __TaxAmount = value;
    }

    /**
     * Gets or sets the total charges after tax. Pretax Charges + Tax Amount
     */
    private double __PostTaxTotal;

    public double getPostTaxTotal()
    {
        return __PostTaxTotal;
    }

    public void setPostTaxTotal( double value )
    {
        __PostTaxTotal = value;
    }

    /**
     * Gets or sets the effective price before taxes.
     */
    private double __PretaxEffectiveRate;

    public double getPretaxEffectiveRate()
    {
        return __PretaxEffectiveRate;
    }

    public void setPretaxEffectiveRate( double value )
    {
        __PretaxEffectiveRate = value;
    }

    /**
     * Gets or sets the effective price after taxes.
     */
    private double __PostTaxEffectiveRate;

    public double getPostTaxEffectiveRate()
    {
        return __PostTaxEffectiveRate;
    }

    public void setPostTaxEffectiveRate( double value )
    {
        __PostTaxEffectiveRate = value;
    }

    /**
     * Gets or sets the charge type.
     */
    private String __ChargeType;

    public String getChargeType()
    {
        return __ChargeType;
    }

    public void setChargeType( String value )
    {
        __ChargeType = value;
    }

    /**
     * Returns the type of invoice line item
     * 
     * @return The type of invoice line item.
     */
    public InvoiceLineItemType getInvoiceLineItemType()
    {
        return InvoiceLineItemType.BILLINGLINEITEMS;
    }
}