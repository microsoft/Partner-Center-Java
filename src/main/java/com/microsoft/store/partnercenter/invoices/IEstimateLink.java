// -----------------------------------------------------------------------
// <copyright file="IEstimateLink.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

/**
 * Represents the operations available to an estimate link.
 */
public interface IEstimateLink
{
    /**
     * Gets the operations that can be applied on products from a given country.
     * 
     * @param currencyCode The currency code for the country.
     * @return The operations that can be performed on estimate link collection that belong to a given currency.
     */
    IEstimateLinkCollectionByCurrency byCurrency(String currencyCode);
}