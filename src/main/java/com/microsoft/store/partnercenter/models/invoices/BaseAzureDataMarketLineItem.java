// -----------------------------------------------------------------------
// <copyright file="BaseAzureDataMarketLineItem.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import org.joda.time.DateTime;

public abstract class BaseAzureDataMarketLineItem extends InvoiceLineItem
{
	/***
	 * Gets or sets the partner's Azure Active Directory tenant Id.
	 */
	private String __PartnerId;

	/***
	 * Gets or sets the partner name.
	 */
	private String __PartnerName;

	/***
	 * Gets or sets the customer company name.
	 */
	private String __CustomerCompanyName;

	/***
	 * Gets or sets the partner's Id. For direct reseller, this is the partner's MPN Id.
	 * For indirect reseller, this is the VAR's MPN Id.
	 */
	private int __PartnerMpnId;

	/***
	 * Gets or sets the invoice number.
	 */
	private String __InvoiceNumber;

	/***
	 * Gets or sets the date charge begins.
	 */
	private DateTime __ChargeStartDate;

	/***
	 * Gets or sets the date charge ends.
	 */
	private DateTime __ChargeEndDate;

	/***
	 * Gets or sets the subscription Id.
	 */
	private String __SubscriptionId;

	/***
	 * Gets or sets the subscription name.
	 */
	private String __SubscriptionName;

	/***
	 * Gets or sets the description of the subscription.
	 */
	private String __SubscriptionDescription;

	/***
	 * Gets or sets the order Id.
	 */
	private String __OrderId;

	/***
	 * Gets or sets the service name. Example: Azure Data Service.
	 */
	private String __ServiceName;

	/***
	 * Gets or sets the resource name. Example: Database (GB/month).
	 */
	private String __ResourceName;

	/***
	 * Gets or sets the region associated with the resource instance.
	 */
	private String __Region;

	/***
	 * Gets or sets the total units consumed.
	 */
	private int __ConsumedQuantity;

	/**
	 * @return the __PartnerId
	 */
	public String getPartnerId() {
		return __PartnerId;
	}

	/**
	 * @param __PartnerId the __PartnerId to set
	 */
	public void setPartnerId(String __PartnerId) {
		this.__PartnerId = __PartnerId;
	}

	/**
	 * @return the __PartnerName
	 */
	public String getPartnerName() {
		return __PartnerName;
	}

	/**
	 * @param __PartnerName the __PartnerName to set
	 */
	public void setPartnerName(String __PartnerName) {
		this.__PartnerName = __PartnerName;
	}

	/**
	 * @return the __CustomerCompanyName
	 */
	public String getCustomerCompanyName() {
		return __CustomerCompanyName;
	}

	/**
	 * @param __CustomerCompanyName the __CustomerCompanyName to set
	 */
	public void setCustomerCompanyName(String __CustomerCompanyName) {
		this.__CustomerCompanyName = __CustomerCompanyName;
	}

	/**
	 * @return the __PartnerMpnId
	 */
	public int getPartnerMpnId() {
		return __PartnerMpnId;
	}

	/**
	 * @param __PartnerMpnId the __PartnerMpnId to set
	 */
	public void setPartnerMpnId(int __PartnerMpnId) {
		this.__PartnerMpnId = __PartnerMpnId;
	}

	/**
	 * @return the __InvoiceNumber
	 */
	public String getInvoiceNumber() {
		return __InvoiceNumber;
	}

	/**
	 * @param __InvoiceNumber the __InvoiceNumber to set
	 */
	public void setInvoiceNumber(String __InvoiceNumber) {
		this.__InvoiceNumber = __InvoiceNumber;
	}

	/**
	 * @return the __ChargeStartDate
	 */
	public DateTime getChargeStartDate() {
		return __ChargeStartDate;
	}

	/**
	 * @param __ChargeStartDate the __ChargeStartDate to set
	 */
	public void setChargeStartDate(DateTime __ChargeStartDate) {
		this.__ChargeStartDate = __ChargeStartDate;
	}

	/**
	 * @return the __ChargeEndDate
	 */
	public DateTime getChargeEndDate() {
		return __ChargeEndDate;
	}

	/**
	 * @param __ChargeEndDate the __ChargeEndDate to set
	 */
	public void setChargeEndDate(DateTime __ChargeEndDate) {
		this.__ChargeEndDate = __ChargeEndDate;
	}

	/**
	 * @return the __SubscriptionId
	 */
	public String getSubscriptionId() {
		return __SubscriptionId;
	}

	/**
	 * @param __SubscriptionId the __SubscriptionId to set
	 */
	public void setSubscriptionId(String __SubscriptionId) {
		this.__SubscriptionId = __SubscriptionId;
	}

	/**
	 * @return the __SubscriptionName
	 */
	public String getSubscriptionName() {
		return __SubscriptionName;
	}

	/**
	 * @param __SubscriptionName the __SubscriptionName to set
	 */
	public void setSubscriptionName(String __SubscriptionName) {
		this.__SubscriptionName = __SubscriptionName;
	}

	/**
	 * @return the __SubscriptionDescription
	 */
	public String getSubscriptionDescription() {
		return __SubscriptionDescription;
	}

	/**
	 * @param __SubscriptionDescription the __SubscriptionDescription to set
	 */
	public void setSubscriptionDescription(String __SubscriptionDescription) {
		this.__SubscriptionDescription = __SubscriptionDescription;
	}

	/**
	 * @return the __OrderId
	 */
	public String getOrderId() {
		return __OrderId;
	}

	/**
	 * @param __OrderId the __OrderId to set
	 */
	public void setOrderId(String __OrderId) {
		this.__OrderId = __OrderId;
	}

	/**
	 * @return the __ServiceName
	 */
	public String getServiceName() {
		return __ServiceName;
	}

	/**
	 * @param __ServiceName the __ServiceName to set
	 */
	public void setServiceName(String __ServiceName) {
		this.__ServiceName = __ServiceName;
	}

	/**
	 * @return the __ResourceName
	 */
	public String getResourceName() {
		return __ResourceName;
	}

	/**
	 * @param __ResourceName the __ResourceName to set
	 */
	public void setResourceName(String __ResourceName) {
		this.__ResourceName = __ResourceName;
	}

	/**
	 * @return the __Region
	 */
	public String getRegion() {
		return __Region;
	}

	/**
	 * @param __Region the __Region to set
	 */
	public void setRegion(String __Region) {
		this.__Region = __Region;
	}

	/**
	 * @return the __ConsumedQuantity
	 */
	public int getConsumedQuantity() {
		return __ConsumedQuantity;
	}

	/**
	 * @param __ConsumedQuantity the __ConsumedQuantity to set
	 */
	public void setConsumedQuantity(int __ConsumedQuantity) {
		this.__ConsumedQuantity = __ConsumedQuantity;
	}

	/***
	 * Returns the billing provider.
	 * 
	 *  @return: The billing provider.
	 */
	@Override
	public BillingProvider getBillingProvider() {
		return BillingProvider.AZURE_DATA_MARKET;
	}
}