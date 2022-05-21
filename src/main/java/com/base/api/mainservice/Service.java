package com.base.api.mainservice;

public class Service {

    public HTTP_Service service;
    public JsonService jsonService;

    protected static final String URL = "https://api.novaposhta.ua/v2.0/json/";

    public Service() {

        service = new HTTP_Service();
        jsonService = new JsonService();
    }


}
