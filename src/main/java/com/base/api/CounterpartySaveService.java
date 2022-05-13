package com.base.api;

import com.base.api.model.counterparty.save.SimpleCounterpartyOrganization;
import com.base.api.model.counterparty.save.SimpleCounterpartyPrivatePerson;
import com.base.api.model.counterparty.save.SimpleCounterpartyThirdPerson;
import com.base.api.response.info.counterparty.save.CreateCounterpartyOrganization;
import com.base.api.response.info.counterparty.save.CreateCounterpartyPrivatePerson;
import com.base.api.response.info.counterparty.save.CreateCounterpartyThirdPerson;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class CounterpartySaveService extends Service {


    /**
     * Даний метод дозволяє створювати Контрагентів отримувачів з типом Приватна особа.
     */
    public CreateCounterpartyPrivatePerson createCounterparty(SimpleCounterpartyPrivatePerson counterparty, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Counterparty");
        jsonObject.addProperty("calledMethod", "save");

        counterparty.setCounterpartyType("PrivatePerson");
        counterparty.setCounterpartyProperty("Recipient");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(counterparty);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new CreateCounterpartyPrivatePerson());

    }

    /**
     * Даний метод дозволяє створювати Контрагентів отримувачів з типом Третя особа.
     */
    public CreateCounterpartyThirdPerson createCounterparty(SimpleCounterpartyThirdPerson counterparty, String api_key) throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Counterparty");
        jsonObject.addProperty("calledMethod", "save");

        counterparty.setCounterpartyType("ThirdPerson");
        counterparty.setCounterpartyProperty("Organization");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(counterparty);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new CreateCounterpartyThirdPerson());
    }

    public CreateCounterpartyOrganization createCounterparty(SimpleCounterpartyOrganization counterparty, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Counterparty");
        jsonObject.addProperty("calledMethod", "save");

        counterparty.setCounterpartyType("Organization");
        counterparty.setCounterpartyProperty("Recipient");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(counterparty);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new CreateCounterpartyOrganization());

    }
}
