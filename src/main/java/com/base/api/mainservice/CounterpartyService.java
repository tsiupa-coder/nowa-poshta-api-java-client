package com.base.api.mainservice;

import com.base.api.model.counterparty.update.SimpleCounterparty;
import com.base.api.response.info.counterparty.other.GetCounterparties;
import com.base.api.response.info.counterparty.other.GetCounterpartyAddresses;
import com.base.api.response.info.counterparty.other.GetCounterpartyContactPersons;
import com.base.api.response.info.counterparty.other.GetCounterpartyOptions;
import com.base.api.response.info.counterparty.updata.DeleteCounterparty;
import com.base.api.response.info.counterparty.updata.UpdateCounterparty;
import com.google.gson.JsonObject;

import java.io.IOException;

import static com.base.api.model.StringConstants.COUNTERPARTY;
import static com.base.api.model.StringConstants.COUNTERPARTY_PROPERTY;
import static com.base.api.model.StringConstants.DELETE;
import static com.base.api.model.StringConstants.GET_COUNTERPARTIES;
import static com.base.api.model.StringConstants.GET_COUNTERPARTY_ADDRESSES;
import static com.base.api.model.StringConstants.GET_COUNTERPARTY_CONTACT_PERSONS;
import static com.base.api.model.StringConstants.GET_COUNTERPARTY_OPTIONS;
import static com.base.api.model.StringConstants.PAGE;
import static com.base.api.model.StringConstants.REF;
import static com.base.api.model.StringConstants.UPDATE;

public class CounterpartyService extends Service {

    public UpdateCounterparty update(SimpleCounterparty counterparty, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(counterparty, api_key, COUNTERPARTY, UPDATE);

        return service.postRequest(URL, jsonObject).getResponse(new UpdateCounterparty());
    }

    public DeleteCounterparty deleteCounterparty(String ref, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty(REF, ref);

        JsonObject jsonObject = jsonService.toObject(api_key, COUNTERPARTY, DELETE, jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new DeleteCounterparty());
    }

    public GetCounterpartyAddresses getCounterpartyAddresses(String ref, String counterpartyProperty, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty(REF, ref);
        jsonObjectIn.addProperty(COUNTERPARTY_PROPERTY, counterpartyProperty);

        JsonObject jsonObject = jsonService.toObject(api_key, COUNTERPARTY, GET_COUNTERPARTY_ADDRESSES, jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new GetCounterpartyAddresses());
    }

    public GetCounterpartyOptions getCounterpartyOptions(String ref, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty(REF, ref);

        JsonObject jsonObject = jsonService.toObject(api_key, COUNTERPARTY, GET_COUNTERPARTY_OPTIONS, jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new GetCounterpartyOptions());
    }

    public GetCounterpartyContactPersons getCounterpartyContactPersons(String ref, String page, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty(REF, ref);
        jsonObjectIn.addProperty(PAGE, page);

        JsonObject jsonObject = jsonService.toObject(api_key, COUNTERPARTY, GET_COUNTERPARTY_CONTACT_PERSONS, jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new GetCounterpartyContactPersons());
    }

    public GetCounterparties getCounterparties(String counterpartyProperty, String page, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty(COUNTERPARTY_PROPERTY, counterpartyProperty);
        jsonObjectIn.addProperty(PAGE, page);

        JsonObject jsonObject = jsonService.toObject(api_key, COUNTERPARTY, GET_COUNTERPARTIES, jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new GetCounterparties());

    }
}
