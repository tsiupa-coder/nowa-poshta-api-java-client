package com.base.api.response.counterparty.save;

import com.base.api.model.counterparty.save.CounterpartyThirdPerson;
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
