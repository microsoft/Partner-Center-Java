// -----------------------------------------------------------------------
// <copyright file="SkuOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.products;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.products.Sku;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Implements a single sku operations.
 */
public class SkuOperations 
    extends BasePartnerComponent<TripletTuple<String, String, String>> 
    implements ISku 
{
    /***
     * The availability operations.
     */  
    private IAvailabilityCollection availabilities;
   
    /***
     * The SKU download options operations.
     */  
    private ISkuDownloadOptions downloadOptions; 

    /**
     * Initializes a new instance of the {@link #SkuOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param productId             Identifier of the product. 
     * @param skuId                 Identifier of the SKU.
     * @param availabilityId        Identifier of the availability.
     * @param country               The country on which to base the availability.
     */
    public SkuOperations(IPartner rootPartnerOperations, String productId, String skuId, String country)
    {
        super(rootPartnerOperations, new TripletTuple<String, String, String>(productId, skuId, country));

        if (StringHelper.isNullOrWhiteSpace(productId)) {
            throw new IllegalArgumentException("productId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(skuId)) {
            throw new IllegalArgumentException("skuId must be set");
        }
        
        ParameterValidator.isValidCountryCode(country);
    }

    /***
     * Retrieves the operations for the current SKU's availabilities.
     * 
     * @return: The operations for the current SKU's availabilities.
     */    
    public IAvailabilityCollection getAvailabilities()
    {
        if(availabilities == null)
        {
            availabilities = new AvailabilityCollectionOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), this.getContext().getItem3());
        }

        return availabilities;
    }

    /***
     * Retrieves the operations for the current SKU's download options.
     * 
     * @return: The operations for the current SKU's download options.
     */    
    public ISkuDownloadOptions getDownloadOptions()
    {
        if(downloadOptions == null)
        {
            downloadOptions = new SkuDownloadOptionsOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), this.getContext().getItem3());
        }

        return downloadOptions;
    }

    /***
     * Retrieves the SKU information.
     * 
     * @return: The SKUs information.
     */
    public Sku get()
    {
        IPartnerServiceProxy<Sku, Sku> partnerServiceProxy = new PartnerServiceProxy<Sku, Sku>(
            new TypeReference<Sku>() {
            }, this.getPartner(),
            MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("GetSku").getPath(),
                    this.getContext().getItem1(), this.getContext().getItem2() ));

        partnerServiceProxy.getUriParameters().add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get( "GetSku" ).getParameters().get( "Country" ),
                this.getContext().getItem3()));          

        return partnerServiceProxy.get();
    }
}