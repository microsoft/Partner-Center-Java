// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UpgradeTypeTest
{
    private static final String NONE_VALUE = "none";
    private static final String UPGRADE_ONLY_VALUE = "upgrade_only";
    private static final String UPGRADE_WITH_LICENSE_TRANSFER_VALUE = "upgrade_with_license_transfer";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String UPGRADE_ONLY_JSON = '"' + UPGRADE_ONLY_VALUE + '"';
    private static final String UPGRADE_WITH_LICENSE_TRANSFER_JSON = '"' + UPGRADE_WITH_LICENSE_TRANSFER_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(UpgradeType.NONE, jsonConverter.readValue(NONE_JSON, UpgradeType.class));
        assertEquals(UpgradeType.UPGRADE_ONLY, jsonConverter.readValue(UPGRADE_ONLY_JSON, UpgradeType.class));
        assertEquals(UpgradeType.UPGRADE_WITH_LICENSE_TRANSFER, jsonConverter.readValue(UPGRADE_WITH_LICENSE_TRANSFER_JSON, UpgradeType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(UpgradeType.NONE));
        assertEquals(UPGRADE_ONLY_JSON, jsonConverter.writeValueAsString(UpgradeType.UPGRADE_ONLY));
        assertEquals(UPGRADE_WITH_LICENSE_TRANSFER_JSON, jsonConverter.writeValueAsString(UpgradeType.UPGRADE_WITH_LICENSE_TRANSFER));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, UpgradeType.NONE.toString());
        assertEquals(UPGRADE_ONLY_VALUE, UpgradeType.UPGRADE_ONLY.toString());
        assertEquals(UPGRADE_WITH_LICENSE_TRANSFER_VALUE, UpgradeType.UPGRADE_WITH_LICENSE_TRANSFER.toString());
    }
}