package com.base.api.response.counterparty.other;

import com.base.api.model.SimpleResponse;
import com.base.api.model.counterparty.other.CounterpartyAddress;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetCounterpartyAddresses extends Response {
    boolean success;
    ArrayList<CounterpartyAddress> data;
    ArrayList<String> errors;
}
