package com.base.api.response.city;

import com.base.api.model.city.DataCompanyCity;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetCompanyCities extends Response {
    public boolean success;
    public ArrayList<DataCompanyCity> data;
    public ArrayList<String> errors;

}
