// -----------------------------------------------------------------------
// <copyright file="AzureDataMarketLineItem.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

public class AzureDataMarketLineItem extends BaseAzureDataMarketLineItem
{
    /***
     * Gets or sets the units included in the order.
     */
    private int __IncludedQuantity;

    /***
     * Gets or sets the quantity consumed above allowed usage.
     */
    private int __OverageQuantity;

    /***
     * Gets or sets the price of each unit.
     */
    private int __ListPrice;

    /***
     * Gets or sets the price of quantity consumed.
     */
    private int __ConsumptionPrice;

    /***
     * Gets or sets the discount on consumption.
     */
    private int __ConsumptionDiscount;

    /***
     * Gets or sets the price charged before taxes.
     */
    private int __PretaxCharges;

    /***
     * Gets or sets the amount of tax charged.
     */
    private int __TaxAmount;

    /***
     * Gets or sets the total charges after tax.
     * Pretax Charges + Tax Amount
     */
    
    private int __PostTaxTotal;

    /***
     * Gets or sets the currency associated with the prices.
     */
    private String __CurrencyCode;

    /***
     * Gets or sets the effective price before taxes.
     */
    private int __PretaxEffectiveRate;

    /***
     * Gets or sets the effective price after taxes.
     */
    private int __PostTaxEffectiveRate;

    /***
     * Gets or sets the charge type. Example: Assess Usage Fee For Current Cycle.
     */
    private String __ChargeType;

    /**
	 * @return the __IncludedQuantity
	 */
	public int getIncludedQuantity() {
		return __IncludedQuantity;
	}

	/**
	 * @param __IncludedQuantity the __IncludedQuantity to set
	 */
	public void setIncludedQuantity(int __IncludedQuantity) {
		this.__IncludedQuantity = __IncludedQuantity;
	}

	/**
	 * @return the __OverageQuantity
	 */
	public int getOverageQuantity() {
		return __OverageQuantity;
	}

	/**
	 * @param __OverageQuantity the __OverageQuantity to set
	 */
	public void setOverageQuantity(int __OverageQuantity) {
		this.__OverageQuantity = __OverageQuantity;
	}

	/**
	 * @return the __ListPrice
	 */
	public int getListPrice() {
		return __ListPrice;
	}

	/**
	 * @param __ListPrice the __ListPrice to set
	 */
	public void setListPrice(int __ListPrice) {
		this.__ListPrice = __ListPrice;
	}

	/**
	 * @return the __ConsumptionPrice
	 */
	public int getConsumptionPrice() {
		return __ConsumptionPrice;
	}

	/**
	 * @param __ConsumptionPrice the __ConsumptionPrice to set
	 */
	public void setConsumptionPrice(int __ConsumptionPrice) {
		this.__ConsumptionPrice = __ConsumptionPrice;
	}

	/**
	 * @return the __ConsumptionDiscount
	 */
	public int getConsumptionDiscount() {
		return __ConsumptionDiscount;
	}

	/**
	 * @param __ConsumptionDiscount the __ConsumptionDiscount to set
	 */
	public void setConsumptionDiscount(int __ConsumptionDiscount) {
		this.__ConsumptionDiscount = __ConsumptionDiscount;
	}

	/**
	 * @return the __PretaxCharges
	 */
	public int getPretaxCharges() {
		return __PretaxCharges;
	}

	/**
	 * @param __PretaxCharges the __PretaxCharges to set
	 */
	public void setPretaxCharges(int __PretaxCharges) {
		this.__PretaxCharges = __PretaxCharges;
	}

	/**
	 * @return the __TaxAmount
	 */
	public int getTaxAmount() {
		return __TaxAmount;
	}

	/**
	 * @param __TaxAmount the __TaxAmount to set
	 */
	public void setTaxAmount(int __TaxAmount) {
		this.__TaxAmount = __TaxAmount;
	}

	/**
	 * @return the __PostTaxTotal
	 */
	public int getPostTaxTotal() {
		return __PostTaxTotal;
	}

	/**
	 * @param __PostTaxTotal the __PostTaxTotal to set
	 */
	public void setPostTaxTotal(int __PostTaxTotal) {
		this.__PostTaxTotal = __PostTaxTotal;
	}

	/**
	 * @return the __CurrencyCode
	 */
	public String getCurrencyCode() {
		return __CurrencyCode;
	}

	/**
	 * @param __CurrencyCode the __CurrencyCode to set
	 */
	public void setCurrencyCode(String __CurrencyCode) {
		this.__CurrencyCode = __CurrencyCode;
	}

	/**
	 * @return the __PretaxEffectiveRate
	 */
	public int getPretaxEffectiveRate() {
		return __PretaxEffectiveRate;
	}

	/**
	 * @param __PretaxEffectiveRate the __PretaxEffectiveRate to set
	 */
	public void setPretaxEffectiveRate(int __PretaxEffectiveRate) {
		this.__PretaxEffectiveRate = __PretaxEffectiveRate;
	}

	/**
	 * @return the __PostTaxEffectiveRate
	 */
	public int getPostTaxEffectiveRate() {
		return __PostTaxEffectiveRate;
	}

	/**
	 * @param __PostTaxEffectiveRate the __PostTaxEffectiveRate to set
	 */
	public void setPostTaxEffectiveRate(int __PostTaxEffectiveRate) {
		this.__PostTaxEffectiveRate = __PostTaxEffectiveRate;
	}

	/**
	 * @return the __ChargeType
	 */
	public String getChargeType() {
		return __ChargeType;
	}

	/**
	 * @param __ChargeType the __ChargeType to set
	 */
	public void setChargeType(String __ChargeType) {
		this.__ChargeType = __ChargeType;
	}

	/***
     * Returns the type of invoice line item
     * 
     * @return The type of invoice line item.
     */
	@Override
	public InvoiceLineItemType getInvoiceLineItemType() {
		return InvoiceLineItemType.BILLINGLINEITEMS;
	}

}
