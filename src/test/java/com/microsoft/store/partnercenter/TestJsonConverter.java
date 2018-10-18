package com.microsoft.store.partnercenter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItem;
import com.microsoft.store.partnercenter.utils.InvoiceLineItemDeserializer;
import com.microsoft.store.partnercenter.utils.UriDeserializer;

import java.net.URI;
import java.text.SimpleDateFormat;

public class TestJsonConverter
{
    /**
     * Private constructor prevents from being inadvertently instantiated.
     */
    private TestJsonConverter()
    {
    }

    /**
     * The methods creates a test JSON converter matching the converter created in PartnerServiceProxy class
     */
    public static ObjectMapper create()
    {
        final ObjectMapper jsonConverter;

        jsonConverter = new ObjectMapper();
        jsonConverter.registerModule(new JodaModule());
        jsonConverter.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        jsonConverter.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        jsonConverter.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        jsonConverter.registerModule(
                new SimpleModule().addDeserializer(InvoiceLineItem.class, new InvoiceLineItemDeserializer()));
        jsonConverter.registerModule(new SimpleModule().addDeserializer(URI.class, new UriDeserializer()));
        jsonConverter.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        return jsonConverter;
    }
}
