package com.base.api;

import com.base.api.model.common.SimplePack;
import com.base.api.model.common.SimpleTimeInterval;
import com.base.api.request.Pagination;
import com.base.api.response.common.GetCargoDescriptionList;
import com.base.api.response.common.GetCargoTypes;
import com.base.api.response.common.GetMessageCodeText;
import com.base.api.response.common.GetOwnershipFormsList;
import com.base.api.response.common.GetPackList;
import com.base.api.response.common.GetPalletsList;
import com.base.api.response.common.GetServiceTypes;
import com.base.api.response.common.GetTimeIntervals;
import com.base.api.response.common.GetTiresWheelsList;
import com.base.api.response.common.GetTypesOfPayersForRedelivery;
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


    public GetCargoTypes getCargoTypes(String api_key) throws IOException {

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

    public GetCargoTypes getBackwardDeliveryCargoTypes(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getBackwardDeliveryCargoTypes");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper
                .postRequest(URL, jsonObject)
                .getResponse(new GetCargoTypes());
    }

    public GetPalletsList getPalletsList(String api_key) throws IOException {


        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getPalletsList");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper
                .postRequest(URL, jsonObject)
                .getResponse(new GetPalletsList());
    }

    public GetTypesOfPayersForRedelivery getTypesOfPayersForRedelivery(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getTypesOfPayersForRedelivery");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper
                .postRequest(URL, jsonObject)
                .getResponse(new GetTypesOfPayersForRedelivery());
    }

    public GetPackList getPackList(SimplePack pack, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getPackList");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(pack);

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper
                .postRequest(URL, jsonObject)
                .getResponse(new GetPackList());
    }

    public GetTiresWheelsList getTiresWheelsList(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getTiresWheelsList");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper
                .postRequest(URL, jsonObject)
                .getResponse(new GetTiresWheelsList());
    }

    public GetCargoDescriptionList getCargoDescriptionList(String findByString, Pagination pagination, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getCargoDescriptionList");

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("FindByString", findByString);
        jsonObjectIn.addProperty("Page", pagination.getPage());

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper
                .postRequest(URL, jsonObject)
                .getResponse(new GetCargoDescriptionList());
    }

    public GetMessageCodeText getMessageCodeText(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getMessageCodeText");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper
                .postRequest(URL, jsonObject)
                .getResponse(new GetMessageCodeText());
    }



    public GetServiceTypes getServiceTypes(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getServiceTypes");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper
                .postRequest(URL, jsonObject)
                .getResponse(new GetServiceTypes());
    }

    public GetOwnershipFormsList getOwnershipFormsList(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getOwnershipFormsList");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper
                .postRequest(URL, jsonObject)
                .getResponse(new GetOwnershipFormsList());

    }
}



