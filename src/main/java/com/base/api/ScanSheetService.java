package com.base.api;

import com.base.api.model.scansheet.SimpleScanSheet;
import com.base.api.response.info.counterparty.updata.UpdateCounterparty;
import com.base.api.response.info.scansheet.GetScanSheet;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class ScanSheetService extends Service{


    public GetScanSheet getScanSheet(SimpleScanSheet scanSheet, String api_key) throws IOException {


        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "ScanSheet");
        jsonObject.addProperty("calledMethod", "getScanSheet");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(scanSheet);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new GetScanSheet());
    }
}
