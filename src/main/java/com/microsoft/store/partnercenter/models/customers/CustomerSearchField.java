// ----------------------------------------------------------------
// <copyright file="CustomerSearchField.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.models.customers;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * List of search fields for customer search
 */
public enum CustomerSearchField
{
    /**
     * Customer Company name
     */
    COMPANY_NAME("CompanyName"),
    
    /**
     * Customer domain name
     */
    DOMAIN_NAME("Domain"),

    /**
     * The indirect reseller
     */
    INDIRECT_RESELLER("IndirectReseller"),

    /**
     * The indirect CSP
     */
    INDIRECT_CLOUD_SOLUTION_PROVIDER("IndirectCloudSolutionProvider");

    private String name;

    CustomerSearchField(String name)
    {
        this.name = name;
    }

    /**
     * Converts the object to a string. 
     * 
     * @return A string that represents this object.
     */
    @JsonValue
    @Override
    public String toString()
    {
        return name;
    }
}