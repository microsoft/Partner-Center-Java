// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.orders;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.orders.OrderLineItemProvisioningStatus;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements operations that apply to order provisioning status.
 */
public class OrderProvisioningStatusOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements IOrderProvisioningStatus
{
    /**
     * Initializes a new instance of the OrderProvisioningStatusOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param orderId The order identifier.
     */
    public OrderProvisioningStatusOperations(IPartner rootPartnerOperations, String customerId, String orderId)
    {
        super(rootPartnerOperations, new Tuple<String, String>(customerId, orderId));

        if (StringHelper.isNullOrWhiteSpace(customerId))
        {
            throw new IllegalArgumentException( "customerId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace( orderId ) )
        {
            throw new IllegalArgumentException( "orderId must be set");
        }
    }

    /**
     * Gets the order provisioning status.
     * 
     * @return The provisioning status for the order.
     */
    @Override
    public ResourceCollection<OrderLineItemProvisioningStatus> get()
    {
        return this.getPartner().getServiceClient().get(
            this.getPartner(),
            new TypeReference<ResourceCollection<OrderLineItemProvisioningStatus>>(){}, 
            MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get("GetOrderProvisioningStatus").getPath(),
                this.getContext().getItem1(), 
                this.getContext().getItem2()));
	}
}