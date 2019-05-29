// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter;

import com.microsoft.store.partnercenter.agreements.AgreementDetailsCollectionOperations;
import com.microsoft.store.partnercenter.agreements.IAgreementDetailsCollection;
import com.microsoft.store.partnercenter.analytics.IPartnerAnalyticsCollection;
import com.microsoft.store.partnercenter.analytics.PartnerAnalyticsCollectionOperations;
import com.microsoft.store.partnercenter.auditrecords.AuditRecordsCollection;
import com.microsoft.store.partnercenter.auditrecords.IAuditRecordsCollection;
import com.microsoft.store.partnercenter.countryvalidationrules.CountryValidationRulesCollectionOperations;
import com.microsoft.store.partnercenter.countryvalidationrules.ICountryValidationRulesCollection;
import com.microsoft.store.partnercenter.customers.CustomerCollectionOperations;
import com.microsoft.store.partnercenter.customers.ICustomerCollection;
import com.microsoft.store.partnercenter.domains.DomainCollectionOperations;
import com.microsoft.store.partnercenter.domains.IDomainCollection;
import com.microsoft.store.partnercenter.enumerators.IResourceCollectionEnumeratorContainer;
import com.microsoft.store.partnercenter.enumerators.ResourceCollectionEnumeratorContainer;
import com.microsoft.store.partnercenter.extensions.ExtensionsOperations;
import com.microsoft.store.partnercenter.extensions.IExtensions;
import com.microsoft.store.partnercenter.genericoperations.ICountrySelector;
import com.microsoft.store.partnercenter.invoices.IInvoiceCollection;
import com.microsoft.store.partnercenter.invoices.InvoiceCollection;
import com.microsoft.store.partnercenter.network.IPartnerServiceClient;
import com.microsoft.store.partnercenter.network.PartnerServiceClient;
import com.microsoft.store.partnercenter.offers.IOfferCategoryCollection;
import com.microsoft.store.partnercenter.offers.IOfferCollection;
import com.microsoft.store.partnercenter.offers.OfferCategoryCountrySelector;
import com.microsoft.store.partnercenter.offers.OfferCountrySelector;
import com.microsoft.store.partnercenter.products.IProductCollection;
import com.microsoft.store.partnercenter.products.ProductCollectionOperations;
import com.microsoft.store.partnercenter.profiles.IPartnerProfileCollection;
import com.microsoft.store.partnercenter.profiles.PartnerProfileCollectionOperations;
import com.microsoft.store.partnercenter.ratecards.IRateCardCollection;
import com.microsoft.store.partnercenter.ratecards.RateCardCollectionOperations;
import com.microsoft.store.partnercenter.relationships.IRelationshipCollection;
import com.microsoft.store.partnercenter.relationships.RelationshipCollectionOperations;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;
import com.microsoft.store.partnercenter.serviceincidents.IServiceIncidentCollection;
import com.microsoft.store.partnercenter.serviceincidents.ServiceIncidentCollectionOperations;
import com.microsoft.store.partnercenter.servicerequests.IPartnerServiceRequestCollection;
import com.microsoft.store.partnercenter.servicerequests.PartnerServiceRequestCollectionOperations;
import com.microsoft.store.partnercenter.usage.IPartnerUsageSummary;
import com.microsoft.store.partnercenter.usage.PartnerUsageSummaryOperations;
import com.microsoft.store.partnercenter.validations.IValidationOperations;
import com.microsoft.store.partnercenter.validations.ValidationOperations;

/**
 * The partner implementation class.
 */
