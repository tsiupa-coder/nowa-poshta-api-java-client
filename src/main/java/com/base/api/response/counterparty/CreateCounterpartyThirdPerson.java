package com.base.api.response.counterparty;

import com.base.api.model.counterparty.CounterpartyPrivatePerson;
import com.base.api.model.counterparty.CounterpartyThirdPerson;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateCounterpartyThirdPerson extends Response {
    boolean success;
    ArrayList<CounterpartyThirdPerson> data;
    ArrayList<String> errors;
}
