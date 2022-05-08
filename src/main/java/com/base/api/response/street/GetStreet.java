package com.base.api.response.street;

import com.base.api.model.department.WarehouseType;
import com.base.api.model.street.Street;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.stream.Stream;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetStreet extends Response {
    public boolean success;
    public ArrayList<Street> data;
    public ArrayList<String> errors;
}
