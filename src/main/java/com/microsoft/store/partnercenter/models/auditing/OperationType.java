// -----------------------------------------------------------------------
// <copyright file="OperationType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enumeration to represent type of operation being performed.
 */
public enum OperationType 
{
    /**
     * The undefined
     */
    UNDEFINED("undefined"),

    /**
     * Update Customer Qualification
     */
    UPDATE_CUSTOMER_QUALIFICATION("update_customer_qualification"),

    /**
     * Updates an existing subscription.
     */
    UPDATE_SUBSCRIPTION("update_subscription"),

    /**
     * Transition a subscription.
     */
    UPGRADE_SUBSCRIPTION("upgrade_subscription"),

    /**
     * Convert a trial subscription to a paid one.
     */
    CONVERT_TRIAL_SUBSCRIPTION("convert_trial_subscription"),

    /**
     * Adding a Customer
     */
    ADD_CUSTOMER("add_customer"),

    /**
     * Update a Customer Billing Profile
     */
    UPDATE_CUSTOMER_BILLING_PROFILE("update_customer_billing_profile"),

    /**
     * Update a Customer's Partner Contract Company Name
     */
    UPDATECUSTOMERPARTNERCONTRACTCOMPANYNAME("update_customer_partner_contract_company_Name"),

    /**
     * Updates a customer spending budget.
     */
    UPDATECUSTOMERSPENDINGBUDGET("update_Customer_spending_budget"),

    /**
     * Deleting a customer. This only happens in the sandbox integration accounts.
     */
    DELETE_CUSTOMER("delete_customer"),

    /**
     * Remove Partner Customer relationship.
     */
    REMOVE_PARTNER_CUSTOMER_RELATIONSHIP("remove_partner_customer_relationship"),

    /**
     * Create a new order.
     */
    CREATE_ORDER("create_order"),

    /**
     * Updates an existing order.
     */
    UPDATE_ORDER("update_order"),

    /**
     * Creates a customer user.
     */
    CREATE_CUSTOMER_USER("create_customer_user"),

    /**
     * Deletes a customer user.
     */
    DELETE_CUSTOMER_USER("delete_customer_user"),

    /**
     * Updates a customer user.
     */
    UPDATE_CUSTOMER_USER("update_customer_user"),

    /**
     * Updates a customer user licenses.
     */
    UPDATE_CUSTOMER_USER_LICENSES("update_customer_user_licenses"),

    /**
     * Reset customer user password.
     */
    RESET_CUSTOMER_USER_PASSWORD("reset_customer_user_password"),

    /**
     * Update customer user UPN.
     */
    UPDATE_CUSTOMER_USER_PRINCIPAL_NAME("update_customer_user_principal_name"),

    /**
     * Restore customer user.
     */
    RESTORE_CUSTOMER_USER("restore_customer_user"),

    /**
     * Create MPN association.
     */
    CREATE_MPN_ASSOCIATION("create_mpn_association"),

    /**
     * Update MPN association.
     */
    UPDATE_MPN_ASSOCIATION("update_mpn_association"),

    /**
     * Updates a Sfb customer user licenses.
     */
    UPDATE_SFB_CUSTOMER_USER_LICENSES("update_sfb_customer_user_licenses"),

    /**
     * Update transfer.
     */
    UPDATE_TRANSFER("update_transfer"),

    /**
     * Creates a partner relationship.
     */
    CREATE_PARTNER_RELATIONSHIP("create_partner_relationship"),

    /**
     * Add and registers an application.
     */
    REGISTER_APPLICATION("register_application"),

    /**
     * Unregisters an application.
     */
    UNREGISTER_APPLICATION("unregister_application"),

    /**
     * An application credential was added.
     */
    ADD_APPLICATION_CREDENTIAL("add_application_credential"),

    /**
     * An application credential was removed.
     */
    REMOVE_APPLICATION_CREDENTIAL("remove_application_credential"),

    /**
     * Creates a partner user.
     */
    CREATE_PARTNER_USER("create_partner_user"),

    /**
     * Updates a partner user.
     */
    UPDATE_PARTNER_USER("update_partner_user"),

    /**
     * Removes a partner user.
     */
    REMOVE_PARTNER_USER("remove_partner_user"),

    /**
     * A referral was created.
     */
    CREATE_REFERRAL("create_referral"), 

    /**
     * A referral was updated.
     */
    UPDATE_REFERRAL("update_referral"), 
    
    /** 
     * A software key was obtained.
     */
    GET_SOFTWARE_KEY("get_software_key"),
    
    /**
     * A link to the software download was obtained.
     */
    GET_SOFTWARE_DOWNLOAD_LINK("get_software_download_link"),
    
    /**
     * The credit limit for the partner was increased.
     */
    INCREASE_CREDIT_LIMIT("increase_credit_limit"),
	
	/**
     * An invoice is ready.
     */
    READY_INVOICE("ready_invoice");

    private final String value;

    OperationType(String value)
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