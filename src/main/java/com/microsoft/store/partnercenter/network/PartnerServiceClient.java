// -----------------------------------------------------------------------
// <copyright file="PartnerServiceClient.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.network;

import java.io.IOException;
import java.net.URI;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.serializer.JacksonAdapter;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.exception.PartnerErrorCategory;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.models.entitlements.Artifact;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItem;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;
import com.microsoft.store.partnercenter.requestcontext.RequestContextFactory;
import com.microsoft.store.partnercenter.utils.ArtifactDeserializer;
import com.microsoft.store.partnercenter.utils.InvoiceLineItemDeserializer;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.utils.UriDeserializer;

import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
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
	 * The JSON media type used when building a body request.
	 */
	static final MediaType JSON_MEDIA_TYPE = MediaType.get("application/json; charset=utf-8");

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
		super(
			new RestClient.Builder()
				.withBaseUrl(baseUrl)
				.withRetryStrategy(
					new PartnerServiceRetryStrategy(
						PartnerService.getInstance().getConfiguration().getDefaultMaxRetryAttempts()))
				.withSerializerAdapter(new JacksonAdapter())
				.withResponseBuilderFactory(new ServiceResponseBuilder.Factory())
				.build());
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
		Request request = new Request.Builder().headers(headers).url(buildUrl(relativeUri, null)).get().build();
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
	 * Executes a HEAD operation against the partner service. 
	 * 
	 * @param rootPartnerOperations An instance of the partner operations.
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address of the request. 
	 */
	public <T> T head(IPartner rootPartnerOperations, TypeReference<T> responseType, String relativeUri)
	{
		Headers headers = Headers.of(getRequestHeaders(rootPartnerOperations));
		Request request = new Request.Builder().headers(headers).url(buildUrl(relativeUri, null)).head().build();
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
	 * Executes a PATCH operation against the partner service.
	 * 
	 * @param rootPartnerOperations An instance of the partner operations.
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address of the request. 
	 * @param content The content for the body of the request.
	 */
	@SuppressWarnings("unchecked")
	public <T, U> U patch(IPartner rootPartnerOperations, TypeReference<U> responseType, String relativeUri, T content)
	{
		Headers headers = Headers.of(getRequestHeaders(rootPartnerOperations));
		Request request;
		Response response;
		String responseBody; 

		try
		{
			request = new Request.Builder()
				.headers(headers)
				.url(buildUrl(relativeUri, null))
				.patch(RequestBody.create(JSON_MEDIA_TYPE, getJsonConverter().writeValueAsString(content)))
				.build();

			response = httpClient().newCall(request).execute();
			responseBody = response.body().string();

			if(StringHelper.isNullOrEmpty(responseBody))
			{
				return (U)response;
			}
			else
			{
				return getJsonConverter().readValue(responseBody, responseType);
			}
		}
		catch (JsonProcessingException e)
		{
			throw new PartnerException("", rootPartnerOperations.getRequestContext(), PartnerErrorCategory.REQUEST_PARSING);
		}	
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}

		return null;
	}

	/**
	 * Executes a POST operation against the partner service. 
	 * 
	 * @param rootPartnerOperations An instance of the partner operations. 
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address fo the request.
	 * @param content The conent for the body of the request.
	 */
	public <T, U> U post(IPartner rootPartnerOperations, TypeReference<U> responseType, String relativeUri, T content)
	{
		return post(rootPartnerOperations, responseType, relativeUri, content, null);
	}

	/**
	 * Executes a POST operation against the partner service. 
	 * 
	 * @param rootPartnerOperations An instance of the partner operations. 
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address fo the request.
	 * @param content The conent for the body of the request.
	 * @param parameters Parameters to be added to the reqest.
	 */
	@SuppressWarnings("unchecked")
	public <T, U> U post(IPartner rootPartnerOperations, TypeReference<U> responseType, String relativeUri, T content, Collection<KeyValuePair<String, String>> parameters)
	{
		Headers headers = Headers.of(getRequestHeaders(rootPartnerOperations));
		Request request;
		Response response;
		String responseBody; 

		try
		{
			request = new Request.Builder()
				.headers(headers)
				.url(buildUrl(relativeUri, parameters))
				.post(RequestBody.create(JSON_MEDIA_TYPE, getJsonConverter().writeValueAsString(content)))
				.build();

			response = httpClient().newCall(request).execute();
			responseBody = response.body().string();

			if(StringHelper.isNullOrEmpty(responseBody))
			{
				return (U)response;
			}
			else
			{
				return getJsonConverter().readValue(responseBody, responseType);
			}
		}
		catch (JsonProcessingException e)
		{
			throw new PartnerException("", rootPartnerOperations.getRequestContext(), PartnerErrorCategory.REQUEST_PARSING);
		}	
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}

		return null;
	}

	/**
	 * Executes a DELETE operation against the partner service. 
	 * 
	 * @param rootPartnerOperations An instance of the partner operations. 
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address fo the request.
	 */
	public <T> void delete(IPartner rootPartnerOperations, TypeReference<T> responseType, String relativeUri)
	{
		Headers headers = Headers.of(getRequestHeaders(rootPartnerOperations));
		Request request = new Request.Builder().headers(headers).url(buildUrl(relativeUri, null)).delete().build();
		Response response; 
		T value;

		try
		{
			response = httpClient().newCall(request).execute();

			value = getJsonConverter().readValue(response.body().string(), responseType);
			response.close();
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}

	/**
	 * Gets the JSON converter. 
	 * 
	 * @return The configured JSON converter.
	 */
	private ObjectMapper getJsonConverter() 
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
	
	/**
	 * Constructs the address for the request.
	 * 
	 * @param relativUri Relative address for the resource being requested.
	 * @param paramters The parameters to be added to the request.
	 * @return The address for the request.
	 */
	private String buildUrl(String relativUri, Collection<KeyValuePair<String, String>> parameters)
	{
		if(StringHelper.isNullOrEmpty(relativUri))
		{
			throw new IllegalArgumentException("resourcePath cannot be null");
		}

		StringBuilder address = new StringBuilder(
			PartnerService.getInstance().getApiRootUrl() + "/"
				+ PartnerService.getInstance().getPartnerServiceApiVersion() + "/" + relativUri);

		if(parameters != null)
		{
			if (!parameters.isEmpty()) 
			{
				address.append("?");
			}

			for (KeyValuePair<String, String> queryParameter : parameters)
			{
				if (address.length() > 1) {
					address.append("&");
				}

				address.append(
					MessageFormat.format(
						"{0}={1}", 
						queryParameter.getKey(), 
						queryParameter.getValue()));
			} 
		}

		return address.toString();
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
		IRequestContext requestContext; 

		if (rootPartnerOperations.getRequestContext().getRequestId().equals(new UUID(0, 0)))
		{
			requestContext = RequestContextFactory.getInstance().create(
				rootPartnerOperations.getRequestContext().getCorrelationId(),
				UUID.randomUUID(),
				rootPartnerOperations.getRequestContext().getLocale());
		}
		else
		{
			requestContext = rootPartnerOperations.getRequestContext();
		}

		headers.put(AUTHORIZATION_HEADER, AUTHORIZATION_SCHEME + " " +  rootPartnerOperations.getCredentials().getPartnerServiceToken());
		headers.put(CONTRACT_VERSION_HEADER, PartnerService.getInstance().getPartnerServiceApiVersion());
		headers.put(CORRELATION_ID_HEADER, requestContext.getCorrelationId().toString());
		headers.put(LOCALE_HEADER, requestContext.getLocale());
		headers.put(REQUEST_ID_HEADER, requestContext.getRequestId().toString());
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