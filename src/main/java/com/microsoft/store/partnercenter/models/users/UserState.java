//-----------------------------------------------------------------------
//<copyright file="UserState.java" company="Microsoft">
//   Copyright (c) Microsoft Corporation. All rights reserved.
//</copyright>
//-----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.users;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * User state
 */
public enum UserState 
{
    /**
     * Active user.
     */
    ACTIVE("active"),

    /**
     * Inactive user.
     */
    INACTIVE("inactive");

    private final String value;

    UserState(String value)
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