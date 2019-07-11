// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.carts;

/**
 * Represent the renews to for a cart line item.
 */
public class RenewsTo 
{
    /**
     *  The term duration if applicable.
     */
    private String termDuration;

    /**
     * Gets the term duration if applicable.
     * 
     * @return The term duration if applicable.
     */
    public String getTermDuration()
    {
        return termDuration;
    }

    /**
     * Sets the term duration if applicable.
     * 
     * @param value The term duration if applicable.
     */
    public void setTermDuration(String value)
    {
    	termDuration = value;
    }
 }