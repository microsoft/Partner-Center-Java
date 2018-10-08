// -----------------------------------------------------------------------
// <copyright file="ServiceCostLineItem.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.servicecosts;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

import org.joda.time.DateTime;

/**
 * Represents a charge incurred by the partner per customer for a given subscription.
 */
public class ServiceCostLineItem 
    extends ResourceBase 
{
    /***
     * Gets or sets the start date for the charge.
     */
	@JsonProperty( "startDate" )
    private DateTime __StartDate;

    public DateTime getStartDate()
    {
        return __StartDate;
    }

    public void setStartDate( DateTime value )
    {
    	__StartDate = value;
    }

    /***
     * Gets or sets the end date for the charge.
     */
	@JsonProperty( "endDate" )
    private DateTime __EndDate;

    public DateTime getEndDate()
    {
        return __EndDate;
    }

    public void setEnd( DateTime value )
    {
    	__EndDate = value;
    }

    /***
     * Gets or sets the friendly name for the subscription.
     */
	@JsonProperty( "subscriptionFriendlyName" )
    private String __SubscriptionFriendlyName;
    
    public String getSubscriptionFriendlyName()
    {
    	return __SubscriptionFriendlyName;
    }

    public void setSubscriptionFriendlyName( String value )
    {
    	__SubscriptionFriendlyName = value;
    }

    /***
     * Gets or sets the subscription identifier.
     */
	@JsonProperty( "subscriptionId" )
    private String __SubscriptionId;
    
    public String getSubscriptionId()
    {
    	return __SubscriptionId;
    }

    public void setSubscriptionId( String value )
    {
    	__SubscriptionId = value;
    }

    /***
     * Gets or sets the order identifier.
     */
	@JsonProperty( "orderId" )
    private String __OrderId;
    
    public String getOrderId()
    {
    	return __OrderId;
    }

    public void setOrderId( String value )
    {
    	__OrderId = value;
    }

    /***
     * Gets or sets the offer identifier.
     */
	@JsonProperty( "offerId" )
    private String __OfferId;
    
    public String getOfferId()
    {
    	return __OfferId;
    }

    public void setOfferId( String value )
    {
    	__OfferId = value;
    }

    /***
     * Gets or sets the offer name.
     */
	@JsonProperty( "offerName" )
    private String __OfferName;
    
    public String getOfferName()
    {
    	return __OfferName;
    }

    public void setOfferName( String value )
    {
    	__OfferName = value;
    }

    /***
     * Gets or sets the ResellerMPNId. In 2-tier partner scenarios, this refers to the MPN identifier.
     */
	@JsonProperty( "resellerMPNId" )
    private String __ResellerMPNId;
    
    public String getResellerMPNId()
    {
    	return __ResellerMPNId;
    }

    public void setResellerMPNId( String value )
    {
    	__ResellerMPNId = value;
    }

    /***
     * Gets or sets the the charge type associated.
     * Charges:
     *  PURCHASE_FEE: Initial charge for a subscription.
     *  CYCLE_FEE: Periodic charges for a subscription.
     * ConvertResources:
     *  CANCEL_USAGEFEE: Access usage fee upon cancellation for unpaid usage during the current billing period.
     *  CYCLE_USAGEFEE: Access usage fee for the current billing period.
     * PRORATIONS:
     *  PURCHASE_PRORATE: Prorated fees upon purchase.
     *  CANCEL_PRORATE: Prorated refund for unused portion of service upon cancellation.
     *  ACTIVATION_PRORATE: Prorated fees from activation until end of billing period.
     *  RENEW_PRORATE: Prorated fees upon subscription renewal.
     * InstanceProrates:
     *  CANCEL_INSTANCEPRORATE: Prorated charges refunded to the customer when associated seats are changed.
     *  CYCLE_INSTANCEPRORATE: Prorated charges assessed from the customer when associated seats are changed.
     * Credits:
     *  CREDIT: Credit applied to a payment instrument.
     * Offsets:
     *  OFFSET_LINEITEM: Partial or whole refund to a line item.
     *  ONE_TIME_REFUND: One Time Refund processed for the customer.
     *  TAX_REFUND: Refund due to validation of tax exemption certificate.
     * Discounts:
     *  ACTIVATION_DISCOUNT: Discount applied when subscription activated.
     *  CYCLE_DISCOUNT: Discount applied on periodic charges.
     *  RENEW_DISCOUNT: Discount applied when subscription renewed.
     *  CANCEL_DISCOUNT: Charges applied when discounts cancelled.
     * Usage Based:
     *  ASSESS USAGE FEE FOR CURRENT CYCLE.
     */
	@JsonProperty( "chargeType" )
    private String __ChargeType;
    
    public String getChargeType()
    {
    	return __ChargeType;
    }

    public void setChargeType( String value )
    {
    	__ChargeType = value;
    }

    /***
     * Gets or sets the quantity used or purchased.
     */
	@JsonProperty( "quantity" )
    private Double __Quantity;
    
    public Double getQuantity()
    {
    	return __Quantity;
    }

    public void setQuantity( Double value )
    {
    	__Quantity = value;
    }

    /***
     * Gets or sets the price per unit.
     */
	@JsonProperty( "unitPrice" )
    private Double __UnitPrice;
    
    public Double getUnitPrice()
    {
    	return __UnitPrice;
    }

    public void setUnitPrice( Double value )
    {
    	__UnitPrice = value;
    }

    /***
     * Gets or sets the total charge for this item before taxes.
     */
	@JsonProperty( "pretaxTotal" )
    private Double __PretaxTotal;
    
    public Double getPretaxTotal()
    {
    	return __PretaxTotal;
    }

    public void setPretaxTotal( Double value )
    {
    	__PretaxTotal = value;
    }

    /***
     * Gets or sets the tax incurred.
     */
	@JsonProperty( "tax" )
    private Double __Tax;
    
    public Double getTax()
    {
    	return __Tax;
    }

    public void setTax( Double value )
    {
    	__Tax = value;
    }

    /***
     * Gets or sets the total for this item inclusive of taxes.
     */
	@JsonProperty( "afterTaxTotal" )
    private Double __AfterTaxTotal;
    
    public Double getAfterTaxTotal()
    {
    	return __AfterTaxTotal;
    }

    public void setAfterTaxTotal( Double value )
    {
    	__AfterTaxTotal = value;
    }

    /***
     * Gets or sets the currency code for the costs.
     */
	@JsonProperty( "currencyCode" )
    private String __CurrencyCode;
    
    public String getCurrencyCode()
    {
    	return __CurrencyCode;
    }

    public void setCurrencyCode( String value )
    {
    	__CurrencyCode = value;
    }

    /***
     * Gets or sets the currency symbol for the costs.
     */
	@JsonProperty( "currencySymbol" )
    private String __CurrencySymbol;
    
    public String getCurrencySymbol()
    {
    	return __CurrencySymbol;
    }

    public void setCurrencySymbol( String value )
    {
    	__CurrencySymbol = value;
    }

    /***
     * Gets or sets The customer identifier.
     */
	@JsonProperty( "customerId" )
    private String __CustomerId;
    
    public String getCustomerId()
    {
    	return __CustomerId;
    }

    public void setCustomerId( String value )
    {
    	__CustomerId = value;
    }

    /***
     * Gets or sets the customer name.
     */
	@JsonProperty( "customerName" )
    private String __CustomerName;
    
    public String getCustomerName()
    {
    	return __CustomerName;
    }

    public void setCustomerName( String value )
    {
    	__CustomerName = value;
    }
}