package com.base.api.response.common;

import com.base.api.model.common.PalletsList;
import com.base.api.model.common.TypesOfPayersForRedelivery;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetTypesOfPayersForRedelivery extends Response {
    boolean success;
    ArrayList<TypesOfPayersForRedelivery> data;
    ArrayList<String> errors;
}
