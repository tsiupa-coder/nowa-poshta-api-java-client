package com.base.api.mainservice;

import com.base.api.model.additionalservice.ChangeDate;
import com.base.api.model.additionalservice.ListRequest;
import com.base.api.response.info.additionalservice.AdditionalServiceSave;
import com.base.api.response.info.additionalservice.CheckPossibilityChangeEW;
import com.base.api.response.info.additionalservice.CheckPossibilityCreateReturn;
import com.base.api.response.info.additionalservice.CheckPossibilityForRedirecting;
import com.base.api.response.info.additionalservice.DeleteAdditionalService;
import com.base.api.response.info.additionalservice.GetChangeEWOrdersList;
import com.base.api.response.info.additionalservice.GetRedirectionOrdersList;
import com.base.api.response.info.additionalservice.GetReturnOrdersList;
import com.base.api.response.info.additionalservice.GetReturnReasons;
import com.base.api.response.info.additionalservice.GetReturnReasonsSubtypes;
import com.base.api.response.info.address.department.GetDepartment;
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

public class AdditionalSaveService extends Service {


    public AdditionalServiceSave additionalServiceSave(ChangeDate changeDate, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(changeDate, api_key, "AdditionalService", "save");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new AdditionalServiceSave());

    }

}
