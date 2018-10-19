// -----------------------------------------------------------------------
// <copyright file="OperationType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.annotation.JsonProperty;

// @JsonProperty("update_customer_qualification")

/**
 * Enumeration to represent type of operation being performed.
 */
public enum OperationType 
{
    /**
     * The undefined
     */
    @JsonProperty("undefined")
    UNDEFINED,

    /**
     * Update Customer Qualification
     */
    @JsonProperty("update_customer_qualification")
    UPDATE_CUSTOMER_QUALIFICATION,
    
    /**
     * Updates an existing subscription.
     */
    @JsonProperty("update_subscription")
    UPDATE_SUBSCRIPTION,

    /**
     * Transition a subscription.
     */
    @JsonProperty("upgrade_subscription")
    UPGRADE_SUBSCRIPTION,
   
    /**
     * Convert a trial subscription to a paid one.
     */
    @JsonProperty("convert_trial_subscription")
    CONVERT_TRIAL_SUBSCRIPTION,

    /**
     * Adding a Customer
     */
    @JsonProperty("add_customer")
    ADD_CUSTOMER,
 
    /**
     * Update a Customer Billing Profile
     */
    @JsonProperty("update_customer_billing_profile")
    UPDATE_CUSTOMER_BILLING_PROFILE,

    /**
     * Update a Customer's Partner Contract Company Name
     */
    @JsonProperty("update_customer_partner_contract_company_Name")
    UPDATECUSTOMERPARTNERCONTRACTCOMPANYNAME,

    /**
     * Updates a customer spending budget.
     */
    @JsonProperty("update_Customer_spending_budget")
    UPDATECUSTOMERSPENDINGBUDGET, 

    /**
     * Deleting a customer. This only happens in the sandbox integration accounts.
     */
    @JsonProperty("delete_customer")
    DELETE_CUSTOMER,
    
    /**
     * Remove Partner Customer relationship.
     */
    @JsonProperty("remove_partner_customer_relationship")
    REMOVE_PARTNER_CUSTOMER_RELATIONSHIP,

    /**
     * Create a new order.
     */
    @JsonProperty("create_order")
    CREATE_ORDER,
    
    /**
     * Updates an existing order.
     */
    @JsonProperty("update_order")
    UPDATE_ORDER,
    
    /**
     * Creates a customer user.
     */
    @JsonProperty("create_customer_user")
    CREATE_CUSTOMER_USER,
    
    /**
     * Deletes a customer user.
     */
    @JsonProperty("delete_customer_user")
    DELETE_CUSTOMER_USER,
    
    /**
     * Updates a customer user.
     */
    @JsonProperty("update_customer_user")
    UPDATE_CUSTOMER_USER,
    
    /**
     * Updates a customer user licenses.
     */
    @JsonProperty("Update_customer_user_licenses")
    UPDATE_CUSTOMER_USER_LICENSES,
    
    /**
     * Reset customer user password.
     */
    @JsonProperty("reset_customer_user_password")
    RESET_CUSTOMER_USER_PASSWORD,
    
    /**
     * Update customer user UPN.
     */
    @JsonProperty("update_customer_user_principal_name")
    UPDATE_CUSTOMER_USER_PRINCIPAL_NAME,
    
    /**
     * Restore customer user.
     */
    @JsonProperty("restore_customer_user")
    RESTORE_CUSTOMER_USER,
    
    /**
     * Create MPN association.
     */
    @JsonProperty("create_mpn_association")
    CREATE_MPN_ASSOCIATION,
    
    /**
     * Update MPN association.
     */
    @JsonProperty("update_mpn_association")
    UPDATE_MPN_ASSOCIATION,
    
    /**
     * Updates a Sfb customer user licenses.
     */
    @JsonProperty("update_sfb_customer_user_licenses")
    UPDATE_SFB_CUSTOMER_USER_LICENSES,
    
    /**
     * Update transfer.
     */
    @JsonProperty("update_transfer")
    UPDATE_TRANSFER,
    
    /**
     * Creates a partner relationship.
     */
    @JsonProperty("create_partner_relationship")
    CREATE_PARTNER_RELATIONSHIP,
    
    /**
     * Add and registers an application.
     */
    @JsonProperty("register_application")
    REGISTER_APPLICATION,
    
    /**
     * Unregisters an application.
     */
    @JsonProperty("unregister_application")
    UNREGISTER_APPLICATION,
    
    /**
     * An application credential was added.
     */
    @JsonProperty("add_application_credential")
    ADD_APPLICATION_CREDENTIAL,
    
    /**
     * An application credential was removed.
     */
    @JsonProperty("remove_application_credential")
    REMOVE_APPLICATION_CREDENTIAL,
    
    /**
     * Creates a partner user.
     */
    @JsonProperty("create_partner_user")
    CREATE_PARTNER_USER,    
    
    /**
     * Updates a partner user.
     */
    @JsonProperty("update_partner_user")
    UPDATE_PARTNER_USER,
    
    /**
     * Removes a partner user.
     */
    @JsonProperty("Remove_partner_user")
    remove_partner_user,
}