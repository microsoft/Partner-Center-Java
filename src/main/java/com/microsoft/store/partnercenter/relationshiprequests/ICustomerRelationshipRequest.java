// -----------------------------------------------------------------------
// <copyright file="ICustomerRelationshipRequest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.relationshiprequests;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.relationshiprequests.CustomerRelationshipRequest;

/**
 * Holds operations that apply to customer relationship requests.
 */
public interface ICustomerRelationshipRequest
    extends IPartnerComponentString, IEntityGetOperations<CustomerRelationshipRequest>
{
    /**
     * Retrieves the customer relationship request which can be used by a customer to establish a relationship with the
     * current partner.
     * 
     * @return A customer relationship request.
     */
    CustomerRelationshipRequest get();
}