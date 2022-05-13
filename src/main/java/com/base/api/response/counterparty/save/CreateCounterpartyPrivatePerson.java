package com.base.api.response.counterparty.save;

import com.base.api.model.counterparty.save.CounterpartyPrivatePerson;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateCounterpartyPrivatePerson extends Response {
    boolean success;
    ArrayList<CounterpartyPrivatePerson> data;
    ArrayList<String> errors;
}
