package com.base.api;

import com.base.api.model.addresses.address.SimpleAddress;
import com.base.api.model.common.SimpleTimeInterval;
import com.base.api.response.common.GetCargoTypes;
import com.base.api.response.common.GetTimeIntervals;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class Common_Service {
    private HTTP_Service http_helper;

    public Common_Service() {
        http_helper = new HTTP_Service();
    }

    private static final String URL = "https://api.novaposhta.ua/v2.0/json/";

    // TODO: 08.05.22 need testing
    public GetTimeIntervals getTimeIntervals(SimpleTimeInterval timeInterval, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getTimeIntervals");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(timeInterval);

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper
                .postRequest(URL, jsonObject)
                .getResponse(new GetTimeIntervals());
    }


    public GetCargoTypes getCargoTypes( String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getCargoTypes");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper
                .postRequest(URL, jsonObject)
                .getResponse(new GetCargoTypes());

    }
}
