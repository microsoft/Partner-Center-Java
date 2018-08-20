// ----------------------------------------------------------------
// <copyright file="ServiceRequestSearchField.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.models.servicerequests;

/**
 * Lists the supported service request search fields
 */
public enum ServiceRequestSearchField
{
    /**
     * Service request status
     */
	STATUS( "Status" );

    private String name;

    private ServiceRequestSearchField( String name )
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}
