// -----------------------------------------------------------------------
// <copyright file="SubscribedSku.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.licenses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/***
 * Model for subscribed products owned by a tenant.
 */
public class SubscribedSku extends ResourceBase {
    /***
     * Gets or sets the number of units available for assignment. This is calculated as Total units - Consumed units.
     */
	@JsonProperty( "AvailableUnits" )
    private int __AvailableUnits;

    public int getAvailableUnits()
    {
        return __AvailableUnits;
    }

    public void setAvailableUnits( int value )
    {
    	__AvailableUnits = value;
    }

    /***
     * Gets or sets the number of units active for assignment.
     */
    @JsonProperty( "ActiveUnits" )
    private int __ActiveUnits;
    public int getActiveUnits()
    {
        return __ActiveUnits;
    }

    public void setActiveUnits( int value )
    {
    	__ActiveUnits = value;
    }

    /***
     * Gets or sets the number of consumed units.
     */
    @JsonProperty( "ConsumedUnits" )
    private int __ConsumedUnits;
    
    public int getConsumedUnits()
    {
        return __ConsumedUnits;
    }

    public void setConsumedUnits( int value )
    {
    	__ConsumedUnits = value;
    }

    /***
     * Gets or sets the number of suspended units.
     */
    @JsonProperty( "SuspendedUnits" )
    private int __SuspendedUnits;
    
    public int getSuspendedUnits()
    {
        return __SuspendedUnits;
    }

    public void setSuspendedUnits( int value )
    {
    	__SuspendedUnits = value;
    }

    /***
     * Gets or sets the total units, which is sum of active and warning units.
     */
    @JsonProperty( "TotalUnits" )
    private int __TotalUnits;
    
    public int getTotalUnits()
    {
        return __TotalUnits;
    }

    public void setTotalUnits( int value )
    {
    	__TotalUnits = value;
    }

    /***
     * Gets or sets the number of warning units.
     */
    @JsonProperty( "WarningUnits" )
    private int __WarningUnits;
    
    public int getWarningUnits()
    {
        return __WarningUnits;
    }

    public void setWarningUnits( int value )
    {
    	__WarningUnits = value;
    }

    /***
     * Gets or sets the products.
     */
    @JsonProperty( "ProductSku" )
    private ProductSku __ProductSku;
    
    public ProductSku getProductSku()
    {
        return __ProductSku;
    }

    public void setProductSku( ProductSku value )
    {
    	__ProductSku = value;
    }

    /***
     * Gets or sets the collection of service plans of a product.
     */
    @JsonProperty( "ServicePlans" )
    private List<ServicePlan> __ServicePlans;
    
    public List<ServicePlan> getServicePlans()
    {
        return __ServicePlans;
    }

    public void setServicePlans( List<ServicePlan> value )
    {
    	__ServicePlans = value;
    }

    /***
     *  Gets or sets the SKU status of a product.
     */
    @JsonProperty( "CapabilityStatus" )
    private String __CapabilityStatus;
    
    public String getCapabilityStatus()
    {
        return __CapabilityStatus;
    }

    public void setCapabilityStatus( String value )
    {
    	__CapabilityStatus = value;
    }
}