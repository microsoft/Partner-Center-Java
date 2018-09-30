// ----------------------------------------------------------------
// <copyright file="BillingProvider.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BillingProvider
{
    /**
     * Different providers of billing information Enum initializer
     */
    @JsonProperty( "none" )
    NONE, 
    
    /**
    * Bill is provided by Office. Example: O365, and In-tune.
    */
    @JsonProperty( "office" )
    OFFICE, 
    
    /**
    * Bill is provided by Azure. Example: Azure Services.
    */
    @JsonProperty( "azure" )
    AZURE,
    
    /**
    * Bill is provided by Azure Data Market.
    */
    @JsonProperty( "azureDataMarket" )
    AZURE_DATA_MARKET,

    /**
    * Bill is provided for one time purchases.
    */
    @JsonProperty( "oneTime" ) 
    ONE_TIME
}
