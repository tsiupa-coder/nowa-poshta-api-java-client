package com.base.api;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import static com.base.api.model.StringConstants.API_KEY;
import static com.base.api.model.StringConstants.CALLED_METHOD;
import static com.base.api.model.StringConstants.METHOD_PROPERTIES;
import static com.base.api.model.StringConstants.MODEL_NAME;

public class JsonService {

    public JsonObject toObject(Object object, String api_key, String modelName, String calledMethod) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(API_KEY, api_key);
        jsonObject.addProperty(MODEL_NAME, modelName);
        jsonObject.addProperty(CALLED_METHOD, calledMethod);

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(object);

        jsonObject.add(METHOD_PROPERTIES, jsonObjectIn);

        return jsonObject;
    }

    public JsonObject toObject(String api_key, String modelName, String calledMethod) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(API_KEY, api_key);
        jsonObject.addProperty(MODEL_NAME, modelName);
        jsonObject.addProperty(CALLED_METHOD, calledMethod);

        JsonObject jsonObjectIn = new JsonObject();

        jsonObject.add(METHOD_PROPERTIES, jsonObjectIn);

        return jsonObject;
    }

    public JsonObject toObject(String api_key, String modelName, String calledMethod, JsonElement jsonElement) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(API_KEY, api_key);
        jsonObject.addProperty(MODEL_NAME, modelName);
        jsonObject.addProperty(CALLED_METHOD, calledMethod);

        jsonObject.add(METHOD_PROPERTIES, jsonElement);

        return jsonObject;
    }
}
