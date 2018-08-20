// -----------------------------------------------------------------------
// <copyright file="OperationType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Enumeration to represent type of
 * Operation being performed
 */
public enum OperationType {
	/***
	 * Update Customer Qualification
	 */
    @JsonProperty("update_customer_qualification")
    UpdateCustomerQualification,

    /***
     * Updates an existing subscription.
     */
    @JsonProperty("update_subscription")
    UpdateSubscription,

    /***
     * Transition a subscription.
     */
    @JsonProperty("upgrade_subscription")
    UpgradeSubscription,

    /***
     * Adding a Customer
     */
    @JsonProperty("add_customer")
    AddCustomer,

    /***
     * Update a Customer Billing Profile
     */
    @JsonProperty("update_customer_billing_profile")
    UpdateCustomerBillingProfile,

    /***
     * Updates a customer spending budget.
     */
    @JsonProperty("update_customer_spending_budget")
    UpdateCustomerSpendingBudget,

    /***
     *  Deleting a Customer.
     *  Happens only in the sandbox integration accounts.
     */
    @JsonProperty("delete_customer")
    DeleteCustomer,

    /***
     *  Create a new order.
     */
    @JsonProperty("create_order")
    CreateOrder,

    /***
     * Updates an existing order.
     */
    @JsonProperty("update_order")
    UpdateOrder,

    /***
     * Creates a customer user.
     */
    @JsonProperty("create_customer_user")
    CreateCustomerUser,

    /***
     * Deletes a customer user.
     */
    @JsonProperty("delete_customer_user")
    DeleteCustomerUser,

    /***
     * Updates a customer user.
     */
    @JsonProperty("update_customer_user")
    UpdateCustomerUser,

    /***
     * Updates a customer user licenses.
     */
    @JsonProperty("update_customer_user_licenses")
    UpdateCustomerUserLicenses,

    /***
     * Reset customer user password.
     */
    @JsonProperty("reset_customer_user_password")
    ResetCustomerUserPassword,

    /***
     * Update customer user UPN.
     */
    @JsonProperty("update_customer_user_principal_name")
    UpdateCustomerUserPrincipalName,

    /***
     * Restore customer user.
     */
    @JsonProperty("restore_customer_user")
    RestoreCustomerUser,

    /***
     *  Create MPN association.
     */
    @JsonProperty("create_mpn_association")
    CreateMpnAssociation,

    /***
     *  Update MPN association.
     */
    @JsonProperty("update_mpn_association")
    UpdateMpnAssociation
}