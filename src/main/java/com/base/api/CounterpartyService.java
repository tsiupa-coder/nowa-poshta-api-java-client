package com.base.api;

import com.base.api.model.counterparty.update.SimpleCounterparty;
import com.base.api.response.counterparty.updata.DeleteCounterparty;
import com.base.api.response.counterparty.updata.UpdateCounterparty;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class CounterpartyService extends Service{

    public UpdateCounterparty update(SimpleCounterparty counterparty, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Counterparty");
        jsonObject.addProperty("calledMethod", "update");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(counterparty);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new UpdateCounterparty());
    }

    public DeleteCounterparty deleteCounterparty(String ref, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Counterparty");
        jsonObject.addProperty("calledMethod", "delete");

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("Ref", ref);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new DeleteCounterparty());

    }

}
