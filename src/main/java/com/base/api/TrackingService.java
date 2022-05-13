package com.base.api;

import com.base.api.model.tracking.SimpleDocumentTracking;
import com.base.api.response.info.tracking.GetStatusDocuments;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class TrackingService extends Service {


    // TODO: 09.05.22 need testing
    public GetStatusDocuments getStatusDocuments(SimpleDocumentTracking simpleDocument, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "TrackingDocument");
        jsonObject.addProperty("calledMethod", "getStatusDocuments");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(simpleDocument);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetStatusDocuments());


    }
}
