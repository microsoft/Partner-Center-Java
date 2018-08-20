// -----------------------------------------------------------------------
// <copyright file="CustomerAvailabilityCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.products;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.products.IAvailability;
import com.microsoft.store.partnercenter.products.IAvailabilityCollection;
import com.microsoft.store.partnercenter.products.IAvailabilityCollectionByTargetSegment;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Availability;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Holds operations that can be performed on products that apply to a given customer.
 */
public class CustomerAvailabilityCollectionOperations
    extends BasePartnerComponent<TripletTuple<String, String, String>>
    implements IAvailabilityCollection
{
    /**
     * Initializes a new instance of the {@link #CustomerAvailabilityCollectionOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId Identifier for the customer.
     * @param productId Identifier for the product. 
     * @param skuId Identifier for the SKU.
     */
    public CustomerAvailabilityCollectionOperations( IPartner rootPartnerOperations, String customerId, String productId, String skuId )
    {
        super( rootPartnerOperations, new TripletTuple<String, String, String>( customerId, productId, skuId ) );

        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( productId ) )
        {
            throw new IllegalArgumentException( "productId must be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( skuId ) )
        {
            throw new IllegalArgumentException( "skuId must be set" );
        }
    }

    /***
     * Retrieves the operations tied with a specific availability.
     * 
     * @param availabilityId Identifier for the availability.
     * @return: The availability operations.
     */    
    @Override
    public IAvailability byId( String availabilityId )
    {
        return new CustomerAvailabilityOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), this.getContext().getItem3(), availabilityId);
    }

    /**
     * Retrieves all the availabilities for the provided SKU.
     * 
     * @return: The availabilities for the provided SKU.
     */
    @Override
    public ResourceCollection<Availability> get()
    {
        IPartnerServiceProxy<Availability, ResourceCollection<Availability>> partnerServiceProxy =
        new PartnerServiceProxy<Availability, ResourceCollection<Availability>>( new TypeReference<ResourceCollection<Availability>>()
        {
        }, 
        this.getPartner(), 
        MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerAvailabilities" ).getPath(),
            this.getContext().getItem1(), this.getContext().getItem2(), this.getContext().getItem3() ) );

        return partnerServiceProxy.get();
    }

    /***
     * Retrieves the operations that can be applied on availabilities filtered by a specific target segment.
     * 
     * @param targetSegment The availability segment filter.
     * @return: The availability collection operations by target segment.
     */    
    @Override
    public IAvailabilityCollectionByTargetSegment byTargetSegment(String targetSegment)
    {
        return new CustomerAvailabilityCollectionByTargetSegmentOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), this.getContext().getItem3(), targetSegment);
    }
}