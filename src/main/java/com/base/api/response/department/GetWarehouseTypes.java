package com.base.api.response.department;

import com.base.api.model.department.Department;
import com.base.api.model.department.WarehouseType;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetWarehouseTypes extends Response {
    public boolean success;
    public ArrayList<WarehouseType> data;
    public ArrayList<String> errors;
}
