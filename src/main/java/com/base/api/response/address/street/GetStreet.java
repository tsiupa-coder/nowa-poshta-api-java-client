package com.base.api.response.address.street;

import com.base.api.model.addresses.street.Street;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetStreet extends Response {
    public boolean success;
    public ArrayList<Street> data;
    public ArrayList<String> errors;
}
