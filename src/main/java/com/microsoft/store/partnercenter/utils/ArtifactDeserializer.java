// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.microsoft.store.partnercenter.models.entitlements.Artifact;
import com.microsoft.store.partnercenter.models.entitlements.ReservedInstanceArtifact;

public class ArtifactDeserializer
    extends StdDeserializer<Artifact>
{
    private static final long serialVersionUID = 2L;

    public ArtifactDeserializer() 
    { 
        this(null); 
    } 
 
    public ArtifactDeserializer(Class<?> vc)
    { 
        super(vc); 
    }

    @Override
    public Artifact deserialize(JsonParser parser, DeserializationContext ctxt) 
      throws IOException, JsonProcessingException 
    {
        JsonNode node = parser.readValueAsTree();
        ObjectMapper mapper = (ObjectMapper)parser.getCodec();
        ObjectReader reader = null; 
        Object target = null;
        String artifcatType = node.get("artifactType").asText();

        System.out.println(artifcatType);

        if(artifcatType.equalsIgnoreCase("reservedinstance"))
        {
            reader = mapper.readerFor(ReservedInstanceArtifact.class);
        }
        else 
        {
            reader = mapper.readerFor(Artifact.class);
        }

        target = reader.readValue(node);

        return (Artifact)target;
    }
}