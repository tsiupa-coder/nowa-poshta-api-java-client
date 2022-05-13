package com.base.api.response.info.address.city;

import com.base.api.model.addresses.city.DataCompanyCity;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetCompanyCities extends Response {

    public ArrayList<DataCompanyCity> data;


}
