// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class NestedResourceDeserializer
    extends StdDeserializer<Map<String, Object>>
{
    private static final long serialVersionUID = 2L;

    public NestedResourceDeserializer() 
    { 
        this(null); 
    } 
 
    public NestedResourceDeserializer(Class<?> vc) 
    { 
        super(vc); 
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> deserialize(JsonParser p, DeserializationContext ctxt)
            throws IOException, JsonProcessingException 
    {
        JsonNode node = p.getCodec().readTree(p);
        ObjectMapper mapper = new ObjectMapper();
        String input = node.asText();

        if(StringHelper.isNullOrEmpty(input))
        {
            return new HashMap<>();
        }
    
        return mapper.readValue(input, Map.class);
    }
}