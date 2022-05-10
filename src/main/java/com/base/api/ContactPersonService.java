package com.base.api;

import com.base.api.model.contact.SimpleContactPerson;
import com.base.api.response.common.GetTimeIntervals;
import com.base.api.response.tracking.CreateContactPerson;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class ContactPersonService {

    private HTTP_Service http_helper;

    public ContactPersonService() {
        http_helper = new HTTP_Service();
    }

    private static final String URL = "https://api.novaposhta.ua/v2.0/json/";

    public CreateContactPerson create(SimpleContactPerson person, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "ContactPerson");
        jsonObject.addProperty("calledMethod", "save");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(person);

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper
                .postRequest(URL, jsonObject)
                .getResponse(new CreateContactPerson());

    }
}
