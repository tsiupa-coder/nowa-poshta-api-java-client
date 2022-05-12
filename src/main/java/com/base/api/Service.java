package com.base.api;

import com.google.gson.JsonObject;

public class Service {

    protected HTTP_Service service;

    protected static final String URL = "https://api.novaposhta.ua/v2.0/json/";

    public Service() {
        service = new HTTP_Service();
    }


}
