package com.base.api.response.counterparty.other;

import com.base.api.model.counterparty.other.CounterpartyAddress;
import com.base.api.model.counterparty.other.CounterpartyOption;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetCounterpartyOptions extends Response {
    boolean success;
    ArrayList<CounterpartyOption> data;
    ArrayList<String> errors;
}
