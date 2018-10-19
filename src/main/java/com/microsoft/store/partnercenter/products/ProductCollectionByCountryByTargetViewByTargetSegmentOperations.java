// -----------------------------------------------------------------------
// <copyright file="ProductCollectionByCountryByTargetViewByTargetSegmentOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.products;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Product;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Product operations by country, by target view and by target segment implementation class.
 */
public class ProductCollectionByCountryByTargetViewByTargetSegmentOperations
    extends BasePartnerComponent<TripletTuple<String, String, String>>
    implements IProductCollectionByCountryByTargetViewByTargetSegment
{
    /**
     * Initializes a new instance of the ProductCollectionByCountryByTargetViewByTargetSegmentOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param targetView            The target view which contains the products.
     * @param country               The country on which to base the product.
     * @param targetSegment         The target segment used for filtering the products.
     */
    public ProductCollectionByCountryByTargetViewByTargetSegmentOperations( IPartner rootPartnerOperations, String targetView, String country, String targetSegment )
    {
        super( rootPartnerOperations, new TripletTuple<String, String, String>(targetView, country, targetSegment) );

        if ( StringHelper.isNullOrWhiteSpace( targetView ) )
        {
            throw new IllegalArgumentException( "targetView must be set" );
        }

        ParameterValidator.isValidCountryCode(country);

        if ( StringHelper.isNullOrWhiteSpace( targetSegment ) )
        {
            throw new IllegalArgumentException( "targetSegment must be set" );
        }
    }

    /**
     * Retrieves all the products in the given country, catalog view and target segment.
     * 
     * @return The products in the given country, catalog view and target segment.
     */
    public ResourceCollection<Product> get()
    {
        IPartnerServiceProxy<Product, ResourceCollection<Product>> partnerServiceProxy =
            new PartnerServiceProxy<>(
                new TypeReference<ResourceCollection<Product>>()
                {
                }, 
                this.getPartner(), 
                PartnerService.getInstance().getConfiguration().getApis().get( "GetProducts" ).getPath() );

        partnerServiceProxy.getUriParameters().add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get( "GetProducts" ).getParameters().get( "TargetView" ),
                this.getContext().getItem1())); 

        partnerServiceProxy.getUriParameters().add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get( "GetProducts" ).getParameters().get( "Country" ),
                this.getContext().getItem2()));   

        partnerServiceProxy.getUriParameters().add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get( "GetProducts" ).getParameters().get( "TargetSegment" ),
                this.getContext().getItem3()));   

        return partnerServiceProxy.get();
    }
}