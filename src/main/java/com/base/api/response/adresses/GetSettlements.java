package com.base.api.response.adresses;


import com.base.api.model.address.DataR;
import com.base.api.model.address.DataSettlements;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetSettlements extends Response {
    boolean success;
    ArrayList<DataSettlements> data;
    ArrayList<String> errors;

}