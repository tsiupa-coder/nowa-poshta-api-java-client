package com.base.api;

import com.base.api.model.contact.PersonData;
import com.base.api.model.contact.SimpleContactPerson;
import com.base.api.response.contact.CreateContactPerson;
import com.base.api.response.contact.DeleteContactPerson;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class ContactPersonService extends Service {


    public CreateContactPerson create(SimpleContactPerson person, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "ContactPerson");
        jsonObject.addProperty("calledMethod", "save");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(person);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new CreateContactPerson());

    }

    public CreateContactPerson update(PersonData person, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "ContactPerson");
        jsonObject.addProperty("calledMethod", "update");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(person);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new CreateContactPerson());

    }

    public DeleteContactPerson deleteContactPerson(String ref, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "ContactPerson");
        jsonObject.addProperty("calledMethod", "delete");

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("Ref", ref);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new DeleteContactPerson());


    }
}
