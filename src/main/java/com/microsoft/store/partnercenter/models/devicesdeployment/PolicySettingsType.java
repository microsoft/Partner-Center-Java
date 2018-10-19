// -----------------------------------------------------------------------
// <copyright file="PolicySettingsType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.devicesdeployment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the settings for an OOBE(Out of box experience) policy.
 */
public enum PolicySettingsType {
    /**
     * Default value for policy settings.
     */
    @JsonProperty("none")
    None,

    /**
     * Remove OEM Pre-installs.
     */
    @JsonProperty("remove_oem_preinstalls")
    REMOVE_OEM_PREINSTALLS,
    
    /**
     * OOBE(Out of box experience) user will not be a local admin on the configured device.
     */
    @JsonProperty("oobe_user_not_local_admin")
    OOBE_USER_NOT_LOCAL_ADMIN,

    /**
     * Skip express settings.
     */
    @JsonProperty("skip_express_settings")
    SKIP_EXPRESS_SETTINGS,

    /**
     *  Skip OEM registration settings.
     */
    @JsonProperty("skip_oem_registration")
    SKIP_OEM_REGISTRATION,

    /**
     * Skip EULA settings.
     */
    @JsonProperty("skip_eula")
    SKIP_EULA
}