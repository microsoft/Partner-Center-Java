// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.servicerequests;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.servicerequests.ServiceRequest;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements operations that can be performed on a single partner's service requests.
 */
public class PartnerServiceRequestOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements IServiceRequest
{
    /**
     * Initializes a new instance of the PartnerServiceRequestOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param serviceRequestId The service request Id.
     */
    public PartnerServiceRequestOperations( IPartner rootPartnerOperations, String serviceRequestId )
    {
        super( rootPartnerOperations, new Tuple<String, String>( serviceRequestId, "" ) );

        if ( StringHelper.isNullOrWhiteSpace( serviceRequestId ) )
        {
            throw new IllegalArgumentException( "serviceRequestId can't be null" );
        }
    }

    /**
     * Get Service Request By ID
     * 
     * @return Service Request
     */
    @Override
    public ServiceRequest get()
    {
        return this.getPartner().getServiceClient().get(
            this.getPartner(),
            new TypeReference<ServiceRequest>(){}, 
            MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get("GetServiceRequestPartner").getPath(),
                this.getContext().getItem1()));
    }

    /**
     * Patches a Service Request
     * 
     * @param updatePayload Payload of the update request
     * @return Updated Service Request
     */
    @Override
    public ServiceRequest patch( ServiceRequest updatePayload )
    {
        return this.getPartner().getServiceClient().patch(
            this.getPartner(),
            new TypeReference<ServiceRequest>(){}, 
            MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get("GetServiceRequestPartner").getPath(),
                this.getContext().getItem1()),
            updatePayload);
    }
}
