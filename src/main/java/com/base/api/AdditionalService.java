package com.base.api;

import com.base.api.response.info.additionalservice.CheckPossibilityCreateReturn;
import com.base.api.response.info.additionalservice.GetReturnReasons;
import com.base.api.response.info.additionalservice.GetReturnReasonsSubtypes;
import com.google.gson.JsonObject;

import java.io.IOException;

public class AdditionalService extends Service{


    public CheckPossibilityCreateReturn checkPossibilityCreateReturn(String number, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("Number", number);

        JsonObject jsonObject = jsonService.toObject(api_key, "AdditionalService", "CheckPossibilityCreateReturn", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new CheckPossibilityCreateReturn());
    }


    public GetReturnReasons getReturnReasons(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, "AdditionalService", "getReturnReasons");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetReturnReasons());

    }

    public GetReturnReasonsSubtypes getReturnReasonsSubtypes(String reasonRef, String api_key) throws IOException {

        JsonObject jsonObjectin = new JsonObject();
        jsonObjectin.addProperty("ReasonRef", reasonRef);

        JsonObject wrapper = jsonService.toObject(api_key, "AdditionalService", "getReturnReasonsSubtypes", jsonObjectin);

        return service
                .postRequest(URL, wrapper)
                .getResponse(new GetReturnReasonsSubtypes());
    }
}
