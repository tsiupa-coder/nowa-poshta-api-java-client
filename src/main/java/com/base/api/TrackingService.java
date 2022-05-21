package com.base.api;

import com.base.api.model.tracking.SimpleDocumentTracking;
import com.base.api.response.info.tracking.GetStatusDocuments;
import com.google.gson.JsonObject;

import java.io.IOException;

import static com.base.api.model.StringConstants.GET_STATUS_DOCUMENTS;
import static com.base.api.model.StringConstants.TRACKING_DOCUMENT;

public class TrackingService extends Service {

    // TODO: 09.05.22 need testing
    public GetStatusDocuments getStatusDocuments(SimpleDocumentTracking simpleDocument, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(simpleDocument, api_key, TRACKING_DOCUMENT, GET_STATUS_DOCUMENTS);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetStatusDocuments());
    }
}
