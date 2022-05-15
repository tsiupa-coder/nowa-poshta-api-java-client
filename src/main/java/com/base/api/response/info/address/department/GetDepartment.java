package com.base.api.response.info.address.department;

import com.base.api.model.addresses.department.Department;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetDepartment extends Response {
    ArrayList<Department> data;

}