public class PartnerOperations
	implements IPartner
{
	// /**
	// * The resource collection enumerator container.
	// */
	private IResourceCollectionEnumeratorContainer enumeratorContainer;

	/**
	 * The partner customers operations.
	 */
	private ICustomerCollection customers;

	/**
	 * The offer categories.
	 */
	private ICountrySelector<IOfferCategoryCollection> offerCategories;

	/**
	 * The offers operation.
	 */
	private ICountrySelector<IOfferCollection> offers;

	/**
	 * The profile operations.
	 */
	private IPartnerProfileCollection profiles;

	/**
	 * The partner invoices.
	 */
	private IInvoiceCollection invoices;

	/**
	 * The service request operations.
	 */
	private IPartnerServiceRequestCollection serviceRequests;
	
	/**
	 * The service incidents operations.
	 */
	private IServiceIncidentCollection serviceIncidents;

	/**
	 * The validations operations.
	 */
	private ICountryValidationRulesCollection countryValidationRules;

	/**
	 * Gets the usage summary operations available to the partner.
	 */
	private IPartnerUsageSummary usageSummary;

	/**
	 * The domain operations.
	 */
	private IDomainCollection domains;

	/**
	 * Gets the audit records collection operations.
	 */
	private IAuditRecordsCollection auditRecords;
	
	/**
	 * The rate cards collection operations.
	 */
	private IRateCardCollection rateCards;

	/**
	 * The analytics collection operations.
	 */
	private IPartnerAnalyticsCollection analytics;

	/**
	 * The extensions operations available to the partner.
	 */
	private IExtensions extensions; 

	/**
	 * The products operations available to the partner.
	 */
	private IProductCollection products; 

	/**
	 * The relationship collection operations.
	 */
	private IRelationshipCollection relationships;

	/**
	 * The validation operations available to the partner.
	 */
	private IValidationOperations validations;

	/**
	 * The agreement metadata collection operations.
	 */
	private IAgreementDetailsCollection agreements;

	/**
	 * The partner service used for performing HTTP operations.
	 */
	private IPartnerServiceClient serviceClient; 

	/**
	 * Initializes a new instance of the PartnerOperations class.
	 * 
	 * @param credentials The partner credentials.
	 * @param context A partner context.
	 */
	public PartnerOperations( IPartnerCredentials credentials, IRequestContext context )
	{
		if ( credentials == null )
		{
			throw new IllegalArgumentException( "credentials can't be null" );
		}
		if ( context == null )
		{
			throw new IllegalArgumentException( "context can't be null" );
		}
	
		this.setCredentials( credentials );
		this.setRequestContext( context );

		serviceClient = new PartnerServiceClient(PartnerService.getInstance().getApiRootUrl());
	}

	/**
	 * Gets the partner credentials.
	 */
	private IPartnerCredentials credentials;

	public IPartnerCredentials getCredentials()
	{
		return credentials;
	}

	private void setCredentials( IPartnerCredentials value )
	{
		credentials = value;
	}

	/**
	 * Gets the partner context.
	 */
	private IRequestContext requestContext;

	public IRequestContext getRequestContext()
	{
		return requestContext;
	}

	private void setRequestContext( IRequestContext value )
	{
		requestContext = value;
	}

	/**
	 * Gets the collection enumerators available for traversing through results.
	 */
	public IResourceCollectionEnumeratorContainer getEnumerators()
	{
		if ( this.enumeratorContainer == null )
		{
			this.enumeratorContainer = new ResourceCollectionEnumeratorContainer( this );
		}

		return this.enumeratorContainer;
	}

	/**
	 * Gets the offer categories operations available to the partner.
	 */
	public ICountrySelector<IOfferCategoryCollection> getOfferCategories()
	{
		if ( this.offerCategories == null )
		{
			this.offerCategories = new OfferCategoryCountrySelector( this );
		}

		return this.offerCategories;
	}

	/**
	 * Gets the partner profiles operations.
	 */
	public IPartnerProfileCollection getProfiles()
	{
		if ( this.profiles == null )
		{
			this.profiles = new PartnerProfileCollectionOperations( this );
		}
		
		return this.profiles;
	}

	/**
	 * Gets the partner customers operations.
	 */
	public ICustomerCollection getCustomers()
	{
		if ( this.customers == null )
		{
			this.customers = new CustomerCollectionOperations( this );
		}
		return this.customers;
	}

	/**
	 * Gets the offer operations available to the partner.
	 */
	public ICountrySelector<IOfferCollection> getOffers()
	{
		if ( this.offers == null )
		{
			this.offers = new OfferCountrySelector( this );
		}
		return this.offers;
	}

	/**
	 * Gets the partner's invoices.
	 */
	public IInvoiceCollection getInvoices()
	{
		if ( this.invoices == null )
		{
			this.invoices = new InvoiceCollection( this );
		}
		return this.invoices;
	}

	/**
	 * Gets the Service Request operations available.
	 */
	public IPartnerServiceRequestCollection getServiceRequests()
	{
		if ( this.serviceRequests == null )
		{
			this.serviceRequests = new PartnerServiceRequestCollectionOperations( this );
		}
		return this.serviceRequests;
	}

	/**
	 * Gets the Service incidents operations available.
	 */
	public IServiceIncidentCollection getServiceIncidents()
	{
		if ( this.serviceIncidents == null )
		{
			this.serviceIncidents = new ServiceIncidentCollectionOperations( this );
		}
		return this.serviceIncidents;
	}

	/**
	 * Gets the usage summary operations available to the partner.
	 */
	public IPartnerUsageSummary getUsageSummary()
	{
		if ( this.usageSummary == null )
		{
			this.usageSummary = new PartnerUsageSummaryOperations( this );
		}
		return this.usageSummary;
	}

	/**
	 * Gets the audit records operations available to the partner.
	 */
	public IAuditRecordsCollection getAuditRecords() {
		if ( this.auditRecords == null )
		{
			this.auditRecords = new AuditRecordsCollection( this );
		}
		return this.auditRecords;
	}

	/**
	 * Gets the country validation rules operations available to the partner.
	 */
	public ICountryValidationRulesCollection getCountryValidationRules() {
		if ( this.countryValidationRules == null )
		{
			this.countryValidationRules = new CountryValidationRulesCollectionOperations( this );
		}
		return this.countryValidationRules;
	}

	/**
	 * Gets the domain operations available to the partner.
	 */
	public IDomainCollection getDomains() {
		if ( this.domains == null )
		{
			this.domains = new DomainCollectionOperations( this );
		}
		return this.domains;
	}

	/**
	 * Gets the rate card operations available to the partner.
	 */
	public IRateCardCollection getRateCards() {
		if ( this.rateCards == null )
		{
			this.rateCards = new RateCardCollectionOperations( this );
		}
		return this.rateCards;
	}
	
	/**
	 * Gets the analytics collection operations.
	 */
	public IPartnerAnalyticsCollection getAnalytics() {
		if ( this.analytics == null )
		{
			this.analytics = new PartnerAnalyticsCollectionOperations( this );
		}
		return this.analytics;
	}
	
	/**
	 * Gets the extensions operations available to the partner.
	 */
	public IExtensions getExtensions()
	{
		if(this.extensions == null)
		{
			this.extensions = new ExtensionsOperations(this);
		}

		return extensions;
	}

	/**
	 * Gets the product operations available to the partner.
	 */
	public IProductCollection getProducts()
	{
		if(this.products == null)
		{
			this.products = new ProductCollectionOperations( this );
		}

		return this.products;
	}

	/**
	 * Gets the relationship collection operations available to the partner.
	 */    
	public IRelationshipCollection getRelationships()
	{
		if(this.relationships == null)
		{
			return new RelationshipCollectionOperations( this );
		}

		return this.relationships;
	}

	/**
	 * Gets the validation operations available to the partner.
	 */    
	public IValidationOperations getValidations()
	{
		if(this.validations == null)
		{
			this.validations = new ValidationOperations(this);
		}

		return this.validations;
	}

	/**
	 * Gets the agreement metadata operations.
	 */
	@Override
	public IAgreementDetailsCollection getAgreementDetails()
	{
		if ( this.agreements == null )
		{
			this.agreements = new AgreementDetailsCollectionOperations( this );
		}

		return this.agreements;
	}

	/**
	 * Gets the partner service client.
	 * 
	 * @return The partner service client.
	 */
	public IPartnerServiceClient getServiceClient()
	{
		return serviceClient;
	}
}