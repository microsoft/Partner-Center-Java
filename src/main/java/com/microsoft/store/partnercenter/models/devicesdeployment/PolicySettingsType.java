// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.devicesdeployment;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents the settings for an OOBE(Out of box experience) policy.
 */
public enum PolicySettingsType
{
    /**
     * Default value for policy settings.
     */
    None("none"),

    /**
     * Remove OEM Pre-installs.
     */
    REMOVE_OEM_PREINSTALLS("remove_oem_preinstalls"),

    /**
     * OOBE(Out of box experience) user will not be a local admin on the configured device.
     */
    OOBE_USER_NOT_LOCAL_ADMIN("oobe_user_not_local_admin"),

    /**
     * Skip express settings.
     */
    SKIP_EXPRESS_SETTINGS("skip_express_settings"),

    /**
     *  Skip OEM registration settings.
     */
    SKIP_OEM_REGISTRATION("skip_oem_registration"),

    /**
     * Skip EULA settings.
     */
    SKIP_EULA("skip_eula");

    private final String value;

    PolicySettingsType(String value)
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