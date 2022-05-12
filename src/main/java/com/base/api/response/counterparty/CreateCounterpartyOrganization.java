package com.base.api.response.counterparty;

import com.base.api.model.counterparty.save.CounterpartyOrganization;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateCounterpartyOrganization extends Response {
    boolean success;
    ArrayList<CounterpartyOrganization> data;
    ArrayList<String> errors;
}
