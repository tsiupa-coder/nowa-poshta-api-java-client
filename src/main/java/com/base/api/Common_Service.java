package com.base.api;

import com.base.api.model.common.SimplePack;
import com.base.api.model.common.SimpleTimeInterval;
import com.base.api.request.Pagination;
import com.base.api.response.info.common.GetCargoDescriptionList;
import com.base.api.response.info.common.GetCargoTypes;
import com.base.api.response.info.common.GetMessageCodeText;
import com.base.api.response.info.common.GetOwnershipFormsList;
import com.base.api.response.info.common.GetPackList;
import com.base.api.response.info.common.GetPalletsList;
import com.base.api.response.info.common.GetServiceTypes;
import com.base.api.response.info.common.GetTimeIntervals;
import com.base.api.response.info.common.GetTiresWheelsList;
import com.base.api.response.info.common.GetTypesOfPayersForRedelivery;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class Common_Service extends Service {

    // TODO: 08.05.22 need testing
    public GetTimeIntervals getTimeIntervals(SimpleTimeInterval timeInterval, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getTimeIntervals");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(timeInterval);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetTimeIntervals());
    }


    // TODO: 08.05.22 need testing
    public GetCargoTypes getCargoTypes(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getCargoTypes");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetCargoTypes());
    }

    // TODO: 08.05.22 need testing
    public GetCargoTypes getBackwardDeliveryCargoTypes(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getBackwardDeliveryCargoTypes");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetCargoTypes());
    }

    // TODO: 08.05.22 need testing
    public GetPalletsList getPalletsList(String api_key) throws IOException {


        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getPalletsList");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetPalletsList());
    }

    // TODO: 08.05.22 need testing
    public GetTypesOfPayersForRedelivery getTypesOfPayersForRedelivery(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getTypesOfPayersForRedelivery");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetTypesOfPayersForRedelivery());
    }

    // TODO: 08.05.22 need testing
    public GetPackList getPackList(SimplePack pack, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getPackList");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(pack);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetPackList());
    }

    // TODO: 08.05.22 need testing
    public GetTiresWheelsList getTiresWheelsList(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getTiresWheelsList");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetTiresWheelsList());
    }

    // TODO: 08.05.22 need testing
    public GetCargoDescriptionList getCargoDescriptionList(String findByString, Pagination pagination, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getCargoDescriptionList");

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("FindByString", findByString);
        jsonObjectIn.addProperty("Page", pagination.getPage());

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetCargoDescriptionList());
    }

    // TODO: 08.05.22 need testing
    public GetMessageCodeText getMessageCodeText(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getMessageCodeText");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetMessageCodeText());
    }


    // TODO: 08.05.22 need testing
    public GetServiceTypes getServiceTypes(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getServiceTypes");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetServiceTypes());
    }

    // TODO: 08.05.22 need testing
    public GetOwnershipFormsList getOwnershipFormsList(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Common");
        jsonObject.addProperty("calledMethod", "getOwnershipFormsList");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetOwnershipFormsList());

    }
}



