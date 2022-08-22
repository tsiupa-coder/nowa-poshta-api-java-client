package com.base.api.mainservice;

import com.base.api.model.additionalservice.ListRequest;
import com.base.api.response.info.additionalservice.CheckPossibilityChangeEW;
import com.base.api.response.info.additionalservice.CheckPossibilityCreateReturn;
import com.base.api.response.info.additionalservice.CheckPossibilityForRedirecting;
import com.base.api.response.info.additionalservice.DeleteAdditionalService;
import com.base.api.response.info.additionalservice.GetChangeEWOrdersList;
import com.base.api.response.info.additionalservice.GetRedirectionOrdersList;
import com.base.api.response.info.additionalservice.GetReturnOrdersList;
import com.base.api.response.info.additionalservice.GetReturnReasons;
import com.base.api.response.info.additionalservice.GetReturnReasonsSubtypes;
import com.google.gson.JsonObject;

import java.io.IOException;

import static com.base.api.model.StringConstants.ADDITIONAL_SERVICE;
import static com.base.api.model.StringConstants.ADDITIONAL_SERVICE_GENERAL;
import static com.base.api.model.StringConstants.CHECK_POSSIBILITY_CHANGE_EW;
import static com.base.api.model.StringConstants.CHECK_POSSIBILITY_CREATE_RETURN;
import static com.base.api.model.StringConstants.CHECK_POSSIBILITY_FOR_REDIRECTING;
import static com.base.api.model.StringConstants.DELETE;
import static com.base.api.model.StringConstants.GET_CHANGE_EW_ORDERS_LIST;
import static com.base.api.model.StringConstants.GET_REDIRECTION_ORDERS_LIST;
import static com.base.api.model.StringConstants.GET_RETURN_ORDERS_LIST;
import static com.base.api.model.StringConstants.GET_RETURN_REASONS;
import static com.base.api.model.StringConstants.GET_RETURN_REASONS_SUBTYPES;
import static com.base.api.model.StringConstants.INT_DOC_NUMBER;
import static com.base.api.model.StringConstants.NUMBER;
import static com.base.api.model.StringConstants.REASON_REF;
import static com.base.api.model.StringConstants.REF;

public class AdditionalService extends Service {

    public CheckPossibilityCreateReturn checkPossibilityCreateReturn(String number, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty(NUMBER, number);

        JsonObject jsonObject = jsonService.toObject(api_key, ADDITIONAL_SERVICE, CHECK_POSSIBILITY_CREATE_RETURN, jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new CheckPossibilityCreateReturn());
    }


    public GetReturnReasons getReturnReasons(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, ADDITIONAL_SERVICE, GET_RETURN_REASONS);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetReturnReasons());

    }

    public GetReturnReasonsSubtypes getReturnReasonsSubtypes(String reasonRef, String api_key) throws IOException {

        JsonObject jsonObjectin = new JsonObject();
        jsonObjectin.addProperty(REASON_REF, reasonRef);

        JsonObject wrapper = jsonService.toObject(api_key, ADDITIONAL_SERVICE, GET_RETURN_REASONS_SUBTYPES, jsonObjectin);

        return service
                .postRequest(URL, wrapper)
                .getResponse(new GetReturnReasonsSubtypes());
    }

    public GetReturnOrdersList getReturnOrdersList(ListRequest request, String api_key) throws IOException {

        JsonObject wrapper = jsonService.toObject(request, api_key, ADDITIONAL_SERVICE, GET_RETURN_ORDERS_LIST);

        return service
                .postRequest(URL, wrapper)
                .getResponse(new GetReturnOrdersList());

    }

    public DeleteAdditionalService deleteAdditionalService(String ref, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(REF, ref);

        JsonObject wrapper = jsonService.toObject(api_key, ADDITIONAL_SERVICE, DELETE, jsonObject);

        return service
                .postRequest(URL, wrapper)
                .getResponse(new DeleteAdditionalService());
    }

    public CheckPossibilityChangeEW checkPossibilityChangeEW(String intDocNumber, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(INT_DOC_NUMBER, intDocNumber);

        JsonObject wrapper = jsonService.toObject(api_key, ADDITIONAL_SERVICE, CHECK_POSSIBILITY_CHANGE_EW, jsonObject);

        return service
                .postRequest(URL, wrapper)
                .getResponse(new CheckPossibilityChangeEW());
    }

    public GetChangeEWOrdersList getChangeEWOrdersList(ListRequest request, String api_key) throws IOException {

        JsonObject wrapper = jsonService.toObject(request, api_key, ADDITIONAL_SERVICE, GET_CHANGE_EW_ORDERS_LIST);

        return service
                .postRequest(URL, wrapper)
                .getResponse(new GetChangeEWOrdersList());
    }

    public CheckPossibilityForRedirecting checkPossibilityForRedirecting(String number, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(NUMBER, number);
        // or AdditionalService
        JsonObject wrapper = jsonService.toObject(api_key, ADDITIONAL_SERVICE_GENERAL, CHECK_POSSIBILITY_FOR_REDIRECTING, jsonObject);

        return service
                .postRequest(URL, wrapper)
                .getResponse(new CheckPossibilityForRedirecting());
    }

    public GetRedirectionOrdersList getRedirectionOrdersList(ListRequest request, String api_key) throws IOException {

        JsonObject wrapper = jsonService.toObject(request, api_key, ADDITIONAL_SERVICE, GET_REDIRECTION_ORDERS_LIST);

        return service
                .postRequest(URL, wrapper)
                .getResponse(new GetRedirectionOrdersList());
    }
}
