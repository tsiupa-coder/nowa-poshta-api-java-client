package com.base.api;

import com.base.api.model.counterparty.SimpleCounterparty;
import com.base.api.response.counterparty.CreateCounterparty;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class CounterpartyService {

    private HTTP_Service service;

    private static final String URL = "https://api.novaposhta.ua/v2.0/json/";

    public CounterpartyService() {
        service = new HTTP_Service();
    }


    public CreateCounterparty createCounterparty(SimpleCounterparty counterparty, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Counterparty");
        jsonObject.addProperty("calledMethod", "save");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(counterparty);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new CreateCounterparty());


    }
}
