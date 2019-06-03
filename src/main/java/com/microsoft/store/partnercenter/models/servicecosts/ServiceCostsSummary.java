// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.servicecosts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;

import org.joda.time.DateTime;

/**
 * Represents a service costs summary for a customer.
 */
public class ServiceCostsSummary 
    extends ResourceBaseWithLinks<ServiceCostsSummaryLinks> 
{
    /**
     * The service costs summary details.
     */
    private List<ServiceCostsSummary> details;

    /**
     * Gets the service costs summary details.
     * 
     * @return The service costs summary details.
     */
    public List<ServiceCostsSummary> getDetails()
    {
        return details;
    }

    /**
     * Sets the service costs summary details.
     * 
     * @param value The service costs summary details.
     */
    public void setDetails(List<ServiceCostsSummary> value) 
    {
        details = value;;
    }

    /**
     * Gets or sets the start of the billing period.
     */
	@JsonProperty("billingStartDate")
    private DateTime __BillingStartDate;

    public DateTime getBillingStartDate()
    {
        return __BillingStartDate;
    }

    public void setBillingStartDate(DateTime value)
    {
    	__BillingStartDate = value;
    }

    /**
     * Gets or sets the end of the billing period.
     */
	@JsonProperty("billingEndDate")
    private DateTime __BillingEndDate;

    public DateTime getBillingEndDate()
    {
        return __BillingEndDate;
    }

    public void setBillingEnd(DateTime value)
    {
    	__BillingEndDate = value;
    }

    /**
     * Gets or sets the total charge for this item before taxes.
     */
	@JsonProperty("pretaxTotal")
    private Double __PretaxTotal;
    
    public Double getPretaxTotal()
    {
    	return __PretaxTotal;
    }

    public void setPretaxTotal(Double value)
    {
    	__PretaxTotal = value;
    }

    /**
     * Gets or sets the tax incurred.
     */
	@JsonProperty("tax")
    private Double __Tax;
    
    public Double getTax()
    {
    	return __Tax;
    }

    public void setTax(Double value)
    {
    	__Tax = value;
    }

    /**
     * Gets or sets the total for this item inclusive of taxes.
     */
	@JsonProperty("afterTaxTotal")
    private Double __AfterTaxTotal;
    
    public Double getAfterTaxTotal()
    {
    	return __AfterTaxTotal;
    }

    public void setAfterTaxTotal(Double value)
    {
    	__AfterTaxTotal = value;
    }

    /**
     * Gets or sets the currency code for the costs.
     */
	@JsonProperty("currencyCode")
    private String __CurrencyCode;
    
    public String getCurrencyCode()
    {
    	return __CurrencyCode;
    }

    public void setCurrencyCode(String value)
    {
    	__CurrencyCode = value;
    }

    /**
     * Gets or sets the currency symbol for the costs.
     */
	@JsonProperty("currencySymbol")
    private String __CurrencySymbol;
    
    public String getCurrencySymbol()
    {
    	return __CurrencySymbol;
    }

    public void setCurrencySymbol(String value)
    {
    	__CurrencySymbol = value;
    }

    /**
     * Gets or sets The customer identifier.
     */
	@JsonProperty("customerId")
    private String __CustomerId;
    
    public String getCustomerId()
    {
    	return __CustomerId;
    }

    public void setCustomerId(String value)
    {
    	__CustomerId = value;
    }
}