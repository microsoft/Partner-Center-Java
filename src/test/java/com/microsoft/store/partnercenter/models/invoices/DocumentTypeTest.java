// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DocumentTypeTest
{
    private static final String NONE_VALUE = "none";
    private static final String INVOICE_VALUE = "invoice";
    private static final String VOID_NOTE_VALUE = "void_note";
    private static final String ADJUSTMENT_NOTE_VALUE = "adjustment_note";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String INVOICE_JSON = '"' + INVOICE_VALUE + '"';
    private static final String VOID_NOTE_JSON = '"' + VOID_NOTE_VALUE + '"';
    private static final String ADJUSTMENT_NOTE_JSON = '"' + ADJUSTMENT_NOTE_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(DocumentType.NONE, jsonConverter.readValue(NONE_JSON, DocumentType.class));
        assertEquals(DocumentType.INVOICE, jsonConverter.readValue(INVOICE_JSON, DocumentType.class));
        assertEquals(DocumentType.VOID_NOTE, jsonConverter.readValue(VOID_NOTE_JSON, DocumentType.class));
        assertEquals(DocumentType.ADJUSTMENT_NOTE, jsonConverter.readValue(ADJUSTMENT_NOTE_JSON, DocumentType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(DocumentType.NONE));
        assertEquals(INVOICE_JSON, jsonConverter.writeValueAsString(DocumentType.INVOICE));
        assertEquals(VOID_NOTE_JSON, jsonConverter.writeValueAsString(DocumentType.VOID_NOTE));
        assertEquals(ADJUSTMENT_NOTE_JSON, jsonConverter.writeValueAsString(DocumentType.ADJUSTMENT_NOTE));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, DocumentType.NONE.toString());
        assertEquals(INVOICE_VALUE, DocumentType.INVOICE.toString());
        assertEquals(VOID_NOTE_VALUE, DocumentType.VOID_NOTE.toString());
        assertEquals(ADJUSTMENT_NOTE_VALUE, DocumentType.ADJUSTMENT_NOTE.toString());
    }
}