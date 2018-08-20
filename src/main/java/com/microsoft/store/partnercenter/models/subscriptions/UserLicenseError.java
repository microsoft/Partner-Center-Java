// -----------------------------------------------------------------------
// <copyright file="UserLicenseError.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import java.util.UUID;

import com.microsoft.store.partnercenter.models.ApiFault;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents a user and the services that had errors during license transfer.
 */
public class UserLicenseError
    extends ResourceBase
{
    /**
     * Gets or sets the user object identifier.
     */
    private UUID __UserObjectId;

    public UUID getUserObjectId()
    {
        return __UserObjectId;
    }

    public void setUserObjectId( UUID value )
    {
        __UserObjectId = value;
    }

    /**
     * Gets or sets the name of the user.
     */
    private String __Name;

    public String getName()
    {
        return __Name;
    }

    public void setName( String value )
    {
        __Name = value;
    }

    /**
     * Gets or sets the email of the user.
     */
    private String __Email;

    public String getEmail()
    {
        return __Email;
    }

    public void setEmail( String value )
    {
        __Email = value;
    }

    /**
     * Gets or sets the list of errors that occurred during license transfer.
     */
    private Iterable<ApiFault> __Errors;

    public Iterable<ApiFault> getErrors()
    {
        return __Errors;
    }

    public void setErrors( Iterable<ApiFault> value )
    {
        __Errors = value;
    }

}
