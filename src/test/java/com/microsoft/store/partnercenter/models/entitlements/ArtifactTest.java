// -----------------------------------------------------------------------
// <copyright file="ArtifactTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Artifcat class.
 */
public class ArtifactTest 
{
    private Artifact artifact;

    /**
     * Create the Agreement instance before each test.
     */
    @BeforeEach
    void setup()
    {
        artifact = new Artifact();
    }

    /**
     * Unit test for the getArtifactType and setArtifactType methods.
     */
    @Test
    public void testGetAndSetArtifcatType()
    {
        artifact.setArtifactType("productKey");
        assertEquals("productKey", artifact.getArtifactType());
    }

    /**
     * Unit test for the getDynamicAttributes and setDynamicAttributes methods.
     */
    @Test
    public void testGetAndSetDyanmicAttributes()
    {
        Map<String, Object> dynamicAttributes = new HashMap<String, Object>();

        dynamicAttributes.put("reservationType", "virtualmachines");

        artifact.setDynamicAttributes(dynamicAttributes);
        dynamicAttributes = artifact.getDynamicAttributes(); 

        assertEquals(dynamicAttributes.get("reservationType"), "virtualmachines");
    }
}