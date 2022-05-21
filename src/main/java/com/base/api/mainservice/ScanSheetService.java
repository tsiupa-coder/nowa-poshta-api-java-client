package com.base.api.mainservice;

import com.base.api.model.scansheet.SimpleInsertDocument;
import com.base.api.model.scansheet.SimpleScanSheet;
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

import static com.base.api.model.StringConstants.DELETE_SCAN_SHEET;
import static com.base.api.model.StringConstants.DOCUMENT_REFS;
import static com.base.api.model.StringConstants.GET_SCAN_SHEET;
import static com.base.api.model.StringConstants.GET_SCAN_SHEET_LIST;
import static com.base.api.model.StringConstants.INSERT_DOCUMENTS;
import static com.base.api.model.StringConstants.REF;
import static com.base.api.model.StringConstants.REMOVE_DOCUMENTS;
import static com.base.api.model.StringConstants.SCAN_SHEET;
import static com.base.api.model.StringConstants.SCAN_SHEET_REFS;

public class ScanSheetService extends Service {

    public GetScanSheet getScanSheet(SimpleScanSheet scanSheet, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(scanSheet, api_key, SCAN_SHEET, GET_SCAN_SHEET);

        return service.postRequest(URL, jsonObject).getResponse(new GetScanSheet());
    }

    public InsertDocuments insertDocuments(SimpleInsertDocument simpleInsertDocument, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(simpleInsertDocument, api_key, SCAN_SHEET, INSERT_DOCUMENTS);

        return service.postRequest(URL, jsonObject).getResponse(new InsertDocuments());
    }

    public GetScanSheetList getScanSheetList(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, SCAN_SHEET, GET_SCAN_SHEET_LIST);


        return service.postRequest(URL, jsonObject).getResponse(new GetScanSheetList());
    }

    public DeleteScanSheet deleteScanSheet(ArrayList<String> scanSheetRefs, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        JsonArray jsonArray = (JsonArray) new Gson().toJsonTree(scanSheetRefs);
        jsonObjectIn.add(SCAN_SHEET_REFS, jsonArray);

        JsonObject jsonObject = jsonService.toObject(api_key, SCAN_SHEET, DELETE_SCAN_SHEET, jsonObjectIn);
        return service.postRequest(URL, jsonObject).getResponse(new DeleteScanSheet());
    }

    public RemoveDocuments removeDocuments(ArrayList<String> documentRefs, String ref, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        JsonArray jsonArray = (JsonArray) new Gson().toJsonTree(documentRefs);
        jsonObjectIn.add(DOCUMENT_REFS, jsonArray);
        jsonObjectIn.addProperty(REF, ref);

        JsonObject jsonObject = jsonService.toObject(api_key, SCAN_SHEET, REMOVE_DOCUMENTS, jsonObjectIn);
        return service.postRequest(URL, jsonObject).getResponse(new RemoveDocuments());
    }
}
