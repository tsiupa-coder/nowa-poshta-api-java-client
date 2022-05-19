package com.base.api;

import com.base.api.response.info.additionalservice.CheckPossibilityCreateReturn;
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
}
