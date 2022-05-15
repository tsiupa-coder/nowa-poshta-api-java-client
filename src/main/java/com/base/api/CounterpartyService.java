package com.base.api;

import com.base.api.model.counterparty.update.SimpleCounterparty;
import com.base.api.response.info.counterparty.other.GetCounterparties;
import com.base.api.response.info.counterparty.other.GetCounterpartyAddresses;
import com.base.api.response.info.counterparty.other.GetCounterpartyContactPersons;
import com.base.api.response.info.counterparty.other.GetCounterpartyOptions;
import com.base.api.response.info.counterparty.updata.DeleteCounterparty;
import com.base.api.response.info.counterparty.updata.UpdateCounterparty;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class CounterpartyService extends Service{

    public UpdateCounterparty update(SimpleCounterparty counterparty, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(counterparty, api_key, "Counterparty", "update");

        return service.postRequest(URL, jsonObject).getResponse(new UpdateCounterparty());
    }

    public DeleteCounterparty deleteCounterparty(String ref, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("Ref", ref);

        JsonObject jsonObject = jsonService.toObject(api_key, "Counterparty", "delete", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new DeleteCounterparty());
    }

    public GetCounterpartyAddresses getCounterpartyAddresses(String ref, String counterpartyProperty, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("Ref", ref);
        jsonObjectIn.addProperty("CounterpartyProperty", counterpartyProperty);

        JsonObject jsonObject = jsonService.toObject(api_key, "Counterparty", "getCounterpartyAddresses", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new GetCounterpartyAddresses());
    }

    public GetCounterpartyOptions getCounterpartyOptions(String ref, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("Ref", ref);

        JsonObject jsonObject = jsonService.toObject(api_key, "Counterparty", "getCounterpartyOptions", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new GetCounterpartyOptions());
    }

    public GetCounterpartyContactPersons getCounterpartyContactPersons(String ref, String page, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("Ref", ref);
        jsonObjectIn.addProperty("Page", page);

        JsonObject jsonObject = jsonService.toObject(api_key, "Counterparty", "getCounterpartyContactPersons", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new GetCounterpartyContactPersons());
    }

    public GetCounterparties getCounterparties(String counterpartyProperty, String page, String api_key) throws IOException {

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("CounterpartyProperty", counterpartyProperty);
        jsonObjectIn.addProperty("Page", page);

        JsonObject jsonObject = jsonService.toObject(api_key, "Counterparty", "getCounterparties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new GetCounterparties());

    }
}
