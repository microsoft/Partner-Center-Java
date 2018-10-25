package com.microsoft.store.partnercenter.models.query.sort;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortDirectionTest
{
    private static final String ASCENDING_VALUE = "ascending";
    private static final String DESCENDING_VALUE = "descending";
    private static final String ASCENDING_JSON = '"' + ASCENDING_VALUE + '"';
    private static final String DESCENDING_JSON = '"' + DESCENDING_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(SortDirection.ASCENDING, jsonConverter.readValue(ASCENDING_JSON, SortDirection.class));
        assertEquals(SortDirection.DESCENDING, jsonConverter.readValue(DESCENDING_JSON, SortDirection.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(ASCENDING_JSON, jsonConverter.writeValueAsString(SortDirection.ASCENDING));
        assertEquals(DESCENDING_JSON, jsonConverter.writeValueAsString(SortDirection.DESCENDING));
    }

    @Test
    void convertToString()
    {
        assertEquals(ASCENDING_VALUE, SortDirection.ASCENDING.toString());
        assertEquals(DESCENDING_VALUE, SortDirection.DESCENDING.toString());
    }
}