// -----------------------------------------------------------------------
// <copyright file="HttpStatusCode.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.network;

import org.apache.http.HttpResponse;

public class HttpStatusCode
{
	public static final int BADREQUEST = 400;

	public static final int UNAUTHORIZED = 401;

	public static final int FORBIDDEN = 403;

	public static final int NOTFOUND = 404;

	public static final int CONFLICT = 409;

	public static final int SERVICEUNAVAILABLE = 503;

	public static final int EXPECTATIONFAILED = 417;

	public static boolean isSuccesful(HttpResponse request) {
		return request.getStatusLine().getStatusCode() < 400;
	}
}