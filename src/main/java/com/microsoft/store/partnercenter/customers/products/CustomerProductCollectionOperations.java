// -----------------------------------------------------------------------
// <copyright file="CustomerProductCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.products;


import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.products.IProduct;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Product operations by customer id implementation class.
 */
public class CustomerProductCollectionOperations
    extends BasePartnerComponentString
    implements ICustomerProductCollection
{
    /**
     * Initializes a new instance of the CustomerProductCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId Identifier for the customer.
     */
    public CustomerProductCollectionOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );

        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }
    }

    /**
     * Retrieves the operations tied with a specific product for a given customer.
     * 
     * @param productId Identifier for the product.
     * @return The operations that can be performed on a single product.
     */
    @Override
     public IProduct byId( String productId )
    {
        return new CustomerProductOperations(this.getPartner(), this.getContext(), productId);        
    }

    /***
     * Retrieves the operations that can be applied on products in a given catalog view and that apply to a given customer.
     * 
     * @return The catalog view operations by target view
     */
    @Override
    public ICustomerProductCollectionByTargetView byTargetView(String targetView)
    {
        return new CustomerProductCollectionByTargetViewOperations(this.getPartner(), this.getContext(), targetView);
    }
}