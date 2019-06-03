// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.microsoft.store.partnercenter.logging.PartnerLog;

public class UriDeserializer 
	extends JsonDeserializer<URI>
{
	@Override
	public URI deserialize(JsonParser parser, DeserializationContext context)
			throws IOException, JsonProcessingException
	{
		JsonToken currentToken = parser.getCurrentToken();
		if (currentToken.equals(JsonToken.VALUE_STRING))
		{
			String linkUri = parser.getText().trim();

	        try
	        {
				return new URI (linkUri);
			}
	        catch (URISyntaxException e)
	        {
				PartnerLog.getInstance().logError(e.toString());
			}
		}
		else if(currentToken.equals(JsonToken.VALUE_NULL))
		{
			return null;
		}
		
		context.handleUnexpectedToken(URI.class, parser); 
		throw JsonMappingException.from(parser, null);
	}
}