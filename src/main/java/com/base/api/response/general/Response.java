package com.base.api.response.general;

import com.base.api.model.counterparty.save.CounterpartyOrganization;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PROTECTED)
public class Response {

    private String statusResponse;
    private String entity;
    boolean success;
    ArrayList<String> errors;
}
