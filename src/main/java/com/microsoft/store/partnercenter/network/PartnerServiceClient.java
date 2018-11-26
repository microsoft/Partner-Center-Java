// -----------------------------------------------------------------------
// <copyright file="PartnerServiceClient.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.network;

import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceClient;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.entitlements.Artifact;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItem;
import com.microsoft.store.partnercenter.utils.ArtifactDeserializer;
import com.microsoft.store.partnercenter.utils.InvoiceLineItemDeserializer;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.utils.UriDeserializer;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

public class PartnerServiceClient 
	extends ServiceClient
	implements IPartnerServiceClient
{
	/**
	 * Provides the ability to serialize and deserialize objects.
	 */
	private ObjectMapper jsonConverter;

	/**
	 * The name of the accept header.
	 */
	static final String ACCEPT_HEADER = "Accept";

	/**
	 * The value for the accept header.
	 */
	static final String ACCEPT_HEADER_VALUE = "application/json";

	/**
	 * The name of the authorization header.
	 */
	static final String AUTHORIZATION_HEADER = "Authorization"; 

	/** 
	 * The value for the authorization scheme.
	 */
	static final String AUTHORIZATION_SCHEME = "Bearer";

	/**
	 * The name of the MS-PartnerCenter-Client header.
	 */
	static final String CLIENT_HEADER = "MS-PartnerCenter-Client";

	/**
	 * The name of the MS-Contract-Version header.
	 */
	static final String CONTRACT_VERSION_HEADER = "MS-Contract-Version";

	/**
	 * The name of the MS-CorrelationId header.
	 */
	static final String CORRELATION_ID_HEADER = "MS-CorrelationId";

	/**
	 * The name of the X-Locale header.
	 */
	static final String LOCALE_HEADER = "X-Locale";

	/**
	 * The name of the MS-PartnerCenter-Application header.
	 */
	static final String PARTNER_CENTER_APP_HEADER = "MS-PartnerCenter-Application"; 

	/**
	 * The name of the MS-RequestId header.
	 */
	static final String REQUEST_ID_HEADER = "MS-RequestId";

	/**
	 * The name of the MS-SdkVersion header.
	 */
	static final String SDK_VERSION_HEADER = "MS-SdkVersion";

	/**
	 * Initializes a new instance of the PartnerServiceClient class.
	 *
	 * @param baseUrl The base service endpoint address.
	 */
	public PartnerServiceClient(String baseUrl)
	{
		super(baseUrl);
	}

	/**
	 * Initializes a new instance of the ServiceClient class.
	 *
	 * @param restClient The client for performing REST operations.
	 */
	public PartnerServiceClient(RestClient restClient)
	{
		super(restClient);
	}
	
	/**
	 * Executes a GET operation against the partner service. 
	 * 
	 * @param rootPartnerOperations An instance of the partner operations.
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address of the request. 
	 */
	public <T> T get(IPartner rootPartnerOperations, TypeReference<T> responseType, String relativeUri)
	{
		Headers headers = Headers.of(getRequestHeaders(rootPartnerOperations));
		Request request = new Request.Builder().headers(headers).url(buildUrl(relativeUri)).get().build();
		Response response; 
		T value;

		try
		{
			 response = httpClient().newCall(request).execute();

			value = getJsonConverter().readValue(response.body().string(), responseType);
			response.close();
			
			return value;
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	   
		return null;
	}

	/**
	 * Gets the JSON converter. 
	 * 
	 * @return The configured JSON converter.
	 */
	public ObjectMapper getJsonConverter() 
	{
		if (jsonConverter == null) 
		{
			jsonConverter = new ObjectMapper();
		
			jsonConverter.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			jsonConverter.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			jsonConverter.registerModule(new JodaModule());
			jsonConverter.registerModule(
				new SimpleModule().addDeserializer(Artifact.class, new ArtifactDeserializer()));
			jsonConverter.registerModule(
					new SimpleModule().addDeserializer(InvoiceLineItem.class, new InvoiceLineItemDeserializer()));
			jsonConverter.registerModule(
				new SimpleModule().addDeserializer(URI.class, new UriDeserializer()));
			jsonConverter.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
			jsonConverter.setSerializationInclusion(Include.NON_NULL);
		}

		return jsonConverter;
	}
	
	private String buildUrl(String resourcePath)
	{
		if(StringHelper.isNullOrEmpty(resourcePath))
		{
			throw new IllegalArgumentException("resourcePath cannot be null");
		}

		StringBuilder baseUri = new StringBuilder(
			PartnerService.getInstance().getApiRootUrl() + "/"
				+ PartnerService.getInstance().getPartnerServiceApiVersion() + "/" + resourcePath);

		return baseUri.toString();
	}

	/**
	 * Gets the headers for the HTTP request.
	 * 
	 * @param rootPartnerOperations An instance of the root partner operations.
	 * @return The headers for the HTTP request.
	 */
	private Map<String, String> getRequestHeaders(IPartner rootPartnerOperations)
	{
		Map<String, String> headers = new HashMap<>();

		headers.put(AUTHORIZATION_HEADER, AUTHORIZATION_SCHEME + " " +  rootPartnerOperations.getCredentials().getPartnerServiceToken());
		headers.put(CONTRACT_VERSION_HEADER, PartnerService.getInstance().getPartnerServiceApiVersion());
		headers.put(CORRELATION_ID_HEADER, rootPartnerOperations.getRequestContext().getCorrelationId().toString());
		headers.put(LOCALE_HEADER, rootPartnerOperations.getRequestContext().getLocale());
		headers.put(REQUEST_ID_HEADER, rootPartnerOperations.getRequestContext().getRequestId().toString());
		headers.put(SDK_VERSION_HEADER, PartnerService.getInstance().getSdkVersion());

		if (PartnerService.getInstance().getApplicationName() != null
			&& PartnerService.getInstance().getApplicationName().trim().isEmpty() != true) 
		{
			headers.put(
				PARTNER_CENTER_APP_HEADER, 
				PartnerService.getInstance().getApplicationName());
		}

		headers.put(
			CLIENT_HEADER,
			PartnerService.getInstance().getConfiguration().getPartnerCenterClient());

		headers.put(ACCEPT_HEADER, ACCEPT_HEADER_VALUE);

		return headers;
	}
}