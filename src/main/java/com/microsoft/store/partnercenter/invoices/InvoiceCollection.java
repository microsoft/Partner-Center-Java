// -----------------------------------------------------------------------
// <copyright file="InvoiceCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.exception.PartnerErrorCategory;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.invoices.Invoice;
import com.microsoft.store.partnercenter.models.query.IQuery;
import com.microsoft.store.partnercenter.models.query.QueryType;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Represents the operations that can be done on Partner's invoices
 */
public class InvoiceCollection
    extends BasePartnerComponentString
    implements IInvoiceCollection
{
    /**
     * The maximum allowed page size
     */
    private static final int MaxPageSize = 200;

    /**
     * The minimum allowed page size
     */
    private static final int MinPageSize = 1;

    /**
     * Initializes a new instance of the InvoiceCollection class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public InvoiceCollection( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Gets a single invoice operations.
     * 
     * @param invoiceId The invoice id.
     * @return The invoice operations.
     */
    @Override
    public IInvoice byId( String invoiceId )
    {
        if ( StringHelper.isNullOrWhiteSpace( invoiceId ) )
        {
            throw new IllegalArgumentException( "invoiceId has to be set." );
        }
        return new InvoiceOperations( this.getPartner(), invoiceId );
    }

    /**
     * Retrieves the partner's current account balance.
     * 
     * @return The account balance.
     */
    public IInvoiceSummary getSummary()
    {
        return new InvoiceSummaryOperations( this.getPartner() );
    }

    /**
     * Retrieves the invoice summary collection operations.
     * 
     * @return The invoice summary collection operations.
     */
    public IInvoiceSummaryCollection getSummaries()
    { 
        return new InvoiceSummaryCollectionOperations( this.getPartner() );
    }

    /**
     * Retrieves all invoices associated to the partner.
     * 
     * @return The collection of invoices.
     */
    @Override
    public SeekBasedResourceCollection<Invoice> get()
    {
        IPartnerServiceProxy<Invoice, SeekBasedResourceCollection<Invoice>> partnerServiceProxy =
            new PartnerServiceProxy<Invoice, SeekBasedResourceCollection<Invoice>>( new TypeReference<SeekBasedResourceCollection<Invoice>>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoices" ).getPath(),
                                                        Locale.US ) );

        return partnerServiceProxy.get();
    }

    /**
     * Retrieves all invoices associated to the partner.
     * 
     * @param offset The page offset.
     * @param size The maximum number of invoices to return.
     * @return The subset of invoices.
     */
    @Override
    public SeekBasedResourceCollection<Invoice> get( int offset, int size )
    {
        ParameterValidator.isIntInclusive( 0, Integer.MAX_VALUE, offset,
                                           "The value of the page offset should be at least 0." );
        ParameterValidator.isIntInclusive( MinPageSize, MaxPageSize, size,
                                           MessageFormat.format( "The page size must be an integer within the allowed range: {0}-{1}.",
                                                                 MinPageSize, MaxPageSize ) );
        IPartnerServiceProxy<Invoice, SeekBasedResourceCollection<Invoice>> partnerServiceProxy =
            new PartnerServiceProxy<Invoice, SeekBasedResourceCollection<Invoice>>( new TypeReference<SeekBasedResourceCollection<Invoice>>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoices" ).getPath(),
                                                        Locale.US ) );

        partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoices" ).getParameters().get( "Offset" ),
                                                                                      String.valueOf( offset ) ) );
        partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoices" ).getParameters().get( "Size" ),
                                                                                      String.valueOf( size ) ) );

        return partnerServiceProxy.get();
    }
    
    /***
     * Asynchronously retrieves all invoices associated to the partner.
     * @param query The query parameter
     * @return The subset of invoices.
     */
    public ResourceCollection<Invoice> query( IQuery query )
    {
        if ( query == null )
        {
            throw new IllegalArgumentException( "query can't be null" );
        }

        if ( query.getType() != QueryType.INDEXED && query.getType() != QueryType.SIMPLE )
        {
            throw new IllegalArgumentException( "This type of query is not supported." );
        }

        IPartnerServiceProxy<Invoice, SeekBasedResourceCollection<Invoice>> partnerServiceProxy =
                new PartnerServiceProxy<Invoice, SeekBasedResourceCollection<Invoice>>( new TypeReference<SeekBasedResourceCollection<Invoice>>()
                {
                }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoices" ).getPath(),
                                                            Locale.US ) );

        if ( query.getType() == QueryType.INDEXED )
        {
            partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoices" ).getParameters().get( "Size" ),
                    String.valueOf( query.getPageSize() ) ) );
            partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoices" ).getParameters().get( "Offset" ),
            		String.valueOf( query.getIndex() ) ) );            
        }

        if ( query.getFilter() != null )
        {
            ObjectMapper mapper = new ObjectMapper();
            try
            {
                partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoices" ).getParameters().get( "Filter" ),
                        URLEncoder.encode( mapper.writeValueAsString( query.getFilter() ),
                                           "UTF-8" ) ) );            	
            }
            catch ( UnsupportedEncodingException e )
            {
                throw new PartnerException( "", null, PartnerErrorCategory.REQUEST_PARSING, e );
            }
            catch ( JsonProcessingException e )
            {
                throw new PartnerException( "", null, PartnerErrorCategory.REQUEST_PARSING, e );
            }
        }
        
        return partnerServiceProxy.get();
    }

}
