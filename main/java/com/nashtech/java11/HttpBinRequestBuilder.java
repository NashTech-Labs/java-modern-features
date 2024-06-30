package com.nashtech.java11;

import java.net.URI;
import java.net.http.HttpRequest;

public class HttpBinRequestBuilder {
	public static HttpRequest createGetRequest() {

		return HttpRequest.newBuilder()
				.GET()
				.uri(URI.create("http://httpbin.org/get"))
				.header("Accept-Language", "en-US,en;q=0.5")
				.build();
	}
}
