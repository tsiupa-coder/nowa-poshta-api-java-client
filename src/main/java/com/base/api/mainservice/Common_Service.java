package com.base.api.mainservice;

import com.base.api.model.common.SimplePack;
import com.base.api.model.common.SimpleTimeInterval;
import com.base.api.request.Pagination;
import com.base.api.response.info.common.GetCargoDescriptionList;
import com.base.api.response.info.common.GetCargoTypes;
import com.base.api.response.info.common.GetMessageCodeText;
import com.base.api.response.info.common.GetOwnershipFormsList;
import com.base.api.response.info.common.GetPackList;
import com.base.api.response.info.common.GetPalletsList;
import com.base.api.response.info.common.GetServiceTypes;
import com.base.api.response.info.common.GetTimeIntervals;
import com.base.api.response.info.common.GetTiresWheelsList;
import com.base.api.response.info.common.GetTypesOfPayersForRedelivery;
import com.google.gson.JsonObject;

import java.io.IOException;

import static com.base.api.model.StringConstants.COMMON;
import static com.base.api.model.StringConstants.FIND_BY_STRING;
import static com.base.api.model.StringConstants.GET_BACKWARD_DELIVERY_CARGO_TYPES;
import static com.base.api.model.StringConstants.GET_CARGO_DESCRIPTION_LIST;
import static com.base.api.model.StringConstants.GET_CARGO_TYPES;
import static com.base.api.model.StringConstants.GET_MESSAGE_CODE_TEXT;
import static com.base.api.model.StringConstants.GET_OWNERSHIP_FORMS_LIST;
import static com.base.api.model.StringConstants.GET_PACK_LIST;
import static com.base.api.model.StringConstants.GET_PALLETS_LIST;
import static com.base.api.model.StringConstants.GET_SERVICE_TYPES;
import static com.base.api.model.StringConstants.GET_TIME_INTERVALS;
import static com.base.api.model.StringConstants.GET_TIRES_WHEELS_LIST;
import static com.base.api.model.StringConstants.GET_TYPES_OF_PAYERS_FOR_REDELIVERY;
import static com.base.api.model.StringConstants.PAGE;

public class Common_Service extends Service {

    // TODO: 08.05.22 need testing
    public GetTimeIntervals getTimeIntervals(SimpleTimeInterval timeInterval, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(timeInterval, api_key, COMMON, GET_TIME_INTERVALS);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetTimeIntervals());
    }


    // TODO: 08.05.22 need testing
    public GetCargoTypes getCargoTypes(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, COMMON, GET_CARGO_TYPES);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetCargoTypes());
    }

    // TODO: 08.05.22 need testing
    public GetCargoTypes getBackwardDeliveryCargoTypes(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, COMMON, GET_BACKWARD_DELIVERY_CARGO_TYPES);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetCargoTypes());
    }

    // TODO: 08.05.22 need testing
    public GetPalletsList getPalletsList(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, COMMON, GET_PALLETS_LIST);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetPalletsList());
    }

    // TODO: 08.05.22 need testing
    public GetTypesOfPayersForRedelivery getTypesOfPayersForRedelivery(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, COMMON, GET_TYPES_OF_PAYERS_FOR_REDELIVERY);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetTypesOfPayersForRedelivery());
    }

    // TODO: 08.05.22 need testing
    public GetPackList getPackList(SimplePack pack, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, COMMON, GET_PACK_LIST);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetPackList());
    }

    // TODO: 08.05.22 need testing
    public GetTiresWheelsList getTiresWheelsList(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, COMMON, GET_TIRES_WHEELS_LIST);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetTiresWheelsList());
    }

    // TODO: 08.05.22 need testing
    public GetCargoDescriptionList getCargoDescriptionList(String findByString, Pagination pagination, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty(FIND_BY_STRING, findByString);
        jsonObjectIn.addProperty(PAGE, pagination.getPage());

        JsonObject jsonObject = jsonService.toObject(api_key, COMMON, GET_CARGO_DESCRIPTION_LIST, jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetCargoDescriptionList());
    }

    // TODO: 08.05.22 need testing
    public GetMessageCodeText getMessageCodeText(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, COMMON, GET_MESSAGE_CODE_TEXT);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetMessageCodeText());
    }


    // TODO: 08.05.22 need testing
    public GetServiceTypes getServiceTypes(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, COMMON, GET_SERVICE_TYPES);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetServiceTypes());
    }

    // TODO: 08.05.22 need testing
    public GetOwnershipFormsList getOwnershipFormsList(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, COMMON, GET_OWNERSHIP_FORMS_LIST);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetOwnershipFormsList());

    }
}



