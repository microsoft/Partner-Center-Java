// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.usage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * The spending budget allocated to the customer by the partner.
 */
@JsonIgnoreProperties( { "usageSpendingBudget" } )
public class SpendingBudget
    extends ResourceBase
{
    /**
     * Gets or sets the usage spending budget.
     */
    private Double __Amount;

    public Double getAmount()
    {
        return __Amount;
    }

    public void setAmount( Double value )
    {
        __Amount = value;
    }

}
