package com.base.api;

public class Service {

    protected HTTP_Service service;
    protected JsonService jsonService;

    protected static final String URL = "https://api.novaposhta.ua/v2.0/json/";

    public Service() {
        service = new HTTP_Service();
    }


}
