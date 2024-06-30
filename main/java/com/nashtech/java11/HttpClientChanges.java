package com.nashtech.java11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientChanges {

    public static void main(String[] args) {
        final String url = "https://www.google.com/";
        final HttpClient httpclient = HttpClient.newHttpClient();
        try {
            final HttpRequest httpRequest = HttpRequest.newBuilder(new URI(url)).GET().build();
            final HttpResponse httpResponse = httpclient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println("Request: " + httpRequest);
            System.out.println("Response from server: \n" + httpResponse.body());
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

}
