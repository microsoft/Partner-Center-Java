// -----------------------------------------------------------------------
// <copyright file="InvoiceSearchFieldTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceSearchFieldTest
{
    private static final String INVOICE_DATE_VALUE = "invoice_date";
    private static final String INVOICE_DATE_JSON = '"' + INVOICE_DATE_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(InvoiceSearchField.INVOICE_DATE, jsonConverter.readValue(INVOICE_DATE_JSON, InvoiceSearchField.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(INVOICE_DATE_JSON, jsonConverter.writeValueAsString(InvoiceSearchField.INVOICE_DATE));
    }

    @Test
    void convertToString()
    {
        assertEquals(INVOICE_DATE_VALUE, InvoiceSearchField.INVOICE_DATE.toString());
    }
}