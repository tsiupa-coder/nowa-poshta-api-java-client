package com.base.api;

import com.base.api.model.scansheet.SimpleInsertDocument;
import com.base.api.model.scansheet.SimpleScanSheet;
import com.base.api.response.info.counterparty.updata.UpdateCounterparty;
import com.base.api.response.info.scansheet.DeleteScanSheet;
import com.base.api.response.info.scansheet.GetScanSheet;
import com.base.api.response.info.scansheet.GetScanSheetList;
import com.base.api.response.info.scansheet.InsertDocuments;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.ArrayList;

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

    public InsertDocuments insertDocuments(SimpleInsertDocument simpleInsertDocument, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "ScanSheet");
        jsonObject.addProperty("calledMethod", "insertDocuments");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(simpleInsertDocument);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new InsertDocuments());
    }

    public GetScanSheetList getScanSheetList(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "ScanSheet");
        jsonObject.addProperty("calledMethod", "getScanSheetList");

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new GetScanSheetList());
    }

    public DeleteScanSheet deleteScanSheet(ArrayList<String> refs, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "ScanSheet");
        jsonObject.addProperty("calledMethod", "deleteScanSheet");

        JsonObject jsonObjectIn = new JsonObject();
        JsonArray jsonArray = (JsonArray) new Gson().toJsonTree(refs);
        jsonObjectIn.add("ScanSheetRefs", jsonArray);
        jsonObject.add("methodProperties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new DeleteScanSheet());
    }
}
