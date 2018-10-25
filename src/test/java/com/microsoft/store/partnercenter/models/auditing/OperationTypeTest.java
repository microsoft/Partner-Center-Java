// -----------------------------------------------------------------------
// <copyright file="OperationTypeTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperationTypeTest
{
    private static final String UNDEFINED_VALUE = "undefined";
    private static final String UPDATE_CUSTOMER_QUALIFICATION_VALUE = "update_customer_qualification";
    private static final String UPDATE_SUBSCRIPTION_VALUE = "update_subscription";
    private static final String UPGRADE_SUBSCRIPTION_VALUE = "upgrade_subscription";
    private static final String CONVERT_TRIAL_SUBSCRIPTION_VALUE = "convert_trial_subscription";
    private static final String ADD_CUSTOMER_VALUE = "add_customer";
    private static final String UPDATE_CUSTOMER_BILLING_PROFILE_VALUE = "update_customer_billing_profile";
    private static final String UPDATECUSTOMERPARTNERCONTRACTCOMPANYNAME_VALUE = "update_customer_partner_contract_company_Name";
    private static final String UPDATECUSTOMERSPENDINGBUDGET_VALUE = "update_Customer_spending_budget";
    private static final String DELETE_CUSTOMER_VALUE = "delete_customer";
    private static final String REMOVE_PARTNER_CUSTOMER_RELATIONSHIP_VALUE = "remove_partner_customer_relationship";
    private static final String CREATE_ORDER_VALUE = "create_order";
    private static final String UPDATE_ORDER_VALUE = "update_order";
    private static final String CREATE_CUSTOMER_USER_VALUE = "create_customer_user";
    private static final String DELETE_CUSTOMER_USER_VALUE = "delete_customer_user";
    private static final String UPDATE_CUSTOMER_USER_VALUE = "update_customer_user";
    private static final String UPDATE_CUSTOMER_USER_LICENSES_VALUE = "Update_customer_user_licenses";
    private static final String RESET_CUSTOMER_USER_PASSWORD_VALUE = "reset_customer_user_password";
    private static final String UPDATE_CUSTOMER_USER_PRINCIPAL_NAME_VALUE = "update_customer_user_principal_name";
    private static final String RESTORE_CUSTOMER_USER_VALUE = "restore_customer_user";
    private static final String CREATE_MPN_ASSOCIATION_VALUE = "create_mpn_association";
    private static final String UPDATE_MPN_ASSOCIATION_VALUE = "update_mpn_association";
    private static final String UPDATE_SFB_CUSTOMER_USER_LICENSES_VALUE = "update_sfb_customer_user_licenses";
    private static final String UPDATE_TRANSFER_VALUE = "update_transfer";
    private static final String CREATE_PARTNER_RELATIONSHIP_VALUE = "create_partner_relationship";
    private static final String REGISTER_APPLICATION_VALUE = "register_application";
    private static final String UNREGISTER_APPLICATION_VALUE = "unregister_application";
    private static final String ADD_APPLICATION_CREDENTIAL_VALUE = "add_application_credential";
    private static final String REMOVE_APPLICATION_CREDENTIAL_VALUE = "remove_application_credential";
    private static final String CREATE_PARTNER_USER_VALUE = "create_partner_user";
    private static final String UPDATE_PARTNER_USER_VALUE = "update_partner_user";
    private static final String remove_partner_user_VALUE = "Remove_partner_user";
    private static final String UNDEFINED_JSON = '"' + UNDEFINED_VALUE + '"';
    private static final String UPDATE_CUSTOMER_QUALIFICATION_JSON = '"' + UPDATE_CUSTOMER_QUALIFICATION_VALUE + '"';
    private static final String UPDATE_SUBSCRIPTION_JSON = '"' + UPDATE_SUBSCRIPTION_VALUE + '"';
    private static final String UPGRADE_SUBSCRIPTION_JSON = '"' + UPGRADE_SUBSCRIPTION_VALUE + '"';
    private static final String CONVERT_TRIAL_SUBSCRIPTION_JSON = '"' + CONVERT_TRIAL_SUBSCRIPTION_VALUE + '"';
    private static final String ADD_CUSTOMER_JSON = '"' + ADD_CUSTOMER_VALUE + '"';
    private static final String UPDATE_CUSTOMER_BILLING_PROFILE_JSON = '"' + UPDATE_CUSTOMER_BILLING_PROFILE_VALUE + '"';
    private static final String UPDATECUSTOMERPARTNERCONTRACTCOMPANYNAME_JSON = '"' + UPDATECUSTOMERPARTNERCONTRACTCOMPANYNAME_VALUE + '"';
    private static final String UPDATECUSTOMERSPENDINGBUDGET_JSON = '"' + UPDATECUSTOMERSPENDINGBUDGET_VALUE + '"';
    private static final String DELETE_CUSTOMER_JSON = '"' + DELETE_CUSTOMER_VALUE + '"';
    private static final String REMOVE_PARTNER_CUSTOMER_RELATIONSHIP_JSON = '"' + REMOVE_PARTNER_CUSTOMER_RELATIONSHIP_VALUE + '"';
    private static final String CREATE_ORDER_JSON = '"' + CREATE_ORDER_VALUE + '"';
    private static final String UPDATE_ORDER_JSON = '"' + UPDATE_ORDER_VALUE + '"';
    private static final String CREATE_CUSTOMER_USER_JSON = '"' + CREATE_CUSTOMER_USER_VALUE + '"';
    private static final String DELETE_CUSTOMER_USER_JSON = '"' + DELETE_CUSTOMER_USER_VALUE + '"';
    private static final String UPDATE_CUSTOMER_USER_JSON = '"' + UPDATE_CUSTOMER_USER_VALUE + '"';
    private static final String UPDATE_CUSTOMER_USER_LICENSES_JSON = '"' + UPDATE_CUSTOMER_USER_LICENSES_VALUE + '"';
    private static final String RESET_CUSTOMER_USER_PASSWORD_JSON = '"' + RESET_CUSTOMER_USER_PASSWORD_VALUE + '"';
    private static final String UPDATE_CUSTOMER_USER_PRINCIPAL_NAME_JSON = '"' + UPDATE_CUSTOMER_USER_PRINCIPAL_NAME_VALUE + '"';
    private static final String RESTORE_CUSTOMER_USER_JSON = '"' + RESTORE_CUSTOMER_USER_VALUE + '"';
    private static final String CREATE_MPN_ASSOCIATION_JSON = '"' + CREATE_MPN_ASSOCIATION_VALUE + '"';
    private static final String UPDATE_MPN_ASSOCIATION_JSON = '"' + UPDATE_MPN_ASSOCIATION_VALUE + '"';
    private static final String UPDATE_SFB_CUSTOMER_USER_LICENSES_JSON = '"' + UPDATE_SFB_CUSTOMER_USER_LICENSES_VALUE + '"';
    private static final String UPDATE_TRANSFER_JSON = '"' + UPDATE_TRANSFER_VALUE + '"';
    private static final String CREATE_PARTNER_RELATIONSHIP_JSON = '"' + CREATE_PARTNER_RELATIONSHIP_VALUE + '"';
    private static final String REGISTER_APPLICATION_JSON = '"' + REGISTER_APPLICATION_VALUE + '"';
    private static final String UNREGISTER_APPLICATION_JSON = '"' + UNREGISTER_APPLICATION_VALUE + '"';
    private static final String ADD_APPLICATION_CREDENTIAL_JSON = '"' + ADD_APPLICATION_CREDENTIAL_VALUE + '"';
    private static final String REMOVE_APPLICATION_CREDENTIAL_JSON = '"' + REMOVE_APPLICATION_CREDENTIAL_VALUE + '"';
    private static final String CREATE_PARTNER_USER_JSON = '"' + CREATE_PARTNER_USER_VALUE + '"';
    private static final String UPDATE_PARTNER_USER_JSON = '"' + UPDATE_PARTNER_USER_VALUE + '"';
    private static final String remove_partner_user_JSON = '"' + remove_partner_user_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(OperationType.UNDEFINED, jsonConverter.readValue(UNDEFINED_JSON, OperationType.class));
        assertEquals(OperationType.UPDATE_CUSTOMER_QUALIFICATION, jsonConverter.readValue(UPDATE_CUSTOMER_QUALIFICATION_JSON, OperationType.class));
        assertEquals(OperationType.UPDATE_SUBSCRIPTION, jsonConverter.readValue(UPDATE_SUBSCRIPTION_JSON, OperationType.class));
        assertEquals(OperationType.UPGRADE_SUBSCRIPTION, jsonConverter.readValue(UPGRADE_SUBSCRIPTION_JSON, OperationType.class));
        assertEquals(OperationType.CONVERT_TRIAL_SUBSCRIPTION, jsonConverter.readValue(CONVERT_TRIAL_SUBSCRIPTION_JSON, OperationType.class));
        assertEquals(OperationType.ADD_CUSTOMER, jsonConverter.readValue(ADD_CUSTOMER_JSON, OperationType.class));
        assertEquals(OperationType.UPDATE_CUSTOMER_BILLING_PROFILE, jsonConverter.readValue(UPDATE_CUSTOMER_BILLING_PROFILE_JSON, OperationType.class));
        assertEquals(OperationType.UPDATECUSTOMERPARTNERCONTRACTCOMPANYNAME, jsonConverter.readValue(UPDATECUSTOMERPARTNERCONTRACTCOMPANYNAME_JSON, OperationType.class));
        assertEquals(OperationType.UPDATECUSTOMERSPENDINGBUDGET, jsonConverter.readValue(UPDATECUSTOMERSPENDINGBUDGET_JSON, OperationType.class));
        assertEquals(OperationType.DELETE_CUSTOMER, jsonConverter.readValue(DELETE_CUSTOMER_JSON, OperationType.class));
        assertEquals(OperationType.REMOVE_PARTNER_CUSTOMER_RELATIONSHIP, jsonConverter.readValue(REMOVE_PARTNER_CUSTOMER_RELATIONSHIP_JSON, OperationType.class));
        assertEquals(OperationType.CREATE_ORDER, jsonConverter.readValue(CREATE_ORDER_JSON, OperationType.class));
        assertEquals(OperationType.UPDATE_ORDER, jsonConverter.readValue(UPDATE_ORDER_JSON, OperationType.class));
        assertEquals(OperationType.CREATE_CUSTOMER_USER, jsonConverter.readValue(CREATE_CUSTOMER_USER_JSON, OperationType.class));
        assertEquals(OperationType.DELETE_CUSTOMER_USER, jsonConverter.readValue(DELETE_CUSTOMER_USER_JSON, OperationType.class));
        assertEquals(OperationType.UPDATE_CUSTOMER_USER, jsonConverter.readValue(UPDATE_CUSTOMER_USER_JSON, OperationType.class));
        assertEquals(OperationType.UPDATE_CUSTOMER_USER_LICENSES, jsonConverter.readValue(UPDATE_CUSTOMER_USER_LICENSES_JSON, OperationType.class));
        assertEquals(OperationType.RESET_CUSTOMER_USER_PASSWORD, jsonConverter.readValue(RESET_CUSTOMER_USER_PASSWORD_JSON, OperationType.class));
        assertEquals(OperationType.UPDATE_CUSTOMER_USER_PRINCIPAL_NAME, jsonConverter.readValue(UPDATE_CUSTOMER_USER_PRINCIPAL_NAME_JSON, OperationType.class));
        assertEquals(OperationType.RESTORE_CUSTOMER_USER, jsonConverter.readValue(RESTORE_CUSTOMER_USER_JSON, OperationType.class));
        assertEquals(OperationType.CREATE_MPN_ASSOCIATION, jsonConverter.readValue(CREATE_MPN_ASSOCIATION_JSON, OperationType.class));
        assertEquals(OperationType.UPDATE_MPN_ASSOCIATION, jsonConverter.readValue(UPDATE_MPN_ASSOCIATION_JSON, OperationType.class));
        assertEquals(OperationType.UPDATE_SFB_CUSTOMER_USER_LICENSES, jsonConverter.readValue(UPDATE_SFB_CUSTOMER_USER_LICENSES_JSON, OperationType.class));
        assertEquals(OperationType.UPDATE_TRANSFER, jsonConverter.readValue(UPDATE_TRANSFER_JSON, OperationType.class));
        assertEquals(OperationType.CREATE_PARTNER_RELATIONSHIP, jsonConverter.readValue(CREATE_PARTNER_RELATIONSHIP_JSON, OperationType.class));
        assertEquals(OperationType.REGISTER_APPLICATION, jsonConverter.readValue(REGISTER_APPLICATION_JSON, OperationType.class));
        assertEquals(OperationType.UNREGISTER_APPLICATION, jsonConverter.readValue(UNREGISTER_APPLICATION_JSON, OperationType.class));
        assertEquals(OperationType.ADD_APPLICATION_CREDENTIAL, jsonConverter.readValue(ADD_APPLICATION_CREDENTIAL_JSON, OperationType.class));
        assertEquals(OperationType.REMOVE_APPLICATION_CREDENTIAL, jsonConverter.readValue(REMOVE_APPLICATION_CREDENTIAL_JSON, OperationType.class));
        assertEquals(OperationType.CREATE_PARTNER_USER, jsonConverter.readValue(CREATE_PARTNER_USER_JSON, OperationType.class));
        assertEquals(OperationType.UPDATE_PARTNER_USER, jsonConverter.readValue(UPDATE_PARTNER_USER_JSON, OperationType.class));
        assertEquals(OperationType.remove_partner_user, jsonConverter.readValue(remove_partner_user_JSON, OperationType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(UNDEFINED_JSON, jsonConverter.writeValueAsString(OperationType.UNDEFINED));
        assertEquals(UPDATE_CUSTOMER_QUALIFICATION_JSON, jsonConverter.writeValueAsString(OperationType.UPDATE_CUSTOMER_QUALIFICATION));
        assertEquals(UPDATE_SUBSCRIPTION_JSON, jsonConverter.writeValueAsString(OperationType.UPDATE_SUBSCRIPTION));
        assertEquals(UPGRADE_SUBSCRIPTION_JSON, jsonConverter.writeValueAsString(OperationType.UPGRADE_SUBSCRIPTION));
        assertEquals(CONVERT_TRIAL_SUBSCRIPTION_JSON, jsonConverter.writeValueAsString(OperationType.CONVERT_TRIAL_SUBSCRIPTION));
        assertEquals(ADD_CUSTOMER_JSON, jsonConverter.writeValueAsString(OperationType.ADD_CUSTOMER));
        assertEquals(UPDATE_CUSTOMER_BILLING_PROFILE_JSON, jsonConverter.writeValueAsString(OperationType.UPDATE_CUSTOMER_BILLING_PROFILE));
        assertEquals(UPDATECUSTOMERPARTNERCONTRACTCOMPANYNAME_JSON, jsonConverter.writeValueAsString(OperationType.UPDATECUSTOMERPARTNERCONTRACTCOMPANYNAME));
        assertEquals(UPDATECUSTOMERSPENDINGBUDGET_JSON, jsonConverter.writeValueAsString(OperationType.UPDATECUSTOMERSPENDINGBUDGET));
        assertEquals(DELETE_CUSTOMER_JSON, jsonConverter.writeValueAsString(OperationType.DELETE_CUSTOMER));
        assertEquals(REMOVE_PARTNER_CUSTOMER_RELATIONSHIP_JSON, jsonConverter.writeValueAsString(OperationType.REMOVE_PARTNER_CUSTOMER_RELATIONSHIP));
        assertEquals(CREATE_ORDER_JSON, jsonConverter.writeValueAsString(OperationType.CREATE_ORDER));
        assertEquals(UPDATE_ORDER_JSON, jsonConverter.writeValueAsString(OperationType.UPDATE_ORDER));
        assertEquals(CREATE_CUSTOMER_USER_JSON, jsonConverter.writeValueAsString(OperationType.CREATE_CUSTOMER_USER));
        assertEquals(DELETE_CUSTOMER_USER_JSON, jsonConverter.writeValueAsString(OperationType.DELETE_CUSTOMER_USER));
        assertEquals(UPDATE_CUSTOMER_USER_JSON, jsonConverter.writeValueAsString(OperationType.UPDATE_CUSTOMER_USER));
        assertEquals(UPDATE_CUSTOMER_USER_LICENSES_JSON, jsonConverter.writeValueAsString(OperationType.UPDATE_CUSTOMER_USER_LICENSES));
        assertEquals(RESET_CUSTOMER_USER_PASSWORD_JSON, jsonConverter.writeValueAsString(OperationType.RESET_CUSTOMER_USER_PASSWORD));
        assertEquals(UPDATE_CUSTOMER_USER_PRINCIPAL_NAME_JSON, jsonConverter.writeValueAsString(OperationType.UPDATE_CUSTOMER_USER_PRINCIPAL_NAME));
        assertEquals(RESTORE_CUSTOMER_USER_JSON, jsonConverter.writeValueAsString(OperationType.RESTORE_CUSTOMER_USER));
        assertEquals(CREATE_MPN_ASSOCIATION_JSON, jsonConverter.writeValueAsString(OperationType.CREATE_MPN_ASSOCIATION));
        assertEquals(UPDATE_MPN_ASSOCIATION_JSON, jsonConverter.writeValueAsString(OperationType.UPDATE_MPN_ASSOCIATION));
        assertEquals(UPDATE_SFB_CUSTOMER_USER_LICENSES_JSON, jsonConverter.writeValueAsString(OperationType.UPDATE_SFB_CUSTOMER_USER_LICENSES));
        assertEquals(UPDATE_TRANSFER_JSON, jsonConverter.writeValueAsString(OperationType.UPDATE_TRANSFER));
        assertEquals(CREATE_PARTNER_RELATIONSHIP_JSON, jsonConverter.writeValueAsString(OperationType.CREATE_PARTNER_RELATIONSHIP));
        assertEquals(REGISTER_APPLICATION_JSON, jsonConverter.writeValueAsString(OperationType.REGISTER_APPLICATION));
        assertEquals(UNREGISTER_APPLICATION_JSON, jsonConverter.writeValueAsString(OperationType.UNREGISTER_APPLICATION));
        assertEquals(ADD_APPLICATION_CREDENTIAL_JSON, jsonConverter.writeValueAsString(OperationType.ADD_APPLICATION_CREDENTIAL));
        assertEquals(REMOVE_APPLICATION_CREDENTIAL_JSON, jsonConverter.writeValueAsString(OperationType.REMOVE_APPLICATION_CREDENTIAL));
        assertEquals(CREATE_PARTNER_USER_JSON, jsonConverter.writeValueAsString(OperationType.CREATE_PARTNER_USER));
        assertEquals(UPDATE_PARTNER_USER_JSON, jsonConverter.writeValueAsString(OperationType.UPDATE_PARTNER_USER));
        assertEquals(remove_partner_user_JSON, jsonConverter.writeValueAsString(OperationType.remove_partner_user));
    }

    @Test
    void convertToString()
    {
        assertEquals(UNDEFINED_VALUE, OperationType.UNDEFINED.toString());
        assertEquals(UPDATE_CUSTOMER_QUALIFICATION_VALUE, OperationType.UPDATE_CUSTOMER_QUALIFICATION.toString());
        assertEquals(UPDATE_SUBSCRIPTION_VALUE, OperationType.UPDATE_SUBSCRIPTION.toString());
        assertEquals(UPGRADE_SUBSCRIPTION_VALUE, OperationType.UPGRADE_SUBSCRIPTION.toString());
        assertEquals(CONVERT_TRIAL_SUBSCRIPTION_VALUE, OperationType.CONVERT_TRIAL_SUBSCRIPTION.toString());
        assertEquals(ADD_CUSTOMER_VALUE, OperationType.ADD_CUSTOMER.toString());
        assertEquals(UPDATE_CUSTOMER_BILLING_PROFILE_VALUE, OperationType.UPDATE_CUSTOMER_BILLING_PROFILE.toString());
        assertEquals(UPDATECUSTOMERPARTNERCONTRACTCOMPANYNAME_VALUE, OperationType.UPDATECUSTOMERPARTNERCONTRACTCOMPANYNAME.toString());
        assertEquals(UPDATECUSTOMERSPENDINGBUDGET_VALUE, OperationType.UPDATECUSTOMERSPENDINGBUDGET.toString());
        assertEquals(DELETE_CUSTOMER_VALUE, OperationType.DELETE_CUSTOMER.toString());
        assertEquals(REMOVE_PARTNER_CUSTOMER_RELATIONSHIP_VALUE, OperationType.REMOVE_PARTNER_CUSTOMER_RELATIONSHIP.toString());
        assertEquals(CREATE_ORDER_VALUE, OperationType.CREATE_ORDER.toString());
        assertEquals(UPDATE_ORDER_VALUE, OperationType.UPDATE_ORDER.toString());
        assertEquals(CREATE_CUSTOMER_USER_VALUE, OperationType.CREATE_CUSTOMER_USER.toString());
        assertEquals(DELETE_CUSTOMER_USER_VALUE, OperationType.DELETE_CUSTOMER_USER.toString());
        assertEquals(UPDATE_CUSTOMER_USER_VALUE, OperationType.UPDATE_CUSTOMER_USER.toString());
        assertEquals(UPDATE_CUSTOMER_USER_LICENSES_VALUE, OperationType.UPDATE_CUSTOMER_USER_LICENSES.toString());
        assertEquals(RESET_CUSTOMER_USER_PASSWORD_VALUE, OperationType.RESET_CUSTOMER_USER_PASSWORD.toString());
        assertEquals(UPDATE_CUSTOMER_USER_PRINCIPAL_NAME_VALUE, OperationType.UPDATE_CUSTOMER_USER_PRINCIPAL_NAME.toString());
        assertEquals(RESTORE_CUSTOMER_USER_VALUE, OperationType.RESTORE_CUSTOMER_USER.toString());
        assertEquals(CREATE_MPN_ASSOCIATION_VALUE, OperationType.CREATE_MPN_ASSOCIATION.toString());
        assertEquals(UPDATE_MPN_ASSOCIATION_VALUE, OperationType.UPDATE_MPN_ASSOCIATION.toString());
        assertEquals(UPDATE_SFB_CUSTOMER_USER_LICENSES_VALUE, OperationType.UPDATE_SFB_CUSTOMER_USER_LICENSES.toString());
        assertEquals(UPDATE_TRANSFER_VALUE, OperationType.UPDATE_TRANSFER.toString());
        assertEquals(CREATE_PARTNER_RELATIONSHIP_VALUE, OperationType.CREATE_PARTNER_RELATIONSHIP.toString());
        assertEquals(REGISTER_APPLICATION_VALUE, OperationType.REGISTER_APPLICATION.toString());
        assertEquals(UNREGISTER_APPLICATION_VALUE, OperationType.UNREGISTER_APPLICATION.toString());
        assertEquals(ADD_APPLICATION_CREDENTIAL_VALUE, OperationType.ADD_APPLICATION_CREDENTIAL.toString());
        assertEquals(REMOVE_APPLICATION_CREDENTIAL_VALUE, OperationType.REMOVE_APPLICATION_CREDENTIAL.toString());
        assertEquals(CREATE_PARTNER_USER_VALUE, OperationType.CREATE_PARTNER_USER.toString());
        assertEquals(UPDATE_PARTNER_USER_VALUE, OperationType.UPDATE_PARTNER_USER.toString());
        assertEquals(remove_partner_user_VALUE, OperationType.remove_partner_user.toString());
    }
}