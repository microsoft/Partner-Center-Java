//-----------------------------------------------------------------------
//<copyright file="UserDomainType.java" company="Microsoft">
//   Copyright (c) Microsoft Corporation. All rights reserved.
//</copyright>
//-----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.users;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Types of user domains supported.
 */
public enum UserDomainType 
{
    /**
     * Default - None.
     */
    NONE("none"),

    /**
     * Password sync directories support mixed mode
     * i.e. users that are cloud only or directory synced from an on premises directory.
     */
    MANAGED("managed"),

    /**
     * Federated domains don’t support mixed mode.
     * Users created have to be linked to an on premises directory account
     * with their immutable ids.
     */
    FEDERATED("federated");

    private final String value;

    UserDomainType(String value)
    {
        this.value = value;
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
        return value;
    }
}