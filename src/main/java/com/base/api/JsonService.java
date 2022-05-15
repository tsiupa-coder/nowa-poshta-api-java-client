package com.base.api;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonService {

    public JsonObject toObject(Object object, String api_key, String modelName, String calledMethod) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", modelName);
        jsonObject.addProperty("calledMethod", calledMethod);

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(object);

        jsonObject.add("methodProperties", jsonObjectIn);

        return jsonObject;
    }

    public JsonObject toObject(String api_key, String modelName, String calledMethod) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", modelName);
        jsonObject.addProperty("calledMethod", calledMethod);

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add("methodProperties", jsonObjectIn);

        return jsonObject;
    }

    public JsonObject toObject(String api_key, String modelName, String calledMethod, JsonElement jsonElement) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", modelName);
        jsonObject.addProperty("calledMethod", calledMethod);

        jsonObject.add("methodProperties", jsonElement);

        return jsonObject;

    }
}
