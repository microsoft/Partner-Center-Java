// -----------------------------------------------------------------------
// <copyright file="IPartnerServiceClient.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.network;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.IPartner;

public interface IPartnerServiceClient 
{
    /**
     * Executes a GET operation against the partner service. 
     * 
     * @param rootPartnerOperations An instance of the partner operations.
     * @param responseType The type of object to be returned.
     * @param relativeUri The relative address of the request. 
     */
    <T> T get(IPartner rootPartnerOperations, TypeReference<T> responseType, String relativeUri);

    /**
     * Executes a PATCH operation against the partner service.
     * 
     * @param rootPartnerOperations An instance of the partner operations.
     * @param responseType The type of object to be returned.
     * @param relativeUri The relative address of the request. 
     * @param content The content for the body of the request.
     */
    <T, U> U patch(IPartner rootPartnerOperations, TypeReference<U> responseType, String relativeUri, T content);

    /**
     * Executes a POST operation against the partner service. 
     * 
     * @param rootPartnerOperations An instance of the partner operations. 
     * @param responseType The type of object to be returned.
     * @param relativeUri The relative address fo the request.
     * @param content The conent for the body of the request.
     */
    <T, U> U post(IPartner rootPartnerOperations, TypeReference<U> responseType, String relativeUri, T content);
}