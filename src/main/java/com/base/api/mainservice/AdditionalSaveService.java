package com.base.api.mainservice;

import com.base.api.model.additionalservice.ChangeDate;
import com.base.api.response.info.additionalservice.AdditionalServiceSave;
import com.google.gson.JsonObject;

import java.io.IOException;

public class AdditionalSaveService extends Service {


    public AdditionalServiceSave additionalServiceSave(ChangeDate changeDate, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(changeDate, api_key, "AdditionalService", "save");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new AdditionalServiceSave());

    }
}
