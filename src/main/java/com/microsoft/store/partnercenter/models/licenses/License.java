// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.licenses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Model for user licenses assigned to a user.
 */
public class License extends ResourceBase {
    /**
     * Gets or sets the service plan collection. Service plans refer to services that user is assigned to use.
     * For example , Delve is a service plan which a user is either assigned to use or can be assigned to use.
     */
	@JsonProperty( "servicePlans" )
	private Iterable<ServicePlan> __ServicePlans;
    
    public Iterable<ServicePlan> getServicePlans()
    {
        return __ServicePlans;
    }

    public void setServicePlans( Iterable<ServicePlan> value )
    {
    	__ServicePlans = value;
    }

    /**
     * Gets or sets the product SKU which the license applies to.
     */
	@JsonProperty( "productSku" )    
    private ProductSku __ProductSku;
    
    public ProductSku getProductSku()
    {
        return __ProductSku;
    }

    public void setProductSku( ProductSku value )
    {
    	__ProductSku = value;
    }
}
