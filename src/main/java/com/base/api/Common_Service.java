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

        JsonObject jsonObject = jsonService.toObject(timeInterval, api_key, "Common", "getTimeIntervals");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetTimeIntervals());
    }


    // TODO: 08.05.22 need testing
    public GetCargoTypes getCargoTypes(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, "Common", "getCargoTypes");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetCargoTypes());
    }

    // TODO: 08.05.22 need testing
    public GetCargoTypes getBackwardDeliveryCargoTypes(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, "Common", "getBackwardDeliveryCargoTypes");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetCargoTypes());
    }

    // TODO: 08.05.22 need testing
    public GetPalletsList getPalletsList(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, "Common", "getPalletsList");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetPalletsList());
    }

    // TODO: 08.05.22 need testing
    public GetTypesOfPayersForRedelivery getTypesOfPayersForRedelivery(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, "Common", "getTypesOfPayersForRedelivery");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetTypesOfPayersForRedelivery());
    }

    // TODO: 08.05.22 need testing
    public GetPackList getPackList(SimplePack pack, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, "Common", "getPackList");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetPackList());
    }

    // TODO: 08.05.22 need testing
    public GetTiresWheelsList getTiresWheelsList(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, "Common", "getTiresWheelsList");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetTiresWheelsList());
    }

    // TODO: 08.05.22 need testing
    public GetCargoDescriptionList getCargoDescriptionList(String findByString, Pagination pagination, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("FindByString", findByString);
        jsonObjectIn.addProperty("Page", pagination.getPage());

        JsonObject jsonObject = jsonService.toObject(api_key, "Common", "getCargoDescriptionList", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetCargoDescriptionList());
    }

    // TODO: 08.05.22 need testing
    public GetMessageCodeText getMessageCodeText(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, "Common", "getMessageCodeText");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetMessageCodeText());
    }


    // TODO: 08.05.22 need testing
    public GetServiceTypes getServiceTypes(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, "Common", "getServiceTypes");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetServiceTypes());
    }

    // TODO: 08.05.22 need testing
    public GetOwnershipFormsList getOwnershipFormsList(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, "Common", "getOwnershipFormsList");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetOwnershipFormsList());

    }
}



