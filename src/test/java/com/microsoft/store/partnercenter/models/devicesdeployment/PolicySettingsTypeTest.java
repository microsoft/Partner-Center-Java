// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.devicesdeployment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PolicySettingsTypeTest
{
    private static final String None_VALUE = "none";
    private static final String REMOVE_OEM_PREINSTALLS_VALUE = "remove_oem_preinstalls";
    private static final String OOBE_USER_NOT_LOCAL_ADMIN_VALUE = "oobe_user_not_local_admin";
    private static final String SKIP_EXPRESS_SETTINGS_VALUE = "skip_express_settings";
    private static final String SKIP_OEM_REGISTRATION_VALUE = "skip_oem_registration";
    private static final String SKIP_EULA_VALUE = "skip_eula";
    private static final String None_JSON = '"' + None_VALUE + '"';
    private static final String REMOVE_OEM_PREINSTALLS_JSON = '"' + REMOVE_OEM_PREINSTALLS_VALUE + '"';
    private static final String OOBE_USER_NOT_LOCAL_ADMIN_JSON = '"' + OOBE_USER_NOT_LOCAL_ADMIN_VALUE + '"';
    private static final String SKIP_EXPRESS_SETTINGS_JSON = '"' + SKIP_EXPRESS_SETTINGS_VALUE + '"';
    private static final String SKIP_OEM_REGISTRATION_JSON = '"' + SKIP_OEM_REGISTRATION_VALUE + '"';
    private static final String SKIP_EULA_JSON = '"' + SKIP_EULA_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(PolicySettingsType.None, jsonConverter.readValue(None_JSON, PolicySettingsType.class));
        assertEquals(PolicySettingsType.REMOVE_OEM_PREINSTALLS, jsonConverter.readValue(REMOVE_OEM_PREINSTALLS_JSON, PolicySettingsType.class));
        assertEquals(PolicySettingsType.OOBE_USER_NOT_LOCAL_ADMIN, jsonConverter.readValue(OOBE_USER_NOT_LOCAL_ADMIN_JSON, PolicySettingsType.class));
        assertEquals(PolicySettingsType.SKIP_EXPRESS_SETTINGS, jsonConverter.readValue(SKIP_EXPRESS_SETTINGS_JSON, PolicySettingsType.class));
        assertEquals(PolicySettingsType.SKIP_OEM_REGISTRATION, jsonConverter.readValue(SKIP_OEM_REGISTRATION_JSON, PolicySettingsType.class));
        assertEquals(PolicySettingsType.SKIP_EULA, jsonConverter.readValue(SKIP_EULA_JSON, PolicySettingsType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(None_JSON, jsonConverter.writeValueAsString(PolicySettingsType.None));
        assertEquals(REMOVE_OEM_PREINSTALLS_JSON, jsonConverter.writeValueAsString(PolicySettingsType.REMOVE_OEM_PREINSTALLS));
        assertEquals(OOBE_USER_NOT_LOCAL_ADMIN_JSON, jsonConverter.writeValueAsString(PolicySettingsType.OOBE_USER_NOT_LOCAL_ADMIN));
        assertEquals(SKIP_EXPRESS_SETTINGS_JSON, jsonConverter.writeValueAsString(PolicySettingsType.SKIP_EXPRESS_SETTINGS));
        assertEquals(SKIP_OEM_REGISTRATION_JSON, jsonConverter.writeValueAsString(PolicySettingsType.SKIP_OEM_REGISTRATION));
        assertEquals(SKIP_EULA_JSON, jsonConverter.writeValueAsString(PolicySettingsType.SKIP_EULA));
    }

    @Test
    void convertToString()
    {
        assertEquals(None_VALUE, PolicySettingsType.None.toString());
        assertEquals(REMOVE_OEM_PREINSTALLS_VALUE, PolicySettingsType.REMOVE_OEM_PREINSTALLS.toString());
        assertEquals(OOBE_USER_NOT_LOCAL_ADMIN_VALUE, PolicySettingsType.OOBE_USER_NOT_LOCAL_ADMIN.toString());
        assertEquals(SKIP_EXPRESS_SETTINGS_VALUE, PolicySettingsType.SKIP_EXPRESS_SETTINGS.toString());
        assertEquals(SKIP_OEM_REGISTRATION_VALUE, PolicySettingsType.SKIP_OEM_REGISTRATION.toString());
        assertEquals(SKIP_EULA_VALUE, PolicySettingsType.SKIP_EULA.toString());
    }
}