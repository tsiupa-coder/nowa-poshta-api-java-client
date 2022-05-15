package com.base.api;

import com.base.api.model.scansheet.SimpleInsertDocument;
import com.base.api.model.scansheet.SimpleScanSheet;
import com.base.api.response.info.counterparty.updata.UpdateCounterparty;
import com.base.api.response.info.scansheet.DeleteScanSheet;
import com.base.api.response.info.scansheet.GetScanSheet;
import com.base.api.response.info.scansheet.GetScanSheetList;
import com.base.api.response.info.scansheet.InsertDocuments;
import com.base.api.response.info.scansheet.RemoveDocuments;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.ArrayList;

public class ScanSheetService extends Service{


    public GetScanSheet getScanSheet(SimpleScanSheet scanSheet, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(scanSheet, api_key, "ScanSheet", "getScanSheet");

        return service.postRequest(URL, jsonObject).getResponse(new GetScanSheet());
    }

    public InsertDocuments insertDocuments(SimpleInsertDocument simpleInsertDocument, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(simpleInsertDocument, api_key, "ScanSheet", "insertDocuments");

        return service.postRequest(URL, jsonObject).getResponse(new InsertDocuments());
    }

    public GetScanSheetList getScanSheetList(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, "ScanSheet",  "getScanSheetList");


        return service.postRequest(URL, jsonObject).getResponse(new GetScanSheetList());
    }

    public DeleteScanSheet deleteScanSheet(ArrayList<String> scanSheetRefs, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        JsonArray jsonArray = (JsonArray) new Gson().toJsonTree(scanSheetRefs);
        jsonObjectIn.add("ScanSheetRefs", jsonArray);

        JsonObject jsonObject = jsonService.toObject(api_key, "ScanSheet", "deleteScanSheet", jsonObjectIn);
        return service.postRequest(URL, jsonObject).getResponse(new DeleteScanSheet());
    }

    public RemoveDocuments removeDocuments(ArrayList<String> documentRefs, String ref, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        JsonArray jsonArray = (JsonArray) new Gson().toJsonTree(documentRefs);
        jsonObjectIn.add("DocumentRefs", jsonArray);
        jsonObjectIn.addProperty("Ref", ref);

        JsonObject jsonObject = jsonService.toObject(api_key, "ScanSheet", "removeDocuments", jsonObjectIn);
        return service.postRequest(URL, jsonObject).getResponse(new RemoveDocuments());
    }
}
