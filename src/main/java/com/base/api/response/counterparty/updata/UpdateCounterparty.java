package com.base.api.response.counterparty.updata;

import com.base.api.model.counterparty.update.Counterparty;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateCounterparty extends Response {
    boolean success;
    ArrayList<Counterparty> data;
    ArrayList<String> errors;
}
