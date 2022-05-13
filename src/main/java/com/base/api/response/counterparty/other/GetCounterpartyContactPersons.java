package com.base.api.response.counterparty.other;

import com.base.api.model.counterparty.other.CounterpartyContactPerson;
import com.base.api.model.counterparty.other.CounterpartyOption;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetCounterpartyContactPersons extends Response {
    boolean success;
    ArrayList<CounterpartyContactPerson> data;
    ArrayList<String> errors;
}
