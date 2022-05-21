package com.base.api.mainservice;

import com.base.api.model.contact.PersonData;
import com.base.api.model.contact.SimpleContactPerson;
import com.base.api.response.info.contact.CreateContactPerson;
import com.base.api.response.info.contact.DeleteContactPerson;
import com.google.gson.JsonObject;

import java.io.IOException;

import static com.base.api.model.StringConstants.CONTACT_PERSON;
import static com.base.api.model.StringConstants.DELETE;
import static com.base.api.model.StringConstants.REF;
import static com.base.api.model.StringConstants.SAVE;
import static com.base.api.model.StringConstants.UPDATE;

public class ContactPersonService extends Service {

    public CreateContactPerson create(SimpleContactPerson person, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(person, api_key, CONTACT_PERSON, SAVE);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new CreateContactPerson());

    }

    public CreateContactPerson update(PersonData person, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(person, api_key, CONTACT_PERSON, UPDATE);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new CreateContactPerson());

    }

    public DeleteContactPerson deleteContactPerson(String ref, String api_key) throws IOException {
        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty(REF, ref);

        JsonObject jsonObject = jsonService.toObject(api_key, CONTACT_PERSON, DELETE, jsonObjectIn);
        return service
                .postRequest(URL, jsonObject)
                .getResponse(new DeleteContactPerson());

    }
}
