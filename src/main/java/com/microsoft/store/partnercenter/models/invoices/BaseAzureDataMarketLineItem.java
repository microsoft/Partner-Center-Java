// -----------------------------------------------------------------------
// <copyright file="BaseAzureDataMarketLineItem.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import org.joda.time.DateTime;

public abstract class BaseAzureDataMarketLineItem extends InvoiceLineItem
{
	/**
	 * Gets or sets the partner's Azure Active Directory tenant Id.
	 */
	private String partnerId;

	/**
	 * Gets or sets the partner name.
	 */
	private String partnerName;

	/**
	 * Gets or sets the customer company name.
	 */
	private String customerCompanyName;

	/**
	 * Gets or sets the partner's Id. For direct reseller, this is the partner's MPN Id.
	 * For indirect reseller, this is the VAR's MPN Id.
	 */
	private int partnerMpnId;

	/**
	 * Gets or sets the invoice number.
	 */
	private String invoiceNumber;

	/**
	 * Gets or sets the date charge begins.
	 */
	private DateTime chargeStartDate;

	/**
	 * Gets or sets the date charge ends.
	 */
	private DateTime chargeEndDate;

	/**
	 * Gets or sets the subscription Id.
	 */
	private String subscriptionId;

	/**
	 * Gets or sets the subscription name.
	 */
	private String subscriptionName;

	/**
	 * Gets or sets the description of the subscription.
	 */
	private String subscriptionDescription;

	/**
	 * Gets or sets the order Id.
	 */
	private String orderId;

	/**
	 * Gets or sets the service name. Example: Azure Data Service.
	 */
	private String serviceName;

	/**
	 * Gets or sets the resource name. Example: Database (GB/month).
	 */
	private String resourceName;

	/**
	 * Gets or sets the region associated with the resource instance.
	 */
	private String region;

	/**
	 * Gets or sets the total units consumed.
	 */
	private int consumedQuantity;

	/**
	 * @return the partnerId
	 */
	public String getPartnerId() {
		return partnerId;
	}

	/**
	 * @param partnerId the partnerId to set
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	/**
	 * @return the partnerName
	 */
	public String getPartnerName() {
		return partnerName;
	}

	/**
	 * @param partnerName the partnerName to set
	 */
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	/**
	 * @return the customerCompanyName
	 */
	public String getCustomerCompanyName() {
		return customerCompanyName;
	}

	/**
	 * @param customerCompanyName the customerCompanyName to set
	 */
	public void setCustomerCompanyName(String customerCompanyName) {
		this.customerCompanyName = customerCompanyName;
	}

	/**
	 * @return the partnerMpnId
	 */
	public int getPartnerMpnId() {
		return partnerMpnId;
	}

	/**
	 * @param partnerMpnId the partnerMpnId to set
	 */
	public void setPartnerMpnId(int partnerMpnId) {
		this.partnerMpnId = partnerMpnId;
	}

	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	/**
	 * @return the chargeStartDate
	 */
	public DateTime getChargeStartDate() {
		return chargeStartDate;
	}

	/**
	 * @param chargeStartDate the chargeStartDate to set
	 */
	public void setChargeStartDate(DateTime chargeStartDate) {
		this.chargeStartDate = chargeStartDate;
	}

	/**
	 * @return the chargeEndDate
	 */
	public DateTime getChargeEndDate() {
		return chargeEndDate;
	}

	/**
	 * @param chargeEndDate the chargeEndDate to set
	 */
	public void setChargeEndDate(DateTime chargeEndDate) {
		this.chargeEndDate = chargeEndDate;
	}

	/**
	 * @return the subscriptionId
	 */
	public String getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * @param subscriptionId the subscriptionId to set
	 */
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	/**
	 * @return the subscriptionName
	 */
	public String getSubscriptionName() {
		return subscriptionName;
	}

	/**
	 * @param subscriptionName the subscriptionName to set
	 */
	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}

	/**
	 * @return the subscriptionDescription
	 */
	public String getSubscriptionDescription() {
		return subscriptionDescription;
	}

	/**
	 * @param subscriptionDescription the subscriptionDescription to set
	 */
	public void setSubscriptionDescription(String subscriptionDescription) {
		this.subscriptionDescription = subscriptionDescription;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the resourceName
	 */
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * @param resourceName the resourceName to set
	 */
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the consumedQuantity
	 */
	public int getConsumedQuantity() {
		return consumedQuantity;
	}

	/**
	 * @param consumedQuantity the consumedQuantity to set
	 */
	public void setConsumedQuantity(int consumedQuantity) {
		this.consumedQuantity = consumedQuantity;
	}

	/**
	 * Returns the billing provider.
	 * 
	 *  @return The billing provider.
	 */
	@Override
	public BillingProvider getBillingProvider() {
		return BillingProvider.AZURE_DATA_MARKET;
	}
}