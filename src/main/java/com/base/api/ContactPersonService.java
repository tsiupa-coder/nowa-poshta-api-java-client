package com.base.api;

import com.base.api.model.contact.PersonData;
import com.base.api.model.contact.SimpleContactPerson;
import com.base.api.response.info.contact.CreateContactPerson;
import com.base.api.response.info.contact.DeleteContactPerson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class ContactPersonService extends Service {


    public CreateContactPerson create(SimpleContactPerson person, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(person, api_key, "ContactPerson", "save");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new CreateContactPerson());

    }

    public CreateContactPerson update(PersonData person, String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(person, api_key, "ContactPerson", "update");

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new CreateContactPerson());

    }

    public DeleteContactPerson deleteContactPerson(String ref, String api_key) throws IOException {
        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("Ref", ref);

        JsonObject jsonObject = jsonService.toObject(api_key, "ContactPerson", "delete", jsonObjectIn);
        return service
                .postRequest(URL, jsonObject)
                .getResponse(new DeleteContactPerson());

    }
}
