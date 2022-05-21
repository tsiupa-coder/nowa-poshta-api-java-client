package com.base.api;

import com.base.api.model.counterparty.save.SimpleCounterpartyOrganization;
import com.base.api.model.counterparty.save.SimpleCounterpartyPrivatePerson;
import com.base.api.model.counterparty.save.SimpleCounterpartyThirdPerson;
import com.base.api.response.info.counterparty.save.CreateCounterpartyOrganization;
import com.base.api.response.info.counterparty.save.CreateCounterpartyPrivatePerson;
import com.base.api.response.info.counterparty.save.CreateCounterpartyThirdPerson;
import com.google.gson.JsonObject;

import java.io.IOException;

import static com.base.api.model.StringConstants.COUNTERPARTY;
import static com.base.api.model.StringConstants.PRIVATE_PERSON;
import static com.base.api.model.StringConstants.RECIPIENT;
import static com.base.api.model.StringConstants.SAVE;

public class CounterpartySaveService extends Service {

    /**
     * Даний метод дозволяє створювати Контрагентів отримувачів з типом Приватна особа.
     */
    public CreateCounterpartyPrivatePerson createCounterparty(SimpleCounterpartyPrivatePerson counterparty, String api_key) throws IOException {

        counterparty.setCounterpartyType(PRIVATE_PERSON);
        counterparty.setCounterpartyProperty(RECIPIENT);

        JsonObject jsonObject = jsonService.toObject(counterparty, api_key, COUNTERPARTY, SAVE);
        return service.postRequest(URL, jsonObject).getResponse(new CreateCounterpartyPrivatePerson());

    }

    /**
     * Даний метод дозволяє створювати Контрагентів отримувачів з типом Третя особа.
     */
    public CreateCounterpartyThirdPerson createCounterparty(SimpleCounterpartyThirdPerson counterparty, String api_key) throws IOException {

        counterparty.setCounterpartyType("ThirdPerson");
        counterparty.setCounterpartyProperty("Organization");

        JsonObject jsonObject = jsonService.toObject(counterparty, api_key, COUNTERPARTY, SAVE);

        return service.postRequest(URL, jsonObject).getResponse(new CreateCounterpartyThirdPerson());
    }

    public CreateCounterpartyOrganization createCounterparty(SimpleCounterpartyOrganization counterparty, String api_key) throws IOException {

        counterparty.setCounterpartyType("Organization");
        counterparty.setCounterpartyProperty(RECIPIENT);

        JsonObject jsonObject = jsonService.toObject(counterparty, api_key, COUNTERPARTY, SAVE);

        return service.postRequest(URL, jsonObject).getResponse(new CreateCounterpartyOrganization());
    }
}
