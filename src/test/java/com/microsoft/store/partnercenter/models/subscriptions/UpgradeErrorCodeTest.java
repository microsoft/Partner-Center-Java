// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UpgradeErrorCodeTest
{
    private static final String OTHER_VALUE = "Other";
    private static final String DELEGATED_ADMIN_PERMISSIONS_DISABLED_VALUE = "DelegatedAdminPermissionsDisabled";
    private static final String SUBSCRIPTION_STATUS_NOT_ACTIVE_VALUE = "SubscriptionStatusNotActive";
    private static final String CONFLICTING_SERVICE_TYPES_VALUE = "ConflictingServiceTypes";
    private static final String CONCURRENCY_CONFLICTS_VALUE = "ConcurrencyConflicts";
    private static final String USER_CONTEXT_REQUIRED_VALUE = "UserContextRequired";
    private static final String SUBSCRIPTION_ADD_ONS_PRESENT_VALUE = "SubscriptionAddOnsPresent";
    private static final String SUBSCRIPTION_DOES_NOT_HAVE_ANY_UPGRADE_PATHS_VALUE = "SubscriptionDoesNotHaveAnyUpgradePaths";
    private static final String SUBSCRIPTION_TARGET_OFFER_NOT_FOUND_VALUE = "SubscriptionTargetOfferNotFound";
    private static final String SUBSCRIPTION_NOT_PROVISIONED_VALUE = "SubscriptionNotProvisioned";
    private static final String OTHER_JSON = '"' + OTHER_VALUE + '"';
    private static final String DELEGATED_ADMIN_PERMISSIONS_DISABLED_JSON = '"' + DELEGATED_ADMIN_PERMISSIONS_DISABLED_VALUE + '"';
    private static final String SUBSCRIPTION_STATUS_NOT_ACTIVE_JSON = '"' + SUBSCRIPTION_STATUS_NOT_ACTIVE_VALUE + '"';
    private static final String CONFLICTING_SERVICE_TYPES_JSON = '"' + CONFLICTING_SERVICE_TYPES_VALUE + '"';
    private static final String CONCURRENCY_CONFLICTS_JSON = '"' + CONCURRENCY_CONFLICTS_VALUE + '"';
    private static final String USER_CONTEXT_REQUIRED_JSON = '"' + USER_CONTEXT_REQUIRED_VALUE + '"';
    private static final String SUBSCRIPTION_ADD_ONS_PRESENT_JSON = '"' + SUBSCRIPTION_ADD_ONS_PRESENT_VALUE + '"';
    private static final String SUBSCRIPTION_DOES_NOT_HAVE_ANY_UPGRADE_PATHS_JSON = '"' + SUBSCRIPTION_DOES_NOT_HAVE_ANY_UPGRADE_PATHS_VALUE + '"';
    private static final String SUBSCRIPTION_TARGET_OFFER_NOT_FOUND_JSON = '"' + SUBSCRIPTION_TARGET_OFFER_NOT_FOUND_VALUE + '"';
    private static final String SUBSCRIPTION_NOT_PROVISIONED_JSON = '"' + SUBSCRIPTION_NOT_PROVISIONED_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(UpgradeErrorCode.OTHER, jsonConverter.readValue(OTHER_JSON, UpgradeErrorCode.class));
        assertEquals(UpgradeErrorCode.DELEGATED_ADMIN_PERMISSIONS_DISABLED, jsonConverter.readValue(DELEGATED_ADMIN_PERMISSIONS_DISABLED_JSON, UpgradeErrorCode.class));
        assertEquals(UpgradeErrorCode.SUBSCRIPTION_STATUS_NOT_ACTIVE, jsonConverter.readValue(SUBSCRIPTION_STATUS_NOT_ACTIVE_JSON, UpgradeErrorCode.class));
        assertEquals(UpgradeErrorCode.CONFLICTING_SERVICE_TYPES, jsonConverter.readValue(CONFLICTING_SERVICE_TYPES_JSON, UpgradeErrorCode.class));
        assertEquals(UpgradeErrorCode.CONCURRENCY_CONFLICTS, jsonConverter.readValue(CONCURRENCY_CONFLICTS_JSON, UpgradeErrorCode.class));
        assertEquals(UpgradeErrorCode.USER_CONTEXT_REQUIRED, jsonConverter.readValue(USER_CONTEXT_REQUIRED_JSON, UpgradeErrorCode.class));
        assertEquals(UpgradeErrorCode.SUBSCRIPTION_ADD_ONS_PRESENT, jsonConverter.readValue(SUBSCRIPTION_ADD_ONS_PRESENT_JSON, UpgradeErrorCode.class));
        assertEquals(UpgradeErrorCode.SUBSCRIPTION_DOES_NOT_HAVE_ANY_UPGRADE_PATHS, jsonConverter.readValue(SUBSCRIPTION_DOES_NOT_HAVE_ANY_UPGRADE_PATHS_JSON, UpgradeErrorCode.class));
        assertEquals(UpgradeErrorCode.SUBSCRIPTION_TARGET_OFFER_NOT_FOUND, jsonConverter.readValue(SUBSCRIPTION_TARGET_OFFER_NOT_FOUND_JSON, UpgradeErrorCode.class));
        assertEquals(UpgradeErrorCode.SUBSCRIPTION_NOT_PROVISIONED, jsonConverter.readValue(SUBSCRIPTION_NOT_PROVISIONED_JSON, UpgradeErrorCode.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(OTHER_JSON, jsonConverter.writeValueAsString(UpgradeErrorCode.OTHER));
        assertEquals(DELEGATED_ADMIN_PERMISSIONS_DISABLED_JSON, jsonConverter.writeValueAsString(UpgradeErrorCode.DELEGATED_ADMIN_PERMISSIONS_DISABLED));
        assertEquals(SUBSCRIPTION_STATUS_NOT_ACTIVE_JSON, jsonConverter.writeValueAsString(UpgradeErrorCode.SUBSCRIPTION_STATUS_NOT_ACTIVE));
        assertEquals(CONFLICTING_SERVICE_TYPES_JSON, jsonConverter.writeValueAsString(UpgradeErrorCode.CONFLICTING_SERVICE_TYPES));
        assertEquals(CONCURRENCY_CONFLICTS_JSON, jsonConverter.writeValueAsString(UpgradeErrorCode.CONCURRENCY_CONFLICTS));
        assertEquals(USER_CONTEXT_REQUIRED_JSON, jsonConverter.writeValueAsString(UpgradeErrorCode.USER_CONTEXT_REQUIRED));
        assertEquals(SUBSCRIPTION_ADD_ONS_PRESENT_JSON, jsonConverter.writeValueAsString(UpgradeErrorCode.SUBSCRIPTION_ADD_ONS_PRESENT));
        assertEquals(SUBSCRIPTION_DOES_NOT_HAVE_ANY_UPGRADE_PATHS_JSON, jsonConverter.writeValueAsString(UpgradeErrorCode.SUBSCRIPTION_DOES_NOT_HAVE_ANY_UPGRADE_PATHS));
        assertEquals(SUBSCRIPTION_TARGET_OFFER_NOT_FOUND_JSON, jsonConverter.writeValueAsString(UpgradeErrorCode.SUBSCRIPTION_TARGET_OFFER_NOT_FOUND));
        assertEquals(SUBSCRIPTION_NOT_PROVISIONED_JSON, jsonConverter.writeValueAsString(UpgradeErrorCode.SUBSCRIPTION_NOT_PROVISIONED));
    }

    @Test
    void convertToString()
    {
        assertEquals(OTHER_VALUE, UpgradeErrorCode.OTHER.toString());
        assertEquals(DELEGATED_ADMIN_PERMISSIONS_DISABLED_VALUE, UpgradeErrorCode.DELEGATED_ADMIN_PERMISSIONS_DISABLED.toString());
        assertEquals(SUBSCRIPTION_STATUS_NOT_ACTIVE_VALUE, UpgradeErrorCode.SUBSCRIPTION_STATUS_NOT_ACTIVE.toString());
        assertEquals(CONFLICTING_SERVICE_TYPES_VALUE, UpgradeErrorCode.CONFLICTING_SERVICE_TYPES.toString());
        assertEquals(CONCURRENCY_CONFLICTS_VALUE, UpgradeErrorCode.CONCURRENCY_CONFLICTS.toString());
        assertEquals(USER_CONTEXT_REQUIRED_VALUE, UpgradeErrorCode.USER_CONTEXT_REQUIRED.toString());
        assertEquals(SUBSCRIPTION_ADD_ONS_PRESENT_VALUE, UpgradeErrorCode.SUBSCRIPTION_ADD_ONS_PRESENT.toString());
        assertEquals(SUBSCRIPTION_DOES_NOT_HAVE_ANY_UPGRADE_PATHS_VALUE, UpgradeErrorCode.SUBSCRIPTION_DOES_NOT_HAVE_ANY_UPGRADE_PATHS.toString());
        assertEquals(SUBSCRIPTION_TARGET_OFFER_NOT_FOUND_VALUE, UpgradeErrorCode.SUBSCRIPTION_TARGET_OFFER_NOT_FOUND.toString());
        assertEquals(SUBSCRIPTION_NOT_PROVISIONED_VALUE, UpgradeErrorCode.SUBSCRIPTION_NOT_PROVISIONED.toString());
    }
}