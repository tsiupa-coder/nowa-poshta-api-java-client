package com.base.api.response.address.general;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import lombok.Data;

import java.util.Objects;

@Data
public class GeneralResponse {

    private String entity;
    private String statusLine;

    public <T extends Response> T getResponse(T response) {

        try {
            if (entity != null) {
                response = (T) new Gson().fromJson(entity, response.getClass());
                response.setEntity(entity);
            }
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }

        if (Objects.isNull(response)) {
            response = (T) new Response();
        }
        response.setStatusResponse(statusLine);
        response.setEntity(entity);
        return response;
    }

}

