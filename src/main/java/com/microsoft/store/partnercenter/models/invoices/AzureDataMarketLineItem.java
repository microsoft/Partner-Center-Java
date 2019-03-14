// -----------------------------------------------------------------------
// <copyright file="AzureDataMarketLineItem.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

public class AzureDataMarketLineItem 
	extends BaseAzureDataMarketLineItem
{
    /**
     * Gets or sets the units included in the order.
     */
    private double __IncludedQuantity;

    /**
     * Gets or sets the quantity consumed above allowed usage.
     */
    private double __OverageQuantity;

    /**
     * Gets or sets the price of each unit.
     */
    private double __ListPrice;

    /**
     * Gets or sets the price of quantity consumed.
     */
    private double __ConsumptionPrice;

    /**
     * Gets or sets the discount on consumption.
     */
    private double __ConsumptionDiscount;

    /**
     * Gets or sets the price charged before taxes.
     */
    private double __PretaxCharges;

    /**
     * Gets or sets the amount of tax charged.
     */
    private double __TaxAmount;

    /**
     * Gets or sets the total charges after tax.
     * Pretax Charges + Tax Amount
     */
    
    private double __PostTaxTotal;

    /**
     * Gets or sets the currency associated with the prices.
     */
    private String __CurrencyCode;

    /**
     * Gets or sets the effective price before taxes.
     */
    private double __PretaxEffectiveRate;

    /**
     * Gets or sets the effective price after taxes.
     */
    private double __PostTaxEffectiveRate;

    /**
     * Gets or sets the charge type. Example: Assess Usage Fee For Current Cycle.
     */
    private String __ChargeType;

    /**
	 * @return the __IncludedQuantity
	 */
	public double getIncludedQuantity() {
		return __IncludedQuantity;
	}

	/**
	 * @param __IncludedQuantity the __IncludedQuantity to set
	 */
	public void setIncludedQuantity(double __IncludedQuantity) {
		this.__IncludedQuantity = __IncludedQuantity;
	}

	/**
	 * @return the __OverageQuantity
	 */
	public double getOverageQuantity() {
		return __OverageQuantity;
	}

	/**
	 * @param __OverageQuantity the __OverageQuantity to set
	 */
	public void setOverageQuantity(double __OverageQuantity) {
		this.__OverageQuantity = __OverageQuantity;
	}

	/**
	 * @return the __ListPrice
	 */
	public double getListPrice() {
		return __ListPrice;
	}

	/**
	 * @param __ListPrice the __ListPrice to set
	 */
	public void setListPrice(double __ListPrice) {
		this.__ListPrice = __ListPrice;
	}

	/**
	 * @return the __ConsumptionPrice
	 */
	public double getConsumptionPrice() {
		return __ConsumptionPrice;
	}

	/**
	 * @param __ConsumptionPrice the __ConsumptionPrice to set
	 */
	public void setConsumptionPrice(double __ConsumptionPrice) {
		this.__ConsumptionPrice = __ConsumptionPrice;
	}

	/**
	 * @return the __ConsumptionDiscount
	 */
	public double getConsumptionDiscount() {
		return __ConsumptionDiscount;
	}

	/**
	 * @param __ConsumptionDiscount the __ConsumptionDiscount to set
	 */
	public void setConsumptionDiscount(double __ConsumptionDiscount) {
		this.__ConsumptionDiscount = __ConsumptionDiscount;
	}

	/**
	 * @return the __PretaxCharges
	 */
	public double getPretaxCharges() {
		return __PretaxCharges;
	}

	/**
	 * @param __PretaxCharges the __PretaxCharges to set
	 */
	public void setPretaxCharges(double __PretaxCharges) {
		this.__PretaxCharges = __PretaxCharges;
	}

	/**
	 * @return the __TaxAmount
	 */
	public double getTaxAmount() {
		return __TaxAmount;
	}

	/**
	 * @param __TaxAmount the __TaxAmount to set
	 */
	public void setTaxAmount(double __TaxAmount) {
		this.__TaxAmount = __TaxAmount;
	}

	/**
	 * @return the __PostTaxTotal
	 */
	public double getPostTaxTotal() {
		return __PostTaxTotal;
	}

	/**
	 * @param __PostTaxTotal the __PostTaxTotal to set
	 */
	public void setPostTaxTotal(double __PostTaxTotal) {
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
	public double getPretaxEffectiveRate() {
		return __PretaxEffectiveRate;
	}

	/**
	 * @param __PretaxEffectiveRate the __PretaxEffectiveRate to set
	 */
	public void setPretaxEffectiveRate(double __PretaxEffectiveRate) {
		this.__PretaxEffectiveRate = __PretaxEffectiveRate;
	}

	/**
	 * @return the __PostTaxEffectiveRate
	 */
	public double getPostTaxEffectiveRate() {
		return __PostTaxEffectiveRate;
	}

	/**
	 * @param __PostTaxEffectiveRate the __PostTaxEffectiveRate to set
	 */
	public void setPostTaxEffectiveRate(double __PostTaxEffectiveRate) {
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

	/**
     * Returns the type of invoice line item
     * 
     * @return The type of invoice line item.
     */
	@Override
	public InvoiceLineItemType getInvoiceLineItemType() {
		return InvoiceLineItemType.BILLINGLINEITEMS;
	}
}