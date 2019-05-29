// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.enumerators;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.factory.IResourceCollectionEnumeratorFactory;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.auditing.AuditRecord;
import com.microsoft.store.partnercenter.models.customers.Customer;
import com.microsoft.store.partnercenter.models.invoices.Invoice;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItem;
import com.microsoft.store.partnercenter.models.offers.Offer;
import com.microsoft.store.partnercenter.models.products.Product;
import com.microsoft.store.partnercenter.models.servicerequests.ServiceRequest;
import com.microsoft.store.partnercenter.models.users.CustomerUser;

/**
 * Contains supported resource collection enumerators.
 */
public interface IResourceCollectionEnumeratorContainer 
	extends IPartnerComponentString
{
    /**
     * Gets a factory that creates offer collection enumerators.
     * 
     * @return A factory that creates offer collection enumerators.
     */
    IResourceCollectionEnumeratorFactory<ResourceCollection<Offer>> getOffers();

    /**
     * Gets a factory that creates customer collection enumerators.
     * 
     * @return A factory that creates customer collection enumerators.
     */
    IResourceCollectionEnumeratorFactory<SeekBasedResourceCollection<Customer>> getCustomers();

    /**
     * Gets a factory that creates customer collection enumerators.
     * 
     * @return A factory that creates customer collection enumerators.
     */
    IResourceCollectionEnumeratorFactory<SeekBasedResourceCollection<CustomerUser>> getCustomerUsers();

    /**
     * Gets a factory that creates invoice collection enumerators.
     * 
     * @return A factory that creates invoice collection enumerators.
     */
    IResourceCollectionEnumeratorFactory<ResourceCollection<Invoice>> getInvoices();

    /**
     * Gets a factory that creates service request collection enumerators.
     * 
     * @return A factory that creates service request collection enumerators.
     */
    IResourceCollectionEnumeratorFactory<ResourceCollection<ServiceRequest>> getServiceRequests();

    /**
     * Gets a factory that creates invoice line item collection enumerators.
     * 
     * @return A factory that creates invoice line item collection enumerators.
     */
    IResourceCollectionEnumeratorFactory<ResourceCollection<InvoiceLineItem>> getInvoiceLineItems();

    /**
     * Gets a factory that creates audit record collection enumerators.
     * 
     * @return A factory that creates audit record collection enumerators.
     */
    IResourceCollectionEnumeratorFactory<SeekBasedResourceCollection<AuditRecord>> getAuditRecords();

    /**
     * Gets a factory that create enumerators for utilization records for different subscriptions.
     * 
     * @return A factory that create enumerators for utilization records for different subscriptions.
     */
    IUtilizationCollectionEnumeratorContainer getUtilization();

    /**
     * Gets a factory that creates product collection enumerators.
     * 
     * @return A factory that creates product collection enumerators.
     */
     IResourceCollectionEnumeratorFactory<ResourceCollection<Product>> getProducts();
}