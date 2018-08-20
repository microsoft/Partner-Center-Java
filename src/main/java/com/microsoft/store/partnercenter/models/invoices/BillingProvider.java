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
    None, 
    
    /**
    * Bill is provided by Office. Example: O365, and In-tune.
    */
    @JsonProperty( "office" )
    Office, 
    
    /**
    * Bill is provided by Azure. Example: Azure Services.
    */
    @JsonProperty( "azure" )
    Azure,
    
    /**
    * Bill is provided by Azure Data Market.
    */
    @JsonProperty( "azureDataMarket" )
    AzureDataMarket,

    /**
    * Bill is provided for one time purchases.
    */
    @JsonProperty( "oneTime" ) 
    OneTime
}
