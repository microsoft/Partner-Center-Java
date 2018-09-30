// -----------------------------------------------------------------------
// <copyright file="OperationType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Enumeration to represent type of operation being performed
 */
public enum OperationType {
	/***
	 * Update Customer Qualification
	 */
    @JsonProperty("update_customer_qualification")
    UPDATE_CUSTOMER_QUALIFICATION,

    /***
     * Updates an existing subscription.
     */
    @JsonProperty("update_subscription")
    UPDATE_SUBSCRIPTION,

    /***
     * Transition a subscription.
     */
    @JsonProperty("upgrade_subscription")
    UPGRADE_SUBSCRIPTION,

    /***
     * Adding a Customer
     */
    @JsonProperty("add_customer")
    ADD_CUSTOMER,

    /***
     * Update a Customer Billing Profile
     */
    @JsonProperty("update_customer_billing_profile")
    UPDATE_CUSTOMER_BILLING_PROFILE,

    /***
     * Updates a customer spending budget.
     */
    @JsonProperty("update_customer_spending_budget")
    UPDATE_CUSTOMER_SPENDING_BUDGET,

    /***
     *  Deleting a Customer. Only happens in the sandbox integration accounts.
     */
    @JsonProperty("delete_customer")
    DELETE_CUSTOMER,

    /***
     *  Create a new order.
     */
    @JsonProperty("create_order")
    CREATE_ORDER,

    /***
     * Updates an existing order.
     */
    @JsonProperty("update_order")
    UPDATE_ORDER,

    /***
     * Creates a customer user.
     */
    @JsonProperty("create_customer_user")
    CREATE_CUSTOMER_USER,

    /***
     * Deletes a customer user.
     */
    @JsonProperty("delete_customer_user")
    DELETE_CUSTOMER_USER,

    /***
     * Updates a customer user.
     */
    @JsonProperty("update_customer_user")
    UPDATE_CUSTOMER_USER,

    /***
     * Updates a customer user licenses.
     */
    @JsonProperty("update_customer_user_licenses")
    UPDATE_CUSTOMER_USER_LICENSES,

    /***
     * Reset customer user password.
     */
    @JsonProperty("reset_customer_user_password")
    RESET_CUSTOMER_USER_PASSWORD,

    /***
     * Update customer user UPN.
     */
    @JsonProperty("update_customer_user_principal_name")
    UpdateCustomerUserPrincipalName,

    /***
     * Restore customer user.
     */
    @JsonProperty("restore_customer_user")
    RESTORE_CUSTOMER_USER,

    /***
     *  Create MPN association.
     */
    @JsonProperty("create_mpn_association")
    CREATE_MPN_ASSOCIATION,

    /***
     *  Update MPN association.
     */
    @JsonProperty("update_mpn_association")
    UPDATE_MPN_ASSOCIATION,
}