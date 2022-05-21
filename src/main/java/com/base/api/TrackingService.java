package com.base.api;

import com.base.api.model.tracking.SimpleDocumentTracking;
import com.base.api.response.info.tracking.GetStatusDocuments;
import com.google.gson.JsonObject;

import java.io.IOException;

public class TrackingService extends Service {


    // TODO: 09.05.22 need testing
    public GetStatusDocuments getStatusDocuments(SimpleDocumentTracking simpleDocument, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(simpleDocument, api_key, "TrackingDocument", "getStatusDocuments");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetStatusDocuments());
    }
}
