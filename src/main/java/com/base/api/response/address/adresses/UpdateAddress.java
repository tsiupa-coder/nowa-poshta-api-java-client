package com.base.api.response.address.adresses;

import com.base.api.model.addresses.address.UpdateData;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateAddress extends Response {
    boolean success;
    ArrayList<UpdateData> data;
    ArrayList<String> errors;
}
