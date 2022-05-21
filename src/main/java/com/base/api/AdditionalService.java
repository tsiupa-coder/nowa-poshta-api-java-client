package com.base.api;

import com.base.api.model.additionalservice.ListRequest;
import com.base.api.response.info.additionalservice.CheckPossibilityChangeEW;
import com.base.api.response.info.additionalservice.CheckPossibilityCreateReturn;
import com.base.api.response.info.additionalservice.DeleteAdditionalService;
import com.base.api.response.info.additionalservice.GetChangeEWOrdersList;
import com.base.api.response.info.additionalservice.GetReturnOrdersList;
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

    public GetReturnOrdersList getReturnOrdersList(ListRequest request, String api_key) throws IOException {

        JsonObject  wrapper = jsonService.toObject(request, api_key, "AdditionalService", "getReturnOrdersList");

        return service
                .postRequest(URL, wrapper)
                .getResponse(new GetReturnOrdersList());

    }

    public DeleteAdditionalService deleteAdditionalService(String ref, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("Ref", ref);

        JsonObject wrapper = jsonService.toObject(api_key, "AdditionalService", "delete", jsonObject);

        return service
                .postRequest(URL, wrapper)
                .getResponse(new DeleteAdditionalService());
    }

    public  CheckPossibilityChangeEW checkPossibilityChangeEW (String intDocNumber, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("IntDocNumber", intDocNumber);

        JsonObject wrapper = jsonService.toObject(api_key, "AdditionalService", "CheckPossibilityChangeEW", jsonObject);

        return service
                .postRequest(URL, wrapper)
                .getResponse(new CheckPossibilityChangeEW());
    }

    public GetChangeEWOrdersList getChangeEWOrdersList(ListRequest request, String api_key) throws IOException {

        JsonObject  wrapper = jsonService.toObject(request, api_key, "AdditionalService", "getChangeEWOrdersList");

        return service
                .postRequest(URL, wrapper)
                .getResponse(new GetChangeEWOrdersList());


    }
}
