package com.microsoft.store.partnercenter.models.carts;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CartErrorTest
{
    private static final String ERROR_TEMPLATE = "{\n" +
            "  \"attributes\": {\n" +
            "    \"objectType\": \"CartError\"\n" +
            "  },\n" +
            "  \"errorCode\": %d,\n" +
            "  \"errorDescription\": \"%s\"\n" +
            "}";

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        final String errorDescription = "Some error has happened.";
        for (final CartErrorCode code : CartErrorCode.values())
        {
            final String json = String.format(ERROR_TEMPLATE, code.intValue(), errorDescription);
            final CartError error = jsonConverter.readValue(json, CartError.class);

            assertEquals(code, error.getErrorCode());
            assertEquals(errorDescription, error.getErrorDescription());
        }
    }

    @Test
    void writeToJson() throws IOException
    {
        final String errorDescription = "Another error has happened.";
        for (final CartErrorCode code : CartErrorCode.values())
        {
            final CartError error = new CartError();
            error.setErrorCode(code);
            error.setErrorDescription(errorDescription);

            final String actual = jsonConverter.writeValueAsString(error);

            assertTrue(actual.contains(String.format("\"errorCode\":%d", code.intValue())));
            assertTrue(actual.contains(String.format("\"errorDescription\":\"%s\"", errorDescription)));
        }
    }
}