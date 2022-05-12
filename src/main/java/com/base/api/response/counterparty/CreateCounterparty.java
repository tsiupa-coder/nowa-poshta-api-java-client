package com.base.api.response.counterparty;

import com.base.api.model.counterparty.Counterparty;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateCounterparty extends Response {
    boolean success;
    ArrayList<Counterparty> data;
    ArrayList<String> errors;
}
