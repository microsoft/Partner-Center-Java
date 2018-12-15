// -----------------------------------------------------------------------
// <copyright file="PartnerServiceProxy.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.errorhandling.DefaultPartnerServiceErrorHandler;
import com.microsoft.store.partnercenter.errorhandling.IFailedPartnerServiceResponseHandler;
import com.microsoft.store.partnercenter.exception.PartnerErrorCategory;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.exception.PartnerResponseParseException;
import com.microsoft.store.partnercenter.logging.PartnerLog;
import com.microsoft.store.partnercenter.models.entitlements.Artifact;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItem;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;
import com.microsoft.store.partnercenter.requestcontext.RequestContext;
import com.microsoft.store.partnercenter.requestcontext.RequestContextFactory;
import com.microsoft.store.partnercenter.utils.ArtifactDeserializer;
import com.microsoft.store.partnercenter.utils.InvoiceLineItemDeserializer;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.utils.UriDeserializer;

import org.apache.http.HttpHost;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

/**
 * An implementation of the partner service proxy which automatically serializes
 * request content into JSON payload and deserializes the response from JSON
 * into the given response type. The type of content that will be passed to the
 * partner service API.The type of response produced from the partner service
 * API.
 */
public class PartnerServiceProxy<TRequest, TResponse> extends BasePartnerComponentString
		implements IPartnerServiceProxy<TRequest, TResponse> 
{
	/**
	 * The request context the proxy will use in executing the network calls.
	 */
	private IRequestContext requestContext = new RequestContext();

	/**
	 * The character which acts as the byte order mark for UTF-8.
	 */
	private static final String UTF8_BOM = "\uFEFF";

	/**
	 * Singleton instance of the Http client.
	 */
	private static CloseableHttpClient httpClient;

	/**
	 * Initializes a new instance of the PartnerServiceProxy class.
	 * 
	 * @param responseClass Type of the response.
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param resourcePath The resource path which will be appended to the root URL.
	 */
	public PartnerServiceProxy(TypeReference<TResponse> responseClass, IPartner rootPartnerOperations,
			String resourcePath) 
	{
		this(rootPartnerOperations, resourcePath, null, null);
		this.responseClass = responseClass;
	}

	/**
	 * Initializes a new instance of the PartnerServiceProxy class.
	 * 
	 * @param rootPartnerOperations
	 *            The root partner operations instance.
	 * @param resourcePath
	 *            The resource path which will be appended to the root URL.
	 * @param errorHandler
	 *            An optional handler for failed responses. The default will be used
	 *            if not provided.
	 * @param jsonConverter
	 *            An optional JSON response converter. The default will be used if
	 *            not provided.
	 */
	public PartnerServiceProxy(IPartner rootPartnerOperations, String resourcePath,
			IFailedPartnerServiceResponseHandler errorHandler, ObjectMapper jsonConverter) 
	{
		super(rootPartnerOperations);

		if (this.getPartner().getRequestContext().getRequestId().equals(new UUID(0, 0))) {
			// there is not request id assigned, generate one and stick to it (consider
			// retries)
			this.requestContext = RequestContextFactory.getInstance().create(
					this.getPartner().getRequestContext().getCorrelationId(), UUID.randomUUID(),
					this.getPartner().getRequestContext().getLocale());
		} else {
			this.requestContext = this.getPartner().getRequestContext();
		}

		this.setAccept("application/json");
		this.setContentType("application/json");
		this.setUriParameters(new ArrayList<KeyValuePair<String, String>>());
		this.setResourcePath(resourcePath);
		this.setAdditionalRequestHeaders(new ArrayList<KeyValuePair<String, String>>());
		this.setErrorHandler(errorHandler != null ? errorHandler : new DefaultPartnerServiceErrorHandler());
		this.setJsonConverter(jsonConverter);
		this.setIsUrlPathAlreadyBuilt(false);
	}

	/**
	 * Gets or sets the assigned Microsoft Id.
	 */
	@Override
	public UUID getRequestId() {
		return this.requestContext.getRequestId();
	}

	@Override
	public void setRequestId(UUID value) 
	{
		this.requestContext = RequestContextFactory.getInstance().create(
			this.requestContext.getCorrelationId(),
			value == new UUID(0, 0) ? UUID.randomUUID() : value);
	}

	/**
	 * Gets or sets the assigned Microsoft correlation Id.
	 */
	@Override
	public UUID getCorrelationId()
	{
		return this.requestContext.getCorrelationId();
	}

	@Override
	public void setCorrelationId(UUID value) 
	{
		this.requestContext = RequestContextFactory.getInstance().create(value, this.requestContext.getRequestId());
	}

	/**
	 * Gets or sets the locale.
	 */
	@Override
	public String getLocale() 
	{
		return this.requestContext.getLocale();
	}

	@Override
	public void setLocale(String value) 
	{
		this.requestContext = RequestContextFactory.getInstance().create(
			this.requestContext.getCorrelationId(),
			this.requestContext.getRequestId(), value);
	}

	/**
	 * Gets or sets the e-tag used for concurrency control.
	 */
	private String __IfMatch;

	@Override
	public String getIfMatch() 
	{
		return __IfMatch;
	}

	@Override
	public void setIfMatch(String value) 
	{
		__IfMatch = value;
	}

	/**
	 * Gets or sets the request content type.
	 */
	private String __ContentType;

	@Override
	public String getContentType() 
	{
		return __ContentType;
	}

	@Override
	public void setContentType(String value) 
	{
		__ContentType = value;
	}

	/**
	 * Gets or sets the accepted response type.
	 */
	private String __Accept;

	@Override
	public String getAccept() 
	{
		return __Accept;
	}

	@Override
	public void setAccept(String value) 
	{
		__Accept = value;
	}

	/**
	 * Gets or sets whether the proxy should build the URL or the URL has already
	 * been built.
	 */
	private boolean __IsUrlPathAlreadyBuilt;

	public boolean getIsUrlPathAlreadyBuilt()
	{
		return __IsUrlPathAlreadyBuilt;
	}

	public void setIsUrlPathAlreadyBuilt(boolean value) {
		__IsUrlPathAlreadyBuilt = value;
	}

	/**
	 * Gets the additional request headers.
	 */
	private Collection<KeyValuePair<String, String>> __AdditionalRequestHeaders = new ArrayList<KeyValuePair<String, String>>();

	@Override
	public Collection<KeyValuePair<String, String>> getAdditionalRequestHeaders() 
	{
		return __AdditionalRequestHeaders;
	}

	public void setAdditionalRequestHeaders(Collection<KeyValuePair<String, String>> value) 
	{
		__AdditionalRequestHeaders = value;
	}

	/**
	 * Gets a collection of Uri parameters which will be added to the request query
	 * string. You can add your own uri parameters to this collection.
	 */
	private Collection<KeyValuePair<String, String>> __UriParameters = new ArrayList<KeyValuePair<String, String>>();

	@Override
	public Collection<KeyValuePair<String, String>> getUriParameters() 
	{
		return __UriParameters;
	}

	public void setUriParameters(Collection<KeyValuePair<String, String>> value) 
	{
		__UriParameters = value;
	}

	/**
	 * Gets or sets the resource path which will be appended to the root URL.
	 */
	private String __ResourcePath;

	@Override
	public String getResourcePath() 
	{
		// The paths on the configuration json file have slashes on the beginning,
		// but the next link from the response doesn't. This function removes that
		// first slash.
		if (__ResourcePath.startsWith("/")) {
			return __ResourcePath.substring(1);
		}
		return __ResourcePath;
	}

	@Override
	public void setResourcePath(String value) 
	{
		__ResourcePath = value;
	}

	/**
	 * Gets an optional JSON converter to use.
	 */
	private ObjectMapper jsonConverter;

	public ObjectMapper getJsonConverter() 
	{
		if (jsonConverter == null) {
			jsonConverter = new ObjectMapper();
			jsonConverter.registerModule(new JodaModule());
			jsonConverter.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
			jsonConverter.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			jsonConverter.setSerializationInclusion(Include.NON_NULL);
			jsonConverter.registerModule(
				new SimpleModule().addDeserializer(Artifact.class, new ArtifactDeserializer()));
			jsonConverter.registerModule(
					new SimpleModule().addDeserializer(InvoiceLineItem.class, new InvoiceLineItemDeserializer()));
			jsonConverter.registerModule(new SimpleModule().addDeserializer(URI.class, new UriDeserializer()));
			jsonConverter.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		}

		return jsonConverter;
	}

	public void setJsonConverter(ObjectMapper value) 
	{
		jsonConverter = value;
	}

	private TypeReference<TResponse> responseClass;

	/**
	 * Gets or sets the error handler for non successful responses.
	 */
	private IFailedPartnerServiceResponseHandler __ErrorHandler;

	protected IFailedPartnerServiceResponseHandler getErrorHandler() 
	{
		return __ErrorHandler;
	}

	protected void setErrorHandler(IFailedPartnerServiceResponseHandler value) 
	{
		__ErrorHandler = value;
	}

	/**
	 * Executes a GET request against the partner service.
	 * 
	 * @return The GET response.
	 * @throws PartnerException If a network operation fails.
	 */
	@Override
	public TResponse get() 
	{
	 	RequestBuilder request = RequestBuilder.get(this.buildPartnerServiceApiUri());
		return this.send(request);
	}

	/**
	 * Executes a file content request against the partner service.
	 * 
	 * @return The file content stream.
	 */
	public InputStream getFileContent() 
	{
		try
		{
			// ensure the credentials are not expired
			this.validateCredentials();
			RetryableHttpCall retryableHttpCall = new RetryableHttpCall();
			CloseableHttpClient httpClient = buildHttpClient();

			CloseableHttpResponse response;

			try 
			{
				RequestBuilder request = RequestBuilder.get(this.buildPartnerServiceApiUri());

				// Add the required HTTP headers to the request.
				addHttpHeaders(request);

				response = retryableHttpCall.execute(httpClient, request.build());
			} 
			catch (IOException e) 
			{
				throw new PartnerException(e.getMessage(), this.requestContext, PartnerErrorCategory.NOT_SPECIFIED, e);
			}

			if (response.getStatusLine().getStatusCode() < 400) 
			{
				return response.getEntity().getContent() == null ? null : response.getEntity().getContent();
			}
			else
			{
				// handle the failure according to the configured policy
				throw this.getErrorHandler().handleFailedResponse(response, this.requestContext);
			}
		} 
		catch (Exception error) 
		{
			throw new PartnerException(error.getMessage(), error);
		}
	}

	/**
	 * Executes a PUT request against the partner service.
	 * 
	 * @param content The request body content.
	 * @return The PUT response.
	 */
	@Override
	public TResponse put(TRequest content) 
	{
		RequestBuilder request = RequestBuilder.put(this.buildPartnerServiceApiUri());
	
		try 
		{
			request.setEntity(new StringEntity(getJsonConverter().writeValueAsString(content)));
		}
		catch (UnsupportedEncodingException e) 
		{
			throw new PartnerException("", this.requestContext, PartnerErrorCategory.REQUEST_PARSING);
		}
		catch (JsonProcessingException e) 
		{
			throw new PartnerException("", this.requestContext, PartnerErrorCategory.REQUEST_PARSING);
		}

		return this.send(request);
	}

	/**
	 * Builds the HTTP client needed to perform network calls. This method aids in
	 * mocking the HttpClient in unit tests and hence was implemented as protected
	 * in order not to expose it to other SDK classes.
	 * 
	 * @return A configured HTTP client.
	 */
	protected CloseableHttpClient buildHttpClient() 
	{
		if(httpClient == null)
		{
			HttpClientBuilder builder = HttpClients.custom().disableContentCompression();
			String proxyName = PartnerService.getInstance().getProxyHostName();
			Integer proxyPort = PartnerService.getInstance().getProxyPort();

			if (proxyName != null && proxyPort != null) 
			{
				builder = builder.setProxy(new HttpHost(proxyName, proxyPort));
			}

			httpClient = builder.build();
		}

		return httpClient;
	}

	/**
	 * Sends an HTTP request to the partner service after checking that the
	 * credentials are not expired. It will also handle the response.
	 * 
	 * @param httpOperation The HTTP operation to execute.
	 * @return A deserialized HTTP response.
	 */
	private TResponse send(RequestBuilder request) 
	{
		validateCredentials();

		RetryableHttpCall retryableHttpCall = new RetryableHttpCall();
		CloseableHttpClient httpClient = buildHttpClient();
		addHttpHeaders(request);

		CloseableHttpResponse response;

		try 
		{
			response = retryableHttpCall.execute(httpClient, request.build());
		} 
		catch (IOException e) 
		{
			throw new PartnerException(e.getMessage(), this.requestContext, PartnerErrorCategory.NOT_SPECIFIED, e);
		}

		return this.handleResponse(response);
	}

	private void addHttpHeaders(RequestBuilder request) 
	{
		request.setHeader("MS-SdkVersion", PartnerService.getInstance().getSdkVersion());
		request.setHeader("MS-Contract-Version", PartnerService.getInstance().getPartnerServiceApiVersion());
		request.setHeader("MS-RequestId", this.getRequestId().toString());
		request.setHeader("MS-CorrelationId", this.getCorrelationId().toString());
		request.setHeader("X-Locale", getLocale());

		if (PartnerService.getInstance().getApplicationName() != null
				&& PartnerService.getInstance().getApplicationName().trim().isEmpty() != true) 
		{
			request.setHeader("MS-PartnerCenter-Application", PartnerService.getInstance().getApplicationName());
		}

		request.setHeader("MS-PartnerCenter-Client",
				PartnerService.getInstance().getConfiguration().getPartnerCenterClient());
		request.setHeader("Authorization", "Bearer " + this.getPartner().getCredentials().getPartnerServiceToken());
		request.setHeader("Accept", this.getAccept());

		if (request.getEntity() != null)
		{
			request.setHeader("Content-Type", this.getContentType());
		}

		if (this.getAdditionalRequestHeaders() != null) 
		{
			for (KeyValuePair<String, String> header : this.getAdditionalRequestHeaders()) 
			{
				request.setHeader(header.getKey(), header.getValue());
			}
		}
	}

	/**
	 * Ensures that the partner credentials are up to date.
	 * 
	 * @return A task that is complete when the verification is done.
	 */
	private void validateCredentials() 
	{
		if (this.getPartner().getCredentials().isExpired()) 
		{
			if (PartnerService.getInstance().getRefreshCredentialsHandler() != null) 
			{
				try 
				{
					PartnerService.getInstance().getRefreshCredentialsHandler()
							.onCredentialsRefreshNeeded(this.getPartner().getCredentials(), this.requestContext);
				} 
				catch (Exception refreshProblem) 
				{
					PartnerLog.getInstance().logError(
						MessageFormat.format(
							"Refreshing the credentials has failed: {0}",
							refreshProblem));

					throw new PartnerException("Refreshing the credentials has failed.", this.requestContext,
							PartnerErrorCategory.UNAUTHORIZED, refreshProblem);
				}

				if (this.getPartner().getCredentials().isExpired()) 
				{
					PartnerLog.getInstance().logError("The credential refresh mechanism provided expired credentials.");
					throw new PartnerException("The credential refresh mechanism provided expired credentials.",
							this.requestContext, PartnerErrorCategory.UNAUTHORIZED);
				}
			} 
			else 
			{
				// we can't refresh the credentials silently, fail with unauthorized
				PartnerLog.getInstance().logError("The partner credentials have expired.");

				throw new PartnerException("The partner credentials have expired. Please provide updated credentials.",
						this.requestContext, PartnerErrorCategory.UNAUTHORIZED);
			}
		}
	}

	/**
	 * Handles partner service responses.
	 * 
	 * @param response
	 *            The partner service response.
	 * @return The configured response result.
	 * @throws PartnerException
	 */
	private TResponse handleResponse(CloseableHttpResponse response) {
		String responseBody = null;

		if (response.getStatusLine().getStatusCode() < 400) 
		{
			try 
			{
				// That string trimming is due to the byte order mark coming on
				// the beginning of the JSON response for some APIs.
				TResponse responseObj = null;

				if (response.getStatusLine().getStatusCode() != 204 && response.getEntity() != null) {
					// Read the raw input in UTF-8 format.
					responseBody = StringHelper.fromInputStream(response.getEntity().getContent(), "UTF-8");

					// Remove byte order mark, a character designating the beginning of a Unicode
					// string, if it exists in the payload.
					if (responseBody != null && responseBody.length() > 0
							&& responseBody.substring(0, 1).equals(UTF8_BOM)) {
						responseBody = responseBody.substring(1);
					}

					responseObj = getJsonConverter().readValue(responseBody, responseClass);
				}

				response.close();

				return responseObj;
			} 
			catch (IOException deserializationProblem) 
			{
				throw new PartnerResponseParseException(responseBody, this.requestContext,
						"Could not deserialize response. Detailed message: " + deserializationProblem.getMessage(),
						deserializationProblem);
			}
		} 
		else
		{
			throw __ErrorHandler.handleFailedResponse(response, requestContext);
		}
	}

	/**
	 * Builds the partner service API Uri based on the configured properties.
	 * 
	 * @return The complete partner service API Uri needed to invoke the current
	 *         operation.
	 */
	private URI buildPartnerServiceApiUri() 
	{
		StringBuilder baseUri = new StringBuilder(
			PartnerService.getInstance().getApiRootUrl() + "/"
				+ PartnerService.getInstance().getPartnerServiceApiVersion() + "/" + this.getResourcePath());

		if (!this.getIsUrlPathAlreadyBuilt()) 
		{
			baseUri.append(this.buildQueryString());
		}
		
		try 
		{
			return new URI(baseUri.toString());
		} 
		catch (URISyntaxException e) 
		{
			throw new IllegalArgumentException("Error when trying to form the request URI");
		}
	}

	/**
	 * Builds the query string part of the REST API URL.
	 *
	 * @return The query string.
	 */
	private String buildQueryString() 
	{
		StringBuilder queryStringBuilder = new StringBuilder();
	
		if (!this.getUriParameters().isEmpty()) 
		{
			queryStringBuilder.append("?");
		}
	
		for (KeyValuePair<String, String> queryParameter : this.getUriParameters()) 
		{
			if (queryStringBuilder.length() > 1) {
				// this is not the first query parameter
				queryStringBuilder.append("&");
			}

			queryStringBuilder.append(
					MessageFormat.format(
						"{0}={1}", 
						queryParameter.getKey(), 
						queryParameter.getValue()));
		}

		return queryStringBuilder.toString();
	}
}