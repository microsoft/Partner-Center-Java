// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.network;

import java.io.IOException;
import java.io.InputStream;
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
import com.microsoft.store.partnercenter.errorhandling.DefaultPartnerServiceErrorHandler;
import com.microsoft.store.partnercenter.errorhandling.IFailedPartnerServiceResponseHandler;
import com.microsoft.store.partnercenter.exception.PartnerErrorCategory;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.exception.PartnerResponseParseException;
import com.microsoft.store.partnercenter.models.Link;
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
	static final MediaType JSON_MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");

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
	 * Provides the ability to handle failed responses.
	 */
	private IFailedPartnerServiceResponseHandler errorHandler;

	/**
	 * Provides the ability to serialize and deserialize objects.
	 */
	private ObjectMapper jsonConverter;

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

		errorHandler = new DefaultPartnerServiceErrorHandler();
	}

	/**
	 * Initializes a new instance of the ServiceClient class.
	 *
	 * @param restClient The client for performing REST operations.
	 */
	public PartnerServiceClient(RestClient restClient)
	{
		super(restClient);

		errorHandler = new DefaultPartnerServiceErrorHandler();
	}
	
	/**
	 * Executes a GET operation against the partner service. 
	 * 
     * @param <T> The type of the response. 
	 * @param rootPartnerOperations An instance of the partner operations.
	 * @param responseType The type of object to be returned.
	 * @param link A link object that represents the action for accessing the resource. 
     * @return The response from the GET operation.
	 */
	public <T> T get(IPartner rootPartnerOperations, TypeReference<T> responseType, Link link)
	{
		Map<String, String> requestHeaders;
		Request request;

		requestHeaders = getRequestHeaders(rootPartnerOperations, ACCEPT_HEADER_VALUE);

		if(link.getHeaders() != null)
		{
			for (KeyValuePair<String, String> header : link.getHeaders())
			{
				requestHeaders.put(header.getKey(), header.getValue());
			}
		}

		request = new Request.Builder().headers(Headers.of(requestHeaders)).url(buildUrl(link.getUri().toString(), null, true)).get().build();
		return handleResponse(rootPartnerOperations, request, responseType);
	}

	/**
	 * Executes a GET operation against the partner service. 
	 * 
     * @param <T> The type of the response.  
	 * @param rootPartnerOperations An instance of the partner operations.
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address of the request. 
     * @return The response from the GET operation.
	 */
	public <T> T get(IPartner rootPartnerOperations, TypeReference<T> responseType, String relativeUri)
	{
		return get(rootPartnerOperations, responseType, relativeUri, null);
	}

	/**
	 * Executes a GET operation against the partner service. 
	 * 
     * @param <T> The type of the response. 	 
	 * @param rootPartnerOperations An instance of the partner operations.
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address of the request. 
	 * @param headers Headers to be added to the request.
	 * @param parameters Parameters to be added to the request.
     * @return The response from the GET operation.
	 */
	public <T> T get(IPartner rootPartnerOperations, TypeReference<T> responseType, String relativeUri, Map<String, String> headers, Collection<KeyValuePair<String, String>> parameters)
	{
		Map<String, String> requestHeaders;
		Request request;

		requestHeaders = getRequestHeaders(rootPartnerOperations, ACCEPT_HEADER_VALUE);

		if(headers != null)
		{
			requestHeaders.putAll(headers);
		}

		request = new Request.Builder().headers(Headers.of(requestHeaders)).url(buildUrl(relativeUri, parameters, false)).get().build();
		return handleResponse(rootPartnerOperations, request, responseType);
	}

	/**
	 * Executes a file content request against the partner service.
	 * 
	 * @param rootPartnerOperations An instance of the partner operations.
	 * @param relativeUri The relative address of the request. 
	 * @param acceptType The value for the accept type header.
     * @return The response from the file content request.
	 */
	public InputStream getFileContents(IPartner rootPartnerOperations, String relativeUri, String acceptType)
	{
		InputStream responseStream; 
		Request request; 
		Response response; 

		try
		{
			request = new Request.Builder().headers(Headers.of(getRequestHeaders(rootPartnerOperations, acceptType))).url(buildUrl(relativeUri, null, false)).get().build();
			response = httpClient().newCall(request).execute();

			responseStream = response.body().byteStream();

			return responseStream;
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	   
		return null;
	}

	/**
	 * Executes a GET operation against the partner service. 
	 * 
     * @param <T> The type of the response. 	 
	 * @param rootPartnerOperations An instance of the partner operations.
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address of the request. 
	 * @param parameters Parameters to be added to the request.
     * @return The response from the GET operation.
	 */
	public <T> T get(IPartner rootPartnerOperations, TypeReference<T> responseType, String relativeUri, Collection<KeyValuePair<String, String>> parameters)
	{
		return get(rootPartnerOperations, responseType, relativeUri, null, parameters);
	}

	/**
	 * Executes a HEAD operation against the partner service. 
	 * 
     * @param <T> The type of the response. 	 
	 * @param rootPartnerOperations An instance of the partner operations.
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address of the request. 
     * @return The response from the HEAD operation.
	 */
	public <T> T head(IPartner rootPartnerOperations, TypeReference<T> responseType, String relativeUri)
	{
		Headers headers = Headers.of(getRequestHeaders(rootPartnerOperations, ACCEPT_HEADER_VALUE));
		Request request = new Request.Builder().headers(headers).url(buildUrl(relativeUri, null, false)).head().build();

		return handleResponse(rootPartnerOperations, request, responseType);
	}

	/**
	 * Executes a PATCH operation against the partner service.
	 * 
	 * @param <T> The type of the request.
     * @param <U> The type of the response.
	 * @param rootPartnerOperations An instance of the partner operations.
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address of the request. 
	 * @param content The content for the body of the request.
     * @return The response from the PATCH operation.
	 */
	public <T, U> U patch(IPartner rootPartnerOperations, TypeReference<U> responseType, String relativeUri, T content)
	{
		Headers headers = Headers.of(getRequestHeaders(rootPartnerOperations, ACCEPT_HEADER_VALUE));
		Request request;

		try
		{
			request = new Request.Builder()
				.headers(headers)
				.url(buildUrl(relativeUri, null, false))
				.patch(RequestBody.create(JSON_MEDIA_TYPE, getJsonConverter().writeValueAsString(content)))
				.build();

			return handleResponse(rootPartnerOperations, request, responseType);
		}
		catch (JsonProcessingException e)
		{
			throw new PartnerException("", rootPartnerOperations.getRequestContext(), PartnerErrorCategory.REQUEST_PARSING);
		}	
	}

	/**
	 * Executes a POST operation against the partner service. 
	 * 
     * @param <T> The type of the request.
     * @param <U> The type of the response.
	 * @param rootPartnerOperations An instance of the partner operations. 
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address fo the request.
	 * @param content The content for the body of the request.
     * @return The response from the POST operation.
	 */
	public <T, U> U post(IPartner rootPartnerOperations, TypeReference<U> responseType, String relativeUri, T content)
	{
		return post(rootPartnerOperations, responseType, relativeUri, content, null);
	}

	/**
	 * Executes a POST operation against the partner service. 
	 * 
	 * @param <T> The type of the request.
     * @param <U> The type of the response.
	 * @param rootPartnerOperations An instance of the partner operations. 
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address fo the request.
	 * @param content The content for the body of the request.
	 * @param parameters Parameters to be added to the request.
     * @return The response from the POST operation.
	 */
	public <T, U> U post(IPartner rootPartnerOperations, TypeReference<U> responseType, String relativeUri, T content, Collection<KeyValuePair<String, String>> parameters)
	{
		Headers headers = Headers.of(getRequestHeaders(rootPartnerOperations, ACCEPT_HEADER_VALUE));
		Request request;

		try
		{
			request = new Request.Builder()
				.headers(headers)
				.url(buildUrl(relativeUri, parameters, false))
				.post(RequestBody.create(JSON_MEDIA_TYPE, getJsonConverter().writeValueAsString(content)))
				.build();

			return handleResponse(rootPartnerOperations, request, responseType);
		}
		catch (JsonProcessingException e)
		{
			throw new PartnerException("", rootPartnerOperations.getRequestContext(), PartnerErrorCategory.REQUEST_PARSING);
		}	
	}

	/**
	 * Executes a PUT operation against the partner service. 
	 * 
	 * @param <T> The type of the request.
     * @param <U> The type of the response.
	 * @param rootPartnerOperations An instance of the partner operations. 
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address fo the request.
	 * @param content The content for the body of the request.
     * @return The response from the POST operation.
	 */
	public <T, U> U put(IPartner rootPartnerOperations, TypeReference<U> responseType, String relativeUri, T content)
	{
		Headers headers = Headers.of(getRequestHeaders(rootPartnerOperations, ACCEPT_HEADER_VALUE));
		Request request;

		try
		{
			request = new Request.Builder()
				.headers(headers)
				.url(buildUrl(relativeUri, null, false))
				.put(RequestBody.create(JSON_MEDIA_TYPE, getJsonConverter().writeValueAsString(content)))
				.build();

			return handleResponse(rootPartnerOperations, request, responseType);
		}
		catch (JsonProcessingException e)
		{
			throw new PartnerException("", rootPartnerOperations.getRequestContext(), PartnerErrorCategory.REQUEST_PARSING);
		}	
	}

	/**
	 * Executes a DELETE operation against the partner service. 
	 * 
     * @param <T> The type of the response. 	 	 
	 * @param rootPartnerOperations An instance of the partner operations. 
	 * @param responseType The type of object to be returned.
	 * @param relativeUri The relative address fo the request.
	 */
	public <T> void delete(IPartner rootPartnerOperations, TypeReference<T> responseType, String relativeUri)
	{
		Headers headers = Headers.of(getRequestHeaders(rootPartnerOperations, ACCEPT_HEADER_VALUE));
		Request request = new Request.Builder().headers(headers).url(buildUrl(relativeUri, null, false)).delete().build();

		handleResponse(rootPartnerOperations, request, responseType);
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
	 * @param relativeUri Relative address for the resource being requested.
	 * @param parameters The parameters to be added to the request.
	 * @return The address for the request.
	 */
	private String buildUrl(String relativeUri, Collection<KeyValuePair<String, String>> parameters, boolean isBuilt)
	{
		if(StringHelper.isNullOrEmpty(relativeUri))
		{
			throw new IllegalArgumentException("resourcePath cannot be null");
		}

		StringBuilder address = new StringBuilder(
			PartnerService.getInstance().getApiRootUrl() + "/"
				+ PartnerService.getInstance().getPartnerServiceApiVersion() + "/" + relativeUri);

		if(!isBuilt)
		{
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
		} 

		return address.toString();
	}

	/**
	 * Gets the headers for the HTTP request.
	 * 
	 * @param rootPartnerOperations An instance of the root partner operations.
	 * @return The headers for the HTTP request.
	 */
	private Map<String, String> getRequestHeaders(IPartner rootPartnerOperations, String acceptType)
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

		if(rootPartnerOperations.getCredentials().isExpired())
		{
			if (PartnerService.getInstance().getRefreshCredentialsHandler() != null) 
			{
				try 
				{
					PartnerService.getInstance().getRefreshCredentialsHandler()
						.onCredentialsRefreshNeeded(rootPartnerOperations.getCredentials(), rootPartnerOperations.getRequestContext());
				} 
				catch (Exception refreshProblem) 
				{
					throw new PartnerException("Refreshing the credentials has failed.", rootPartnerOperations.getRequestContext(),
						PartnerErrorCategory.UNAUTHORIZED, refreshProblem);
				}
			}
		
			if (rootPartnerOperations.getCredentials().isExpired()) 
			{
				throw new PartnerException("The credential refresh mechanism provided expired credentials.",
					rootPartnerOperations.getRequestContext(), PartnerErrorCategory.UNAUTHORIZED);
			}
		} 
		else 
		{
			throw new PartnerException("The partner credentials have expired. Please provide updated credentials.",
				rootPartnerOperations.getRequestContext(), PartnerErrorCategory.UNAUTHORIZED);
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

		headers.put(ACCEPT_HEADER, acceptType);

		return headers;
	}

	@SuppressWarnings("unchecked")
	private <T> T handleResponse(IPartner rootPartnerOperations, Request request, TypeReference<T> responseType)
	{
		Response response; 
		String responseBody = null; 
		T value; 

		try
		{
			response = httpClient().newCall(request).execute();
		
			if(response.isSuccessful())
			{
				responseBody = response.body().string();

				if(StringHelper.isNullOrEmpty(responseBody))
				{
					value = (T)response;
				}
				else
				{
					value = getJsonConverter().readValue(responseBody, responseType);
				}

				response.close();
				return value; 
			}

			throw errorHandler.handleFailedResponse(response, rootPartnerOperations.getRequestContext());
		}
		catch (IOException ex) 
		{
			throw new PartnerResponseParseException(
				responseBody, 
				rootPartnerOperations.getRequestContext(), 
				"Could not deserialize response. Detailed message: " + ex.getMessage(),
				ex);
		}
	}
}