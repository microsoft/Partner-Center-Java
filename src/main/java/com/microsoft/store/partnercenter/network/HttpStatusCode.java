// -----------------------------------------------------------------------
// <copyright file="HttpStatusCode.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.network;

import org.apache.http.HttpResponse;

public class HttpStatusCode
{
	public static final int BadRequest = 400;

	public static final int Unauthorized = 401;

	public static final int Forbidden = 403;

	public static final int NotFound = 404;

	public static final int Conflict = 409;

	public static final int ServiceUnavailable = 503;

	public static final int ExpectationFailed = 417;

	public static boolean isSuccesful(HttpResponse request) {
		return request.getStatusLine().getStatusCode() < 400;
	}
}