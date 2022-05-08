package com.base.api.response.address.adresses;

import com.base.api.model.addresses.address.Datum;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetAddresses extends Response {
    public boolean success;
    public ArrayList<Datum> data;
    public ArrayList<String> errors;
}
