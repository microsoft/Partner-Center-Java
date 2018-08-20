// ----------------------------------------------------------------
// <copyright file="AzureDataMarketDailyUsageLineItem.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import org.joda.time.DateTime;

public class AzureDataMarketDailyUsageLineItem extends BaseAzureDataMarketLineItem {

    /***
     * Gets or sets the usage date the resource.
     */
    private DateTime __UsageDate;

    /***
     * Gets or sets the metered service name.
     * Example: Storage.
     */
    private String __MeteredServiceName;

    /***
     * Gets or sets the metered service type.
     */
    private String __MeteredServiceType;

    /***
     * Gets or sets the customer assigned friendly name for the resource instance.
     */
    private String __ResourceFriendlyName;
    
	/**
	 * @return the __UsageDate
	 */
	public DateTime get__UsageDate() {
		return __UsageDate;
	}

	/**
	 * @param __UsageDate the __UsageDate to set
	 */
	public void set__UsageDate(DateTime __UsageDate) {
		this.__UsageDate = __UsageDate;
	}

	/**
	 * @return the __MeteredServiceName
	 */
	public String get__MeteredServiceName() {
		return __MeteredServiceName;
	}

	/**
	 * @param __MeteredServiceName the __MeteredServiceName to set
	 */
	public void set__MeteredServiceName(String __MeteredServiceName) {
		this.__MeteredServiceName = __MeteredServiceName;
	}

	/**
	 * @return the __MeteredServiceType
	 */
	public String get__MeteredServiceType() {
		return __MeteredServiceType;
	}

	/**
	 * @param __MeteredServiceType the __MeteredServiceType to set
	 */
	public void set__MeteredServiceType(String __MeteredServiceType) {
		this.__MeteredServiceType = __MeteredServiceType;
	}

	/**
	 * @return the __ResourceFriendlyName
	 */
	public String get__ResourceFriendlyName() {
		return __ResourceFriendlyName;
	}

	/**
	 * @param __ResourceFriendlyName the __ResourceFriendlyName to set
	 */
	public void set__ResourceFriendlyName(String __ResourceFriendlyName) {
		this.__ResourceFriendlyName = __ResourceFriendlyName;
	}

	/***
	 * Returns the type of invoice line item.
	 * 
	 * @return: The type of invoice line item.
	 */
	@Override
	public InvoiceLineItemType getInvoiceLineItemType() {
		return	InvoiceLineItemType.USAGELINEITEMS;
	}

}
