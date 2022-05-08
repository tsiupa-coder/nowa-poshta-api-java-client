package com.base.api.response.common;

import com.base.api.model.common.CargoDescription;
import com.base.api.model.common.CargoType;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetCargoDescriptionList extends Response {
    boolean success;
    ArrayList<CargoDescription> data;
    ArrayList<String> errors;
}
