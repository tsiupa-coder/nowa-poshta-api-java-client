package com.base.api;


import com.base.api.response.address.general.GeneralResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.StatusLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

class HTTP_Service {

    public static final String APPLICATION_JSON = "application/json";
    private static int timeout = 10;

    public GeneralResponse getRequest(String URL) throws IOException {

        try (CloseableHttpClient httpclient = HttpClientBuilder.create()
                .setDefaultRequestConfig(getRequestConfig()).build()) {

            HttpGet request = new HttpGet(URL);
            request.setHeader(HttpHeaders.ACCEPT, APPLICATION_JSON);
            request.setHeader(HttpHeaders.CONTENT_TYPE, APPLICATION_JSON);

            return execute(httpclient, request);
        }
    }

    public GeneralResponse postRequest(String URL, Object o) throws IOException {

        try (CloseableHttpClient httpclient = HttpClientBuilder.create()
                .setDefaultRequestConfig(getRequestConfig()).build()) {

            HttpPost request = new HttpPost(URL);
            request.setHeader(HttpHeaders.ACCEPT, APPLICATION_JSON);
            request.setHeader(HttpHeaders.CONTENT_TYPE, APPLICATION_JSON);

            Gson gson = new GsonBuilder().create();
            String json = gson.toJson(o);
            StringEntity entityJson = new StringEntity(json, ContentType.APPLICATION_JSON);
            request.setEntity(entityJson);
            System.out.println(json);
            return execute(httpclient, request);
        }
    }

    public GeneralResponse deleteRequest(String URL) throws IOException {

        try (CloseableHttpClient httpclient = HttpClientBuilder.create()
                .setDefaultRequestConfig(getRequestConfig()).build()) {

            HttpDelete request = new HttpDelete(URL);
            request.setHeader(HttpHeaders.ACCEPT, APPLICATION_JSON);
            request.setHeader(HttpHeaders.CONTENT_TYPE, APPLICATION_JSON);

            return execute(httpclient, request);
        }
    }

    private GeneralResponse execute(CloseableHttpClient httpclient, HttpRequestBase request) throws IOException {

        GeneralResponse generalResponse = new GeneralResponse();

        try (CloseableHttpResponse response = httpclient.execute(request)) {
            HttpEntity entity = response.getEntity();
            String result;
            if (entity != null) {
                result = EntityUtils.toString(entity);
                generalResponse.setEntity(result);
                System.out.println(result);
            }
            StatusLine statusLine = response.getStatusLine();
            if (statusLine != null) {
                generalResponse.setStatusLine(statusLine.toString());
            }
        }
        return generalResponse;
    }

    private RequestConfig getRequestConfig() {

        RequestConfig config = RequestConfig.custom()
                .setConnectTimeout(timeout * 1000)
                .setConnectionRequestTimeout(timeout * 1000)
                .setSocketTimeout(timeout * 1000).build();

        return config;
    }
}
